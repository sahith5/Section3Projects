import java.util.Scanner;

public class Proj_3_1_LearningPackages {
    public static void main(String[] args) {
        System.out.println("enter the package");
        Scanner input =new Scanner(System.in);
        int packageNo=input.nextInt();
        System.out.println("enter the no,. of packages");
        int courses=input.nextInt();
        if(packageNo==1)
        {
            int sum=10;
            if(courses>2)
            {
                sum+=(courses-2)*6;
            }
            System.out.println(sum);


        }
        else if(packageNo==2)
        {
            int sum=12;
            if(courses>4)
            {
                sum+=(courses-4)*4;
            }
            System.out.println(sum);

        }

        else
        {
            int sum=15;
            if(courses>6)
            {
                sum+=(courses-6)*3;
            }

            System.out.println(sum);
        }


    }
}
