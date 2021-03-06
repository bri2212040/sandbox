package org.example;

import java.util.HashMap;
import java.util.Map;

public class Algorithm {

    private static Map<Integer, Long> dictionary = new HashMap<>();

    public static long fib(int n){
        if (n == 0){
            return 0L;
        }

        if (n == 1){
            return 1L;
        }

        return memo(n -1) + memo(n -2);
    }

    private static long memo(int n){

    Long value = dictionary.get(n);

    if (value != null){
        return value;
    }

    value = fib(n);
    dictionary.put(Integer.valueOf(n),value);
    return value;
    }
    public static void main(String[] args) {
        System.out.println(Algorithm.fib(5));
        System.out.println(Algorithm.fib(10));
        System.out.println(Algorithm.fib(20));
        System.out.println(Algorithm.fib(50));
    }

}
