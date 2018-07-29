import java.util.Scanner;
 public class EvenNumber_Java {
	public static void main(String args[])
	{
		int i,j;
		System.out.println("Enter the Number:");
		Scanner sn=new Scanner(System.in);
		int N=sn.nextInt();
		sn.close();
		
		for(i=1;i<=N;i++)
		{
			for(j=2;j<=2;j++)
			{
				if(i%j==0)
				{
					System.out.println(i);
				}
			}
		}
			
	}
 }