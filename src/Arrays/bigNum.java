package Arrays;
//Find the greatest number from array

public class bigNum {
	public static void main(String args[])
	{
		int a[]={1,4,7,15,8,10};
		int g=a[0];
		for(int i=1;i<a.length;i++)
			if(a[i]>g)
				g=a[i];
		System.out.print("Greatest number is "+g);
	}
}
