package core.programs.stack;

import java.util.Stack;

public class StackMethod {

	public static void main(String[] args) {
		Stack stack =new Stack();
		
		stack.push("Apple");
		stack.push("Mango");
		stack.push("Banana");
		stack.push("Watermelon");
		stack.push("Pineapple");
		stack.push("Mumbai");
		stack.push("Pune");
		stack.push("Nagpur");
		stack.push("Delhi");
		stack.push(5);
		stack.push(10);
		stack.push(85);
		stack.push(9);
		stack.push("A");
		stack.push("B");
	
		 System.out.println("Stack : "+ stack);
		 System.out.println("Stack pop1 : "+ stack.pop());
		 System.out.println("Stack pop2 : "+ stack.pop());
		 System.out.println("Stack pop3 : "+ stack.pop());
		 System.out.println("Stack pop4 : "+ stack.pop());
		 System.out.println("Stack pop5 : "+ stack.pop());
		 System.out.println("After removing 5 element : "+ stack);
		 System.out.println("Peek the Element from stack  : "+ stack.peek());
		 System.out.println("Stack pop1 : "+ stack.pop());
		 System.out.println("Stack pop2 : "+ stack.pop());
		 System.out.println("After removing 2 element : "+ stack);	
		 System.out.println("Poll1 : "+stack.pop());
		 System.out.println("Poll2 : "+ stack.pop());
		 System.out.println("Top of the Stack is  : "+ stack.peek());
		 System.out.println("index of elemtn All inside the stack : "+ stack.indexOf("Apple"));
		 System.out.println("index of elemtn All inside the stack : "+ stack.indexOf("Delhi"));
		 
		 
		 

	}

}
