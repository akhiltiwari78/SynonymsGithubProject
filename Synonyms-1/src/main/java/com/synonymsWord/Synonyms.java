package com.synonymsWord;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Synonyms {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String word;
	public Synonyms() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Synonyms(long id, String word) {
		super();
		this.id = id;
		this.word = word;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	
	
	
	
	
}
