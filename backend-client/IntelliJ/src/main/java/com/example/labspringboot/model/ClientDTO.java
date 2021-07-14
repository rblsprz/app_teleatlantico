package com.example.labspringboot.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;


public class ClientDTO{

        private String name;
        private String firstsurname;
        private String secondsurname;
        private String address;
        private String phone;
        private String secondcontact;
        private String email;
        private String password;
        private int television;
        private int mobilephone;
        private int telephone;
        private int internet;
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date creationdate;
        private String creationuser;
        @JsonFormat(pattern="yyyy-MM-dd")
        private Date updatedate;
        private String updateuser;


        public ClientDTO() {
        }


        public ClientDTO(String name, String firstsurname, String secondsurname, String address, String phone, String secondcontact, String email, String password, int television, int mobilephone, int telephone, int internet, Date creationdate, String creationuser, Date updatedate, String updateuser) {
            this.name = name;
            this.firstsurname = firstsurname;
            this.secondsurname = secondsurname;
            this.address = address;
            this.phone = phone;
            this.secondcontact = secondcontact;
            this.email = email;
            this.password = password;
            this.television = television;
            this.mobilephone = mobilephone;
            this.telephone = telephone;
            this.internet = internet;
            this.creationdate = creationdate;
            this.creationuser = creationuser;
            this.updatedate = updatedate;
            this.updateuser = updateuser;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

         @JsonProperty("firstsurname")
        public String getFirstsurname() {
            return firstsurname;
        }

        @JsonProperty("firstsurname")
        public void setFirstsurname(String firstsurname) {
            this.firstsurname = firstsurname;
        }

        @JsonProperty("secondsurname")
        public String getSecondsurname() {
            return secondsurname;
        }

        @JsonProperty("secondsurname")
        public void setSecondsurname(String secondsurname) {
            this.secondsurname = secondsurname;
        }

        @JsonProperty("address")
        public String getAddress() {
            return address;
        }

        @JsonProperty("address")
        public void setAddress(String address) {
            this.address = address;
        }

        @JsonProperty("phone")
        public String getPhone() {
            return phone;
        }

        @JsonProperty("phone")
        public void setPhone(String phone) {
            this.phone = phone;
        }

        @JsonProperty("secondcontact")
         public String getSecondcontact() {
            return secondcontact;
        }

        @JsonProperty("secondcontact")
        public void setSecondcontact(String secondcontact) {
            this.secondcontact = secondcontact;
        }

        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        @JsonProperty("email")
        public void setEmail(String email) {
            this.email = email;
        }

        @JsonProperty("password")
        public String getPassword() {
            return password;
        }

        @JsonProperty("password")
        public void setPassword(String password) { this.password = password; }

        @JsonProperty("television")
        public int getTelevision() {
            return television;
        }

        @JsonProperty("television")
        public void setTelevision(int television) {
            this.television = television;
        }

        @JsonProperty("mobilephone")
        public int getMobilephone() {
            return mobilephone;
        }

        @JsonProperty("mobilephone")
        public void setMobilephone(int mobilephone) { this.mobilephone = mobilephone; }

        @JsonProperty("telephone")
        public int getTelephone() {
            return telephone;
        }

        @JsonProperty("telephone")
        public void setTelephone(int telephone) {
            this.telephone = telephone;
        }

       @JsonProperty("internet")
        public int getInternet() {
            return internet;
        }

        @JsonProperty("internet")
        public void setInternet(int internet) {
            this.internet = internet;
        }

        @JsonProperty("creationdate")
        public Date getCreationdate() { return creationdate; }

        @JsonProperty("creationdate")
        public void setCreationdate(Date creationdate) { this.creationdate = creationdate; }

        @JsonProperty("creationuser")
        public String getCreationuser() { return creationuser; }

        @JsonProperty("CreationUser")
        public void setCreationuser(String creationuser) { this.creationuser = creationuser; }

       @JsonProperty("updatedate")
        public Date getUpdatedate() { return updatedate; }

        @JsonProperty("updatedate")
        public void setUpdatedate(Date updatedate) { this.updatedate = updatedate; }

        @JsonProperty("updateuser")
        public String getUpdateuser() { return updateuser; }

        @JsonProperty("updateuser")
        public void setUpdateuser(String updateuser) { this.updateuser = updateuser; }
}
