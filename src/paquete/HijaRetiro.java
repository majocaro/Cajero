package paquete;

public class HijaRetiro extends ClasePadre {

    @Override
    public void trasaccciones() {

        System.out.println("Cuanto deseas retirar ?");
        retiro();
        transacciones = getSaldo();
        if (retiro <= transacciones) {
            setSaldo(transacciones - retiro);
            System.out.println("El dinero retirado = " + retiro);
            System.out.println("Su saldo actual = " + getSaldo());
        } else System.out.println("Saldo insuficiente");
    }
}
