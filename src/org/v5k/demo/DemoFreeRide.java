package org.v5k.demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DemoFreeRide {

    public static void main(String[] args) throws IOException {
        List<String> stars = new ArrayList<>(Arrays.asList("Valentyn", "Vitalii", "Justin", "Ken", "Raghu", "Slava", "Matt", "Ranjan", "Sam", "Sergii"));
        Random random = new Random();
        System.out.println("Lets get started, shall we?");
        while (!stars.isEmpty()) {
            System.in.read();
            int index = random.nextInt(stars.size());
            System.out.println(stars.get(index));
            stars.remove(index);
        }
        System.out.println();
        System.out.println("Thank you!");
        System.out.println("THE END");

    }
}
