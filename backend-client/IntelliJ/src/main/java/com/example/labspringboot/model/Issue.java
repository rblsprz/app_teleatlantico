package com.example.labspringboot.model;

import javax.persistence.*;
import java.sql.Date;




@Entity
@Table(name = "Issue")
@NamedStoredProcedureQuery(name = "Issue.SelectIssueByClient", procedureName = "SelectIssueByClient", parameters = {
@StoredProcedureParameter(mode = ParameterMode.IN, name = "id", type = Index.class)})

@NamedStoredProcedureQuery(name = "Issue.SelectIssueByReportNumber", procedureName = "SelectIssueByReportNumber", parameters = {
@StoredProcedureParameter(mode = ParameterMode.IN, name = "number", type = String.class)})

public class Issue {

    private int id;
    private String reportnumber;
    private String address;
    private String contactphone;
    private String contactemail;
    private String status;
    private String supportuserasigned;
    private int iduser;
    private String description;
    private String service;
    private Date creationdate;
    private String creationuser;
    private Date updatedate;
    private String updateuser;


    public Issue() {
    }

    public Issue(int id, String reportnumber, String address, String contactphone, String contactemail, String status, String supportuserasigned, int iduser, String description, String service, Date creationdate, String creationuser, Date updatedate, String updateuser) {
        this.id = id;
        this.reportnumber = reportnumber;
        this.address = address;
        this.contactphone = contactphone;
        this.contactemail = contactemail;
        this.status = status;
        this.supportuserasigned = supportuserasigned;
        this.iduser = iduser;
        this.description = description;
        this.service = service;
        this.creationdate = creationdate;
        this.creationuser = creationuser;
        this.updatedate = updatedate;
        this.updateuser = updateuser;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReportnumber() {
        return reportnumber;
    }

    public void setReportnumber(String reportnumber) {
        this.reportnumber = reportnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactphone() {
        return contactphone;
    }

    public void setContactphone(String contactphone) {
        this.contactphone = contactphone;
    }

    public String getContactemail() {
        return contactemail;
    }

    public void setContactemail(String contactemail) {
        this.contactemail = contactemail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupportuserasigned() {
        return supportuserasigned;
    }

    public void setSupportuserasigned(String supportuserasigned) {
        this.supportuserasigned = supportuserasigned;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public String getCreationuser() {
        return creationuser;
    }

    public void setCreationuser(String creationuser) {
        this.creationuser = creationuser;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

}

