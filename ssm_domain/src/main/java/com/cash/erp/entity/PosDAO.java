package com.cash.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PosDAO {
    private Integer pkPos;

    private Integer fkAuftrag;

    private Short laus;

    private String paufno;

    private String pposno;

    private String pmenge;

    private String punit;

    private String part1;

    private String part2;

    private String part3;

    private String part4;

    private String ptech;

    private String pdeltime;

    private BigDecimal pvk;

    private Integer pvper;

    private String pvwae;

    private BigDecimal pveurfak;

    private BigDecimal pveur;

    private BigDecimal pek;

    private Integer peper;

    private String pewae;

    private BigDecimal peeurfak;

    private BigDecimal peeur;

    private String plief;

    private String pstatus;

    private String pspec;

    private String pdep;

    private String panab;

    private String phunu;

    private Date pltermin;

    private String patyp;

    private String prem;

    private String stamp;

    public Integer getPkPos() {
        return pkPos;
    }

    public void setPkPos(Integer pkPos) {
        this.pkPos = pkPos;
    }

    public Integer getFkAuftrag() {
        return fkAuftrag;
    }

    public void setFkAuftrag(Integer fkAuftrag) {
        this.fkAuftrag = fkAuftrag;
    }

    public Short getLaus() {
        return laus;
    }

    public void setLaus(Short laus) {
        this.laus = laus;
    }

    public String getPaufno() {
        return paufno;
    }

    public void setPaufno(String paufno) {
        this.paufno = paufno == null ? null : paufno.trim();
    }

    public String getPposno() {
        return pposno;
    }

    public void setPposno(String pposno) {
        this.pposno = pposno == null ? null : pposno.trim();
    }

    public String getPmenge() {
        return pmenge;
    }

    public void setPmenge(String pmenge) {
        this.pmenge = pmenge == null ? null : pmenge.trim();
    }

    public String getPunit() {
        return punit;
    }

    public void setPunit(String punit) {
        this.punit = punit == null ? null : punit.trim();
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1 == null ? null : part1.trim();
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2 == null ? null : part2.trim();
    }

    public String getPart3() {
        return part3;
    }

    public void setPart3(String part3) {
        this.part3 = part3 == null ? null : part3.trim();
    }

    public String getPart4() {
        return part4;
    }

    public void setPart4(String part4) {
        this.part4 = part4 == null ? null : part4.trim();
    }

    public String getPtech() {
        return ptech;
    }

    public void setPtech(String ptech) {
        this.ptech = ptech == null ? null : ptech.trim();
    }

    public String getPdeltime() {
        return pdeltime;
    }

    public void setPdeltime(String pdeltime) {
        this.pdeltime = pdeltime == null ? null : pdeltime.trim();
    }

    public BigDecimal getPvk() {
        return pvk;
    }

    public void setPvk(BigDecimal pvk) {
        this.pvk = pvk;
    }

    public Integer getPvper() {
        return pvper;
    }

    public void setPvper(Integer pvper) {
        this.pvper = pvper;
    }

    public String getPvwae() {
        return pvwae;
    }

    public void setPvwae(String pvwae) {
        this.pvwae = pvwae == null ? null : pvwae.trim();
    }

    public BigDecimal getPveurfak() {
        return pveurfak;
    }

    public void setPveurfak(BigDecimal pveurfak) {
        this.pveurfak = pveurfak;
    }

    public BigDecimal getPveur() {
        return pveur;
    }

    public void setPveur(BigDecimal pveur) {
        this.pveur = pveur;
    }

    public BigDecimal getPek() {
        return pek;
    }

    public void setPek(BigDecimal pek) {
        this.pek = pek;
    }

    public Integer getPeper() {
        return peper;
    }

    public void setPeper(Integer peper) {
        this.peper = peper;
    }

    public String getPewae() {
        return pewae;
    }

    public void setPewae(String pewae) {
        this.pewae = pewae == null ? null : pewae.trim();
    }

    public BigDecimal getPeeurfak() {
        return peeurfak;
    }

    public void setPeeurfak(BigDecimal peeurfak) {
        this.peeurfak = peeurfak;
    }

    public BigDecimal getPeeur() {
        return peeur;
    }

    public void setPeeur(BigDecimal peeur) {
        this.peeur = peeur;
    }

    public String getPlief() {
        return plief;
    }

    public void setPlief(String plief) {
        this.plief = plief == null ? null : plief.trim();
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus == null ? null : pstatus.trim();
    }

    public String getPspec() {
        return pspec;
    }

    public void setPspec(String pspec) {
        this.pspec = pspec == null ? null : pspec.trim();
    }

    public String getPdep() {
        return pdep;
    }

    public void setPdep(String pdep) {
        this.pdep = pdep == null ? null : pdep.trim();
    }

    public String getPanab() {
        return panab;
    }

    public void setPanab(String panab) {
        this.panab = panab == null ? null : panab.trim();
    }

    public String getPhunu() {
        return phunu;
    }

    public void setPhunu(String phunu) {
        this.phunu = phunu == null ? null : phunu.trim();
    }

    public Date getPltermin() {
        return pltermin;
    }

    public void setPltermin(Date pltermin) {
        this.pltermin = pltermin;
    }

    public String getPatyp() {
        return patyp;
    }

    public void setPatyp(String patyp) {
        this.patyp = patyp == null ? null : patyp.trim();
    }

    public String getPrem() {
        return prem;
    }

    public void setPrem(String prem) {
        this.prem = prem == null ? null : prem.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}