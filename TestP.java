package core.programs;

import core.programs.TestM;
import core.programs.TestN;

public class TestP {

	public static void main(String[] args) {
		
		System.out.println("Variable of TestM Class ");
		System.out.println("Value of b :"+ new TestM().b);	
		System.out.println("Value of y : "+ new TestM().y);	
		
		System.out.println("Variable of TestN Class ");
		System.out.println("Value of a : "+ new TestN().a);	
		System.out.println("Value of y : "+ new TestN().y);	
	}

	public void methodPublic() {
		System.out.println("Class TestP: methodPublic");
	}

	protected void methodProtected() {
		System.out.println("Class TestP: methodProtected");	
	}

	void methodDefault() {
		System.out.println("Class TestP: methodDefault");
	}

	private void methodPrivate() {
		System.out.println("Class TestP: methodPrivate");
	}
	

}
