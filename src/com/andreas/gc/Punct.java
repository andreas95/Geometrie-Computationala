package com.andreas.gc;

/**
 * Created by Andreas on 5/31/16.
 */

public class Punct {

    private double x;
    private double y;
    private double z;

    public Punct(double x, double y) {
        this.x=x;
        this.y=y;
    }

    public Punct(double x, double y, double z) {
        this.x=x;
        this.y=y;
        this.z=z;
    }

    public void setX(double x) {
        this.x=x;
    }

    public void setY(double y) {
        this.y=y;
    }

    public void setZ(double z) {
        this.z=z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

}