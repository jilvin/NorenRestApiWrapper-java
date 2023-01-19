/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noren.javaapi;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author itsku
 */
public class NorenRoutes {
    public Map<String, String> routes;
    public static String _host = "http://kurma.kambala.co.in:9959/NorenWClient/";
    // Initialize all routes,
       public NorenRoutes(){        
        routes = new HashMap<String, String>(){{
           put("authorize", "/QuickAuth");
           put("logout", "/Logout");
           put("searchscrip", "/SearchScrip");
           put("orderbook", "/OrderBook");
           put("tradebook", "/TradeBook");
           put("placeorder", "/PlaceOrder");
           put("modifyorder", "/ModifyOrder");
           put("cancelorder", "/CancelOrder");
           put("timepriceseries", "/TPSeries");
        }};
       }
       public String get(String key){
        return _host + routes.get(key);
    }
}
