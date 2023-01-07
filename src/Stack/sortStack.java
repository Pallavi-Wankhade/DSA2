package Stack;
//Program to sort stack in ascending order.
import java.util.Stack;

public class sortStack {
static Stack<Integer> sortstack(Stack<Integer> input) 
{
	Stack<Integer> tempst=new Stack<Integer>();
	
		while(!input.isEmpty())
		{
			int temp=input.pop();
			while(!tempst.isEmpty() &&tempst.peek()>temp)
			{
				input.push(tempst.pop());
			}
			tempst.push(temp);
		}
		return tempst;
	
}
public static void main(String args[])
{
Stack<Integer> input=new Stack<Integer>();
input.add(34);
input.add(40);
input.add(6);
input.add(17);
input.add(15);
System.out.println("Given numbers are "+ input);
System.out.println("Sorted numbers are "+  sortstack(input));

}}