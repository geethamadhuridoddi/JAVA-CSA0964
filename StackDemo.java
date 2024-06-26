import java.util.*;

class StackDemo {
    public static void main(String[] args)
    {


        Stack stack1 = new Stack();


        Stack<String> stack2 = new Stack<String>();

        stack1.push("4");
        stack1.push("Geetha");
        stack1.push("Madhuri");

        stack2.push(" ");
        stack2.push("kavya");
        stack2.push("Bhumika");

        System.out.println(stack1);
        System.out.println(stack2);
    }
}

