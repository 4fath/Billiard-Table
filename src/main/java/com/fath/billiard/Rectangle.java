package com.fath.billiard;

import java.util.ArrayList;
import java.util.List;

public class Rectangle {

    private int N;
    private int M;
    private Point point;

    private List<Point> crashedList = new ArrayList<>(); // stored

    public Rectangle(int N, int M, Point point) {
        this.N = N;
        this.M = M;
        this.point = point;
    }

    public void solveProblem() {
        Point nextPoint = findNextPoint(this.point);
        while (true) {
            boolean contains = pointIsASpot(nextPoint);
            if (!contains) {
                nextPoint = findNextPoint(nextPoint);
            } else {
                System.out.println(nextPoint.x + "," + nextPoint.y);
                break;
            }
        }
    }

    private Point findNextPoint(Point point) {
        // find next points x and y axis
        int returnX = point.x;
        int returnY = point.y;
        while (true) {
            returnX = returnX + point.vX;
            returnY = returnY + point.vY;
            if (returnX == N || returnX == 0 || returnY == M || returnY == 0) {
                break;
            }
        }

        // find next points vX and vY
        int returnVX;
        int returnVY;
        if (returnX == N || returnX == 0) {
            returnVX = point.vX * -1;
            returnVY = point.vY;
        } else {
            returnVX = point.vX;
            returnVY = point.vY * -1;
        }

        Point nextPoint = Point.make(returnX, returnY, returnVX, returnVY);
        System.out.println("Crashed: " + nextPoint);

        // check nextPoint already discovered within same ways
        if (crashedList.contains(nextPoint)) {
            System.err.println("infinite, because hits same point within same way");
            System.err.println(-1);
            System.exit(0);
        } else {
            crashedList.add(nextPoint);
        }

        return nextPoint;
    }

    private boolean pointIsASpot(Point p) {
        if (p.x == 0 && p.y == 0) {
            return true;
        } else if (p.x == N && p.y == M) {
            return true;
        } else if (p.x == 0 && p.y == M) {
            return true;
        } else if (p.x == N && p.y == 0) {
            return true;
        }
        return false;
    }
}
