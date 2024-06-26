/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.noren.javaapi;

import java.net.URI;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import com.noren.javaapi.NorenCallback;
/**
 *
 * @author ubuntu
 */
 public  class NorenWebsocketClient extends WebSocketClient {
        private NorenCallback _callback;
        public NorenWebsocketClient(URI serverUri,NorenCallback callback) {
             super(serverUri);
            _callback=callback;
            
        }

        @Override
        public void onOpen(ServerHandshake handshakedata) {
            System.out.println("Connected");
        }

        @Override
        public void onMessage(String message) {
            if(_callback !=null )
            {
                _callback.Onfeed(message);
            }
            //System.out.println("Received data: " + message);
        }
       
        @Override
        public void onClose(int code, String reason, boolean remote) {
            System.out.println("Disconnected");
        }

        @Override
        public void onError(Exception ex) {
            ex.printStackTrace();
        }
    }
