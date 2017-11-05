package io.github.alpen.validations;

public class Validate {
    public static void notNull(Object par,String msg){
        if(par == null)
            throw new NullPointerException(msg);
    }
}
