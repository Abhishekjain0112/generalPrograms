import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Employee> list = setData();
		List<EmployeeResult> result = new ArrayList<>();
		list.sort((a1, a2) -> a1.getEmployeeId() - a2.getEmployeeId());

		Employee temp = list.get(0);
		int tempEmpId = temp.getEmployeeId();
		String tempEmpGread = temp.getGread();

		for (int i = 1; i < list.size(); i++) {
			Employee curtEmployee = list.get(i);

			if (curtEmployee.getEmployeeId() != tempEmpId) {
				tempEmpId = curtEmployee.getEmployeeId();
				tempEmpGread = curtEmployee.getGread();
				continue;
			} else {
				if (!tempEmpGread.equalsIgnoreCase(curtEmployee.getGread())) {
					EmployeeResult empResult = new EmployeeResult();
					empResult.setEmployeeId(curtEmployee.getEmployeeId());
					empResult.setPromotionTo(tempEmpGread + " to " + curtEmployee.getGread());
					empResult.setPromotionDate(curtEmployee.getDate());
					tempEmpGread = curtEmployee.getGread();
					result.add(empResult);
				}

			}
		}

		result.stream().forEach(System.out::println);

	}

	private static List<Employee> setData() {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(101, "GREAD F", "2020-1"));
		list.add(new Employee(101, "GREAD F", "2020-2"));
		list.add(new Employee(101, "GREAD E", "2020-3"));
		list.add(new Employee(101, "GREAD E", "2020-4"));
		list.add(new Employee(101, "GREAD E", "2020-5"));
		list.add(new Employee(102, "GREAD F", "2020-1"));
		list.add(new Employee(102, "GREAD F", "2020-1"));

		list.add(new Employee(102, "GREAD F", "2020-2"));
		list.add(new Employee(103, "GREAD C", "2020-1"));

		list.add(new Employee(102, "GREAD E", "2020-5"));
		list.add(new Employee(102, "GREAD G", "2020-6"));
		list.add(new Employee(103, "GREAD B", "2020-3"));
		list.add(new Employee(103, "GREAD A", "2020-5"));

		return list;
	}
}

class Employee {

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

class EmployeeResult {

	private int employeeId;
	private String promotionTo;
	private String promotionDate;

	public EmployeeResult() {
	}

	int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getPromotionTo() {
		return promotionTo;
	}

	public void setPromotionTo(String promotionTo) {
		this.promotionTo = promotionTo;
	}

	public String getPromotionDate() {
		return promotionDate;
	}

	public void setPromotionDate(String promotionDate) {
		this.promotionDate = promotionDate;
	}

	@Override
	public String toString() {
		return "EmployeeResult [employeeId=" + employeeId + ", promotionTo=" + promotionTo + ", promotionDate="
				+ promotionDate + "]";
	}

}
