package Arrays;
//Program to find maximum sum of sub array.
public class maxSubArraySum {
	static int maxSum(int ar[],int n) 
	{
	int maxSum=0,sum=0;
	for(int i=0;i<n;i++)
	{
		sum=sum+ar[i];
		if(sum<=0)
			sum=0;
		maxSum=Integer.max(maxSum, sum);
					
	}
	return maxSum;
	}
public static void main(String args[])
{
int ar[]= {4,3,-2,6,-15,9,-1,5 };
int n=ar.length;
System.out.println("Maximum sum of subarray is "+ maxSum(ar,n));

}
}