package core.programs.methods;

public class CalArea {
	float a;
	int b,p,q,d,tr;
	long base,height;
	long c;
	int romb;
	
	public void rom(int p,int q)
	{
		romb=(p*q/2);
		System.out.println("Area of Rhombus : "+romb);
	}
	public void tri(long base,long height)
	{
		tr=(int) (0.5*base*height);
		System.out.println("Area of Triangle : "+tr);	
	}
	public  CalArea(Float s) 
	{
		a=s;
	}
	public CalArea(int l ,long w)
	{
		b=l;
		c=w;
	}
	public CalArea(int r)
	{
		d=r;
	}
	
	public void display()
	{
		System.out.println("Area of square : "+(a*a));	
	}
	public void display1()
	{
		System.out.println("Area of rect : "+(b*c));
	}
	public void display2()
	{
		System.out.println("Area of cir : "+(3.14*d*d));
	}
	public static void main(String[] args) {
	CalArea ca = new CalArea(10.0F);
	ca.display();
	CalArea a = new CalArea(5,3);
	a.display1();
	CalArea b = new CalArea(6);
	b.display2();
	//CalArea ca3 = new CalArea(10,15);
	ca.rom(10,15);
	ca.tri(2,3);
}
}