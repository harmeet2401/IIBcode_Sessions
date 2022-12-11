package logsingleton;

import java.io.Serializable;

public class Logger implements Serializable,Cloneable {
    private Logger(){

    }
    private static volatile Logger logInstance;

    /**
     * This function is thread safe
     * @return
     */
    public static synchronized Logger getInstance(){
        synchronized (Logger.class) {
            if (logInstance == null) {
                logInstance = new Logger();
            }
        }
        return logInstance;
    }

    public void log(String message){
        System.out.println(message);
    }

    /**
     * This will resolve the read/de-serialization from the file
     * @return
     */
    public Object readResolve(){
        return logInstance;
    }

    /**
     * This will send or throw an exception in case some other class try to clone it.
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
