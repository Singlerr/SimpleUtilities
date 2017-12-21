package io.github.alpen.system;

import io.github.alpen.string.StringHelper;

import java.util.ArrayList;

public class SystemHelper {

    public void print(String str){
        System.out.println(str);
    }
    public static void print(boolean useSeperator,String sep,String... str){
        if(useSeperator){
          System.out.println(StringHelper.joinWith(sep,str));
        }else{
            for(String s : str){
                System.out.println(s);
            }
        }
    }
    public static void print(int i){

    }
    public static void print(double d){

    }
    public static void print(char c){

    }
    public static void print(float f){

    }
    public static <E>void print(ArrayList<E> list){

    }
}
