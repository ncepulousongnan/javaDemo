import java.util.Scanner;


	public class point
	{
	public	int i1=0;
	public int i2=0;
	public int i3=0;
	public int i4=0;
	public int i5=0;
		public void setI1(int i1)
		{
			this.i1=i1;
		}
		public void setI2(int i2)
		{
			this.i2=i2;
		}
		
		public void setI3(int i3) {
			
			this.i3=i3;
		}
		
		public void setI4(int i4)
		{
			this.i4=i4;
		}
		public void setI5(int i5)
		{
			this.i5=i5;
		}
			public int getI1()
			{
				return i1;
			}
			public int getI2()
			{
				return i2;
			}
			public int getI3()
			{
				return i3;
			}
		public int getI4()
		{
			return i4;
		}
		public int getI5()
		{
			return i5;
		}
		
		
		public point()
		{
			super();
		}
		public point(int i1,int i2,int i3,int i4,int i5)
		{
			super();
			this.i1=i1;
			this.i2=i2;
			this.i3=i3;
			this.i4=i4;
			this.i5=i5;
		}
	
		public static class test1
		{
			 int d=0;
			int q=0;
			int w=0;
			double r=0;
			double y1=0;
			double y2=0;
			int p=0;
			int o=0;
			double juli=0;
			public   void getDistance(point a)
			{    p=a.getI4();
			    o=a.getI5();
				d=a.getI1();
				q=a.getI2();
				w=a.getI3();
				y1= Math.sqrt(d*d+q*q);
				 y2=Math.sqrt(w*w+w*w);
				 juli=Math.sqrt((d-p)*(d-p)+(q-o)*(q-o));
				 r=Math.sqrt((d-w)*(d-w)+(q-w)*(q-w));
				 
			}
			public double getY1()
			{
				return y1;
			}
			public double getY2()
			{
				return y2;
			}
			public double getJuli()
			{
				return juli;
			}
			public double getR()
			{
				return r;
			}
			
			
		}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int d=scn.nextInt();
		int e=scn.nextInt();
		
		point j=new point(a,b,c,d,e);
		test1 test=new test1();
		test.getDistance(j);
		double []q=new double [4];
		q[0]=test.getY1();
		q[1]=test.getY2();
		q[2]=test.getJuli();
		q[3]=test.getR();
		for(int i=0;i<=3;i++)
		{
		System.out.println(String.format("%.2f",q[i]));
		
		}
	
	}
	
	}
	

