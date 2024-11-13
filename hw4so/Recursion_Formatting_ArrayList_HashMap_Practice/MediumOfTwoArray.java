package Recursion_Formatting_ArrayList_HashMap_Practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class MediumOfTwoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size1 = scanner.nextInt();
        ArrayList<Integer> arlist = new ArrayList<>();
        // I don't want to create two separate arrays just to merge them, so I directly add the integers to the ArrayList
        for (int i = 0; i < size1; i++) {
            arlist.add(scanner.nextInt());
        }

        int size2 = scanner.nextInt();
        for (int i = 0; i < size2; i++) {
            arlist.add(scanner.nextInt());
        }

        Collections.sort(arlist);

        if (arlist.size() % 2 == 0) {
            double median = (arlist.get(arlist.size() / 2 - 1) + arlist.get(arlist.size() / 2)) / 2.0;
            System.out.printf("The median of the two sorted arrays is: %.1f", median);
        }else {
        System.out.printf("The median of the two sorted arrays is: %.1f%n", (double) arlist.get(arlist.size() / 2));
    }   

    }
}
