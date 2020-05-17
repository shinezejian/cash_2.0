package com.cash.erp.entity;

public class InvoiceDAO {
    private Integer pkInvoice;

    private Integer fkAuftrag;

    private String iinvno;

    private String irem;

    private String iref;

    private String stamp;

    public Integer getPkInvoice() {
        return pkInvoice;
    }

    public void setPkInvoice(Integer pkInvoice) {
        this.pkInvoice = pkInvoice;
    }

    public Integer getFkAuftrag() {
        return fkAuftrag;
    }

    public void setFkAuftrag(Integer fkAuftrag) {
        this.fkAuftrag = fkAuftrag;
    }

    public String getIinvno() {
        return iinvno;
    }

    public void setIinvno(String iinvno) {
        this.iinvno = iinvno == null ? null : iinvno.trim();
    }

    public String getIrem() {
        return irem;
    }

    public void setIrem(String irem) {
        this.irem = irem == null ? null : irem.trim();
    }

    public String getIref() {
        return iref;
    }

    public void setIref(String iref) {
        this.iref = iref == null ? null : iref.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}