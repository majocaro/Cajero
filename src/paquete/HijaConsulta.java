package paquete;

public class HijaConsulta extends ClasePadre{

    @Override
    public void trasaccciones() {

        System.out.println("Tu saldo actual es " + getSaldo());
    }
}
