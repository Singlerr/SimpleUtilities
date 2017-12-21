package io.github.alpen.randoms;


import io.github.alpen.randoms.classes.SoleFinder;

import java.util.Random;

public class RandomUtils {
    public static Random newRandomInstance(){
        return new Random();
    }
    public static <E> SoleFinder<E> newSoleFinder(Class<E> c){
        SoleFinder<E> soleFinder = new SoleFinder<E>(c);
        return soleFinder;
    }

}
