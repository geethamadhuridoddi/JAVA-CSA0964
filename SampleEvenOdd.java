import java.util.Scanner;
class SampleEvenOdd
{
    public static void main(String ar[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = S.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}