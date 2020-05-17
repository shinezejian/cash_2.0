package com.cash.erp.entity;

public class User3DAO {
    private Integer pkUser;

    private Integer fkGruppe;

    private String username;

    private String password;

    private String anrede;

    private String fullname;

    private String datCreated;

    private String datUpdated;

    private String datUntil;

    private String internalId;

    private String tel1;

    private String tel2;

    private String email;

    private String address;

    private String stamp;

    public Integer getPkUser() {
        return pkUser;
    }

    public void setPkUser(Integer pkUser) {
        this.pkUser = pkUser;
    }

    public Integer getFkGruppe() {
        return fkGruppe;
    }

    public void setFkGruppe(Integer fkGruppe) {
        this.fkGruppe = fkGruppe;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede == null ? null : anrede.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public String getDatCreated() {
        return datCreated;
    }

    public void setDatCreated(String datCreated) {
        this.datCreated = datCreated == null ? null : datCreated.trim();
    }

    public String getDatUpdated() {
        return datUpdated;
    }

    public void setDatUpdated(String datUpdated) {
        this.datUpdated = datUpdated == null ? null : datUpdated.trim();
    }

    public String getDatUntil() {
        return datUntil;
    }

    public void setDatUntil(String datUntil) {
        this.datUntil = datUntil == null ? null : datUntil.trim();
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId == null ? null : internalId.trim();
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1 == null ? null : tel1.trim();
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2 == null ? null : tel2.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}