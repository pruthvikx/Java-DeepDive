package com.company;

public class Practice {
    public static void main(String[] args) {

        class EvenNumbers{
            int number;

            public void isEvenNumber(){
                if(number % 2 == 0){
                    System.out.println("Even Number");
                }else if (number == 0){
                    System.out.println("Zero");
                } else{
                    System.out.println("Odd Number");
                }

            }

        }
        EvenNumbers evenNumbers = new EvenNumbers();
        evenNumbers.number = 0;
        System.out.println(evenNumbers.number);
        evenNumbers.isEvenNumber();

        /*   Map map = new HashMap();
        map.put("no1","2");
        map.put("no2","4");
        map.put("no3","6");
        map.put("no4","8");
        map.put("no5","10");

        System.out.println(map.get("no1"));

     int[] evenNummbers = {2, 4, 6, 8, 10};

        System.out.println(evenNummbers.length);
        for (int num : evenNummbers){
            System.out.println(num);
        }

        List<Integer> evenNumbers = new ArrayList<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);
        evenNumbers.add(10);

        for (int evenNum : evenNumbers){
            System.out.println(evenNum);
        }

      */


    }
}
