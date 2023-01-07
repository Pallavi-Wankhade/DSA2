package Arrays;
//find smallest maximum occurred element in ranges.
public class maxOccrInt {
static int MAX=100000;
static int maxOccuerdElement(int L[],int R[],int n)
{
	int [] Ar=new int[MAX];
	int maxVal=-1;
	for(int i=0;i<n;i++)
		{
		Ar[L[i]]++;
		Ar[R[i]+1]--;
		if(R[i]>maxVal)  
		{ 
			maxVal=R[i];
		}
		}
	int maxSum=Ar[0],ind=0;
	for(int i=1;i<(maxVal+1);i++)
	{
	Ar[i+1]=Ar[i+1]+Ar[i];
	if(maxSum<Ar[i])
	{
		maxSum=Ar[i];
		ind=i;
		
	}
	}return Ar[ind];
}
public static void main(String args[])
{
int L[] = { 2,3,1,0 }; 
int R[] = { 20,7,5,4 };
int n=L.length;
System.out.println("Smallest Maximum occured element is "+ maxOccuerdElement(L,R,n));
}

}
