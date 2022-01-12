package core.programs;

public class TestN {

	public int a = 58;  
	protected long b = 8500;      
	double y = 3.145657458452; 
	
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
		System.out.println("Value of public a : "+ a);
		System.out.println("Value of Protected b : "+ b);
		System.out.println("Value of double y : "+ y);
	}
}
