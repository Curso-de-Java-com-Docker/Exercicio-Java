package org.dejailton.sistemaregistrador;

class Question {
	private String text;

	public Question (String text) {
		this.text = text;
	}
	public Question () {
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
}
