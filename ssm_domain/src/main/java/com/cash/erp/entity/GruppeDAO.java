package com.cash.erp.entity;

public class GruppeDAO {
    private Integer pkGruppe;

    private String name;

    private String status;

    private String allowCash;

    private String allowAccounting;

    private String allowSystem;

    private String allowAdmin;

    private String rem;

    private String stamp;

    public Integer getPkGruppe() {
        return pkGruppe;
    }

    public void setPkGruppe(Integer pkGruppe) {
        this.pkGruppe = pkGruppe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAllowCash() {
        return allowCash;
    }

    public void setAllowCash(String allowCash) {
        this.allowCash = allowCash == null ? null : allowCash.trim();
    }

    public String getAllowAccounting() {
        return allowAccounting;
    }

    public void setAllowAccounting(String allowAccounting) {
        this.allowAccounting = allowAccounting == null ? null : allowAccounting.trim();
    }

    public String getAllowSystem() {
        return allowSystem;
    }

    public void setAllowSystem(String allowSystem) {
        this.allowSystem = allowSystem == null ? null : allowSystem.trim();
    }

    public String getAllowAdmin() {
        return allowAdmin;
    }

    public void setAllowAdmin(String allowAdmin) {
        this.allowAdmin = allowAdmin == null ? null : allowAdmin.trim();
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}