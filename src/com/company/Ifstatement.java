package com.company;

public class Ifstatement {
    public static void main(String[] args) {
        int age = 18;

        if(age > 18){
            System.out.println("User is greater than 18");
        }else if(age == 18){
            System.out.println("User age is equal to 18");
        }else {
            System.out.println("age is less than 18");
        }

        int[] myArr = {10,10};

        if(myArr[1] > myArr[0]){
            System.out.println(myArr[1] + " is greater than " + myArr[0]);
        }else if(myArr[1] == myArr[0]){
            System.out.println(myArr[1] + " is equal to " + myArr[0]);
        } else {
            System.out.println(myArr[1] + " is less than " + myArr[0]);
        }
    }
}
