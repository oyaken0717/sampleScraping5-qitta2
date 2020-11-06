package com.example.domain;

import java.util.Date;

public class Job {
	
	private Integer id;
	
	private String siteName;
	
	private String companyName;
	
	private String jobType;
	
	private String codingLanguages;
	
	private String  location;
	
	private String phoneNumber;
	
	private String businessDetails;
	
	private String url;
	
	private Date acquisitionDate;
	
	private Date updateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getCodingLanguages() {
		return codingLanguages;
	}

	public void setCodingLanguages(String codingLanguages) {
		this.codingLanguages = codingLanguages;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBusinessDetails() {
		return businessDetails;
	}

	public void setBusinessDetails(String businessDetails) {
		this.businessDetails = businessDetails;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", siteName=" + siteName + ", companyName=" + companyName + ", jobType=" + jobType
				+ ", codingLanguages=" + codingLanguages + ", location=" + location + ", phoneNumber=" + phoneNumber
				+ ", businessDetails=" + businessDetails + ", url=" + url + ", acquisitionDate=" + acquisitionDate
				+ ", updateDate=" + updateDate + "]";
	}
	
	

}
