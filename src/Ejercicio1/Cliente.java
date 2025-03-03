package Ejercicio1;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        String direccionServidor = "localhost"; // Dirección del servidor
        int puerto = 5000; // Puerto del servidor

        try (Socket socket = new Socket(direccionServidor, puerto);
             BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter salida = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("STATUS: Conectado al servidor");

            String mensaje = "";
            do {
                System.out.println("Introduzca un texto a enviar (FIN para acabar)");
                    mensaje = scanner.nextLine();


                if (!mensaje.equalsIgnoreCase("FIN")) {
                    System.out.println("STATUS: Enviando " + mensaje);
                    salida.println(mensaje);

                    System.out.println("STATUS: Esperando eco");
                    String respuesta = entrada.readLine();
                    System.out.println("echo: " + respuesta);
                }

            } while (!mensaje.equalsIgnoreCase("FIN"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
