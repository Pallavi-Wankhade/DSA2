package Stack;
//check given parenthesis in an expression.
import java.util.Stack;

public class checkParanthesis {
static boolean checkParan(String expr[])
{ 	
	Stack<Object> s=new Stack<>();
	//stack<character> s=new stack<character>();
	String x;
	for(int i=0;i<expr.length;i++)
	{
		if(expr[i]=="("|| expr[i]=="{"|| expr[i]=="[")
		{ 
		s.push(expr[i]);
		continue;
		}
		if(s.empty()) return false;
		switch(expr[i])
		{
		case ")":
			x=(String) s.pop();
			if(x!="(") return false;
			break;
		case "}":
			x=(String) s.pop();
			if(x!="{") return false;
			break;
		case "]":
			x=(String) s.pop();
			if(x!="[") return false;
			break;
		}
	}
	/*if(s.empty()) 	{		return true;	}*/
	return(s.empty());
}
public static void main(String args[])
{
	String ex[]={"(","[","]",")"};
	System.out.println("checking is "+ checkParan(ex));
}
}
