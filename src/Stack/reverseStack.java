package Stack;
//Program to reverse a stack elements.
import java.util.Stack;

public class reverseStack {
	static Stack<Integer> reverse(Stack<Integer> s1)
	{ int n=5;
	    Stack<Integer> s2 = new Stack<Integer>();
	    for(int i=0;i<n;i++)
	    {
	    int temp=s1.peek();
	    s1.pop();
	    s2.push(temp);
	    }
	    return s2;
	}
	public static void main(String[] args)
	{
	    //int n = 5;
	 
	    Stack<Integer> s = new Stack<Integer>();
	    s.push(1);
	    s.push(2);
	    s.push(3);
	    s.push(4);
	    s.push(5);
	    System.out.println(s);
	    System.out.println("output is"+ reverse(s));

	   /* for(int i = 0; i < n; i++)
	    {
	        System.out.print(s.peek() + " ");
	        s.pop();
	    }
*/
	    }
	}


