package core.programs.collection;
import java.util.*;

public class Month {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("May");
		ll.add("June");
		ll.add("July");
		ll.add("August");
		
		ll.add("November");
		
		ll.addLast("December");
		ll.addFirst("January");
		
		ll.add(1,"March");
		
		ll.add(1,"February");
		ll.add(7,"September");
		ll.add(8,"October");
		ll.add(3,"April");
		System.out.println("Month : "+ll+"\n");
		
		
		System.out.println("Even Months are = " + ll.get(1)+" , "+ ll.get(3)+" , "+ ll.get(5)+" , "+ ll.get(7)+" , "+ ll.get(9)+" , "+ ll.get(11)+"\n");
		System.out.println("Odd Months are = " + ll.get(0)+" , "+ ll.get(2)+" , "+ ll.get(4)+" , "+ ll.get(6)+" , "+ ll.get(8)+" , "+ ll.get(10)+"\n");
					
		Iterator itr=ll.iterator();
        while(itr.hasNext()) {
        System.out.println("Iterator Month is : "+ itr.next());
        
        }
        System.out.println("\n");
        System.out.println("First and Last Month is : "+ll.getFirst() +" "+ ll.getLast()+"\n");
        System.out.println("Remove Birthday Month :" +ll.remove(0)+"\n");
       
        System.out.println("Print Months : "+ll+"\n");
        
        if(ll.contains("January"))
		{
			System.out.println("Any Winter months in LinkedList = YES, which is January"+"\n");
		}
		else if(ll.contains("February"))
		{
			System.out.println("Any Winter months in LinkedList = YES, which is February"+"\n");
		}
		else if(ll.contains("December")){
			System.out.println("Any Winter months in LinkedList = YES, which is December"+"\n");
		}
		else {
			System.out.println("Any Winter months in LinkedList = NO"+"\n");
			
		}
        
	}
}
