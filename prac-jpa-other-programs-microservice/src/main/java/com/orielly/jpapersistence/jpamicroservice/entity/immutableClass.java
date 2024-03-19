package com.orielly.jpapersistence.jpamicroservice.entity;

/**
 * Final class can not be extended.
 * Its members are final means can not be changed.
 */
public final class immutableClass {
    private final int x;
    private final int y;

    public immutableClass(int x , int y ){
        this.x = x;
        this.y = y;
    }

    public immutableClass move(int x , int y ){
        return new immutableClass(x,y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
