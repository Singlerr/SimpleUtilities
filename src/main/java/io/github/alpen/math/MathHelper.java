package io.github.alpen.math;

public class MathHelper {
    public static double changeSign(double input){
        return -input;
    }
    public static double exponent(double input,double times){
        double rt = 1;
        for(int i = 1;i<times;i++){
            rt += input;
        }
        return rt;
    }
}
