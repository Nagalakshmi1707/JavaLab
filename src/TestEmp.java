 class Emp
{
   private int id;
   private String name;
   private double salary;
   public int getId() {
	    return id;
   }
    public void setId(int id) {
    	this.id=id;
    	
    }
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double salary) {
    	this.salary=salary;
    }	
    	
 }
    
    public class TestEmp {
    	public static void main(String[]args) {
    		Emp e1=new Emp();
    		e1.setId(100);
    		e1.setName("Alekhya");
    		e1.setSalary(50000.00);
    	   System.out.println("Emp Details");
    	   System.out.println(e1.getId());
    	   System.out.println(e1.getName());
    	   System.out.println(e1.getSalary());
    		

	
	  
	

	}

}
