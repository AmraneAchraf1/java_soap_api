package com.iam;

import jakarta.xml.ws.Endpoint;
import jakarta.ws.rs.OPTIONS;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/scolarite")
public class ServerWS {

    // endpoints
    public static void main(String[] args) {  

        Endpoint.publish("http://127.0.0.1:8080/scolarite", new ScolariteService());
        
    }
  // ... (your existing methods)

    @OPTIONS
    public Response handleOptions() {
        // Handle OPTIONS requests
        return Response.ok()
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS")
                .header("Access-Control-Allow-Headers", "Content-Type")
                .build();
    }


}
