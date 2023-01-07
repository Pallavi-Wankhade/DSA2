package Queue;

import java.util.*;

public class createQueue {
	public static void main(String args[])
	{
		Queue<String> q=new PriorityQueue<>();
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("D");
		q.add("E");
		System.out.println(q+" ");
		System.out.println("size is "+q.size());
		q.remove("C");
		System.out.println(q);
		System.out.println(q.poll());// show and remove first element
		System.out.println("first element is "+q.peek());
		

}
}