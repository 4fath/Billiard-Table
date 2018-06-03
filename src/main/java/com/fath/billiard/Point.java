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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point otherPoint = (Point) obj;
            if (otherPoint.x == this.x && otherPoint.y == this.y && otherPoint.vX == this.vX && otherPoint.vY == this.vY) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Point:{ " +
                "x= " + x +
                ", y= " + y +
                ", vX= " + vX +
                ", vY= " + vY +
                " }";
    }

}
