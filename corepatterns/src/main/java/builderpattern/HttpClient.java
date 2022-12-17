package builderpattern;

public class HttpClient {
    private String method;
    private String url;
    private String username;
    private String password;
    private String headers;
    private String body;

    /**
     * This Constructor will instantiate its attributes using the HttpClientBuilder Instance set in inner class
     * @param httpClientBuilder
     */
    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.username = httpClientBuilder.username;
        this.password = httpClientBuilder.password;
        this.headers = httpClientBuilder.headers;
        this.body = httpClientBuilder.body;
    }


   /* public HttpClient(String method, String url,
                      String username, String password,
                      String headers, String body) {
        this.method = method;
        this.url = url;
        this.username = username;
        this.password = password;
        this.headers = headers;
        this.body = body;
    }*/

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String username;
        private String password;
        private String headers;
        private String body;

        public HttpClientBuilder method(String method){
            this.method=method;
            return this;
        }
        public HttpClientBuilder url(String url){
            this.url=url;
            return this;
        }
        public HttpClientBuilder secure(String username,String password){
            this.username=username;
            this.password=password;
            return this;
        }
        public HttpClientBuilder headers(String headers){
            this.headers=headers;
            return this;
        }
        public HttpClientBuilder body(String body){
            this.body=body;
            return this;
        }
        public HttpClient build(){
            return new HttpClient(this);
        }

    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", headers='" + headers + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
