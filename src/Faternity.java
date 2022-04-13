import java.util.Scanner;

public class Faternity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age;
        String gender;
        age=input.nextInt();
        input.nextLine();
        gender=input.nextLine();
        if(age>=19 && gender=="M")
        {
            System.out.println("Allowed");
        }
        else
        {
            System.out.println("Not Allowed");
        }
    }
}
