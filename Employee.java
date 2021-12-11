package employee;

public class Employee {

	private int employeeId;
	private String gread;
	private String date;

	public Employee(int employeeId, String gread, String date) {
		super();
		this.employeeId = employeeId;
		this.gread = gread;
		this.date = date;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getGread() {
		return gread;
	}

	public void setGread(String gread) {
		this.gread = gread;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
