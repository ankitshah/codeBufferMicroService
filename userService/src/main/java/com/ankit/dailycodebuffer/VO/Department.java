package com.ankit.dailycodebuffer.VO;

public class Department {
	
	private long departmentId;
	private String departmentNmae;
	private String departmentAddress;
	private String departmentCode;
	
	public Department() {}
	
	public Department(long departmentId, String departmentNmae, String departmentAddress, String departmentCode) {
		this.departmentId = departmentId;
		this.departmentNmae = departmentNmae;
		this.departmentAddress = departmentAddress;
		this.departmentCode = departmentCode;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentNmae() {
		return departmentNmae;
	}
	public void setDepartmentNmae(String departmentNmae) {
		this.departmentNmae = departmentNmae;
	}
	public String getDepartmentAddress() {
		return departmentAddress;
	}
	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}
	
	

}
