package com.example.labspringboot.model;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CommentDTO {
	
    private String description;
    private int idissue;
    private String reportnumber;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date creationdate;
    private String creationuser;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updatedate;
    private String updateuser;

    public CommentDTO() {
    }

    public CommentDTO(String description, int idissue, String reportnumber, Date creationdate, String creationuser, Date updatedate, String updateuser) {
        this.description = description;
        this.idissue = idissue;
        this.reportnumber = reportnumber;
        this.creationdate = creationdate;
        this.creationuser = creationuser;
        this.updatedate = updatedate;
        this.updateuser = updateuser;
    }

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("issue")
    public int getIdissue() {
        return this.idissue;
    }
    @JsonProperty("issue")
    public void setIdissue(int idissue) {
    	this.idissue = idissue;
    }

    @JsonProperty("reportnumber")
    public String getReportnumber() {
        return this.reportnumber;
    }
    @JsonProperty("reportnumber")
    public void setReportnumber(String reportnumber) {
    	this.reportnumber = reportnumber;
    }
    @JsonProperty("creationdate")
    public Date getCreationdate() {
        return this.creationdate;
    }
    @JsonProperty("creationdate")
    public void setCreationdate(Date creationdate) {
    	this.creationdate = creationdate;
    }
    @JsonProperty("creationuser")
    public String getCreationuser() {
        return this.creationuser;
    }
    @JsonProperty("creationuser")
    public void setCreationuser(String creationuser) {
    	this.creationuser = creationuser;
    }
    @JsonProperty("updatedate")
    public Date getUpdatedate() {
        return this.updatedate;
    }
    @JsonProperty("updatedate")
    public void setUpdatedate(Date updatedate) {
    	this.updatedate = updatedate;
    }
    @JsonProperty("updateuser")
    public String getUpdateuser() {
        return this.updateuser;
    }
    @JsonProperty("updateuser")
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

}
