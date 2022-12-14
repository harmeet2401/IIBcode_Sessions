package flyweightpattern;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

/**
 * This factory will return the Human object on the basis of humantype
 * Below factory method along with map or hashmap act as flyweight design pattern . Which is used to overcome the issue of
 * large number of objects creation which eats up the memory
 */
public class Humanfactory {
    public static Map<String,Human> map = new HashMap<>();
    public static Human getHuman(String htype){
        Human h = null;
        if(map.get(htype)!=null){
            return map.get(htype);
        }else{
            System.out.println("Map is null first run of the program." + htype);
            if(htype.equalsIgnoreCase("girl")){
                h = new Girl();
            }else if(htype.equalsIgnoreCase("boy")) {
                h = new Boy();
            }
            map.put(htype,h); /// inserted into the cache so that it will be retrieved again later.
        }

        return map.get(htype);
    }
}
