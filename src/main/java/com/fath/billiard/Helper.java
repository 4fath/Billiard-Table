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
}
