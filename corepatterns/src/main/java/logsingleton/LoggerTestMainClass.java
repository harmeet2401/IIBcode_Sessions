package logsingleton;

public class LoggerTestMainClass {
    public static void main(String[] args) {
        Logger instance = Logger.getInstance();
        instance.log("Message to logged in for singleton class");
    }
}
