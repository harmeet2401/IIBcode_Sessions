package com.mongoDb.MyDb.Client;

import static com.mongodb.MongoClientSettings.getDefaultCodecRegistry;
import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import com.mongoDb.MyDb.bean.Flower;
import com.mongoDb.MyDb.bean.Movie;
import com.mongodb.client.result.InsertOneResult;
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class QuickStart {
    public static void main( String[] args ) {

        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix");
            MongoCollection<Document> collection = database.getCollection("movies");

            Document doc = collection.find(eq("title", "Back to the Future")).first();

            if (doc != null) {
                System.out.println(doc.toJson());
            } else {
                System.out.println("No matching documents found.");
            }

            Optional hh = Optional.of(collection.insertOne(new Document("title","Conjuring")));
                if(hh.isPresent()){
                    System.out.println(hh.get());
                }else{
                    System.out.println("insertion failed.");
                }
            System.out.println("--------------inserting the movie object-----------");
               /* List<Movie> list = Arrays.asList(new Movie("Horror",Arrays.asList("11","12"),"Exorcists"),
                        new Movie("Horror",Arrays.asList("1","2"),"Exorcists-1"),
                        new Movie("Horror",Arrays.asList("3","4"),"Exorcist-2"),
                        new Movie("Horror",Arrays.asList("5","6"),"Exorcists-3"),
                        new Movie("Horror",Arrays.asList("7","8"),"Exorcists-4"),
                        new Movie("Horror",Arrays.asList("9","10"),"Exorcists-5")

                );*/


            MappingDocumentToMovieObject();
        }

    }
    public static void MappingDocumentToMovieObject(){
        CodecProvider pojoCodecProvider = PojoCodecProvider.builder().automatic(true).build();
        CodecRegistry pojoCodecRegistry = fromRegistries(getDefaultCodecRegistry(), fromProviders(pojoCodecProvider));
        // Replace the uri string with your MongoDB deployment's connection string
        String uri = "mongodb://localhost:27017";
        try (MongoClient mongoClient = MongoClients.create(uri)) {
            MongoDatabase database = mongoClient.getDatabase("sample_mflix").withCodecRegistry(pojoCodecRegistry);
            MongoCollection<Movie> collection = database.getCollection("movies", Movie.class);
            Movie movie = collection.find(eq("title", "Back to the Future")).first();
            System.out.println(movie);
            System.out.println("------------Insert the data ------------------");
            MongoCollection<Flower> collection_flower = database.getCollection("Flower", Flower.class);
            Flower flower = new Flower("rose", false, 25.4f, Arrays.asList(new String[] {"red", "green"}));
            // insert the instance
            collection_flower.insertOne(flower);
            // return all documents in the collection
            List<Flower> flowers = new ArrayList<>();
            collection_flower.find().into(flowers);
            System.out.println(flowers);
        }

    }

}
