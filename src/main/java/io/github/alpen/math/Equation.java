package io.github.alpen.math;

import java.util.LinkedList;
import java.util.regex.Pattern;

public interface Equation {
    public static final String SIGN_SPLIT_REGEX = "(\\+|-)";
    public static final Pattern PATTERN_1 = Pattern.compile("([0-9])([a-z][A-Z])\\^([0-9])");
    public static final Pattern PATTERN_2 = Pattern.compile("\\(\\)([0-9][a-z][A-Z])(.)([0-9])");
    public Equation expression(String expression);
    public Equation unknownQuantity(String quantity);
    public int result();
    public double resultDouble();
    public float resultFloat();
    public Equation insert(int k);
    public Equation insert(float k);
    public Equation insert(double k);
    public Equation calculate();
}
