package com.xyf;

public class lazy_Singleton {
    private volatile static lazy_Singleton lazy_singleton;

    private lazy_Singleton(){

    }

    //双检查锁的方式，volatitle关键字作用 1. 防止指令的重排序15行  2.可见性12行 14行
    public static lazy_Singleton newInstance() {
        if (lazy_singleton == null){
            synchronized (lazy_Singleton.class){
                if (lazy_singleton == null){
                    lazy_singleton = new lazy_Singleton();
                }
            }
        }
        return lazy_singleton;
    }
}
