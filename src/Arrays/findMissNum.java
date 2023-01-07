package Arrays;
//To find missing number from unsorted array.

public class findMissNum {
	static int findMiss(int a[],int n)		
	{
				
		int sumN = (n+1)*(n+2)/2;
		int sumA = 0;
		
		
	for( int i=0; i<n ;i++)
	{
		sumA=sumA+a[i];
	}
	return sumN-sumA;
	}
	public static void main(String args[])
	{
	int a[]= {1,2,7,5,3,8,4};
	int n=a.length;
	System.out.println("Missing num is " + findMiss(a,n));
}
}
