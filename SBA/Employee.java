package Sba;

abstract class Employee{
	String name="hari";
	int emp_id=1234;
	abstract float calculateSalary();
	abstract void fetchDepartment();
}
 class Engineer extends Employee{
	float CalculateSalary() {
		return 4.5f;
		
	}
	void fetchDepartment() {
		System.out.println("Delivery");
		
	}
	@Override
	float calculateSalary() {
		// TODO Auto-generated method stub
		return 0;
	}


}
class Doctor extends Employee{
	float calculateSalary() {
		
		return 6.5f;
	}
	void fetchDepartment() {
		System.out.println("Cardiology");
		
	}
}
class Main01{
	public static void main(String[] args) {
		//Employee E1=new Employee();
		Engineer e=new Engineer();
		Doctor d=new Doctor();
		System.out.println(e.name);
		System.out.println(e.emp_id);
		System.out.println(e.calculateSalary());
		e.fetchDepartment();
		System.out.println(d.name);
		System.out.println(d.calculateSalary());
		d.fetchDepartment();
	}
}

	

