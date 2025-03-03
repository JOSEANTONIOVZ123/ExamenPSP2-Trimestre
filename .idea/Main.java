public class Main {
    public static void main(String[] args) {
        Cifrado cifrador = new CifradoPersonalizado();
        GestorCifrado gestor = new GestorCifrado(cifrador);

        String mensajeOriginal = "HolaMundo123";
        System.out.println("Mensaje original: " + mensajeOriginal);

        String mensajeCifrado = gestor.cifrarMensaje(mensajeOriginal);
        System.out.println("Mensaje cifrado: " + mensajeCifrado);

        String mensajeDescifrado = gestor.descifrarMensaje(mensajeCifrado);
        System.out.println("Mensaje descifrado: " + mensajeDescifrado);
    }
}
