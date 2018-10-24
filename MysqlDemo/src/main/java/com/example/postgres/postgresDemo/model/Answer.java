package com.example.postgres.postgresDemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name= "answers")
public class Answer  extends AudiModel{

	private static final long serialVersionUID = 1026942776781625527L;
	
	@Id
	@GeneratedValue(generator="answer_generator")
	@SequenceGenerator(name = "answer_generator", sequenceName= "answer_sequence", initialValue =1000)
	private long id;
	
	@Column(columnDefinition ="text")
	private String text;
	
	@ManyToOne(fetch =FetchType.LAZY, optional =false)
	@JoinColumn(name="question_id", nullable =false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JsonIgnore
	private Question question;

	@Override
	public String toString() {
		return "Answer [id=" + id + ", text=" + text + ", question=" + question + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
	

}
