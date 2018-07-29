public class Sorting {
public static void main(String args[])
{
	int i,j,temp=0;
	int A[]={2,2,2,2,4,4,2,4};
	System.out.println("Given array: 2 2 2 2 4 4 2 4 ");
	for(i=0;i<A.length-2;i++)
	{
		for(j=i+1;j<A.length;j++)
		{
			if(A[i]>A[j])
			{
				temp=A[i];
				A[i]=A[j];
				A[j]=temp;
			}
		}
	}
	System.out.print("Sorted array: ");
	for(i=0;i<A.length;i++)
	{
		System.out.print(" "+A[i]);	
	}
	
}
	
	
}