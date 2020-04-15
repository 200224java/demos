package com.revature.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode(exclude = {"topic"}) @ToString(exclude = {"topic"})
public class Flashcard {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String question;
	private String answer;
	private String name;
	private Difficulty difficulty;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "topic_id")
	private Topic topic;

	public Flashcard(int id, String question, String answer, String name, Difficulty difficulty, Topic topic) {
		super();
		this.id = id;
		this.question = question;
		this.answer = answer;
		this.name = name;
		this.difficulty = difficulty;
		this.topic = topic;
	}
}
