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
        artists.breath();
        artists.eat();
        artists.walk();
        artists.speak();
        artists.check();
        System.out.println(artists.name +" of age :"+ artists.age+" and gender : "+ artists.gender +" can do the : "+ artists.art);
        Artists a = new Artists();
        Artists b = new Artists();// these objects are refring to diff address or mem space so these are diff
        //Artists b = a;// these objects are refring to same address or mem space so these are diff

        if(a.equals(b)){
            System.out.println("both  are equals");
        }else{
            System.out.println("both  are not equals");
        }
    }
}
