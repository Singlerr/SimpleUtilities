package io.github.alpen.validations;

public class Validate {
    public static void notNull(Object par,String msg){
        if(par == null)
            throw new IllegalArgumentException(msg);
    }
    public static void notNull(Object par){
        if(par == null)
            throw new IllegalArgumentException();
    }
}
