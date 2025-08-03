import java.util.Scanner;
import java.util.Random;

public class NUMBERGUESSINGGAME
 {
    public static void main(String[] args) 
    {
        System.out.println("WELCOME TO NUMBER GUESSING GAME");
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String play = "yes";
        while ("yes".equals(play)) 
        {
            int COMPUTERCHOICE = rand.nextInt(100) + 1;
            int attempts = 0;
            int attemptsMax = 10;
            System.out.println("\nGUESS A NUMBER BETWEEN 1 TO 100");
            while (attempts < attemptsMax) 
            {
                System.out.println("\nTOTAL ATTEMPTS MADE IS " + attempts + " out of " + attemptsMax + " ATTEMPTS");
                System.out.println("\nENTER YOUR GUESS :");
                int userNum = sc.nextInt();
                attempts++;
                if (userNum < 1 || userNum > 100)
                {
                    System.out.println("\nYOU CAN GUESS A NUMBER ONLY BETWEEN 1 TO 100");
                }
                 else if (userNum < COMPUTERCHOICE)
                {
                    System.out.println("\nYOUR GUESS IS LOW");
                } 
                else if (userNum > COMPUTERCHOICE)
                 {
                    System.out.println("\nYOUR GUESS IS HIGH");
                } 
                else 
                {
                    System.out.println("\nYOU GUESSED CORRECTLY! THE NUMBER WAS " + COMPUTERCHOICE);
                    System.out.println("\nYOU TOOK " + attempts + " ATTEMPTS");
                    break;
                }
            }
            if (attempts > attemptsMax) 
            {
                System.out.println("\nYOU HAVE REACHED MAXIMUM ATTEMPTS");
            }
            System.out.println("\nDO YOU WANT TO PLAY AGAIN? (yes/no):");
            sc.nextLine();
            play = sc.nextLine().toLowerCase();
            if (!"yes".equals(play)) 
            {
                System.out.println("THANK YOU FOR PLAYING!");
            }
        }
        sc.close();
    }
}