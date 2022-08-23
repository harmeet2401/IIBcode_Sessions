package com.learnjava8.interfaces;
import java.util.List;
public interface Multiplier {
    int multiply(List<Integer> list);

    /**
     * This methd can be overriden in the IMPL class .
     * @param list
     * @return
     */
    default int listSize(List<Integer> list){
        System.out.println("Size using Multiplier class : ");
        return list.size();
    }

    /**
     * This method will be called directly using the Interface name and can not be overriden in the impl
     * class.
     * @param list
     * @return
     */
    static boolean isEmpty(List<Integer> list){
        return list.size()>0 && list!=null;
    }
}
