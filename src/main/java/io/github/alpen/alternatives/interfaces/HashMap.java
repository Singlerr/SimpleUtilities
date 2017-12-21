package io.github.alpen.alternatives.interfaces;

import io.github.alpen.alternatives.DirtyHashMap;

import java.util.LinkedList;

public interface HashMap<K,V> {
    public HashMap<K,V> put(K key,V value);
    public V getValue(K key);
    public K getKey(V value);
    public HashMap<K,V> remove(K key);
    public LinkedList<K> keyList();
    public LinkedList<V> valueList();
    public boolean containsKey(K key);
    public boolean containsValue(V value);
    public int size();
    public java.util.HashMap<K,V> toJavaHashMap();
    public HashMap<K,V> clear();

}
