package iegcode.standard.classes;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 20; i++){
            int value = random.nextInt(20);
            System.out.println(value);
        }
    }
}
