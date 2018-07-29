import java.util.Scanner;
public class Armstrong_Java {
public static void main(String args[])
{
	int i,j,M,Z,sum,count,temp;
	System.out.println("Enter the Number:");
	Scanner sn=new Scanner(System.in);
	int N=sn.nextInt();
	sn.close();
	count=0;
	temp=N;
	sum=0;
	while(temp!=0)
	{
		count++;
		temp=temp/10;
	}
	temp=N;
	
	for(j=1;j<=count;j++)
	{
		Z=temp%10;
		M=Z;
		for(i=1;i<=count-1;i++)
		{
			M=M*Z;
		}
		temp=temp/10;
		sum=sum+M;
	}
	
	if(sum==N)
	{
		System.out.println("It is an Armstrong Number");
	}
	else
		System.out.println("It is not an Armstrong Number");
}
 }