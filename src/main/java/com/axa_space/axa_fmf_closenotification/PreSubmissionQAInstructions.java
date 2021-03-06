package com.axa_space.axa_fmf_closenotification;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class PreSubmissionQAInstructions implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Comments")
	private java.lang.String comments;
	@org.kie.api.definition.type.Label(value = "Complete")
	private java.lang.Boolean complete;

	@org.kie.api.definition.type.Label(value = "Not Complete")
	private java.lang.Boolean notComplete;

	public PreSubmissionQAInstructions() {
	}

	public java.lang.String getComments() {
		return this.comments;
	}

	public void setComments(java.lang.String comments) {
		this.comments = comments;
	}

	public java.lang.Boolean getComplete() {
		return this.complete;
	}

	public void setComplete(java.lang.Boolean complete) {
		this.complete = complete;
	}

	public java.lang.Boolean getNotComplete() {
		return this.notComplete;
	}

	public void setNotComplete(java.lang.Boolean notComplete) {
		this.notComplete = notComplete;
	}

	public PreSubmissionQAInstructions(java.lang.String comments,
			java.lang.Boolean complete, java.lang.Boolean notComplete) {
		this.comments = comments;
		this.complete = complete;
		this.notComplete = notComplete;
	}

}