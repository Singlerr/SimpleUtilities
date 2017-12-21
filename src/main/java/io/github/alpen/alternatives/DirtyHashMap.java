package io.github.alpen.alternatives;

import io.github.alpen.alternatives.interfaces.HashMap;

import java.util.LinkedList;

public class DirtyHashMap<K,V> implements HashMap<K,V>{
    @Override
    public LinkedList<V> valueList() {
        return null;
    }

    @Override
    public LinkedList<K> keyList() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public java.util.HashMap<K, V> toJavaHashMap() {
        return null;
    }

    @Override
    public HashMap<K, V> remove(K key) {
        return null;
    }

    @Override
    public HashMap<K, V> put(K key, V value) {
        return null;
    }

    @Override
    public HashMap<K, V> clear() {
        return null;
    }

    @Override
    public boolean containsValue(V value) {
        return false;
    }


    @Override
    public boolean containsKey(K key) {
        return false;
    }

    @Override
    public V getValue(K key) {
        return null;
    }

    @Override
    public K getKey(V value) {
        return null;
    }
}
