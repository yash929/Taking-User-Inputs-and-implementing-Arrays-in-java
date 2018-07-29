import java.util.Scanner;
public class BinarySearch {
	BinarySearch(int B[],int s)
	{
 		int start=0;
		int last=B.length-1;
		while(start<=last)
		{
		int mid=(start+last)/2;
	
		
		if(B[mid]==s)
			{
		
			System.out.println("Exist in array!");
		break;
			
			}
		
		else if(B[mid]>s)
			last=mid-1;
		
		else if(B[mid]<s)
			start=mid+1;
					
		}
		
		
	}
public static void main(String args[])
{
	int[] A={1,4,6,7,8,9,10};
	System.out.println("Enter the Number to search in A={1,4,6,7,8,9,10}:");
	Scanner sn=new Scanner(System.in);
	int x=sn.nextInt();
	sn.close();
	new BinarySearch(A,x);
	
}
}