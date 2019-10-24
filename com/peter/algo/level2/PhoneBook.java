package com.peter.algo.level2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhoneBook {
    public static void main(String[] args) {
        System.out.println(solution(new String[] { "119", "97674223", "1195524421" })); // false;
        System.out.println(solution(new String[] { "123", "456", "789" })); // false;
        System.out.println(solution(new String[] { "12", "123", "1235", "567", "88" })); // false;
    }

    public static boolean solution(String[] phone_book) {
        List<String> list = Arrays.asList(phone_book);
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            String pre = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j).indexOf(pre) == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
