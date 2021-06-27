package com.ankit.dailycodebuffer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;
	private String departmentNmae;
	private String departmentAddress;
	private String departmentCode;
	
	
	
	
	public Department() {
		super();
	}
	
	public Department(long departmentId, String departmentNmae, String departmentAddress, String departmentCode) {
		super();
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

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentNmae=" + departmentNmae
				+ ", departmentAddress=" + departmentAddress + ", departmentCode=" + departmentCode + "]";
	}
	
	
	

}
