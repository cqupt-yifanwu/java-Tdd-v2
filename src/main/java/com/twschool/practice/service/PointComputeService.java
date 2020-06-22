package com.twschool.practice.service;

public class PointComputeService {
    // 连续赢的局数，静态变量可以得以保存
    private static int gameWinNumber = 0;
    private static int points = 0; // 分数

    public static void addGameWinNumber() {
        gameWinNumber += 1;
    }

    public static void clearGameWinNumber() {
        gameWinNumber = 0;
    }

    public int addPoint() {
        points += 3;

        if ((gameWinNumber % 3) == 0) {
            points += 2;
        }

        if ((gameWinNumber % 5) == 0) {
            points += 3;
        }

        return points;
    }

    public int subductionPoint() {
        points -= 3;
        return points;
    }
}
