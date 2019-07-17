package aaaa;
import java.util.Scanner;
public   class baohan
{	

public void jisuan(int a,int b,int c,int d,int e)
{
	
if((d-a)*(d-a)+(e-b)*(e-b)<c*c)
	{
		System.out.print("point("+d+","+e+") is in the Cirlce(("+a+","+b+"),"+c+")");
	}
else
	{
		System.out.print("point("+d+","+e+") is not in the Cirlce(("+a+","+b+"),"+c+")");
	}

}

	




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 int a=s.nextInt();
		 int b=s.nextInt();
		 int c=s.nextInt();
		 int d=s.nextInt();
		 int e=s.nextInt();
		baohan test=new baohan();
		test.jisuan(a,b,c,d,e);
   	
	
}
}
