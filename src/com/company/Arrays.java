package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arrays {
    public static void main(String[] args){
        int[] myArray = {1, 2, 3, 4, 'a', 23};
        System.out.println(myArray.length);

        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove(2);
        System.out.println(list.toString());

        List countryList = new ArrayList();
        countryList.add("India");
        countryList.add("phillipines");
        countryList.add("Japan");
        countryList.remove("phillipines");
        countryList.add("America");

        System.out.println(countryList.toString());

        Map map = new HashMap();
        map.put("Blank","Mind");
        map.remove("Blank");
        System.out.println(map.size());
        }
    }

