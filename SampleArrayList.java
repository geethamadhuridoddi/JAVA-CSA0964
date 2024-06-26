import java.util.*;
public class SampleArrayList
{
    public static void main(String ar[])
    {
        try
        {
          List l=new ArrayList();
          l.add(4);
          l.add(3);
          l.add(2);
          l.remove(2);
          System.out.println(l);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

