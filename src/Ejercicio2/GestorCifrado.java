package Ejercicio2;

import java.rmi.RemoteException;

public class GestorCifrado {
    private final CifradoAtBash cifrador;

    public GestorCifrado(CifradoAtBash cifrador) {
        this.cifrador = cifrador;
    }

    public String cifrarMensaje(String mensaje) throws RemoteException {
        return cifrador.atBash(mensaje);
    }

    public String revesMensaje(String mensaje) throws RemoteException {
        return cifrador.reves(mensaje);
    }
}
