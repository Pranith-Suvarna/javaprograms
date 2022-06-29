package coreJavaTraining;

public class VariableScope {

	String name; //instance variables
	String street;
	static String city;//class variable
	static int i =0;
	
	static{
	      city = "Delhi";
	    //  i=0;
	      
	   
	   }
	
	//instance variables can have access modifiers(like private, public, protected etc.),
	//but local variables will not have any access modifiers.
	
	VariableScope(String name, String street)
	{
		//Scope: Local variables are visible only in the method or block they are declared whereas
		//instance variables can been seen by all methods in the class
		this.name=name;
		this.street = street;
		i++;
		System.out.println(i);
		
	
	}
	
	public void getDetails()
	{
		System.out.println(name+" "+city);
	}
	static void getAnyThing()
	{
		System.out.println("population"+city);
		
	}
	
	public static void main(String[] args)
	{
		
		VariableScope c=new VariableScope("Bob","MainStreet");
		VariableScope c1=new VariableScope("Ram","Side street");
		
		
		
		c.getDetails();
		VariableScope.city ="Hyd";
		c1.getDetails();
		getAnyThing();
		
	
		
	}
	
	 
}
