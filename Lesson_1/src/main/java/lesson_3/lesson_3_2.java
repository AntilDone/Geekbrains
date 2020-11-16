package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class lesson_3_2 {
    public static void main(String[] args) throws IOException {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin",
                "potato"};
        String guess = getRandomWord(words);
        String maskedGuess = maskWord(guess);
        System.out.println("Guess the word");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String myWord = br.readLine();
            myWord = maskWord(myWord);
            if (maskedGuess.equals(myWord)) {
                System.out.println("You win! The word is: " + guess);
                break;
            } else {
                StringBuilder maskedResult = new StringBuilder();
                for (int i = 0; i < maskedGuess.length() - 1; i++) {
                    if (maskedGuess.charAt(i) == myWord.charAt(i)) maskedResult.append(maskedGuess.charAt(i));
                    else {
                        final StringBuilder append = maskedResult.append("#");
                    }
                }
                System.out.println(maskedResult);
                System.out.println("WRONG! Try again!");
            }
        }

    }

    static String getRandomWord(String[] s) {
        Random r = new Random();
        return s[r.nextInt(s.length - 1)];
    }

    static String maskWord(String s) {
        String mask = "###############";
        StringBuilder sBuilder = new StringBuilder(s);
        for (int i = sBuilder.length() - 1; i < mask.length() - 1; i++) {
            sBuilder.append(mask.charAt(i));
        }
        s = sBuilder.toString();
        return s;
    }
}
