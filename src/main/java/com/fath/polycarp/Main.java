package com.fath.polycarp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
* another problem, another package
*
* http://codeforces.com/problemset/problem/988/F
*
* */

public class Main {

    public static void main(String[] args) throws IOException {

        // read inputs
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String input = bufferedReader.readLine();

        String[] firstInputArr = input.split("\\s+");
        int a = Integer.parseInt(firstInputArr[0]);
        int n = Integer.parseInt(firstInputArr[1]);
        int m = Integer.parseInt(firstInputArr[2]);


        List<RainyArea> rainyAreaList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String eachLine = bufferedReader.readLine();
            String[] eachLineArr = eachLine.split("\\s+");
            int l = Integer.parseInt(eachLineArr[0]);
            int r = Integer.parseInt(eachLineArr[1]);
            rainyAreaList.add(RainyArea.make(l, r));
        }


        List<Umbrella> umbrellaList = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String eachLine = bufferedReader.readLine();
            String[] eachLineArr = eachLine.split("\\s+");
            int w = Integer.parseInt(eachLineArr[0]);
            int p = Integer.parseInt(eachLineArr[1]);
            umbrellaList.add(Umbrella.make(w, p));
        }

        inputStreamReader.close();
        bufferedReader.close();

    }

    static class RainyArea {
        int l;
        int r;

        RainyArea(int l, int r) {
            this.l = l;
            this.r = r;
        }

        static RainyArea make(int l, int r) {
            return new RainyArea(l, r);
        }
    }

    static class Umbrella {
        int w;
        int p;

        Umbrella(int w, int p) {
            this.w = w;
            this.p = p;
        }

        static Umbrella make(int w, int p) {
            return new Umbrella(w, p);
        }
    }
}
