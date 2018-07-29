import java.util.Scanner;
public class PrimeNumbers {
public static void main(String args[])
{
	int i,j;
	boolean flag=false;
	System.out.println("Enter the Number:");
	Scanner sn=new Scanner(System.in);
	int N= sn.nextInt();
	sn.close();
	
for(i=1;i<=N;i++)
	{
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				flag=true;
				break;
			}
	    	else 
				flag=false;
		}
		if(flag)
		{
			continue;
		}
		else
		{
			System.out.print(i+" ");
		}
	}
 }
}