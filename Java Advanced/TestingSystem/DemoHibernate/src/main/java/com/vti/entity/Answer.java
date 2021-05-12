package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

@Entity
@Table (name = "Answer", catalog = "TestingSystem")
public class Answer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private short id;
	
	@Column(name = "key", nullable = false)
	private String key;
	
	@Column(name = " is_correct", nullable = false)
	@ColumnDefault("false")
	private boolean isCorrect;

	
	public Answer() {
		
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
	 * @return the key
	 */
	public String getKey() {
		return key;
	}


	/**
	 * @param key the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}


	/**
	 * @return the isCorrect
	 */
	public boolean isCorrect() {
		return isCorrect;
	}


	/**
	 * @param isCorrect the isCorrect to set
	 */
	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	
	
}
