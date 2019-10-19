package org.naic.bien.test ;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) throws Exception, IllegalArgumentException {

        String input1= "iamdl";
        String input2 = "timil";
        isAnagram(input1, input2);

        if (args.length < 2) {
            throw new Exception("There must be two arguments");
        }

        if (args.length > 2) {
            throw new IllegalArgumentException("There only needs to be 2 arguments");
        }
    }

    public static void isAnagram(String input1, String input2) {
        //Remove all whitespace first
        String s1 = input1.replaceAll("\\s", "");

        String s2 = input2.replaceAll("\\s", "");

        boolean status = true;

        if (s1.length() != s2.length()) {
            status = false;
        } else {
            //Convert into character array

            char[] s1Array = s1.toLowerCase().toCharArray();

            char[] s2Array = s2.toLowerCase().toCharArray();

            //Sorting both character array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Check if both arrays are equal

            status = Arrays.equals(s1Array, s2Array);
        }
        if (status) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

