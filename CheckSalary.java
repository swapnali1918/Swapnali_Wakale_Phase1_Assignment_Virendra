package core.programs.exception;

import java.util.Scanner;

public class CheckSalary {
	
	static void check(int salary) throws InvalidSalaryException{
		if(salary < 2100)
			throw new InvalidSalaryException("You need to work hard");
		
		else if(salary <= 2100 || salary <= 5000)
			throw new InvalidSalaryException("your salary is somehow good");
		
		else if(salary <= 5100 || salary <= 9000)
			throw new InvalidSalaryException("Salary is very good");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int salary ;

		System.out.println("Enter Salary : ");  
		
		salary = sc.nextInt();
		try{
			check(salary);
			
		}
		catch(Exception e){
			System.out.println("Exception occured: "+ e.getMessage());
		}
		System.out.println("rest of the code...");  
		}
}
class  InvalidSalaryException extends Exception
{
	InvalidSalaryException(String s){
	super(s);
}
}