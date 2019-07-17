import java.util.Scanner;
import java.util.Arrays;
public class ji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int a[]=new int [n];
int b=0;
int c[]=new int [2000];
for(int i=0;i<=n-1;i++)
{
	a[i]=scn.nextInt();
}
for(int i=0;i<=n-1;i++)
{
	b=a[i];

	{
	for(int k=2;k<=a[i];k++)
	{
		if(b%k==0)
		{
	while(b%k==0)
	{
		b=b/k;
	}
	   c[k]=k;
		}
	 
	}
	}
}
for(int k=0;k<=c.length-1;k++)
{   
	Arrays.sort(c);
	if(c[k]!=0) {
		System.out.print(c[k]+" ");
	}
	
}


	}

}
