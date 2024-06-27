/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noren.javaapi;

/**
 *
 * @author ubuntu
 */
import java.util.List;

public class MainData {

    public String exch;
    public String tsym;
    public int qty;
    public double prc;
    public String prd;
    public String trantype;
    public String prctyp;
    public List<BasketItem> basketlists;

    public MainData(){}
    // Constructor
    public MainData( String exch, String tsym, int qty, double prc, String prd, String trantype, String prctyp, List<BasketItem> basketlists) {
        
        this.exch = exch;
        this.tsym = tsym;
        this.qty = qty;
        this.prc = prc;
        this.prd = prd;
        this.trantype = trantype;
        this.prctyp = prctyp;
        this.basketlists = basketlists;
    }

    @Override
    public String toString() {
        StringBuilder basketlistsStr = new StringBuilder();
        basketlistsStr.append("[");
        for (int i = 0; i < basketlists.size(); i++) {
            basketlistsStr.append(basketlists.get(i).toString());
            if (i < basketlists.size() - 1) {
                basketlistsStr.append(", ");
            }
        }
        basketlistsStr.append("]");

        return basketlistsStr.toString();
                  
        
    }
}

