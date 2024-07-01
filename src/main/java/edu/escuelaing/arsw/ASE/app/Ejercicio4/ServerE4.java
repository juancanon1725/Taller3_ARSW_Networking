package edu.escuelaing.arsw.ASE.app.Ejercicio4;

import java.net.*;
import java.io.*;
import java.util.function.Function;
public class ServerE4 {
    private static Function<Double, Double> currentFunction = Math::cos;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }

        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
            System.out.println("Cliente conectado");
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.startsWith("fun:")) {
                String functionName = inputLine.substring(4).toLowerCase();
                switch (functionName) {
                    case "sin":
                        currentFunction = Math::sin;
                        out.println("Operation changed to sine");
                        break;
                    case "cos":
                        currentFunction = Math::cos;
                        out.println("Operation changed to cosine");
                        break;
                    case "tan":
                        currentFunction = Math::tan;
                        out.println("Operation changed to tangent");
                        break;
                    default:
                        out.println("Unknown function: " + functionName);
                }
            } else {
                try {
                    double number = Double.parseDouble(inputLine);
                    double result = currentFunction.apply(number);
                    out.println(result);
                } catch (NumberFormatException e) {
                    out.println("Invalid input, please send a valid number.");
                }
            }
        }

        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}

