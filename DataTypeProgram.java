package core.programs;

public class DataTypeProgram {

	public static void main(String[] args) {
	/*
		boolean x=true;
		char gender = 'M';
		int age = 21;
		long dist = 526485798564L;
		float b = 52.14F;
		double pi = 3.146585688752122;
		
		System.out.println("boolean : " + x);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("dist : " + dist);
		System.out.println("b : " + b);
		System.out.println("pi : " + pi);
		*/
		//implicit typecasting int to long
		int i =100;
		long l = i;
		System.out.println("long : "+l);
		
		//long to int
		int o = (int) l;
		System.out.println("int : "+o);
		
		//int to char
		char t = (char) i;
		System.out.println("char : "+t);
		
		//doublt to float
		double d = 15784689568456856.986854879562135584;
		float r=(float)d;
		System.out.println("float : "+r);
		System.out.println("double : "+d);
		
		//double to long to int	
		double d2 = 154785658458536558.568546826584689;
		float l2 = (float) d2;
		int i2 = (int)l2;
		System.out.println("double : "+d2);
		System.out.println("long : "+l2);
		System.out.println("int : "+i2);
		
		//long to float
		float f=l;
		System.out.println("float : "+f);
		
		//byte int ,double
		byte y;
		int ii=457;
		double dd=323.254;
		
		System.out.println("conversion of int to byte");
		y=(byte) ii;
		System.out.println("int = " + ii+ " byte = " +y);
		
		
		System.out.println("conversion of int to byte");
		y = (byte)dd;
		System.out.println("double = "+dd+" byte= "+y);

		
		

	}

}
