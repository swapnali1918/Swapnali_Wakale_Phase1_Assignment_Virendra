package core.programs.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Employee {
     public static void main(String args[]) throws IOException 
	  {
	   Emp obj = new Emp("swapnali",205,21,"IT","swapnaliwakale@gmail.com",9856894582l,"F");
	   Emp obj1 = new Emp("Shruti",210,24,"CSE","Shruti@gmail.com",9885794682l,"F");
	    
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	    
	    		
	      fos = new FileOutputStream("D://swapnali//Employee.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      oos.writeObject(obj1);
	      System.out.println("Serialzation Done!!");
	      
	         
	   	      
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    	    finally{
		      oos.close();
		      fos.close();
		      
	    }
     
     //Deserialization
	    Emp o=null;
	   Emp o1=null;
     try{
       FileInputStream fis = new FileInputStream("D://swapnali//Employee.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (Emp)ois.readObject();
      o1 = (Emp)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("****Employee 1****");
     System.out.println("Employee Name:"+o.getName());
     System.out.println("Employee ID:"+o.getId());
     System.out.println("Employee Age:"+o.getAge());
     System.out.println("Employee Dept Name:"+o.getDeptname());
     System.out.println("Employee Email:"+o.getEmail());
     System.out.println("Employee Contact No:"+o.getContactNo());
     System.out.println("Employee Gender:"+o.getGender());
     System.out.println("\n");
     System.out.println("****Employee2****");
     System.out.println("Employee Name :"+o1.getName());
     System.out.println("Employee ID:"+o1.getId());
     System.out.println("Employee Age:"+o1.getAge());
     System.out.println("Employee Dept Name:"+o1.getDeptname());
     System.out.println("Employee Email:"+o1.getEmail());
     System.out.println("Employee Contact No:"+o1.getContactNo1());
     System.out.println("Employee Gender:"+o1.getGender());
  }
}

//------------------------------Student-------------------------//
class Emp implements java.io.Serializable{
	  
	  private String Name;
	  private int Id;
	  private int Age;
	  private String Deptname;  
	   private String Email;
	  private  long ContactNo;
	 transient private  long ContactNo1;
	  private String Gender;//
	  
	  public Emp(String Name , int Id,int Age, String Deptname,String Email, long ContactNo,String Gender) {
	    this.Name = Name;
	    this.Id = Id;
	    this.Age = Age;
	    this.Deptname = Deptname;
	    this.Email = Email;
	    this.ContactNo = ContactNo;
	    //this.ContactNo1 =ContactNo1;
	    this.Gender = Gender;
	       
	  }
	  public Emp( long ContactNo1) {
		   
		    //this.ContactNo = ContactNo;
		    this.ContactNo1 =ContactNo1;
		
		       
		  }

	public long getContactNo1() {
		return ContactNo1;
	}
	public void setContactNo1(long contactNo1) {
		ContactNo1 = contactNo1;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getDeptname() {
		return Deptname;
	}

	public void setDeptname(String deptname) {
		Deptname = deptname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getContactNo() {
		return ContactNo;
	}

	public void setContactNo(long contactNo) {
		ContactNo = contactNo;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}
	  
		}
