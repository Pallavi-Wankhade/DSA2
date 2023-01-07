package Stack;
//To delete mid element from stack(wrong o/p)
import java.util.Stack;
public class deleteMid {
	static int deleteMidElement(Stack<Character> s,int n) 
	{
		if(s.empty())
		return n;
		char x=s.pop();
		int size =deleteMidElement(s,n+1);
		if(n!=size/2)
			s.push(x);
		return size;
		
	}
	public static void main(String[] args)
	{
	    Stack<Character> s = new Stack<Character>();
	    s.push('1');
	    s.push('2');
	    s.push('3');
	    s.push('4');
	    s.push('5');
	    s.push('6');
	    s.push('7');
	    System.out.println(s);
	    //int n=s.size();
	    deleteMidElement(s,s.size());
	    //System.out.println("Mid number is "+  deleteMidElement(s,n));
	    while(!s.empty())
	    {char p=s.pop();
	    System.out.print(p +" ");}
	    }

}
