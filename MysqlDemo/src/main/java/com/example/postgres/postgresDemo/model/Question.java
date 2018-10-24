package com.example.postgres.postgresDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Questipns")
public class Question extends AudiModel {

	private static final long serialVersionUID = -6015369155822179965L;

	@Id
	@GeneratedValue(generator ="question_generator")
	@SequenceGenerator( name="question_generator", sequenceName="question_sequence", initialValue =100)
	private long id;
	
	
	@NotBlank
	@Size(min=3, max =100)
	private String title;
	
	@Column(columnDefinition ="text")
	private String description;

	@Override
	public String toString() {
		return "Question [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
