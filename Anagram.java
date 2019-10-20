package org.naic.bien.test ;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) throws Exception, IllegalArgumentException {

        Scanner s = new Scanner(System.in);
        String[] array = new String[2];

        System.out.println("Please enter two words:");

        for (int i = 0; i < array.length; i++) {
            array[i] = s.nextLine();
        }
        String input1 = array[0];
        String input2 = array[1];
        isAnagram(input1, input2);

        if (args.length < 2) {
            throw new Exception("There must be two arguments");
        }

        if (args.length > 2) {
            throw new IllegalArgumentException("There only needs to be 2 arguments");
        }
    }

    public static void isAnagram(String input1, String input2) {

        String s1 = input1.replaceAll("\\s", "");

        String s2 = input2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {

            char[] s1Array = s1.toLowerCase().toCharArray();

            char[] s2Array = s2.toLowerCase().toCharArray();

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            status = Arrays.equals(s1Array, s2Array);
        }
        if (status) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

