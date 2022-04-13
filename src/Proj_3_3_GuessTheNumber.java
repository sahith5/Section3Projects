import java.util.Random;
import java.util.Scanner;

public class Proj_3_3_GuessTheNumber {
    public static void main(String[] args) {
        Random r=new Random();
        int number=r.nextInt(101);

        Scanner input=new Scanner(System.in);
        int guess=1;
        while (true)
        {
            int numberguess=input.nextInt();
            if(numberguess<0 || numberguess>100)
            {
                System.out.println("guess wasted number is between 0 and 100");
                guess+=1;
            }
            else if(numberguess==number)
            {
                System.out.println("Crct Guess number of guesses are "+guess);
                break;
            }
            else if(numberguess<number)
            {
                System.out.println("number is higher");
                guess+=1;
            }
            else if (numberguess>number)
            {
                System.out.println("number is lower");
                guess+=1;
            }
        }

    }
}
