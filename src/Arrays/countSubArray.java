package Arrays;
//count all subArray with greater length than given element

public class countSubArray {
	static int countSubArrays(int ar[],int n, int k)
	{
		int i=0, count=0, subArray=0;
		for(i=0;i<n;i++)
		{
			if(ar[i]>k) continue;
		count=0;
		for(;i<n&&ar[i]<=k;i++)
			count++;
		subArray=subArray+((count*(count+1)/2));
		//return subArray;
	}
	return ((n*(n+1))/2-subArray);
	
	}

public static void main(String args[])
{
int ar[]= {4,3,2,6,1,5 };
int k=3;
//int subArray=0;
int n=ar.length;
System.out.println("Remaining subarrays greater than "+ k +" is "+ countSubArrays(ar,n,k));

//System.out.println("Subarray less than k is "+ subArray);
}
}


