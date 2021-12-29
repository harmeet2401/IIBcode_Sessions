package inheritance;

public class Artists extends Human{
    public String art;

    public void createArtist(){
        System.out.println(name+" : ARTIST CAN DO THE ART ");
    }
    public Artists(){

    }

    public static void main(String[] args) {
        Artists artists = new Artists();
        artists.name="Leonardo da vinci";
        artists.age = 34;
        artists.art= "Painting";
        artists.gender="Male";
        System.out.println(artists.name +" of age :"+ artists.age+" and gender : "+ artists.gender +" can do the : "+ artists.art);
    }
}
