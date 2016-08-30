
public class Employee {
	private double sal,allowance;
	private double tax;
	private String eName, department, designation;
	public void input(String name, String dept, String design, double sal){
		this.eName = name;
		this.department = dept;
		this.designation = design;
		this.sal = sal;
	}
	
	public void calculateAllowance(){
		if(designation.equals("PL"))
			allowance = 1600.00;
		else if(designation.equals("TM"))
			allowance = 1300.00;
		else if(designation.equals("TL"))
			allowance = 1270.00;
		else if(designation.equals("Admin"))
			allowance = 1500.00;
		else
			allowance = 1100.00;
	}
	
	public void calculateTax(){
		if(sal>20000)
			tax = 0.15*sal;
		else if(sal>=15000 && sal<=20000)
			tax = 0.125*sal;
		else if(sal>=12500 && sal<15000)
			tax = 0.1125*sal;
		else if(sal>=7500 && sal<12500)
			tax = 0.096*sal;
		else
			tax = 0.0;
	}
	
	public void netSalary(){
		sal = sal + allowance - tax;
	}
	
	public void display(){
		System.out.println("Employee details:\nName: "+eName);
		System.out.println("Department: "+department+"\nDesignation: "+designation);
		System.out.println("Net Salary: Rs."+sal+"/-");
	}
}
