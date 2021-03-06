package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CodeSE_Type")
public class EducationType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "isActive")
	private Integer isActive;

	@Column(name = "SE_TypeID")
	private Integer mesId;
	
	@Column(name = "SE_TypeName")
	private String mesName;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		if (isActive == null) {
			isActive = 1;
		}
		this.isActive = isActive;
	}

	@Override
	public int hashCode() {
		return getId();
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof EducationType) {
			EducationType userPhdReport = (EducationType) obj;
			return userPhdReport.getId() == getId();
		}

		return false;
	}

	@Override
	public String toString() {
		return String.format(
				"Id: %d; IsActive: %d; SE_TypeID: %d; SE_TypeName: %s;", getId(),
				getIsActive(), getMesId(), getMesName());
	}

	public Integer getMesId() {
		return mesId;
	}

	public void setMesId(Integer edFormId) {
		this.mesId = edFormId;
	}

	public String getMesName() {
		return mesName;
	}

	public void setMesName(String edFormName) {
		this.mesName = edFormName;
	}
}