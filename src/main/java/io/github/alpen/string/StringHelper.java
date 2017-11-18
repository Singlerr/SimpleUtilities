package io.github.alpen.string;

public class StringHelper {
    public static String joinWith(String med,String... str){
        StringBuffer stringBuffer = new StringBuffer();
        for(String sts : str){
            stringBuffer.append(sts).append(med);
        }
        return stringBuffer.toString().substring(stringBuffer.toString().length()-1);
    }
    public static String removeAllBlanks(String param){
        return param.replaceAll(" ","");
    }

}
