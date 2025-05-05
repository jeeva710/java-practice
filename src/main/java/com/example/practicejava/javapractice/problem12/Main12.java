package com.example.practicejava.javapractice.problem12;

public class Main12 {
    public void executeAll(){
        LRUCache<Integer,String> cache=new LRUCache<>(4);
        cache.put(1,"A");
        cache.put(2,"B");
        cache.put(3,"C");
        cache.put(4,"D");
        System.out.println(cache);
        cache.put(5,"j");
        System.out.println(cache);
    }
}
