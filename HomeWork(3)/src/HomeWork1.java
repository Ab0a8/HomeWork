import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        char letter;
        int n;
        boolean wrong = true;
        String color = "";
        System.out.println("Enter a letter from 'A' to 'H' :");
        letter = input.next().charAt(0);
        System.out.println("Enter a number from '1' to '8' :");
        number = input.nextInt();

        for (int i = 0; i < 8; i++)
            if (letter == (letters[i])) {
                wrong = false;
                break;
            }
        if (wrong) {
            System.out.println("Invalid letter");
            return;
        }

        if (n < 1 | n > 8) {
            System.out.println("Invalid number");
            return;
        }

        for (int i = 0; i < 8; i++) {
            if (letter == letters[i]) {
                if (i % 2 == 0) {
                    if (n % 2 != 0)
                        color = "red";
                    else
                        color = "orang";
                    break;
                } else {
                    if (number % 2 == 0)
                        color = "red";
                    else
                        color = "orang";
                    break;
                }

            }
        }
        System.out.println(letter + "" + n + " is " + color);
    }
}
