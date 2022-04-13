import java.util.Scanner;

public class SelectionFun {
    public static void main(String[] args) {
        int n;
        Scanner KeyboardInput=new Scanner(System.in);
        n=KeyboardInput.nextInt();
        KeyboardInput.nextLine();
        if(n>21)
        {
            System.out.println("elegible to vote");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}
