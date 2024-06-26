import java.util.Scanner;
public class SampleEvenOdd
{
    public static void main(String ar[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();

        if(num%2==0)
        {
            System.out.println("the entered number is even "+num);
        }
        else
        {
            System.out.println("the entered number is odd "+num);
        }

    }
}
