public class Company {
    
	public static void main(String[] args) {
		
        //declare and create 3 objects(as a employee1,2,3) 
		Employee em1 = new Employee("Mike", "Manager", "ABC Ltd", 1750.00);
    	Employee em2 = new Employee("Bob", "Junior developer", "ABC Ltd", 2000.00);
    	Employee em3 = new Employee("David", "Tester", "ABC Ltd", 1400.00);
    	
    	System.out.println("==============");
    	System.out.println(em1);
    	System.out.println(em2);
    	System.out.println(em3);
    	System.out.println();
    	
    	//and set params
    	 //set department for your employees
    	double sal1 = em1.getSalary();
    	double sal2 = em2.getSalary();	
    	double sal3 = em3.getSalary();	
    	em1.setDepartment("Sales department");
    	em2.setDepartment("Project department");
    	em3.setDepartment("Product department");
    	
    	
    	System.out.println("After 1 year inside the company:");
    	System.out.println();
    	
        //set to change your employee promotion from position 
    	//to salary
    	em1.setPosition("Head of Sales department");
    	em1.setSalary(2050.00);
    	
    	em2.setPosition("Senior developer");
    	em2.setSalary(2300.00);
    	
    	em2.setPosition("Team lead");
    	em2.setSalary(1800.00);
    	
        //calculate employees salary difference after 1 year
    	double sal1new = em1.getSalary();
    	double diff1 = sal1new - sal1;
    	
    	double sal2new = em2.getSalary();
    	double diff2 = sal2new - sal2;
    	
    	double sal3new = em3.getSalary();
    	double diff3 = sal3new - sal3;
    	
        //out print your employees
    	
    	System.out.println(em1);
    	System.out.println(em2);
    	System.out.println(em3);
    	System.out.println();
    	
    	System.out.println("The employee with id="+ em1.getId() + " salary difference after 1 year: " + diff1);
    	System.out.println("The employee with id="+ em2.getId() + " salary difference after 1 year: " + diff2);
    	System.out.println("The employee with id="+ em3.getId() + " salary difference after 1 year: " + diff3);
	
	}//end main
}//end class