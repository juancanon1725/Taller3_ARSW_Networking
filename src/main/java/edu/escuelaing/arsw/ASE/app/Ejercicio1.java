package edu.escuelaing.arsw.ASE.app;

import java.net.URL;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            // Crear un objeto URL
            URL url = new URL("http://www.example.com:80/docs/resource1.html?name=networking#INTRO");

            // Obtener y mostrar cada uno de los datos usando los métodos de URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("File: " + url.getFile());
            System.out.println("Ref: " + url.getRef());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
