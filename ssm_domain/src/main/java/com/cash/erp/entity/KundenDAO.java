package com.cash.erp.entity;

import java.math.BigDecimal;
import java.util.Date;

public class KundenDAO {
    private Integer pkKunden;

    private Integer fkLaddr;

    private String kkunum;

    private Date kdatum;

    private String ksname;

    private String kwerber;

    private String kbetreu;

    private String kgruppe;

    private String kehemali;

    private String ktyp;

    private Integer kbrt;

    private String kraddr1;

    private String kraddr2;

    private String kraddr3;

    private String kraddr4;

    private String kraddr5;

    private String kraddr6;

    private String kraddr7;

    private String ktel1;

    private String ktel2;

    private String ktlx;

    private String kfax;

    private Short kcopies;

    private String kmwstpro;

    private String kvat;

    private BigDecimal kraba;

    private String kzahld;

    private String kzahle;

    private String ksprach;

    private String krem1;

    private String krem2;

    private String krem3;

    private String krem4;

    private String krout1;

    private String krout2;

    private String krout3;

    private String krout4;

    private Date kroutdat;

    private String kdatumls;

    private BigDecimal kaufschl;

    private String stamp;

    private Short kbank;

    private String kredinr;

    private Short ktage1;

    private String kproz1;

    private Short ktage2;

    private String kproz2;

    private String kemail;

    private Integer fkKundencontact;

    private String rem;

    public Integer getPkKunden() {
        return pkKunden;
    }

    public void setPkKunden(Integer pkKunden) {
        this.pkKunden = pkKunden;
    }

    public Integer getFkLaddr() {
        return fkLaddr;
    }

    public void setFkLaddr(Integer fkLaddr) {
        this.fkLaddr = fkLaddr;
    }

    public String getKkunum() {
        return kkunum;
    }

    public void setKkunum(String kkunum) {
        this.kkunum = kkunum == null ? null : kkunum.trim();
    }

    public Date getKdatum() {
        return kdatum;
    }

    public void setKdatum(Date kdatum) {
        this.kdatum = kdatum;
    }

    public String getKsname() {
        return ksname;
    }

    public void setKsname(String ksname) {
        this.ksname = ksname == null ? null : ksname.trim();
    }

    public String getKwerber() {
        return kwerber;
    }

    public void setKwerber(String kwerber) {
        this.kwerber = kwerber == null ? null : kwerber.trim();
    }

    public String getKbetreu() {
        return kbetreu;
    }

    public void setKbetreu(String kbetreu) {
        this.kbetreu = kbetreu == null ? null : kbetreu.trim();
    }

    public String getKgruppe() {
        return kgruppe;
    }

    public void setKgruppe(String kgruppe) {
        this.kgruppe = kgruppe == null ? null : kgruppe.trim();
    }

    public String getKehemali() {
        return kehemali;
    }

    public void setKehemali(String kehemali) {
        this.kehemali = kehemali == null ? null : kehemali.trim();
    }

    public String getKtyp() {
        return ktyp;
    }

    public void setKtyp(String ktyp) {
        this.ktyp = ktyp == null ? null : ktyp.trim();
    }

    public Integer getKbrt() {
        return kbrt;
    }

    public void setKbrt(Integer kbrt) {
        this.kbrt = kbrt;
    }

    public String getKraddr1() {
        return kraddr1;
    }

    public void setKraddr1(String kraddr1) {
        this.kraddr1 = kraddr1 == null ? null : kraddr1.trim();
    }

    public String getKraddr2() {
        return kraddr2;
    }

    public void setKraddr2(String kraddr2) {
        this.kraddr2 = kraddr2 == null ? null : kraddr2.trim();
    }

    public String getKraddr3() {
        return kraddr3;
    }

    public void setKraddr3(String kraddr3) {
        this.kraddr3 = kraddr3 == null ? null : kraddr3.trim();
    }

    public String getKraddr4() {
        return kraddr4;
    }

    public void setKraddr4(String kraddr4) {
        this.kraddr4 = kraddr4 == null ? null : kraddr4.trim();
    }

    public String getKraddr5() {
        return kraddr5;
    }

    public void setKraddr5(String kraddr5) {
        this.kraddr5 = kraddr5 == null ? null : kraddr5.trim();
    }

    public String getKraddr6() {
        return kraddr6;
    }

    public void setKraddr6(String kraddr6) {
        this.kraddr6 = kraddr6 == null ? null : kraddr6.trim();
    }

    public String getKraddr7() {
        return kraddr7;
    }

    public void setKraddr7(String kraddr7) {
        this.kraddr7 = kraddr7 == null ? null : kraddr7.trim();
    }

    public String getKtel1() {
        return ktel1;
    }

    public void setKtel1(String ktel1) {
        this.ktel1 = ktel1 == null ? null : ktel1.trim();
    }

    public String getKtel2() {
        return ktel2;
    }

    public void setKtel2(String ktel2) {
        this.ktel2 = ktel2 == null ? null : ktel2.trim();
    }

    public String getKtlx() {
        return ktlx;
    }

    public void setKtlx(String ktlx) {
        this.ktlx = ktlx == null ? null : ktlx.trim();
    }

    public String getKfax() {
        return kfax;
    }

    public void setKfax(String kfax) {
        this.kfax = kfax == null ? null : kfax.trim();
    }

    public Short getKcopies() {
        return kcopies;
    }

    public void setKcopies(Short kcopies) {
        this.kcopies = kcopies;
    }

    public String getKmwstpro() {
        return kmwstpro;
    }

    public void setKmwstpro(String kmwstpro) {
        this.kmwstpro = kmwstpro == null ? null : kmwstpro.trim();
    }

    public String getKvat() {
        return kvat;
    }

    public void setKvat(String kvat) {
        this.kvat = kvat == null ? null : kvat.trim();
    }

    public BigDecimal getKraba() {
        return kraba;
    }

    public void setKraba(BigDecimal kraba) {
        this.kraba = kraba;
    }

    public String getKzahld() {
        return kzahld;
    }

    public void setKzahld(String kzahld) {
        this.kzahld = kzahld == null ? null : kzahld.trim();
    }

    public String getKzahle() {
        return kzahle;
    }

    public void setKzahle(String kzahle) {
        this.kzahle = kzahle == null ? null : kzahle.trim();
    }

    public String getKsprach() {
        return ksprach;
    }

    public void setKsprach(String ksprach) {
        this.ksprach = ksprach == null ? null : ksprach.trim();
    }

    public String getKrem1() {
        return krem1;
    }

    public void setKrem1(String krem1) {
        this.krem1 = krem1 == null ? null : krem1.trim();
    }

    public String getKrem2() {
        return krem2;
    }

    public void setKrem2(String krem2) {
        this.krem2 = krem2 == null ? null : krem2.trim();
    }

    public String getKrem3() {
        return krem3;
    }

    public void setKrem3(String krem3) {
        this.krem3 = krem3 == null ? null : krem3.trim();
    }

    public String getKrem4() {
        return krem4;
    }

    public void setKrem4(String krem4) {
        this.krem4 = krem4 == null ? null : krem4.trim();
    }

    public String getKrout1() {
        return krout1;
    }

    public void setKrout1(String krout1) {
        this.krout1 = krout1 == null ? null : krout1.trim();
    }

    public String getKrout2() {
        return krout2;
    }

    public void setKrout2(String krout2) {
        this.krout2 = krout2 == null ? null : krout2.trim();
    }

    public String getKrout3() {
        return krout3;
    }

    public void setKrout3(String krout3) {
        this.krout3 = krout3 == null ? null : krout3.trim();
    }

    public String getKrout4() {
        return krout4;
    }

    public void setKrout4(String krout4) {
        this.krout4 = krout4 == null ? null : krout4.trim();
    }

    public Date getKroutdat() {
        return kroutdat;
    }

    public void setKroutdat(Date kroutdat) {
        this.kroutdat = kroutdat;
    }

    public String getKdatumls() {
        return kdatumls;
    }

    public void setKdatumls(String kdatumls) {
        this.kdatumls = kdatumls == null ? null : kdatumls.trim();
    }

    public BigDecimal getKaufschl() {
        return kaufschl;
    }

    public void setKaufschl(BigDecimal kaufschl) {
        this.kaufschl = kaufschl;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }

    public Short getKbank() {
        return kbank;
    }

    public void setKbank(Short kbank) {
        this.kbank = kbank;
    }

    public String getKredinr() {
        return kredinr;
    }

    public void setKredinr(String kredinr) {
        this.kredinr = kredinr == null ? null : kredinr.trim();
    }

    public Short getKtage1() {
        return ktage1;
    }

    public void setKtage1(Short ktage1) {
        this.ktage1 = ktage1;
    }

    public String getKproz1() {
        return kproz1;
    }

    public void setKproz1(String kproz1) {
        this.kproz1 = kproz1 == null ? null : kproz1.trim();
    }

    public Short getKtage2() {
        return ktage2;
    }

    public void setKtage2(Short ktage2) {
        this.ktage2 = ktage2;
    }

    public String getKproz2() {
        return kproz2;
    }

    public void setKproz2(String kproz2) {
        this.kproz2 = kproz2 == null ? null : kproz2.trim();
    }

    public String getKemail() {
        return kemail;
    }

    public void setKemail(String kemail) {
        this.kemail = kemail == null ? null : kemail.trim();
    }

    public Integer getFkKundencontact() {
        return fkKundencontact;
    }

    public void setFkKundencontact(Integer fkKundencontact) {
        this.fkKundencontact = fkKundencontact;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }
}