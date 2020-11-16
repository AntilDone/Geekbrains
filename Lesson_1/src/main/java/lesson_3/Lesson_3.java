package lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lesson_3 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            do {
                Random r = new Random();
                int x = r.nextInt(9);
                int f;
                System.out.println("Guess the number!");

                for (int i = 1; i <= 3; i++) {
                    f = Integer.parseInt(br.readLine());

                    if (f == x) {
                        System.out.println(f + " = " + x + " You win!");
                        break;
                    }
                    else if (f > x) System.out.println(f + " > ?");
                    else {
                        System.out.println(f + " < ?");
                    }

                    if (i == 3) System.out.println("You Loose! The number is: " + x);
                }

                System.out.println("Do you wish to play again? 1 - YES / 0 - NO");

                int repeat = Integer.parseInt(br.readLine());
                while ((repeat < 0) || (repeat > 1)) {
                    System.out.println("Enter correct number: 1 - YES / 0 - NO");
                    repeat = Integer.parseInt(br.readLine());
                }

                if (repeat == 1) {
                    System.out.println("Starting new game...");
                }
                else {
                    System.out.println("Good bye!");
                    return;
                }
            } while (true);
        }
    }

