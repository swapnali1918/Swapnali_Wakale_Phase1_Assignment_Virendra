package core.programs.methods;

public class Calculate  {
	
	public void cal(int a,int b)
	{
		System.out.println("Add two Number : "+ (a+b));
		
	}
	public void cal(int r)
	{
		System.out.println("Area of circle : "+(3.14*r*r));
	}
	public void cal(int l , float w) 
	{
		System.out.println("Area of Reactangle : "+(l*w));
	}
	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.cal(10,20);
		c.cal(5);
		c.cal(3,5.0F);

	}

}
