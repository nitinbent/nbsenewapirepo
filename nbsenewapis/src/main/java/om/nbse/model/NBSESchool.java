package om.nbse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="mas_school")
public class NBSESchool implements Serializable{

	/**
	 *  Serial Version UID
	 */
	private static final long serialVersionUID = -2147967029174725778L;
	
	@Id
	@Column(name="SCHOOL_ID")
	private Integer schoolId;
	
	@Column(name="SCHOOL_CODE")
	private String schoolCode;

	@Column(name="SCHOOL_NAME")
	private String schoolName;
	
	@Column(name="SCHOOL_ADDRESS")
	private String schoolAddress;
	
	@Column(name="SCHOOL_CITY")
	private String schoolCity;
	
	@Column(name="SCHOOL_BOARD")
	private String schoolBoard;
	
	@Column(name="SCHOOL_PHONE_NUMBER")
	private String schoolPhoneNumber;
	
	@Column(name="SCHOOL_PHONE_EMAIL")
	private String schoolPhoneEmail;
	
	@Column(name="SCHOOL_PRINCIPLE_NAME")
	private String schoolPrincipleName;
	
	@Column(name="SCHOOL_STATE")
	private String schoolState;
	
	@Column(name="PASSWORD")
	@JsonIgnore
	private String schoolPassword;
	
	@Column(name="SCHOOL_COORDINATOR")
	private String schoolCoordinator;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="CREATED_AT")
	@JsonIgnore
	private Date createdAt;

	@JsonIgnore
	@Column(name="CREATED_BY")
	private String createdBy;

	@JsonIgnore
	@Column(name="IS_ACTIVE")
	private String isActive;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@JsonIgnore
	@Column(name="UPDATED_AT")
	private Date updatedAt;

	@Column(name="UPDATED_BY")
	@JsonIgnore
	private String updatedBy;

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public String getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolBoard() {
		return schoolBoard;
	}

	public void setSchoolBoard(String schoolBoard) {
		this.schoolBoard = schoolBoard;
	}

	public String getSchoolPhoneNumber() {
		return schoolPhoneNumber;
	}

	public void setSchoolPhoneNumber(String schoolPhoneNumber) {
		this.schoolPhoneNumber = schoolPhoneNumber;
	}

	public String getSchoolPhoneEmail() {
		return schoolPhoneEmail;
	}

	public void setSchoolPhoneEmail(String schoolPhoneEmail) {
		this.schoolPhoneEmail = schoolPhoneEmail;
	}

	public String getSchoolPrincipleName() {
		return schoolPrincipleName;
	}

	public void setSchoolPrincipleName(String schoolPrincipleName) {
		this.schoolPrincipleName = schoolPrincipleName;
	}

	public String getSchoolState() {
		return schoolState;
	}

	public void setSchoolState(String schoolState) {
		this.schoolState = schoolState;
	}

	public String getSchoolPassword() {
		return schoolPassword;
	}

	public void setSchoolPassword(String schoolPassword) {
		this.schoolPassword = schoolPassword;
	}

	public String getSchoolCoordinator() {
		return schoolCoordinator;
	}

	public void setSchoolCoordinator(String schoolCoordinator) {
		this.schoolCoordinator = schoolCoordinator;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
