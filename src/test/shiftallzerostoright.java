package test;

public class shiftallzerostoright {
	static void moveZeroElementToEnd(int[] a)
	{
		int s = a.length;
		int count = 0;
 
		for (int i = 0; i < s; i++)
		{
			if (a[i] != 0)
			{
				a[count++] = a[i];
			}
		}
 
		while (count < s)
		{
			a[count++] = 0;
		}
	}
 
	public static void main(String[] args)
	{	
		int[] a = {1,0,45,34,0,67,2,0,6,67,45,2,0,10};
		moveZeroElementToEnd(a);
 
		System.out.print("Array after Moving Zeros to End : ");
 
		for (int i = 0, s = a.length; i < s; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
