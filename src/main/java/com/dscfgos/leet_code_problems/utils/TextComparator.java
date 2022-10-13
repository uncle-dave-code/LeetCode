package com.dscfgos.leet_code_problems.utils;

import java.time.LocalDateTime;
import java.util.Comparator;

public class TextComparator{
//    @Override
//    public int compare(String o1, String o2) {
//        if (o1 == null && o2 == null) {
//            return 0;
//        } else if (o1 == null) {
//            return -1;
//        } else if (o2 == null) {
//            return 1;
//        } else {
//            return o1.compareTo(o2);
//        }
//    }

    public Comparator<Number> getComparator() {
        return new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                if (o1 == null && o2 == null) {
                    return 0;
                } else if (o1 == null) {
                    return -1;
                } else if (o2 == null) {
                    return 1;
                } else {
                    return o1.toString().compareTo(o2.toString());
                }
            }
        };
    }
}

