package com.teachmeskill.homework.hometask5;

import java.util.Random;

public class RandomData {
    public static void main(String[] args) {
        System.out.println(getRandomPrice());
    }

    private static Random generateData = new Random();

    public static String getRandomBrand() {
        String[] brands = {"BMW", "Subaru", "Mercedes", "Lamborghini", "Citroen", "Peugeot", "Reno", "Audi", "Ferrari", "Escalate"};

        return brands[generateData.nextInt(10)];
    }

    public static String getRandomModel() {
        String[] models = {"i", "b", "c", "m", "p", "g", "j", "t", "f", "q"};

        String finalModels = models[generateData.nextInt(10)];

        return finalModels += generateData.nextInt((9999 - 1000) + 1) + 1000;
    }

    public static String getRandomColor() {
        String[] colors = {"blue", "black", "red", "yellow", "pink", "orange", "white", "green", "Brown", "Gray"};

        return colors[generateData.nextInt(10)];
    }

    public static int getRandomId() {
        return generateData.nextInt((100 - 10) + 1) + 10;
    }

    public static int getRandomYear() {
        return generateData.nextInt((2019 - 1990) + 1) + 1990;
    }

    public static int getRandomPrice() {
        return generateData.nextInt((9999999 - 10000) + 1) + 10000;
    }

    public static int getRandomRegistrationNumber() {
        return generateData.nextInt((99999999 - 10000000) + 1) + 10000000;
    }


}
