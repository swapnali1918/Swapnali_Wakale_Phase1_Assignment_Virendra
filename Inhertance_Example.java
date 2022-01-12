package core.programs.inheritance;

class Product{
	
	int id = 70;
	String name = "Amul";
	
	void show() {
		System.out.println("Product id : " +id+" Product Name : "+ name);
	}
}
class A extends Product{
	int count = 50;
	String category = "Butter";
	void show() {
		System.out.println("Product id : " +id+", Product Name : "+ name+", Product count : "+count+", Product category : "+category);
	}
	}
class B extends Product{
	int count = 90;
	String category = "Milk";
	void show() {
		System.out.println("Product id : " +id+", Product Name : "+ name+", Product count : "+count+", Product category : "+category);
	}
	}
class C extends Product{
	int count = 56;
	String category = "Choco";
	void display() {
		System.out.println("Product id : " +id+", Product Name : "+ name+", Product count : "+count+ ", Product category : "+category);
	}
	}

class SubA extends A{
	int price = 30;
	public int total() {
		return count * price;
	}
	void display() {
		System.out.println("Product id : " +id+", Product Name : "+ name+", Product cateogy is  "+category+" and Total Price is "+total());
	}
}
class SubB extends B{
	int price = 10;
	public int total() {
		return count * price;
	}
	void display() {
		System.out.println("Product id : " +id+", Product Name : "+ name+", Product cateogy is  "+category+" and Total Price  is "+total());
	}
}

public class Inhertance_Example {

	public static void main(String[] args) {
		SubA a = new SubA();
		SubB b = new SubB();
		a.display();
		b.display();
		
	}

}
