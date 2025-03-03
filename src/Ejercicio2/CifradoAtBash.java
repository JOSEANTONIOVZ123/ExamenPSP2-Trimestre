package Ejercicio2;

import java.rmi.RemoteException;

public interface CifradoAtBash {
    String atBash(String mensaje) throws RemoteException;
    String reves(String mensaje) throws RemoteException;
}
