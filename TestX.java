package core.programs1;

public class TestX {

		private int a = 58;  
		long b = 8500;    
		protected float g = 562.5544879456F;
		public char s = 's';
		
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
			System.out.println("Value of private a : "+ a);
			System.out.println("Value of default b : "+ b);
			System.out.println("Value of Protected g : "+ g);
			System.out.println("Value of char s : "+ s);
	
	}

}
