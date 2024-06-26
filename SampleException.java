class SampleException
{
    public static void main(String ar[])
    {
        try
        {
            int a=7;
            int b=0;
            c =a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("welcome");
        }

    }
}
