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
@Table(name="mas_subject")
public class NBSESubject implements Serializable{

	/**
	 *  Serial Version UID
	 */
	private static final long serialVersionUID = 4757570360877770311L; 
	
	@Id
	@Column(name="SUBJECT_ID")
	private Integer subjectId;
	
	@Column(name="SUBJECT_CODE")
	private String subjectCode;
	
	@Column(name="SUBJECT_NAME")
	private String subjectName;
	
	@Column(name="ORDER_VAL")
	private Integer orderVal;
	
	@Column(name="CLASS_ID")
	private Integer classId;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name="CREATED_AT")
	@JsonIgnore
	private Date createdAt;

	@JsonIgnore
	@Column(name="CREATED_BY")
	private Integer createdBy;

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
	private Integer updatedBy;

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Integer getOrderVal() {
		return orderVal;
	}

	public void setOrderVal(Integer orderVal) {
		this.orderVal = orderVal;
	}

	public Integer getClassId() {
		return classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
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

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	

}
