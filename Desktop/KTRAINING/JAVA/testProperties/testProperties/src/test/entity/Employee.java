package test.entity;

public class Employee {
	private int eld;
	private String eName;
	private String dept;
	private int salary;
	private double bonusPoint;
	private int total;
	public Employee() {
		super();
	}
	public Employee(int eld, String eName, String dept, int salary, double bonusPoint, int total) {
		super();
		this.eld = eld;
		this.eName = eName;
		this.dept = dept;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.total = total;
	}
	
	public int getEld() {
		return eld;
	}
	public void setEld(int eld) {
		this.eld = eld;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public int getTotalint() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Employee [eld=" + eld + ", eName=" + eName + ", dept=" + dept + ", salary=" + salary + ", bonusPoint="
				+ bonusPoint + ", total=" + total + "]";
	}
	
	
	
}
