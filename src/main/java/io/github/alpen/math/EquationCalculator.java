package io.github.alpen.math;

import io.github.alpen.string.StringHelper;
import io.github.alpen.validations.Validate;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EquationCalculator implements Equation{
    private LinkedList<Object> tree;
    private String expression;
    private String quantity;
    private boolean useInt,useDouble,useFloat;
    private int k;
    private float f;
    private double d;
    public EquationCalculator(){
        tree = new LinkedList<>();
    }
    private boolean isDouble(Object obj){
        try{
            Double.parseDouble(obj.toString());
        return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    private double calculateDouble(String par1,double insert){
        Matcher matcher = PATTERN_1.matcher(par1);
        double k = 1;
        if(matcher.matches()){
            for(int i = 0;i<matcher.groupCount();i++){
               if(isDouble(matcher.group(i))){
                    k *= Double.parseDouble(matcher.group(i));
                }else{
                    k += MathHelper.exponent(insert,Double.parseDouble(matcher.group(i+1)));
                }
            }
        }
        return k;
    }
    private int calculateInteger(String par1,int insert){
        return insert;
    }
    @Override
    public Equation calculate() {
        try {
            Validate.notNull(expression);
            String expr = expression;
            String temp = expr.split("\\=")[1];
            String t = StringHelper.removeAllBlanks((expr.split("\\=")[0] + MathHelper.changeSign(Integer.parseInt(temp.replaceAll(" ","")))).concat("= 0"));
            String[] args  = t.split(SIGN_SPLIT_REGEX);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return this;
    }

    private boolean isFloat(Object obj){
        try{
            Float.parseFloat(obj.toString());
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    private boolean isInteger(Object obj){
        try{
            Integer.parseInt(obj.toString());
            return true;
        }catch (NumberFormatException ex){
            return false;
        }
    }
    @Override
    public Equation expression(String expression) {
        this.expression = expression;
        return this;
    }

    @Override
    public Equation insert(int k) {
        this.k = k;
        useInt = true;
        useDouble = false;
        useFloat = false;
        return this;
    }

    @Override
    public Equation insert(float k) {
        f = k;
        useInt = false;
        useDouble = false;
        useFloat = true;
        return this;
    }

    @Override
    public Equation insert(double k) {
        d= k;
        useInt = false;
        useDouble = true;
        useFloat = false;
        return this;
    }

    @Override
    public int result() {
        return k;
    }

    @Override
    public double resultDouble() {
        return d;
    }

    @Override
    public float resultFloat() {
        return f;
    }

    @Override
    public Equation unknownQuantity(String quantity) {
        this.quantity = quantity;
        return this;
    }
}
