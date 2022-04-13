import java.util.Scanner;

public class Sumfun {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
        while (num>0)
        {
            sum+=num;
            System.out.println(sum);
            num=input.nextInt();
        }
            System.out.println(sum);

    }
}
