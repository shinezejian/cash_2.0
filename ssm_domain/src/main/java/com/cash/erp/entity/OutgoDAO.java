package com.cash.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OutgoDAO {
    private Integer pkOutgo;

    private Integer fkAuftrag;

    private String ocust;

    private String oinvno;

    private String otype;

    private String oaufno;

    private String ocurr;

    private BigDecimal ocfactor;

    private Date odate;

    private String ovatco;

    private BigDecimal ovatpr;

    private BigDecimal ovatdm;

    private BigDecimal odisproz;

    private BigDecimal odisdm;

    private BigDecimal osonde;

    private BigDecimal onetto;

    private BigDecimal otopay;

    private Date odue;

    private Date opayd1;

    private BigDecimal opaydm1;

    private Date opayd2;

    private BigDecimal opaydm2;

    private Date opayd3;

    private BigDecimal opaydm3;

    private String oexport;

    private Short obank;

    private String ocustnam;

    private BigDecimal oopen;

    private BigDecimal ofacto2;

    private BigDecimal ofacto3;

    private String orem;

    private String oref;

    private String stamp;

    public Integer getPkOutgo() {
        return pkOutgo;
    }

    public void setPkOutgo(Integer pkOutgo) {
        this.pkOutgo = pkOutgo;
    }

    public Integer getFkAuftrag() {
        return fkAuftrag;
    }

    public void setFkAuftrag(Integer fkAuftrag) {
        this.fkAuftrag = fkAuftrag;
    }

    public String getOcust() {
        return ocust;
    }

    public void setOcust(String ocust) {
        this.ocust = ocust == null ? null : ocust.trim();
    }

    public String getOinvno() {
        return oinvno;
    }

    public void setOinvno(String oinvno) {
        this.oinvno = oinvno == null ? null : oinvno.trim();
    }

    public String getOtype() {
        return otype;
    }

    public void setOtype(String otype) {
        this.otype = otype == null ? null : otype.trim();
    }

    public String getOaufno() {
        return oaufno;
    }

    public void setOaufno(String oaufno) {
        this.oaufno = oaufno == null ? null : oaufno.trim();
    }

    public String getOcurr() {
        return ocurr;
    }

    public void setOcurr(String ocurr) {
        this.ocurr = ocurr == null ? null : ocurr.trim();
    }

    public BigDecimal getOcfactor() {
        return ocfactor;
    }

    public void setOcfactor(BigDecimal ocfactor) {
        this.ocfactor = ocfactor;
    }

    public Date getOdate() {
        return odate;
    }

    public void setOdate(Date odate) {
        this.odate = odate;
    }

    public String getOvatco() {
        return ovatco;
    }

    public void setOvatco(String ovatco) {
        this.ovatco = ovatco == null ? null : ovatco.trim();
    }

    public BigDecimal getOvatpr() {
        return ovatpr;
    }

    public void setOvatpr(BigDecimal ovatpr) {
        this.ovatpr = ovatpr;
    }

    public BigDecimal getOvatdm() {
        return ovatdm;
    }

    public void setOvatdm(BigDecimal ovatdm) {
        this.ovatdm = ovatdm;
    }

    public BigDecimal getOdisproz() {
        return odisproz;
    }

    public void setOdisproz(BigDecimal odisproz) {
        this.odisproz = odisproz;
    }

    public BigDecimal getOdisdm() {
        return odisdm;
    }

    public void setOdisdm(BigDecimal odisdm) {
        this.odisdm = odisdm;
    }

    public BigDecimal getOsonde() {
        return osonde;
    }

    public void setOsonde(BigDecimal osonde) {
        this.osonde = osonde;
    }

    public BigDecimal getOnetto() {
        return onetto;
    }

    public void setOnetto(BigDecimal onetto) {
        this.onetto = onetto;
    }

    public BigDecimal getOtopay() {
        return otopay;
    }

    public void setOtopay(BigDecimal otopay) {
        this.otopay = otopay;
    }

    public Date getOdue() {
        return odue;
    }

    public void setOdue(Date odue) {
        this.odue = odue;
    }

    public Date getOpayd1() {
        return opayd1;
    }

    public void setOpayd1(Date opayd1) {
        this.opayd1 = opayd1;
    }

    public BigDecimal getOpaydm1() {
        return opaydm1;
    }

    public void setOpaydm1(BigDecimal opaydm1) {
        this.opaydm1 = opaydm1;
    }

    public Date getOpayd2() {
        return opayd2;
    }

    public void setOpayd2(Date opayd2) {
        this.opayd2 = opayd2;
    }

    public BigDecimal getOpaydm2() {
        return opaydm2;
    }

    public void setOpaydm2(BigDecimal opaydm2) {
        this.opaydm2 = opaydm2;
    }

    public Date getOpayd3() {
        return opayd3;
    }

    public void setOpayd3(Date opayd3) {
        this.opayd3 = opayd3;
    }

    public BigDecimal getOpaydm3() {
        return opaydm3;
    }

    public void setOpaydm3(BigDecimal opaydm3) {
        this.opaydm3 = opaydm3;
    }

    public String getOexport() {
        return oexport;
    }

    public void setOexport(String oexport) {
        this.oexport = oexport == null ? null : oexport.trim();
    }

    public Short getObank() {
        return obank;
    }

    public void setObank(Short obank) {
        this.obank = obank;
    }

    public String getOcustnam() {
        return ocustnam;
    }

    public void setOcustnam(String ocustnam) {
        this.ocustnam = ocustnam == null ? null : ocustnam.trim();
    }

    public BigDecimal getOopen() {
        return oopen;
    }

    public void setOopen(BigDecimal oopen) {
        this.oopen = oopen;
    }

    public BigDecimal getOfacto2() {
        return ofacto2;
    }

    public void setOfacto2(BigDecimal ofacto2) {
        this.ofacto2 = ofacto2;
    }

    public BigDecimal getOfacto3() {
        return ofacto3;
    }

    public void setOfacto3(BigDecimal ofacto3) {
        this.ofacto3 = ofacto3;
    }

    public String getOrem() {
        return orem;
    }

    public void setOrem(String orem) {
        this.orem = orem == null ? null : orem.trim();
    }

    public String getOref() {
        return oref;
    }

    public void setOref(String oref) {
        this.oref = oref == null ? null : oref.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}