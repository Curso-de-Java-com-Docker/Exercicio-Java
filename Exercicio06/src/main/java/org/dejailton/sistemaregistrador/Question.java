package org.dejailton.sistemaregistrador;

class Question {
	private String text;
	private String type;

	public Question (String text, String type) {
		this.text = text;
		this.type = type;
	}
	public Question (String text) {
		this.text = text;
	}
	public Question(Question question) {
	}
	public Question () {
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
