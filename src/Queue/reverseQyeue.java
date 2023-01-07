package Queue;

import java.util.*;
public class reverseQyeue {
static Queue<Integer> reverse(Queue<Integer> q)
{
	int n=q.size();
	Queue<Integer> q1=new LinkedList<>();
	for(int i=0;i<n;i++)
	{
		for(int j=0; j <q.size()-1 ;j++)
		{
			int t=q.peek();
			q.remove();
			q.add(t);
		}
		q1.add(q.peek());
		q.remove();
	}
	return q1;
}
public static void main(String args[])
{
	Queue<Integer> q=new LinkedList<>();
	q.add(1);
	q.add(2);
	q.add(3);
	q.add(4);
	q.add(5);
	q=reverse(q);
	 while(!q.isEmpty())
	 {
		 System.out.print(q.peek()+" ");
		 q.remove();
	 }
}
}
