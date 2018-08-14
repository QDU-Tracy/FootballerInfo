package com.springboot.demo.entity;

import java.io.Serializable;

public class Player implements Serializable {
    private int pId;
    private String pName;
    private short pCa;
    private short pPa;
    private String pCountry;
    private short pHeight;
    private short pWeight;

    public Player() {
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public short getpCa() {
        return pCa;
    }

    public void setpCa(short pCa) {
        this.pCa = pCa;
    }

    public short getpPa() {
        return pPa;
    }

    public void setpPa(short pPa) {
        this.pPa = pPa;
    }

    public String getpCountry() {
        return pCountry;
    }

    public void setpCountry(String pCountry) {
        this.pCountry = pCountry;
    }

    public short getpHeight() {
        return pHeight;
    }

    public void setpHeight(short pHeight) {
        this.pHeight = pHeight;
    }

    public short getpWeight() {
        return pWeight;
    }

    public void setpWeight(short pWeight) {
        this.pWeight = pWeight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pCa=" + pCa +
                ", pPa=" + pPa +
                ", pCountry='" + pCountry + '\'' +
                ", pHeight=" + pHeight +
                ", pWeight=" + pWeight +
                '}';
    }
}
