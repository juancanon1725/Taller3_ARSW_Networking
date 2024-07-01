package edu.escuelaing.arsw.ASE.app;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una direccion URL: ");
        String urlString = scanner.nextLine();

        try {
            // Crear el objeto URL a partir de la cadena proporcionada por el usuario
            URL url = new URL(urlString);

            // Abrir una conexión de lectura a la URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            // Crear un FileWriter para escribir en resultado.html
            FileWriter writer = new FileWriter("resultado.html");

            // Leer línea por línea de la URL y escribir en el archivo
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write(System.lineSeparator());
            }

            // Cerrar los recursos
            reader.close();
            writer.close();

            System.out.println("Cambios guardados en resultado.html.");
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }

        scanner.close();
    }
}

