package com.iam;

import jakarta.xml.ws.Endpoint;

public class ServerWS {

    // endpoints
    public static void main(String[] args) {  

        Endpoint.publish("http://127.0.0.1:8080/scolarite", new ScolariteService());
        
    }



}
