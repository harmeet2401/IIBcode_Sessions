package adaptorpattern;

public class WeatherFinderImpl implements WeatherFinder{
    @Override
    public int findTemprature(String city) {
        if(city.equalsIgnoreCase("New Jearsey")){
            return 54;
        }
        return 0;
    }
}
