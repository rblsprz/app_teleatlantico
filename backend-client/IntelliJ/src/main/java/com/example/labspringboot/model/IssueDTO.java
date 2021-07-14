package com.example.labspringboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;


public class IssueDTO {

    private int id;
    private String reportnumber;
    private String classification;
    private String status;
    private String resolutioncomment;
    private String contactemail;
    private Integer idsupporter;
    private String description;
    private String service;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creationdate;

    private String creationuser;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updatedate;

    private String updateuser;


    public IssueDTO() {
    }

    public IssueDTO(Integer id, String reportnumber, String classification, String status, String resolutioncomment, String contactemail, int idsupporter, String description, String service, Date creationdate, String creationuser, Date updatedate, String updateuser) {
        this.id = id;
        this.reportnumber = reportnumber;
        this.classification = classification;
        this.status = status;
        this.resolutioncomment = resolutioncomment;
        this.contactemail = contactemail;
        this.idsupporter = idsupporter;
        this.description = description;
        this.service = service;
        this.creationdate = creationdate;
        this.creationuser = creationuser;
        this.updatedate = updatedate;
        this.updateuser = updateuser;
    }

    @JsonProperty("id")
    public int getId() {
        return id;
    }
    @JsonProperty("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonProperty("reportnumber")
    public String getReportnumber() {
        return reportnumber;
    }
    @JsonProperty("reportnumber")
    public void setReportnumber(String reportnumber) {
        this.reportnumber = reportnumber;
    }
    @JsonProperty("classification")
    public String getClassification() {
        return classification;
    }
    @JsonProperty("classification")
    public void setClassification(String classification) {
        this.classification = classification;
    }
    @JsonProperty("status")
    public String getStatus() {
        return status;
    }
    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
    @JsonProperty("resolutioncomment")
    public String getResolutioncomment() {
        return resolutioncomment;
    }
    @JsonProperty("resolutioncomment")
    public void setResolutioncomment(String resolutioncomment) {
        this.resolutioncomment = resolutioncomment;
    }
    @JsonProperty("contactemail")
    public String getContactemail() {
        return contactemail;
    }
    @JsonProperty("contactemail")
    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }
    @JsonProperty("idsupporter")
    public Integer getIdsupporter() {
        return idsupporter;
    }
    @JsonProperty("idsupporter")
    public void setIdsupporter(Integer idsupporter) {
        this.idsupporter = idsupporter;
    }
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonProperty("service")
    public String getService() {
        return service;
    }
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }
    @JsonProperty("creationdate")
    public Date getCreationdate() {
        return creationdate;
    }
    @JsonProperty("creationdate")
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }
    @JsonProperty("creationuser")
    public String getCreationuser() {
        return creationuser;
    }
    @JsonProperty("creationuser")
    public void setCreationuser(String creationuser) {
        this.creationuser = creationuser;
    }
    @JsonProperty("updatedate")
    public Date getUpdatedate() {
        return updatedate;
    }
    @JsonProperty("updatedate")
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
    @JsonProperty("updateuser")
    public String getUpdateuser() {
        return updateuser;
    }
    @JsonProperty("updateuser")
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }
}
