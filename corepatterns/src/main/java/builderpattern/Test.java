package builderpattern;

/**
 * This test class will test the builderpattern first line shows the ugly instantiation
 * of the httpclient.
 * To make it more readable the HttpClient class will have an inner class HttpClientBuilder
 * with same attributes, its implemented methods and a builder function
 */
public class Test {
    public static void main(String[] args) {
        /*HttpClient httpClient = new
            HttpClient("Get","https://localhost:8080/getuser",
            null,null,null,"{}");*/
        HttpClient httpClient = new HttpClient.HttpClientBuilder().method("GET").
                url("https://localhost:8080/getuser")
                .secure("hsingh82","667335424")
                .body("{}")
                .build();
        System.out.println(httpClient);

    }

}
