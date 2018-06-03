package com.fath.billiard;

import java.util.Arrays;

public final class Helper {

    private Helper() {
    }

    public static boolean validateInputs(int N, int M, int x, int y, int vX, int vY) {
        boolean result = false;
        if (!(1 < N && N < 10e9 && 1 < M && M < 10e9)) {
            System.err.println("Please give valid n and m values: valid input 1 < n,m < 10e9");
            result = true;
        }

        if (!(0 <= x && x <= N && 0 <= y && y <= M)) {
            System.err.println("Please give valid x and y value: valid input 0 <= x,y <= n,m");
            result = true;
        }

        // todo : think about it again
        if (!(Arrays.asList(1, 0, -1).contains(vX) && Arrays.asList(1, 0, -1).contains(vY)) || (vX == 0 && vY == 0)) {
            System.err.println("Please give valid Vx and Vy value: valid input list: {-1, 0, 1} ");
            result = true;
        }
        return result;
    }

    public static boolean checkDotsInBorders(int N, int M, int x, int y, int vX, int vY) {
        if (x == 0 && y != 0) { // dot is in y axis
            if (vX == 0) {
                if (vY == 1) {
                    System.out.println("Point is in border!");
                    System.out.println(0 + "," + M);
                    return true;
                } else {
                    System.out.println("Point is in border!");
                    System.out.println(0 + "," + 0);
                    return true;
                }
            }
        } else if (x == N && y != 0) { // dot is in N line
            if (vX == 0) {
                if (vY == 1) {
                    System.out.println("Point is in border!");
                    System.out.println(N + "," + M);
                    return true;
                } else {
                    System.out.println("Point is in border!");
                    System.out.println(N + "," + 0);
                    return true;
                }
            }
        }

        if (y == 0 && x != 0) { // dot is in x axis
            if (vY == 0) {
                if (vX == 1) {
                    System.out.println("Point is in border!");
                    System.out.println(N + "," + 0);
                    return true;
                } else {
                    System.out.println("Point is in border!");
                    System.out.println(0 + "," + 0);
                    return true;
                }
            }
        } else if (y == M && y != 0) {
            if (vY == 0) {
                if (vX == 1) {
                    System.out.println("Point is in border!");
                    System.out.println(N + "," + M);
                    return true;
                } else {
                    System.out.println("Point is in border!");
                    System.out.println(0 + "," + M);
                    return true;
                }
            }
        }

        return false;
    }
}
