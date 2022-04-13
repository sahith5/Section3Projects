import java.util.Random;

public class RandomFile {
    public static void main(String[] args) {
        Random r=new Random();
        int num;
        for(int i=0;i<=9;i++)
        {
            num=r.nextInt(6)+1;
            System.out.println(num);
        }

    }
}
