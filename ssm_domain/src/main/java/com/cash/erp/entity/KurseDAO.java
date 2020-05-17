package com.cash.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class KurseDAO {
    private Integer pkKurse;

    private String kwae;

    private String kland;

    private BigDecimal kkurs;

    private String kfixed;

    private Date klast;

    private String stamp;

    public Integer getPkKurse() {
        return pkKurse;
    }

    public void setPkKurse(Integer pkKurse) {
        this.pkKurse = pkKurse;
    }

    public String getKwae() {
        return kwae;
    }

    public void setKwae(String kwae) {
        this.kwae = kwae == null ? null : kwae.trim();
    }

    public String getKland() {
        return kland;
    }

    public void setKland(String kland) {
        this.kland = kland == null ? null : kland.trim();
    }

    public BigDecimal getKkurs() {
        return kkurs;
    }

    public void setKkurs(BigDecimal kkurs) {
        this.kkurs = kkurs;
    }

    public String getKfixed() {
        return kfixed;
    }

    public void setKfixed(String kfixed) {
        this.kfixed = kfixed == null ? null : kfixed.trim();
    }

    public Date getKlast() {
        return klast;
    }

    public void setKlast(Date klast) {
        this.klast = klast;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }
}