package com.company;

import java.util.ArrayList;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
      /*  int x = 1;

        while (x <= 5){
            System.out.println(x * 2);
            x++;
        }

        for (int y = 2; y <= 10; y+=2){
            System.out.println(y);
        }

        for (int z = 10; z > 0; z--){
            System.out.println(z);
        }

        int multiple = 1;
        while (multiple <= 10){
            System.out.println(multiple * 3);
            multiple++;
        }

        for (multiple = 1; multiple <= 10; multiple++){
            System.out.println(multiple * 3);
        }

        int triNumber = 1;
        int sum = 0;

        while (triNumber <= 10){
            sum += triNumber; //0+1=1,1+2=3,3+3=6,
            triNumber++;
            System.out.println(sum);
        }

        int triNumber = 1;
        int sum = 0;
        for (triNumber = 1; triNumber <= 10; triNumber++){
            sum+=triNumber;
            System.out.println(sum);
        }

        String[] family = {"pruthvi", "r", "J", "r"};

        for (String name : family){
            System.out.println(name);
        }

       */

        List<String> list = new ArrayList<String>();
        list.add("pruthvi");
        list.add("b");
        list.add("c");
        list.add("d");
        for (String name : list){
            System.out.println(name);
        }

    }
}
