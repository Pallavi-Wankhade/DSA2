package Stack;

import java.util.Stack;

public class NextGrtrElement {
	static int nextGreaterElement(int A[],int n)
	{
		Stack<Integer> st=new Stack<Integer>();
		st.push(A[0]);
		for(int i=0;i<n;i++)
		{
			if(st.empty())
			{
			st.push(A[i]);
			continue;
			}
				while(st.empty()==false &&st.pop()<A[i])
				{
					//System.out.println(st.pop()+" "+A[i]);
					st.pop();
				}
				st.push(A[i]);
				
		}
		while(st.empty()==false)
		{
			//System.out.println(st.pop()+" "+ -1);
			st.pop();
		}
		return n;
		
	}
	public static void main(String args[])
	{
		int Ar[]= {2,4,6,1,9,4,7};
		int n=Ar.length;
		System.out.println("Next greater element is"+ nextGreaterElement(Ar,n));
	}


	
}
