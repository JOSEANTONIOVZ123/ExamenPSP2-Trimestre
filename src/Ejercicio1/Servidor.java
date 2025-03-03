package Ejercicio1;

import java.io.*;
import java.net.*;

public class Servidor {
    public static void main(String[] args) {
        int puerto = 5000; // Puerto donde escucha el servidor
        try (ServerSocket servidor = new ServerSocket(puerto)) {
            System.out.println("Esperando conexión en el puerto: " + puerto + "...");

            while (true) {
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado: " + cliente.getInetAddress());

                BufferedReader entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                PrintWriter salida = new PrintWriter(cliente.getOutputStream(), true);

                String mensaje;
                while ((mensaje = entrada.readLine()) != null) {
                    System.out.println("Mensaje recibido: " + mensaje);
                    salida.println(mensaje); // Enviar el mismo mensaje de vuelta (eco)
                }

                cliente.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
