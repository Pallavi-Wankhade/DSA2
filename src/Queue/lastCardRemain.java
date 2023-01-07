package Queue;

import java.util.LinkedList;
import java.util.Queue;
//Find the last remained card from given pattern.
public class lastCardRemain {
	static int lastCard(Queue<Integer> q){
		//Queue<Integer> q1=new LinkedList<>();
		while(((int)q.size())>=2)
		{
		int t=q.peek();
		q.add(t);
		q.remove();
		q.remove();
		}
		return q.peek();
	}
	public static void main(String args[])
	{
		Queue<Integer> q=new LinkedList<>();
		q.add(1);
		q.add(5);
		q.add(8);
		q.add(4);
		q.add(2);
		System.out.println(q+" ");
		System.out.print("last card is  "+lastCard(q));
		 }
	}


