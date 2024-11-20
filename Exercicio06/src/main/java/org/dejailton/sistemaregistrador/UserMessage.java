package org.dejailton.sistemaregistrador;

class UserMessage {
	private String valuestring;
	private int valueint;
	private char valuechar;
	private String type;
	
	public UserMessage (String value) {
		this.valuestring = value;
		this.type = "String";
	}

	public UserMessage (int value) {
		this.valueint = value;
		this.type = "int";
	}

	public UserMessage (char value) {
		this.valuechar = value;
		this.type = "char";
	}

	public UserMessage () {
	}

	public String getString () {
		return this.valuestring;
	}

	public int getInt () {
		return this.valueint;
	}

	public char getChar () {
		return this.valuechar;
	}

	public String getType () {
	       return this.type;
	}	       
}

