
public class EmployeeMain {
	public static void main(String args[]){
		Employee ob = new Employee();
		ob.input("SAHIL", "CSE", "TL", 15000.00);
		ob.calculateTax();
		ob.calculateAllowance();
		ob.netSalary();
		ob.display();
	}

}
