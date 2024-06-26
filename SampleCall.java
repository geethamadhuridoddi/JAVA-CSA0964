import java.util.*;
class SampleCall {
    public static void main(String ar[]) {
        try {
            List l = new LinkedList();
            l.add(1);
            l.add(2);
            l.add(3);
            l.remove(2);
            System.out.println(l);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
