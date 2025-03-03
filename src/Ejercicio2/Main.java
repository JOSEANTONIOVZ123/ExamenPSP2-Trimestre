package Ejercicio2;

import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RemoteException {
        CifradoAtBash cifrador = new AtBash();
        GestorCifrado gestor = new GestorCifrado(cifrador);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un texto para Cifrar:");
        String mensajeOriginal = scanner.nextLine();

        System.out.println("Mensaje original: " + mensajeOriginal);

        String mensajeCifrado = gestor.cifrarMensaje(mensajeOriginal);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        // Mostrar el mensaje cifrado al revés
        System.out.println("Mensaje al revés: " + gestor.revesMensaje(mensajeOriginal));

        scanner.close();
    }
}
