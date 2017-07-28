package org.v5k.retrospective;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Circle {

    public static void main(String[] args) {
        List<String> stars = new ArrayList<>(Arrays.asList("Valentyn", "Vitalii", "Justin", "Ken", "Raghu", "Slava", "Matt", "Ranjan", "Sam", "Sergii"));
        Collections.shuffle(stars);
        System.out.println("...");
        for (int i = 0; i < stars.size(); i++) {
            if (i == stars.size() - 1) {
                System.out.print(stars.get(0));
            } else {
                System.out.print(stars.get(i) + "->");
            }
        }
        System.out.println("\n...");
    }
}
