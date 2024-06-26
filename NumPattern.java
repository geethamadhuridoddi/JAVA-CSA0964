public class NumPattern
{
    public static void main(String args[])
    {
        int r,c,s,row=5;

        for(r=5; r<=row; r++)
        {
            for(c=1; c<=row-1; c++)
            {
                System.out.print(r);
            }
            {
                for(s=1; s<=r; s++){
                    System.out.print(r);

                }
            }
            System.out.println();
        }
    }
}

