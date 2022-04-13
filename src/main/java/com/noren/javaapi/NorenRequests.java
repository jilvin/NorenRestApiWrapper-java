/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noren.javaapi;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;       
import okhttp3.Response;
import okhttp3.MediaType;
/**
 *
 * @author itsku
 */
public class NorenRequests {
  OkHttpClient client = new OkHttpClient();
  NorenRoutes routes = new NorenRoutes();
  public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
  
  public NorenRequests(String host){                
        NorenRoutes._host = host;
    }
  public String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            return ex.toString();
        }
  }
  private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }
  String sha256(String input)  {
      try{
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(encodedhash);      
      }
      catch(NoSuchAlgorithmException ex){
          return input;
      }
    }
  
  String run(String url) {
      try{
            Request request = new Request.Builder()
            .url(url)
            .build();
           Response response =  client.newCall(request).execute();
           return response.body().string();
      }
         catch(IOException e) {
            e.printStackTrace();
            return e.toString();
          }
    }
  
  String post(String url, JSONObject jsnObj){
    String json = "jData=" + jsnObj.toString();
    System.out.println(url + " " + json);
    RequestBody body = RequestBody.create(json, JSON);
    Request request = new Request.Builder()
        .url(url)
        .post(body)
        .build();
    try {
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    catch(IOException e) {
            e.printStackTrace();
            return e.toString();
          }   
    }
  String post(String url, String key, JSONObject jsnObj){
    String json = "jData=" + jsnObj.toString() + "&jKey=" + key;
    System.out.println(url + " " + json);
    RequestBody body = RequestBody.create(json, JSON);
    Request request = new Request.Builder()
        .url(url)
        .post(body)
        .build();
    try {
        Response response = client.newCall(request).execute();
        return response.body().string();
    }
    catch(IOException e) {
            e.printStackTrace();
            return e.toString();
          }   
    }
}
