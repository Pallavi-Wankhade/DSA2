package Arrays;
//To find missing number from sorted array.

public class findMisNumSorted {
	static int findMiss(int a[],int n)		
	{
	for( int i=1; i<n ;i++)
	if(a[i]-a[i-1]!=1)
		return a[i]-1;
	//last number mising
		return a[n-1];
	
	}
	public static void main(String args[])
	{
	int a[]= {1,2,4,5,6,7,8,9};
	int n=a.length;
	System.out.println("Missing num is " + findMiss(a,n));
}

}
