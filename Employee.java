public	class Employee{  
	 float salary=40000;  
	}  
	class Programmer extends Employee{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Programmer p=new Programmer();  
	   System.out.println("Programmer salary is:"+p.salary);  
       System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  class A{  
	A getA(){  
	return this;  
	}  
	void msg(){System.out.println("Hello java");}  
    }  
	  
    class Test1{  
	public static void main(String args[]){  
	new A().getA().msg();  
	}  
	}  
	
