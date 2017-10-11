package com.example.a15657_000.listviewtest;

/**
 * Created by 15657_000 on 2017/6/15 0015.
 */

public class Fruit {
    private String name;
    private int imageId;

    public Fruit(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName()
    {
        return this.name;
    }
    public int getImageId()
    {
        return this.imageId;
    }
}
