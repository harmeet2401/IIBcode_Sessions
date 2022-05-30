package com.smartentities.json.generator.test;

import java.io.*;
import java.nio.charset.Charset;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.everit.json.schema.loader.SchemaLoader.SchemaLoaderBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.GeneratorConfig;
import com.smartentities.json.generator.GeneratorFactory;
import com.smartentities.json.generator.JsonGenerator;

/**
 * Schema used : AuthorSchema.json,TestSchema1.json,TestSchema2.json,TestSchema3.json
 * Schema2.json,Schema4.json
 */
public class JsonGeneratorTest {

	public static FileOutputStream fileOutputStream = null;
	public static BufferedOutputStream bufferedOutputStream = null;
	public static ObjectMapper mapper = null;
	public static JsonGeneratorTest j = null;


	 static  {
		 try {
		 	 double random = Math.random();
			 fileOutputStream = new FileOutputStream("C:\\Users\\0023N7744\\JsonGenerator\\"+random+"_TestData"+".json");
			 mapper = new ObjectMapper();
			 j = new JsonGeneratorTest();
		 } catch (FileNotFoundException e) {
			 e.printStackTrace();
		 }

	}

	public static void main(String[] args) {
		j.function_1();

	}
	void function_1(){
		try {
			j.function_2();
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
			System.out.println("------catched the exception -------");
		}
	}
	void function_2() throws FileNotFoundException {
		try {
			String schemaPath = "C:\\Users\\0023N7744\\JsonGenerator\\Test-json-data-generator\\" +
					"Test-json-data-generator\\src\\test\\resources\\Schema4.json";
			GeneratorConfig generatorConfig= GeneratorConfig.fromSchemaPath(schemaPath);
			JsonGenerator jsonGenerator = new JsonGenerator(generatorConfig);
			String json = jsonGenerator.generate();
			json = new GsonBuilder().setPrettyPrinting().create().toJson((new JsonParser().parse(json)));
			byte[] b = json.getBytes();
			fileOutputStream.write(b);
			System.out.println(json);
			//Validate generated message
			//	JSONArray jsonSubject = new JSONArray(new JSONTokener(new ByteArrayInputStream(json.getBytes(Charset.defaultCharset()))));
			//	Schema schema = SchemaLoader.load(generatorConfig.getJsonSchema());
			//	schema.validate(jsonSubject);
		}catch (FileNotFoundException e){
			throw new FileNotFoundException();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
