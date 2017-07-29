package com.internet.cms.model;

public class Subject extends PageInfo{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_id
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    private Integer subjectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_name
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    private String subjectName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_state
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    private Integer subjectState;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subject.subject_content
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    private String subjectContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_id
     *
     * @return the value of subject.subject_id
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public Integer getSubjectId() {
        return subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_id
     *
     * @param subjectId the value for subject.subject_id
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_name
     *
     * @return the value of subject.subject_name
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_name
     *
     * @param subjectName the value for subject.subject_name
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_state
     *
     * @return the value of subject.subject_state
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public Integer getSubjectState() {
        return subjectState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_state
     *
     * @param subjectState the value for subject.subject_state
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public void setSubjectState(Integer subjectState) {
        this.subjectState = subjectState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subject.subject_content
     *
     * @return the value of subject.subject_content
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public String getSubjectContent() {
        return subjectContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subject.subject_content
     *
     * @param subjectContent the value for subject.subject_content
     *
     * @mbggenerated Sun Apr 09 17:20:40 CST 2017
     */
    public void setSubjectContent(String subjectContent) {
        this.subjectContent = subjectContent == null ? null : subjectContent.trim();
    }
}