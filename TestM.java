package core.programs;

public class TestM {

	private int a = 20;   //private variable
	long b = 1000;       // default variable
	protected float y = 3.145657458452F; //protected
	
	public void methodPublic(){     // public method
		methodPrivate();
	}
	
	protected void methodProtected(){   // protected method
		methodPrivate();
	}
	
	void methodDefault(){    //default method
		methodPrivate();
	}
	
	private void methodPrivate(){     // private method
		System.out.println("Class TestM: method Protected");
		System.out.println("Value of private variable a : "+ a);
		System.out.println("Value of long b : "+ b);
		System.out.println("Value of Protected y : "+ y);
	}
}


