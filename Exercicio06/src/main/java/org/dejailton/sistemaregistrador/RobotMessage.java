package org.dejailton.sistemaregistrador;

class RobotMessage {
	private String text;
	private String type;

	public RobotMessage (String text, String type) {
		this.text = text;
		this.type = type;
	}

	public RobotMessage (String text) {
		this.text = text;
	}

	public RobotMessage  () {
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
