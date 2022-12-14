package flyweightpattern;


import java.util.HashMap;
import java.util.Map;

/**
 * Under this class the H object will create 10 objects in case num = 10
 * Which will consume the memory space and create issue.
 */
public class HumanCreation {

    public void createHuman(int num){
    Human h = null;
            for (int i = 0; i < num-1; i++) {
                if (i % 2 == 0) {
                    h = Humanfactory.getHuman("boy");
                    h.weights(i);
                } else {
                    h = Humanfactory.getHuman("girl");
                    h.weights(i);
                }
            }
    }
}
