package Arrays;
//Program to find minimum position from where to start in circular way..
public class findMinPos {
	static int findMinPos(int fuel[], int dist[],int n)
	{
		float last=0;
		int pos=0;
		float minFuel=0;int minPos=0;
		while(pos<n) 
		{
			last +=fuel[pos];
			last -=dist[pos];
			pos++;
			if(last<minFuel)
			{
			minFuel=last;
			minPos=pos%n;
			}
		}
return minPos;
} 
	public static void main(String args[])
	{
	//int fuel[]= {5,3,12,1,7};	int dist[]= {8,4,7,4,5};//here(last>minFuel)
	int fuel[] = { 3,4,6,3,7,11 }; int dist[] = { 3,10,2,4,6,9 }; 
	int n=dist.length;
	System.out.println("Minimum position will be "+ findMinPos(fuel,dist,n));
	}
}
