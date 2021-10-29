package paquete;

public class ClasePrincipal {

    public static void main(String[] args) {

        ClasePadre dep = new HijaDeposito();
        dep.setSaldo(500);
        dep.operacion();
    }
}
