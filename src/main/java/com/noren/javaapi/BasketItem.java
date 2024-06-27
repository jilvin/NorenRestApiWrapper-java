/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noren.javaapi;

/**
 *
 * @author ubuntu
 */
public class BasketItem {
    private String exch;
    private String tsym;
    private int qty;
    private double prc;
    private String prd;
    private String trantype;
    private String prctyp;

    // Constructor
    public BasketItem(String exch, String tsym, int qty, double prc, String prd, String trantype, String prctyp) {
        this.exch = exch;
        this.tsym = tsym;
        this.qty = qty;
        this.prc = prc;
        this.prd = prd;
        this.trantype = trantype;
        this.prctyp = prctyp;
    }

    // Getters and setters (optional)
    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public String getTsym() {
        return tsym;
    }

    public void setTsym(String tsym) {
        this.tsym = tsym;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrc() {
        return prc;
    }

    public void setPrc(double prc) {
        this.prc = prc;
    }

    public String getPrd() {
        return prd;
    }

    public void setPrd(String prd) {
        this.prd = prd;
    }

    public String getTrantype() {
        return trantype;
    }

    public void setTrantype(String trantype) {
        this.trantype = trantype;
    }

    public String getPrctyp() {
        return prctyp;
    }

    public void setPrctyp(String prctyp) {
        this.prctyp = prctyp;
    }

    @Override
    public String toString() {
        return "{" +
                "exch='" + exch + '\'' +
                ", tsym='" + tsym + '\'' +
                ", qty=" + Integer.toString(qty) +
                ", prc=" + String.valueOf(prc) +
                ", prd='" + prd + '\'' +
                ", trantype='" + trantype + '\'' +
                ", prctyp='" + prctyp + '\'' +
                '}';
    }
}
