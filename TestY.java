package core.programs1;

import core.programs.TestM;
import core.programs.TestN;

public class TestY extends TestN{

	public static void main(String[] args) {
		System.out.println("Variable of TestM Class ");
		System.out.println("\n");
		new TestM().methodPublic();
		 
		System.out.println("\n");
		System.out.println("Variable of TestN Class ");
		System.out.println("\n");
		new TestN().methodPublic();
		
		System.out.println("\n");
		System.out.println("Variable of TestX Class ");
		System.out.println("Variable of b : "+new TestX().b);
		System.out.println("Variable of g : "+new TestX().g);
		System.out.println("Variable of s : "+new TestX().s);

		 
		
	}

}
