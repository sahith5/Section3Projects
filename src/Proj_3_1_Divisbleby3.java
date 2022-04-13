import java.util.Scanner;

public class Proj_3_1_Divisbleby3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n= s.nextInt();
        if(n%3==0)
        {
            System.out.println("divibleby3");
        }
        else
        {
            System.out.println("not divisible by 3");
        }
    }
}
