package com.vti.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Testing", catalog = "TestingSystem")
public class Testing implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "name", nullable = false,length = 200, unique = true)
	private String name;
	
	@Column(name = "time",nullable = false)
	private short time;
	
	@Column(name = "generation_Type", nullable = false)
	@Convert(converter = GenerationTypeConverter.class)
	private GenerationType generationType;
	
	@Column(name = "version", nullable = false)
	@ColumnDefault("1")
	private short version;
	
	@Column(name = "status")
	@ColumnDefault("0")
	private boolean status;
	
	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	private Date createTime;
	
	@Column(name = "Note")
	private String Note;
	
	public Testing() {
		
	}

	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(short id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the time
	 */
	public short getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(short time) {
		this.time = time;
	}

	/**
	 * @return the generationType
	 */
	public GenerationType getGenerationType() {
		return generationType;
	}

	/**
	 * @param generationType the generationType to set
	 */
	public void setGenerationType(GenerationType generationType) {
		this.generationType = generationType;
	}

	/**
	 * @return the version
	 */
	public short getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(short version) {
		this.version = version;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return Note;
	}

	/**
	 * @param note the note to set
	 */
	public void setNote(String note) {
		Note = note;
	}
	
	
}
