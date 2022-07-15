package islam.farhad.exercises;

import java.util.Locale;

public class Palindrome {

    public static void main (String ... args){

        System.out.println("Plaindrome Demo");

        isPalindrome("Monsoon");
    }

    public static void isPalindrome(String word){

        //String word = "Radar";
        String word_reversed = "";

        for (int i = word.length()-1; i >= 0; i--){
            word_reversed = word_reversed + word.charAt(i);
        }

        System.out.println("Word Entered: " + word.toLowerCase());
        System.out.println("Word Reversed: " + word_reversed.toLowerCase());

        if (word_reversed.toLowerCase().equals(word.toLowerCase())){
            System.out.println("Word is a palindrome");
        }else{
            System.out.println("Word is a not palindrome");
        }
    }
}

