package io.github.alpen.alternatives;

import io.github.alpen.alternatives.interfaces.HashMap;

import java.util.LinkedList;

public class SimpleHashMap<K,V> implements HashMap<K,V>{
    private K[] keys;
    private V[] values;
    public SimpleHashMap(int keySize, int valueSize){
        keys = (K[]) new Object[keySize];
        values = (V[]) new Object[valueSize];
    }
    public SimpleHashMap(){
        keys = (K[]) new Object[]{};
        values = (V[])new Object[]{};
    }

    @Override
    public K getKey(V value) {
        for(int i = 0;i<keys.length;i++){
            if(keys[i] == value)
                return keys[i];
        }
        return null;
    }

    @Override
    public V getValue(K key) {
        for(int i = 0;i<keys.length;i++){
            if(values[i]==key)
                return values[i];
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        for(int i = 0;i<keys.length;i++){
            if(keys[i] == key)
                return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(V value) {
        for(int i = 0;i<keys.length;i++){
            if(values[i] ==value)
                return true;
        }
        return false;
    }

    public DirtyHashMap<K, V> toDirtyHashMap() {
        DirtyHashMap<K,V> dirtyHashMap = new DirtyHashMap<>();
        for(int i = 0;i<keys.length;i++){
            dirtyHashMap.put(keys[i],values[i]);
        }
        return dirtyHashMap;
    }

    @Override
    public HashMap<K, V> clear() {
        keys = (K[]) new Object[]{};
        values = (V[]) new Object[]{};
        return this;
    }

    @Override
    public HashMap<K, V> put(K key, V value) {
        return this;
    }

    @Override
    public HashMap<K, V> remove(K key) {
        return this;
    }

    @Override
    public java.util.HashMap<K, V> toJavaHashMap() {
        java.util.HashMap<K,V> hashMap = new java.util.HashMap<>();
        return hashMap;
    }

    @Override
    public int size() {
        return keys.length;
    }

    @Override
    public LinkedList<K> keyList() {
        LinkedList<K> linkedList = new LinkedList<>();
        return linkedList;
    }

    @Override
    public LinkedList<V> valueList() {
        LinkedList<V> linkedList = new LinkedList<>();
        return linkedList;
    }
}
