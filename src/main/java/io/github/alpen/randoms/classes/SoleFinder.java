package io.github.alpen.randoms.classes;

import io.github.alpen.validations.Validate;

import java.util.LinkedList;
import java.util.Random;
import static io.github.alpen.randoms.RandomUtils.newRandomInstance;
public class SoleFinder<E>{
    private Integer to;
    private Integer from;
    private LinkedList<E> list;
    private Class<E> c;
    public SoleFinder(int k,int i,Class<E> c){
        if(k != 902){
            throw new Error("Incorrect Access Key");
        }
        if(i != 302){
            throw new Error("Incorrect Access Key");
        }
        list = new LinkedList<E>();
        to = null;
        from = null;
        this.c = c;
    }
    public SoleFinder<E> from(Integer i){
        Validate.notNull(i,"Integer cannot be null");
        from= i;

        return this;
    }
    public SoleFinder<E> to(Integer i){
        Validate.notNull(i,"Integer cannot be null");
        to= i;
        return this;
    }
    public SoleFinder<E> add(E e){
        Validate.notNull(e,"Element cannot be null");
        list.add(e);
        return this;
    }
    public E peek(){
        if(to != null && from != null){
            Random r = newRandomInstance();
            int k;
            do{
                k = r.nextInt(to);
            }while (k >= to);
            return list.get(k);
        }else{
            Random r = newRandomInstance();
            int k = r.nextInt(list.size());
            return list.get(k);
        }

    }
}