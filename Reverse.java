import java.util.Scanner;
public class Reverse {
	public static void main (String args[])
	{
		int R=0;
		System.out.println("Enter the Number to be reversed:");
		Scanner sn=new Scanner(System.in);
		int N= sn.nextInt();
		sn.close();
		System.out.println("The number You Entered:"+N);
		while(N>0)
		{
			R=R*10+N%10;
			N=N/10;
		}
		System.out.println("The Reverse of the Number is:"+R);
	}
 	}