package Stack;
import java.util.Stack;
public class lenLongSubstring  {
static int findMaxLen(String str)
{
	int n=str.length();
	Stack<Integer> st=new Stack<>();
	st.push(-1);
	int res=0;
	for(int i=0;i<n;i++)
	{
		if(str.charAt(i)=='(')
			st.push(i);
		else
		{
			if(!st.empty())
				st.pop();
			if(!st.empty())
				res=Math.max(res,i-st.peek());
			else 
				st.push(i);
		}
	}
	return res;
}
public static void main(String args[])
{
	String s1="((()()";
	System.out.println("maximum length is "+ findMaxLen(s1));
}
}


