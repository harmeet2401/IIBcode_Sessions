package singletonclasses;


import java.util.Date;

/**
 *                          .SINGLETON DESIGN PATTERN.
 * 1. First make the constructor private so that no one instantiate this class again
 * 2. Create a private static attribute of this class type
 * 3. Create a public static method which will return the instance of this class
 *    only once using the above attribute.
 */
public class DateUtil {
    private static DateUtil dateUtil;
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
        synchronized(DateUtil.class)
        {
            if (dateUtil == null) {
                dateUtil = new DateUtil();
            }
        }
        return dateUtil;
    }
}
