package edu.escuelaing.arsw.ASE.app.Ejercicio3;

import java.io.*;
import java.net.*;

public class EchoClient {

        public static void main(String[] args) throws IOException {
            Socket echoSocket = null;
            PrintWriter out = null;
            BufferedReader in = null;

            try {
                echoSocket = new Socket("127.0.0.1", 35000);
                out = new PrintWriter(echoSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            } catch (UnknownHostException e) {
                System.err.println("Don’t know about host!.");
                System.exit(1);
            } catch (IOException e) {
                System.err.println("Couldn’t get I/O for the connection to: localhost.");
                System.exit(1);
            }

            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String userInput;

            System.out.println("Escriba un numero:");
            while ((userInput = stdIn.readLine()) != null) {
                if (userInput.equalsIgnoreCase("exit")) {
                    break;
                }
                out.println(userInput);
                System.out.println("Cuadrado del numero: " + in.readLine());
            }

            out.close();
            in.close();
            stdIn.close();
            echoSocket.close();
        }
    }

