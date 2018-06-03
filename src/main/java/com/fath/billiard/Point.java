package com.fath.billiard;

public class Point {

    int x;
    int y;
    int vX;
    int vY;

    Point(int x, int y, int vX, int vY) {
        this.x = x;
        this.y = y;
        this.vX = vX;
        this.vY = vY;
    }

    static Point make(int x, int y, int vX, int vY) {
        return new Point(x, y, vX, vY);
    }
    
}
