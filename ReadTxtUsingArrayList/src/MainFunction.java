import java.util.*;
public  class MainFunction {
	String fName;
	String lName;
	String DOB;
	String Position;
	String Salary;
	public MainFunction(String fName,String lName,String DOB,String Position,String Salary) {
		this.fName=fName;
		this.lName=lName;
		this.DOB=DOB;
		this.Position=Position;
		this.Salary = Salary;
		
	}
	public String getfName() {
		return this.fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public double getSalary() {
		double sal = Double.valueOf(this.Salary);
		return sal;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	/*public String toString() {
		return "{fName="+getfName()+",lName="+lName+",DOB="+DOB+",Position="+Position+",Salary="+Salary+"}";
	}*/
}