package edu.escuelaing.arsw.ASE.app.Ejercicio6;

import java.net.*;

public class TimeClient {
    private static final int SERVER_PORT = 9876;
    private static final String SERVER_ADDRESS = "localhost";
    private static String currentTime = "00:00:00"; // Hora inicial predeterminada

    public static void main(String[] args) {
        try {
            InetAddress serverAddress = InetAddress.getByName(SERVER_ADDRESS);
            DatagramSocket clientSocket = new DatagramSocket();

            byte[] receiveData = new byte[1024];
            byte[] sendData = "TIME".getBytes(); // Mensaje de solicitud

            while (true) {
                try {
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, SERVER_PORT);
                    clientSocket.send(sendPacket);

                    DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                    clientSocket.setSoTimeout(5000); // Tiempo de espera de 5 segundos
                    clientSocket.receive(receivePacket);

                    currentTime = new String(receivePacket.getData(), 0, receivePacket.getLength());
                } catch (SocketTimeoutException e) {
                    // Si no se recibe una respuesta, se mantiene la hora actual
                    System.out.println("No se recibió la hora, manteniendo la hora actual.");
                }

                System.out.println("Hora actual: " + currentTime);
                Thread.sleep(5000); // Espera de 5 segundos antes de la próxima solicitud
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

