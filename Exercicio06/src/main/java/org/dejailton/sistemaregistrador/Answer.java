package org.dejailton.sistemaregistrador;

class Answer {
	private String valuestring;
	private int valueint;
	private char valuechar;
	
	public Answer () {
	}
	public Answer (String value) {
		this.valuestring = value;
	}
	public Answer (int value) {
		this.valueint = value;
	}
	public Answer(char value) {
		this.valuechar = value;
	}
	public String getString() {
		return this.valuestring;
	}
	public int getInt() {
		return this.valueint;
	}
	public char getChar() {
		return this.valuechar;
	}
}

