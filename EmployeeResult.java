package employee;

public class EmployeeResult {

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
