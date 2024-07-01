package edu.escuelaing.arsw.ASE.app.Ejercicio4;

import java.io.*;
import java.net.*;
import java.util.HashMap;
import java.util.Map;

public class ClientE4 {
    private static final Map<String, Double> constantsMap;

    static {
        constantsMap = new HashMap<>();
        constantsMap.put("pi", Math.PI);
        constantsMap.put("pi/2", Math.PI / 2);
        constantsMap.put("pi/4", Math.PI / 4);
        constantsMap.put("pi/6", Math.PI / 6);
    }

    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null;
        BufferedReader in = null;

        try {
            echoSocket = new Socket("localhost", 35000);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost.");
            System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: localhost.");
            System.exit(1);
        }

        BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
        String userInput;
        System.out.println("Enter a number to calculate (or 'fun:sin', 'fun:cos', 'fun:tan' to change operation):");

        while ((userInput = stdIn.readLine()) != null) {
            if (constantsMap.containsKey(userInput.toLowerCase())) {
                out.println(constantsMap.get(userInput.toLowerCase()));
            } else {
                out.println(userInput);
            }
            System.out.println("Server response: " + in.readLine());
        }

        out.close();
        in.close();
        stdIn.close();
        echoSocket.close();
    }
}
