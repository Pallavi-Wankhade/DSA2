package Arrays;
//Program to find minimum distance between two elements of given array.

public class minDistance {
	static int min_Dist(int ar[],int n,int x,int y)
	{
		int i=0,prev=-1, md=Integer.MAX_VALUE;
		for(i=0;i<n;i++)
		{
		if(ar[i]==x || ar[i]==y)
		{
		prev=i;
		break;
		}
		}
	for(;i<n;i++) 
	{
		if(ar[i]==x || ar[i]==y)
		{
			if(ar[prev]!=ar[i] && (i-prev) < md)
			{ 
				md=i-prev;
				prev=i;
			}
		}
		
	}
	return md;
	}	

	public static void main(String args[])
	{
	int ar[]= {4,2,6,4,1,3,1,3,5,9,2};
	int x=2,y=3;
	int n=ar.length;
	System.out.println("Minimum distance is" + min_Dist(ar,n,x,y));
	}
	

	
}
