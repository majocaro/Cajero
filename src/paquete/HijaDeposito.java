package paquete;

public class HijaDeposito extends ClasePadre {

    @Override
    public void trasaccciones() {

            System.out.println("Cuanto deseas depositar ?");
            deposito();
            transacciones = getSaldo();
            setSaldo(transacciones+deposito);
            System.out.println("El deposito ingresado = "+ deposito);
            System.out.println("Su saldo actual = "+ getSaldo());
        }
    }


