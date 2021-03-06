package com.examportal.entities;

import javax.persistence.*;

import java.util.Set;

@Entity(name = "questions")
public class QuestionEntity {
	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String questionContent;

	@OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
	private Set<AnswerEntity> answers;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestionContent() {
		return questionContent;
	}

	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}

	public Set<AnswerEntity> getAnswers() {
		return answers;
	}

}
