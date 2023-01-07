package Arrays;
//To find minimum swaps required to bring all elements together <= given element.
public class minSwap {
	static int minSwaps(int A[],int n,int k)
	{
		int ws=0,ans=Integer.MAX_VALUE,i,j,large=0;
		for(i=0;i<n;i++)
		{
			if(A[i]<=k)
				ws++;
		}
		for(i=0;i<ws;i++)
		{
			if(A[i]>k)
				large++;
		}
		ans=large;
		for(i=1,j=ws+1;j<n;i++,j++)
		{
			if(A[i]>k) large--;
			if(A[j]>k) large++;
			ans= Math.min(ans,large);
 		}
		return ans;
	}
	public static void main(String args[])
	{
	int A[] = { 20,3,2,8,7,1,5,4 };
	int k=4;
	int n=A.length;
	System.out.println("Minimum swaps required is "+ minSwaps(A,n,k));
	}

}
