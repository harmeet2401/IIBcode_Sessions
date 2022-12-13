package adaptorpattern;

public class WeatherAdapter {
    public String fetchCity(int zipcode){
        if(zipcode==19466){
            return "New Jearsey";
        }else{
            return "unknow";
        }
    }
}
