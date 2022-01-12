package core.programs1;

import core.programs.TestM;
import core.programs.TestN;
import core.programs.TestP;

public class TestZ extends TestM {

	public static void main(String[] args) {
		System.out.println("Variable of TestM Class ");
		System.out.println("\n");
		new TestM().methodPublic();
		 
		System.out.println("\n");
		System.out.println("Variable of TestN Class ");
		System.out.println("\n");
		new TestN().methodPublic();
		
		System.out.println("\n");
		System.out.println("Variable of TestP Class ");
		System.out.println("\n");
		new TestP().methodPublic();
		
		System.out.println("\n");
		System.out.println("Variable of TestX Class ");
		System.out.println("Variable of b : "+new TestX().b);
		System.out.println("Variable of g : "+new TestX().g);
		System.out.println("Variable of s : "+new TestX().s);

	}

}
