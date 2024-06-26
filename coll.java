import java.util.Collection;
import java.util.*;
public class coll{
    public static void main(String arg[])
    {
        List l=new LinkedList();
        l.add("ram");
        l.add("ammu");
        l.add("mom");
        l.add("dad");
        Collections.shuffle(l);
        System.out.println(l);
    }
}
