package com.xyf;

public class hunger_Singleton {
    private static hunger_Singleton hunger_singleton = new hunger_Singleton();

    public static hunger_Singleton newInstance() {
        return hunger_singleton;
    }

}
