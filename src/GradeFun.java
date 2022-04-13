import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        String grade;
        Scanner KeyboardInput=new Scanner(System.in);
        grade=KeyboardInput.nextLine();
        switch (grade)
        {
            case "A":
            System.out.println("Highesr");
                break;
            case "B":
            System.out.println("second");
                break;
            case "c":
                System.out.println("Third");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
