import java.util.Locale;
import java.util.function.Consumer;
public class ConsumerLambdaExample {
    public static void main(String[] args) {
        Consumer<String> c1 = (c)->
                System.out.println("Uppercase value of the input : "+ (c.toUpperCase(Locale.ROOT)));
        c1.accept("Harmeet");
        Consumer<Integer> c2 = (n)->
                System.out.println("Incremented value of the input : "+ (++n));
        c2.accept(67);

    }



}
