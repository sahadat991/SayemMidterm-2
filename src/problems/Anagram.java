package problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */

//Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
//same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

public class Anagram {

    public static void main(String[] args) {

        check("CAT", "ACT");
        check("MARY", "ARMY");
        check("NANO", "NONA");
        check("TOP", "POT");
        check("SAYEM", "SAYEN");
    }

    public static void check(String word, String anagram) {
        if (Anagram(word, anagram) == true) {
            System.out.println(anagram + " is an anagram of " + word);
        } else {
            System.out.println(anagram + " is NOT an anagram of " + word);
        }
    }

    private static boolean Anagram(String word, String anagram) {
        if (word.length() != anagram.length()) {
            return false;
        }

        char[] chars = word.toCharArray();
        for (char c : chars) {
            int index = anagram.indexOf(c);
            if (index != -1) {
                anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
            } else {
                return false;
            }
        }
        return anagram.isEmpty();
    }

}
