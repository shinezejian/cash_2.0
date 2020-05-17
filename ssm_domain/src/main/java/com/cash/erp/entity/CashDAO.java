package com.cash.erp.entity;

public class CashDAO {
    private Integer pkCash;

    private String akurz;

    private String auch;

    private String prod1;

    private String prod2;

    private String anschr1;

    private String anschr2;

    private String anschr3;

    private String strasse;

    private String plzort;

    private String ortnr;

    private String land;

    private String tel1;

    private String tlx;

    private String fax;

    private String email;

    private String verweis1;

    private String verweis2;

    private String rem1;

    private String rem2;

    private String rem3;

    private String rem4;

    private String rem5;

    private String rem6;

    private String institut;

    private String blz;

    private String konto;

    private String vzweck1;

    private String vzweck2;

    private String skproz1;

    private Short sktage1;

    private String skproz2;

    private Short sktage2;

    private String skgen;

    private String debinr;

    private String vatno;

    private Short abank;

    private String stamp;

    private Integer fkCashcontact;

    private String rem;

    public Integer getPkCash() {
        return pkCash;
    }

    public void setPkCash(Integer pkCash) {
        this.pkCash = pkCash;
    }

    public String getAkurz() {
        return akurz;
    }

    public void setAkurz(String akurz) {
        this.akurz = akurz == null ? null : akurz.trim();
    }

    public String getAuch() {
        return auch;
    }

    public void setAuch(String auch) {
        this.auch = auch == null ? null : auch.trim();
    }

    public String getProd1() {
        return prod1;
    }

    public void setProd1(String prod1) {
        this.prod1 = prod1 == null ? null : prod1.trim();
    }

    public String getProd2() {
        return prod2;
    }

    public void setProd2(String prod2) {
        this.prod2 = prod2 == null ? null : prod2.trim();
    }

    public String getAnschr1() {
        return anschr1;
    }

    public void setAnschr1(String anschr1) {
        this.anschr1 = anschr1 == null ? null : anschr1.trim();
    }

    public String getAnschr2() {
        return anschr2;
    }

    public void setAnschr2(String anschr2) {
        this.anschr2 = anschr2 == null ? null : anschr2.trim();
    }

    public String getAnschr3() {
        return anschr3;
    }

    public void setAnschr3(String anschr3) {
        this.anschr3 = anschr3 == null ? null : anschr3.trim();
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse == null ? null : strasse.trim();
    }

    public String getPlzort() {
        return plzort;
    }

    public void setPlzort(String plzort) {
        this.plzort = plzort == null ? null : plzort.trim();
    }

    public String getOrtnr() {
        return ortnr;
    }

    public void setOrtnr(String ortnr) {
        this.ortnr = ortnr == null ? null : ortnr.trim();
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land == null ? null : land.trim();
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1 == null ? null : tel1.trim();
    }

    public String getTlx() {
        return tlx;
    }

    public void setTlx(String tlx) {
        this.tlx = tlx == null ? null : tlx.trim();
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

    public String getVerweis1() {
        return verweis1;
    }

    public void setVerweis1(String verweis1) {
        this.verweis1 = verweis1 == null ? null : verweis1.trim();
    }

    public String getVerweis2() {
        return verweis2;
    }

    public void setVerweis2(String verweis2) {
        this.verweis2 = verweis2 == null ? null : verweis2.trim();
    }

    public String getRem1() {
        return rem1;
    }

    public void setRem1(String rem1) {
        this.rem1 = rem1 == null ? null : rem1.trim();
    }

    public String getRem2() {
        return rem2;
    }

    public void setRem2(String rem2) {
        this.rem2 = rem2 == null ? null : rem2.trim();
    }

    public String getRem3() {
        return rem3;
    }

    public void setRem3(String rem3) {
        this.rem3 = rem3 == null ? null : rem3.trim();
    }

    public String getRem4() {
        return rem4;
    }

    public void setRem4(String rem4) {
        this.rem4 = rem4 == null ? null : rem4.trim();
    }

    public String getRem5() {
        return rem5;
    }

    public void setRem5(String rem5) {
        this.rem5 = rem5 == null ? null : rem5.trim();
    }

    public String getRem6() {
        return rem6;
    }

    public void setRem6(String rem6) {
        this.rem6 = rem6 == null ? null : rem6.trim();
    }

    public String getInstitut() {
        return institut;
    }

    public void setInstitut(String institut) {
        this.institut = institut == null ? null : institut.trim();
    }

    public String getBlz() {
        return blz;
    }

    public void setBlz(String blz) {
        this.blz = blz == null ? null : blz.trim();
    }

    public String getKonto() {
        return konto;
    }

    public void setKonto(String konto) {
        this.konto = konto == null ? null : konto.trim();
    }

    public String getVzweck1() {
        return vzweck1;
    }

    public void setVzweck1(String vzweck1) {
        this.vzweck1 = vzweck1 == null ? null : vzweck1.trim();
    }

    public String getVzweck2() {
        return vzweck2;
    }

    public void setVzweck2(String vzweck2) {
        this.vzweck2 = vzweck2 == null ? null : vzweck2.trim();
    }

    public String getSkproz1() {
        return skproz1;
    }

    public void setSkproz1(String skproz1) {
        this.skproz1 = skproz1 == null ? null : skproz1.trim();
    }

    public Short getSktage1() {
        return sktage1;
    }

    public void setSktage1(Short sktage1) {
        this.sktage1 = sktage1;
    }

    public String getSkproz2() {
        return skproz2;
    }

    public void setSkproz2(String skproz2) {
        this.skproz2 = skproz2 == null ? null : skproz2.trim();
    }

    public Short getSktage2() {
        return sktage2;
    }

    public void setSktage2(Short sktage2) {
        this.sktage2 = sktage2;
    }

    public String getSkgen() {
        return skgen;
    }

    public void setSkgen(String skgen) {
        this.skgen = skgen == null ? null : skgen.trim();
    }

    public String getDebinr() {
        return debinr;
    }

    public void setDebinr(String debinr) {
        this.debinr = debinr == null ? null : debinr.trim();
    }

    public String getVatno() {
        return vatno;
    }

    public void setVatno(String vatno) {
        this.vatno = vatno == null ? null : vatno.trim();
    }

    public Short getAbank() {
        return abank;
    }

    public void setAbank(Short abank) {
        this.abank = abank;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp == null ? null : stamp.trim();
    }

    public Integer getFkCashcontact() {
        return fkCashcontact;
    }

    public void setFkCashcontact(Integer fkCashcontact) {
        this.fkCashcontact = fkCashcontact;
    }

    public String getRem() {
        return rem;
    }

    public void setRem(String rem) {
        this.rem = rem == null ? null : rem.trim();
    }
}