package singletonclasses;


import java.io.Serializable;
import java.util.Date;

/**
 *                          .SINGLETON DESIGN PATTERN.
 * 1. First make the constructor private so that no one instantiate this class again
 * 2. Create a private static attribute of this class type.
 * 3. Create a public static method which will return the instance of this class
 *    only once using the above attribute.
 */
public class DateUtil implements Serializable , Cloneable{
    private static volatile DateUtil dateUtil; // volatile is to make the attribute thread safe
    //private static DateUtil dateUtil = new DateUtil();   ////--------------- EAGER instantiation
    /*static {
      dateUtil = new DateUtil();
    }*/
    private DateUtil(){
        //System.out.println("Making the constructor private for singleTon to work");
    }
    public String getDateUtil(){
        return "----- Called function of DateUtil Class -----";
    }

    /**
     * We are instantiating the dateUtil only if its null . To make it singleton we need to return the same instance.
     * @return
     */
    public static DateUtil getInstance(){
        if(dateUtil == null){
            dateUtil=new DateUtil();
        }
        return dateUtil;
    }

    public static synchronized DateUtil getThreadSafeInstance(){
        if (dateUtil == null) {
        synchronized(DateUtil.class)
           {
                dateUtil = new DateUtil();
            }
        }
        return dateUtil;
    }

    /**
     * This function will help in resolving the de-serialise read issue jisme object read krte time new instance bnke change horra tha.
     * This fn will return the original instance value when ObjectInputStream reads the object from the file or network .
     * @return
     */
    protected Object  readResolve(){
        return dateUtil;
    }

    /**
     * This function will throw CloneNotSupportedException in case other class extends this singleton class and tries to clone it.
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
