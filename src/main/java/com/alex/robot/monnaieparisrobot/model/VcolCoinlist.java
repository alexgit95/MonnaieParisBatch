
package com.alex.robot.monnaieparisrobot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VcolCoinlist {

    @SerializedName("jetid")
    @Expose
    private String jetid;
    @SerializedName("jetref")
    @Expose
    private String jetref;
    @SerializedName("jetnom")
    @Expose
    private String jetnom;
    @SerializedName("sitcodepostal")
    @Expose
    private String sitcodepostal;
    @SerializedName("sitville")
    @Expose
    private String sitville;
    @SerializedName("payid")
    @Expose
    private String payid;
    @SerializedName("rvrlibelle")
    @Expose
    private String rvrlibelle;
    @SerializedName("jetrvrprixvente")
    @Expose
    private String jetrvrprixvente;
    @SerializedName("jetrvrargus")
    @Expose
    private String jetrvrargus;
    @SerializedName("jetrvrstaid")
    @Expose
    private String jetrvrstaid;
    @SerializedName("jetbat")
    @Expose
    private String jetbat;
    @SerializedName("jetfront")
    @Expose
    private String jetfront;
    @SerializedName("rvrid")
    @Expose
    private String rvrid;
    @SerializedName("vpc")
    @Expose
    private String vpc;

    public String getJetid() {
        return jetid;
    }

    public void setJetid(String jetid) {
        this.jetid = jetid;
    }

    public String getJetref() {
        return jetref;
    }

    public void setJetref(String jetref) {
        this.jetref = jetref;
    }

    public String getJetnom() {
        return jetnom;
    }

    public void setJetnom(String jetnom) {
        this.jetnom = jetnom;
    }

    public String getSitcodepostal() {
        return sitcodepostal;
    }

    public void setSitcodepostal(String sitcodepostal) {
        this.sitcodepostal = sitcodepostal;
    }

    public String getSitville() {
        return sitville;
    }

    public void setSitville(String sitville) {
        this.sitville = sitville;
    }

    public String getPayid() {
        return payid;
    }

    public void setPayid(String payid) {
        this.payid = payid;
    }

    public String getRvrlibelle() {
        return rvrlibelle;
    }

    public void setRvrlibelle(String rvrlibelle) {
        this.rvrlibelle = rvrlibelle;
    }

    public String getJetrvrprixvente() {
        return jetrvrprixvente;
    }

    public void setJetrvrprixvente(String jetrvrprixvente) {
        this.jetrvrprixvente = jetrvrprixvente;
    }

    public String getJetrvrargus() {
        return jetrvrargus;
    }

    public void setJetrvrargus(String jetrvrargus) {
        this.jetrvrargus = jetrvrargus;
    }

    public String getJetrvrstaid() {
        return jetrvrstaid;
    }

    public void setJetrvrstaid(String jetrvrstaid) {
        this.jetrvrstaid = jetrvrstaid;
    }

    public String getJetbat() {
        return jetbat;
    }

    public void setJetbat(String jetbat) {
        this.jetbat = jetbat;
    }

    public String getJetfront() {
        return jetfront;
    }

    public void setJetfront(String jetfront) {
        this.jetfront = jetfront;
    }

    public String getRvrid() {
        return rvrid;
    }

    public void setRvrid(String rvrid) {
        this.rvrid = rvrid;
    }

    public String getVpc() {
        return vpc;
    }

    public void setVpc(String vpc) {
        this.vpc = vpc;
    }

}
