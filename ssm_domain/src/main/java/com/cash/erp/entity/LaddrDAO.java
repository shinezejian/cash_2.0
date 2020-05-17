package com.cash.erp.entity;

public class LaddrDAO {
    private Integer pkLaddr;

    private Integer fkKunden;

    private String lkunum;

    private String lort;

    private String lkurz;

    private String ladr1;

    private String ladr2;

    private String ladr3;

    private String ladr4;

    private String ladr5;

    private String ladr6;

    private String ladr7;

    private String lkindex;

    private String stamp;

    public Integer getPkLaddr() {
        return pkLaddr;
    }

    public void setPkLaddr(Integer pkLaddr) {
        this.pkLaddr = pkLaddr;
    }

    public Integer getFkKunden() {
        return fkKunden;
    }

    public void setFkKunden(Integer fkKunden) {
        this.fkKunden = fkKunden;
    }

    public String getLkunum() {
        return lkunum;
    }

    public void setLkunum(String lkunum) {
        this.lkunum = lkunum == null ? null : lkunum.trim();
    }

    public String getLort() {
        return lort;
    }

    public void setLort(String lort) {
        this.lort = lort == null ? null : lort.trim();
    }

    public String getLkurz() {
        return lkurz;
    }

    public void setLkurz(String lkurz) {
        this.lkurz = lkurz == null ? null : lkurz.trim();
    }

    public String getLadr1() {
        return ladr1;
    }

    public void setLadr1(String ladr1) {
        this.ladr1 = ladr1 == null ? null : ladr1.trim();
    }

    public String getLadr2() {
        return ladr2;
    }

    public void setLadr2(String ladr2) {
        this.ladr2 = ladr2 == null ? null : ladr2.trim();
    }

    public String getLadr3() {
        return ladr3;
    }

    public void setLadr3(String ladr3) {
        this.ladr3 = ladr3 == null ? null : ladr3.trim();
    }

    public String getLadr4() {
        return ladr4;
    }

    public void setLadr4(String ladr4) {
        this.ladr4 = ladr4 == null ? null : ladr4.trim();
    }

    public String getLadr5() {
        return ladr5;
    }

    public void setLadr5(String ladr5) {
        this.ladr5 = ladr5 == null ? null : ladr5.trim();
    }

    public String getLadr6() {
        return ladr6;
    }

    public void setLadr6(String ladr6) {
        this.ladr6 = ladr6 == null ? null : ladr6.trim();
    }

    public String getLadr7() {
        return ladr7;
    }

    public void setLadr7(String ladr7) {
        this.ladr7 = ladr7 == null ? null : ladr7.trim();
    }

    public String getLkindex() {
        return lkindex;
    }

    public void setLkindex(String lkindex) {
        this.lkindex = lkindex == null ? null : lkindex.trim();
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}