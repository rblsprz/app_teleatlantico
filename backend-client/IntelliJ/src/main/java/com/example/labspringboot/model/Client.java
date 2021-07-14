package com.example.labspringboot.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Client")
@NamedStoredProcedureQuery(name = "Client.SelectClientByEmail", procedureName = "SelectClientByEmail", parameters = {
@StoredProcedureParameter(mode = ParameterMode.IN, name = "email", type = String.class),
@StoredProcedureParameter(mode = ParameterMode.IN, name = "password", type = String.class)})

public class Client {

    private int id;
    private String name;
    private String firstsurname;
    private String secondsurname;
    private String phone;
    private String secondcontact;
    private String email;
    private String password;
    private String address;
    private int television;
    private int mobilephone;
    private int telephone;
    private int internet;
    private Date creationdate;
    private String creationuser;
    private Date updatedate;
    private String updateuser;

    public Client(int id, String name, String firstsurname, String secondsurname, String phone, String secondcontact, String email, String password, String address, int television, int mobilephone, int telephone, int internet, Date creationdate, String creationuser, Date updatedate, String updateuser) {
        this.id = id;
        this.name = name;
        this.firstsurname = firstsurname;
        this.secondsurname = secondsurname;
        this.phone = phone;
        this.secondcontact = secondcontact;
        this.email = email;
        this.password = password;
        this.address = address;
        this.television = television;
        this.mobilephone = mobilephone;
        this.telephone = telephone;
        this.internet = internet;
        this.creationdate = creationdate;
        this.creationuser = creationuser;
        this.updatedate = updatedate;
        this.updateuser = updateuser;
    }

    public Client() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstsurname() { return firstsurname;}

    public void setFirstsurname(String firstsurname) {
        this.firstsurname = firstsurname;
    }

    public String getSecondsurname() {
        return secondsurname;
    }

    public void setSecondsurname(String secondsurname) {
        this.secondsurname = secondsurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecondcontact() {
        return secondcontact;
    }

    public void setSecondcontact(String secondcontact) {
        this.secondcontact = secondcontact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    public int getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(int mobilephone) {
        this.mobilephone = mobilephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public Date getCreationdate() { return creationdate; }

    public void setCreationdate(Date creationdate) { this.creationdate = creationdate; }

    public String getCreationuser() { return creationuser; }

    public void setCreationuser(String creationuser) { this.creationuser = creationuser; }

    public Date getUpdatedate() { return updatedate; }

    public void setUpdatedate(Date updatedate) { this.updatedate = updatedate; }

    public String getUpdateuser() { return updateuser; }

    public void setUpdateuser(String updateuser) { this.updateuser = updateuser; }

}
