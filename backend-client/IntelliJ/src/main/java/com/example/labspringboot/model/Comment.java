package com.example.labspringboot.model;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Comment")
@NamedStoredProcedureQuery(name = "Comment.SelectCommentByIssue", procedureName = "SelectCommentByIssue", parameters = {
@StoredProcedureParameter(mode = ParameterMode.IN, name = "number", type = String.class)})
public class Comment {

    private int id;
    private String description;
    private String reportnumber;
    private Date creationdate;
    private String creationuser;
    private Date updatedate;
    private String updateuser;

    public Comment() {
    }

    public Comment(int id, String description, String reportnumber, Date creationdate, String creationuser, Date updatedate, String updateuser) {
        this.id = id;
        this.description = description;
        this.reportnumber = reportnumber;
        this.creationdate = creationdate;
        this.creationuser = creationuser;
        this.updatedate = updatedate;
        this.updateuser = updateuser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription() {
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getReportnumber() {
        return this.reportnumber;
    }
    public void setReportnumber(String reportnumber) {
    	this.reportnumber = reportnumber;
    }
    public Date getCreationdate() {
        return this.creationdate;
    }
    public void setCreationdate(Date creationdate) {
    	this.creationdate = creationdate;
    }
    public String getCreationuser() {
        return this.creationuser;
    }
    public void setCreationuser(String creationuser) {
    	this.creationuser = creationuser;
    }
    public Date getUpdatedate() {
        return this.updatedate;
    }
    public void setUpdatedate(Date updatedate) {
    	this.updatedate = updatedate;
    }
    public String getUpdateuser() {
        return this.updateuser;
    }
    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }
}
