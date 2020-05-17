package com.cash.erp.entity;

public class KundenContactDAO {
    private Integer pkKundencontact;

    private Integer fkKunden;

    private String name;

    private String vorname;

    private String company;

    private String street;

    private String blz;

    private String ort;

    private String state;

    private String country;

    private String tel;

    private String fax;

    private String email;

    private String telPrivate;

    private String emailPrivate;

    private String website;

    private String remarks;

    private String stamp;

    public Integer getPkKundencontact() {
        return pkKundencontact;
    }

    public void setPkKundencontact(Integer pkKundencontact) {
        this.pkKundencontact = pkKundencontact;
    }

    public Integer getFkKunden() {
        return fkKunden;
    }

    public void setFkKunden(Integer fkKunden) {
        this.fkKunden = fkKunden;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname == null ? null : vorname.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz == null ? null : blz.trim();
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort == null ? null : ort.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getTelPrivate() {
        return telPrivate;
    }

    public void setTelPrivate(String telPrivate) {
        this.telPrivate = telPrivate == null ? null : telPrivate.trim();
    }

    public String getEmailPrivate() {
        return emailPrivate;
    }

    public void setEmailPrivate(String emailPrivate) {
        this.emailPrivate = emailPrivate == null ? null : emailPrivate.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}