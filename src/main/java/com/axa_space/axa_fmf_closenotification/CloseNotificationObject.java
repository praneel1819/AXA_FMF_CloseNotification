package com.axa_space.axa_fmf_closenotification;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class CloseNotificationObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Submission Completed in Nautilus User Comments")
	private java.lang.String submissionCompletedNautilusUserComments;

	@org.kie.api.definition.type.Label("Submission Completed in Nautilus Manager Comments")
	private java.lang.String submissionCompletedNautilusManagerComments;

	@org.kie.api.definition.type.Label("Presubmission QA Instr User Comments")
	private java.lang.String presubmissionQAInstrUserComments;

	@org.kie.api.definition.type.Label("Presubmission QA Instr Manager Comments")
	private java.lang.String presubmissionQAInstrManagerComments;

	@org.kie.api.definition.type.Label("Submission Completed in Nautilus")
	private com.axa_space.axa_fmf_closenotification.SubmissionCompletedNautilus submissionCompletedNautilus;

	@org.kie.api.definition.type.Label(value = "PreSubmission of QA Instruction Completed?")
	private com.axa_space.axa_fmf_closenotification.PreSubmissionQAInstructions presubmissionQAInstr;

	public CloseNotificationObject() {
	}

	public java.lang.String getSubmissionCompletedNautilusUserComments() {
		return this.submissionCompletedNautilusUserComments;
	}

	public void setSubmissionCompletedNautilusUserComments(
			java.lang.String submissionCompletedNautilusUserComments) {
		this.submissionCompletedNautilusUserComments = submissionCompletedNautilusUserComments;
	}

	public java.lang.String getSubmissionCompletedNautilusManagerComments() {
		return this.submissionCompletedNautilusManagerComments;
	}

	public void setSubmissionCompletedNautilusManagerComments(
			java.lang.String submissionCompletedNautilusManagerComments) {
		this.submissionCompletedNautilusManagerComments = submissionCompletedNautilusManagerComments;
	}

	public java.lang.String getPresubmissionQAInstrUserComments() {
		return this.presubmissionQAInstrUserComments;
	}

	public void setPresubmissionQAInstrUserComments(
			java.lang.String presubmissionQAInstrUserComments) {
		this.presubmissionQAInstrUserComments = presubmissionQAInstrUserComments;
	}

	public java.lang.String getPresubmissionQAInstrManagerComments() {
		return this.presubmissionQAInstrManagerComments;
	}

	public void setPresubmissionQAInstrManagerComments(
			java.lang.String presubmissionQAInstrManagerComments) {
		this.presubmissionQAInstrManagerComments = presubmissionQAInstrManagerComments;
	}

	public com.axa_space.axa_fmf_closenotification.SubmissionCompletedNautilus getSubmissionCompletedNautilus() {
		return this.submissionCompletedNautilus;
	}

	public void setSubmissionCompletedNautilus(
			com.axa_space.axa_fmf_closenotification.SubmissionCompletedNautilus submissionCompletedNautilus) {
		this.submissionCompletedNautilus = submissionCompletedNautilus;
	}

	public com.axa_space.axa_fmf_closenotification.PreSubmissionQAInstructions getPresubmissionQAInstr() {
		return this.presubmissionQAInstr;
	}

	public void setPresubmissionQAInstr(
			com.axa_space.axa_fmf_closenotification.PreSubmissionQAInstructions presubmissionQAInstr) {
		this.presubmissionQAInstr = presubmissionQAInstr;
	}

	public CloseNotificationObject(
			java.lang.String submissionCompletedNautilusUserComments,
			java.lang.String submissionCompletedNautilusManagerComments,
			java.lang.String presubmissionQAInstrUserComments,
			java.lang.String presubmissionQAInstrManagerComments,
			com.axa_space.axa_fmf_closenotification.SubmissionCompletedNautilus submissionCompletedNautilus,
			com.axa_space.axa_fmf_closenotification.PreSubmissionQAInstructions presubmissionQAInstr) {
		this.submissionCompletedNautilusUserComments = submissionCompletedNautilusUserComments;
		this.submissionCompletedNautilusManagerComments = submissionCompletedNautilusManagerComments;
		this.presubmissionQAInstrUserComments = presubmissionQAInstrUserComments;
		this.presubmissionQAInstrManagerComments = presubmissionQAInstrManagerComments;
		this.submissionCompletedNautilus = submissionCompletedNautilus;
		this.presubmissionQAInstr = presubmissionQAInstr;
	}

}