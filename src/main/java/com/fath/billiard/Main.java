package com.fath.billiard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // read inputs
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = bufferedReader.readLine();

        inputStreamReader.close();
        bufferedReader.close();

        String[] inputArr = input.split("\\s+");
        int N = Integer.valueOf(inputArr[0]);
        int M = Integer.valueOf(inputArr[1]);
        int x = Integer.valueOf(inputArr[2]);
        int y = Integer.valueOf(inputArr[3]);
        int vX = Integer.valueOf(inputArr[4]);
        int vY = Integer.valueOf(inputArr[5]);

        // validate inputs for given description
        boolean isNotValid = Helper.validateInputs(N, M, x, y, vX, vY);
        if (isNotValid) {
            System.out.println("Invalid inputs, please give inputs within below rules.");
            return;
        }

        // check dots and ways, if dot directly goes a spot
        boolean isInLine = Helper.checkDotsInBorders(N, M, x, y, vX, vY);
        if (isInLine) {
            return;
        }
    }
}
