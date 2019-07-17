package ccc;

import java.util.Scanner;

public class student {
	
	
public void toString(String a,int b,int c,String d,int e)
{
	System.out.println(a+","+b+","+c+","+d);
}



		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scn=new Scanner(System.in);
	student p=new student();
int n=scn.nextInt();
String []q=new String[n];
int []w=new int [n];
int []e=new int [n];
String []r=new String [n];
int []t=new int [n];
for(int i=0;i<n;i++)
{
   q[i]=scn.next();	
   w[i]=scn.nextInt();
   e[i]=scn.nextInt();
   for(int k=1;k<e[i];k++)
   {
	   r[k]=scn.next();
	   t[k]=scn.nextInt();
   
   p.toString(q[i],w[i],e[i],r[k],t[k]);
}
}
	
	

	
		}
}
	

	
		
	


