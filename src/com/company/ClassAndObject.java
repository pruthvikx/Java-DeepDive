package com.company;

public class ClassAndObject {
    public static void main(String[] args) {

        class Number{
            int intValue;

            public boolean isPositive(){
                if (intValue > 0){
                    return true;
                } else {
                    return false;
                }
            }

        }
        Number number = new Number();
        number.intValue = 0;
        System.out.println(number.intValue);
        if(number.isPositive()){
            System.out.println(number.intValue + " is positive ");
        } else {
            System.out.println(number.intValue + " is negative");
        }

       /* class User {
            int score;

            public boolean hasWon(){
                if (score >= 100){
                    return true;
                }else {
                    return false;
                }
            }

        }

        User user = new User();
        user.score = 101;
        System.out.println(user.score);
        System.out.println(user.hasWon());
*/
    }
}
