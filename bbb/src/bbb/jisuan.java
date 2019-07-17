package bbb;

import java.util.Scanner;



	public class jisuan
	{
		public void  mianji(int a,int b,double c)
		{
			double mianji;
			mianji=c*c*Math.PI;
			
			System.out.println( "Area of Circle(("+a+","+b+"),"+c+") is:"+String.format("%.2f",mianji));
		}
		public void panduan(int a,int b,double c,int d)
		{
			if((d-a)*(d-a)+(d-b)*(d-b)<c*c)
			{
				System.out.println("Point("+d+","+d+") is in the Circle(("+a+","+b+"),"+c+")");
				
			}
			else
			{
				System.out.println("Point("+d+","+d+") is not in the Circle(("+a+","+b+"),"+c+")");
			}
			
		}
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
	int a=scn.nextInt();
	int b=scn.nextInt();
	double c=scn.nextDouble();
	int d=scn.nextInt();
	jisuan q=new jisuan();
	q.mianji(a,b,c);
	q.panduan(a,b,c,d);
	
		}
		}
	
	