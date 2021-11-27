package baseline;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution25Test {
@Test
    void passwordVeryWeak() {
    String userInput = "12345";
    int n = userInput.length();
    boolean hasLett = false, hasDigit = false, specialChar = false;

    //Make Special Characters valid.
    Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

    for (char i : userInput.toCharArray()) {
        if (Character.isLetter(i))
            hasLett = true;
        if (Character.isDigit(i))
            hasDigit = true;
        if (set.contains(i))
            specialChar = true;
    if ((hasDigit) && (n <= 8)) {
            String result = "Very Weak";
            System.out.print("The password '" + userInput + "' is a " + result + " password.");
        }
    }
}
    @Test
    void passwordWeak() {
        String userInput = "abcdef";

        int n = userInput.length();
        boolean hasLett = false, hasDigit = false, specialChar = false;

        //Make Special Characters valid.
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        for (char i : userInput.toCharArray()) {
            if (Character.isLetter(i))
                hasLett = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
        if ((hasLett) && (n <= 8)) {
            String result = "Weak";
        }
    }
    @Test
    void passwordStrong() {
    String userInput = "abc123xyz";
            int n = userInput.length();
            boolean hasLett = false, hasDigit = false, specialChar = false;

            //Make Special Characters valid.
            Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

            for (char i : userInput.toCharArray()) {
                if (Character.isLetter(i))
                    hasLett = true;
                if (Character.isDigit(i))
                    hasDigit = true;
                if (set.contains(i))
                    specialChar = true;
            }
        if ((hasLett && hasDigit) && (n >= 8)) {
            String result = "Strong";
        }
        }
            @Test
            void passwordVeryStrong () {
                String userInput = "1337h@xor!";
                int n = userInput.length();
                boolean hasLett = false, hasDigit = false, specialChar = false;

                //Make Special Characters valid.
                Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

                for (char i : userInput.toCharArray()) {
                    if (Character.isLetter(i))
                        hasLett = true;
                    if (Character.isDigit(i))
                        hasDigit = true;
                    if (set.contains(i))
                        specialChar = true;
                }
                if (hasDigit && hasLett && specialChar && (n >= 8)) {
                    String result = "Very Strong";
                }
            }
        }