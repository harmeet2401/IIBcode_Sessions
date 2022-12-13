package adaptorpattern;

public class WeatherUI {
    public void getTemprature(int zipcode){
        int temp = 0;
        WeatherFinder w = new WeatherFinderImpl();
        /**
         * We will use an adapter program to convert the zipcode to city
         */
        WeatherAdapter w1 = new WeatherAdapter();
        String city = w1.fetchCity(zipcode);
        temp = w.findTemprature(city);
        System.out.println(temp);
    }
}
