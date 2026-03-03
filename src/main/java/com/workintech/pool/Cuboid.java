package com.workintech.pool;

public class Cuboid extends Rectangle{
    private int height;

    public Cuboid(int height, int width, int length){
        super(width, length);

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public int getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea() * this.height;
    }
}


