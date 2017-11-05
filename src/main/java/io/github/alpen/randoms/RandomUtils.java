package io.github.alpen.randoms;


import io.github.alpen.randoms.classes.SoleFinder;
import io.github.alpen.validations.Validate;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class RandomUtils {
    public static Random newRandomInstance(){
        return new Random();
    }
    public static <E> SoleFinder<E> sole(Class<E> c){
        SoleFinder<E> soleFinder = new SoleFinder<E>(902,302,c);
        return soleFinder;
    }

}
