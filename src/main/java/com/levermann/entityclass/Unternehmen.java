package com.levermann.entityclass;

import javax.persistence.*;
import java.io.Serializable;
import javax.inject.Named;
import javax.annotation.ManagedBean;

@Named
@ManagedBean
@Entity
@Access(AccessType.FIELD)
//@Table(name="unternehmen")
@NamedQueries({
        @NamedQuery(name = "Unternehmen.findAll", query = "SELECT A FROM Unternehmen A"),
        @NamedQuery(name = "Unternehmen.findById", query = "SELECT c FROM Unternehmen c WHERE c.Cid =:Cid"),
        @NamedQuery(name = "Unternehmen.findByName", query = "SELECT c FROM Unternehmen c WHERE c.name =:name"),
        @NamedQuery(name = "Unternehmen.findByEigenkapital", query = "SELECT c FROM Unternehmen c WHERE c.eigenkapital =:eigenkapital"),
        @NamedQuery(name = "Unternehmen.findByJahresüberschuss", query = "SELECT c FROM Unternehmen c WHERE c.jahresueberschuss =:jahresueberschuss")

})
public class Unternehmen implements Serializable  {


    /*public Unternehmen(String name, String datum, float eigenkapital, float jahresueberschuss) {
        this.name = name;
        this.datum = datum;
        this.eigenkapital = eigenkapital;
        this.jahresueberschuss = jahresueberschuss;
    }*/

    public Unternehmen() {}

    @Override
    public String toString() {
        return "Unternehmen{" + "Cid=" + Cid + ", name=" + name + ", datum=" + datum + ", eigenkapital=" + eigenkapital + ", jahresueberschuss=" + jahresueberschuss + ", GewinnEBIT=" + GewinnEBIT + ", Jahresumsatz=" + Jahresumsatz + ", Fremdkapital=" + Fremdkapital + ", AktuellerAktienkurs=" + AktuellerAktienkurs + ", Gewinnschaezung=" + Gewinnschaezung + ", GewinnAVG=" + GewinnAVG + ", Halten=" + Halten + ", Verkaufen=" + Verkaufen + ", Kaufen=" + Kaufen + ", KursanstiegUnternehmen=" + KursanstiegUnternehmen + ", KursanstiegIndex=" + KursanstiegIndex + ", GewinnschaezungVor4Wochen=" + GewinnschaezungVor4Wochen + ", AktienkursTagVeroeffentlichungQartalszahlen=" + AktienkursTagVeroeffentlichungQartalszahlen + ", KursVor6Monaten=" + KursVor6Monaten + ", KursVor12Monaten=" + KursVor12Monaten + ", KursVor3Monaten=" + KursVor3Monaten + ", KursVor2Monaten=" + KursVor2Monaten + ", KursVor1Monat=" + KursVor1Monat + ", DaxVor1Monat=" + DaxVor1Monat + ", DaxVor2Monaten=" + DaxVor2Monaten + ", DaxVor3Monaten=" + DaxVor3Monaten + ", GewinnschaezungNaechstesJahr=" + GewinnschaezungNaechstesJahr + ", GewinnschaezungDiesesJahr=" + GewinnschaezungDiesesJahr + ", Finanzsektor=" + Finanzsektor + '}';
    }




    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="Cid")
    private  int  Cid;

    @Column(name="name")
    private String name;

    @Column(name="datum")
    private String datum;

    @Column(name="eigenkapital")
    private float eigenkapital;

    @Column(name="jahresueberschuss")
    private float jahresueberschuss;

    @Column(name="GewinnEBIT")
    private float GewinnEBIT;

    @Column(name="Jahresumsatz")
    private float Jahresumsatz;

    @Column(name="Fremdkapital")
    private float Fremdkapital;

    @Column(name="AktuellerAktienkurs")
    private float AktuellerAktienkurs;

    @Column(name="Gewinnschaezung")
    private float Gewinnschaezung;

    @Column(name="GewinnAVG")
    private float GewinnAVG;

    @Column(name="Halten")
    private float Halten;

    @Column(name="Verkaufen")
    private float Verkaufen;

    @Column(name="Kaufen")
    private float Kaufen;

    @Column(name="KursanstiegUnternehmen")
    private float KursanstiegUnternehmen;

    @Column(name="KursanstiegIndex")
    private float KursanstiegIndex;

    @Column(name="GewinnschaezungVor4Wochen")
    private float GewinnschaezungVor4Wochen;

   @Column(name="AktienkursTagVeroeffentlichungQartalszahlen")
   private float AktienkursTagVeroeffentlichungQartalszahlen;

    @Column(name="KursVor6Monaten")
    private float KursVor6Monaten;

    @Column(name="KursVor12Monaten")
    private float KursVor12Monaten;

    @Column(name="KursVor3Monaten")
    private float KursVor3Monaten;

    @Column(name="KursVor2Monaten")
    private float KursVor2Monaten;

    @Column(name="KursVor1Monat")
    private float KursVor1Monat;

    @Column(name="DaxVor1Monat")
    private float DaxVor1Monat;

    @Column(name="DaxVor2Monaten")
    private float DaxVor2Monaten;

    @Column(name="DaxVor3Monaten")
    private float DaxVor3Monaten;

    @Column(name="GewinnschaezungNaechstesJahr")
    private float GewinnschaezungNaechstesJahr;

    @Column(name="GewinnschaezungDiesesJahr")
    private float GewinnschaezungDiesesJahr;

    @Column(name="Finanzsektor")
    private float Finanzsektor;

    @Column(name="PerfInJedemMonat", unique = true, nullable = true)
    private Integer PerfInJedemMonat;

    public Integer getPerfInJedemMonat() {
        return PerfInJedemMonat;
    }

    public void setPerfInJedemMonat(Integer PerfInJedemMonat) {
        this.PerfInJedemMonat = PerfInJedemMonat;
    }

     public int getCid() {
        return Cid;
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public float getEigenkapital() {
        return eigenkapital;
    }

    public void setEigenkapital(float eigenkapital) {
        this.eigenkapital = eigenkapital;
    }

    public float getJahresueberschuss() {
        return jahresueberschuss;
    }

    public void setJahresueberschuss(float jahresueberschuss) {
        this.jahresueberschuss = jahresueberschuss;
    }

    public float getGewinnEBIT() {
        return GewinnEBIT;
    }

    public void setGewinnEBIT(float GewinnEBIT) {
        this.GewinnEBIT = GewinnEBIT;
    }

    public float getJahresumsatz() {
        return Jahresumsatz;
    }

    public void setJahresumsatz(float Jahresumsatz) {
        this.Jahresumsatz = Jahresumsatz;
    }

    public float getFremdkapital() {
        return Fremdkapital;
    }

    public void setFremdkapital(float Fremdkapital) {
        this.Fremdkapital = Fremdkapital;
    }

    public float getAktuellerAktienkurs() {
        return AktuellerAktienkurs;
    }

    public void setAktuellerAktienkurs(float AktuellerAktienkurs) {
        this.AktuellerAktienkurs = AktuellerAktienkurs;
    }

    public float getGewinnschaezung() {
        return Gewinnschaezung;
    }

    public void setGewinnschaezung(float Gewinnschaezung) {
        this.Gewinnschaezung = Gewinnschaezung;
    }

    public float getGewinnAVG() {
        return GewinnAVG;
    }

    public void setGewinnAVG(float GewinnAVG) {
        this.GewinnAVG = GewinnAVG;
    }

    public float getHalten() {
        return Halten;
    }

    public void setHalten(float Halten) {
        this.Halten = Halten;
    }

    public float getVerkaufen() {
        return Verkaufen;
    }

    public void setVerkaufen(float Verkaufen) {
        this.Verkaufen = Verkaufen;
    }

    public float getKaufen() {
        return Kaufen;
    }

    public void setKaufen(float Kaufen) {
        this.Kaufen = Kaufen;
    }

    public float getKursanstiegUnternehmen() {
        return KursanstiegUnternehmen;
    }



    public void setKursanstiegUnternehmen(float KursanstiegUnternehmen) {
        this.KursanstiegUnternehmen = KursanstiegUnternehmen;
    }

    public float getKursanstiegIndex() {
        return KursanstiegIndex;
    }

    public void setKursanstiegIndex(float KursanstiegIndex) {
        this.KursanstiegIndex = KursanstiegIndex;
    }

    public float getGewinnschaezungVor4Wochen() {
        return GewinnschaezungVor4Wochen;
    }

    public void setGewinnschaezungVor4Wochen(float GewinnschaezungVor4Wochen) {
        this.GewinnschaezungVor4Wochen = GewinnschaezungVor4Wochen;
    }

    public float getAktienkursTagVeroeffentlichungQartalszahlen() {return AktienkursTagVeroeffentlichungQartalszahlen;}

   public void setAktienkursTagVeroeffentlichungQartalszahlen(float AktienkursTagVeroeffentlichungQartalszahlen) {
        this.AktienkursTagVeroeffentlichungQartalszahlen = AktienkursTagVeroeffentlichungQartalszahlen;
    }



    public float getKursVor6Monaten() {
        return KursVor6Monaten;
    }

    public void setKursVor6Monaten(float KursVor6Monaten) {
        this.KursVor6Monaten = KursVor6Monaten;
    }

    public float getKursVor12Monaten() {
        return KursVor12Monaten;
    }

    public void setKursVor12Monaten(float KursVor12Monaten) {
        this.KursVor12Monaten = KursVor12Monaten;
    }

    public float getKursVor3Monaten() {
        return KursVor3Monaten;
    }

    public void setKursVor3Monaten(float KursVor3Monaten) {
        this.KursVor3Monaten = KursVor3Monaten;
    }

    public float getKursVor2Monaten() {
        return KursVor2Monaten;
    }

    public void setKursVor2Monaten(float KursVor2Monaten) {
        this.KursVor2Monaten = KursVor2Monaten;
    }

    public float getKursVor1Monat() {
        return KursVor1Monat;
    }

    public void setKursVor1Monat(float KursVor1Monat) {
        this.KursVor1Monat = KursVor1Monat;
    }

    public float getDaxVor1Monat() {
        return DaxVor1Monat;
    }

    public void setDaxVor1Monat(float DaxVor1Monat) {
        this.DaxVor1Monat = DaxVor1Monat;
    }

    public float getDaxVor2Monaten() {
        return DaxVor2Monaten;
    }

    public void setDaxVor2Monaten(float DaxVor2Monaten) {
        this.DaxVor2Monaten = DaxVor2Monaten;
    }

    public float getDaxVor3Monaten() {
        return DaxVor3Monaten;
    }

    public void setDaxVor3Monaten(float DaxVor3Monaten) {
        this.DaxVor3Monaten = DaxVor3Monaten;
    }

    public float getGewinnschaezungNaechstesJahr() {
        return GewinnschaezungNaechstesJahr;
    }

    public void setGewinnschaezungNaechstesJahr(float GewinnschaezungNaechstesJahr) {
        this.GewinnschaezungNaechstesJahr = GewinnschaezungNaechstesJahr;
    }

    public float getGewinnschaezungDiesesJahr() {
        return GewinnschaezungDiesesJahr;
    }

    public void setGewinnschaezungDiesesJahr(float GewinnschaezungDiesesJahr) {
        this.GewinnschaezungDiesesJahr = GewinnschaezungDiesesJahr;
    }

    public float getFinanzsektor() {
        return Finanzsektor;
    }

    public void setFinanzsektor(float Finanzsektor) {
        this.Finanzsektor = Finanzsektor;
    }



}
