import java.util.Scanner;
public class tihuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
	int x=scn.nextInt();
int y=scn.nextInt();
	int a[][]=new int [x][x];
	int b[][]=new int [x][x];
	int c[][]=new int [x][x];
	int j=0;
	for(int i=0;i<=x-1;i++)
	{
		for(int k=0;k<=i;k++)
		{
			a[k][i]=a[i][k]=scn.nextInt();
		}
	}
	for(int i=0;i<=x-1;i++)
	{
		for(int k=0;k<=i;k++)
	{
			b[k][i]=b[i][k]=scn.nextInt();
			c[k][i]=c[i][k]=0;
		}
	}
	for(int p=0;p<=x-1;p++)
	{
		for(int i=0;i<=x-1;i++)
		{
		for(int k=0;k<=x-1;k++)
		{     
			c[p][i]+=a[p][k]*b[k][i];
		}
		
		}
	}
	
		for(int i=0;i<=x-1;i++) {
			for(int k=0;k<=x-1;k++) {
				System.out.print(c[i][k]+" ");
			}
			System.out.println();
		}
	
	}

}



