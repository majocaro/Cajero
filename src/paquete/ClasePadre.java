package paquete;

import java.util.Scanner;

public abstract class ClasePadre {

   protected int transacciones,retiro,deposito;
   private static int saldo;
   Scanner data = new Scanner(System.in);

   public void operacion ()
   {
       System.out.println(" Proyecto de Majo");
       int bandera=0;
       int seleccion=0;

       do{

       do{

           System.out.println("Por favor seleccione una opcion en esta aplicacion");
           System.out.println("1. Consulta de saldo");
           System.out.println("2. Retiro de efectivo");
           System.out.println("3. Deposito de efectivo");
           System.out.println("4. Salir, Que tenga un excelente dia" );

           seleccion = data.nextInt();

           if (seleccion > 4 && seleccion <= 0){

               System.out.println("ingrese una opcion valida");

           }else bandera =1;

       }while(bandera == 0);



       if(bandera != 0 ){

           if(seleccion == 1){

              ClasePadre con = new HijaConsulta();
              con.trasaccciones();

           }else if(seleccion == 2){
               ClasePadre ret = new HijaRetiro();
               ret.trasaccciones();

           }else if (seleccion==3){
               ClasePadre dep = new HijaDeposito();
               dep.trasaccciones();
           }else if (seleccion==4){
               System.out.println("Gracias por consultar");
               bandera =2;
           }
       }

       }while (bandera != 2);
   }

   public void retiro()
   {
       retiro = data.nextInt();
   }

   public void deposito()
    {
        deposito = data.nextInt();
    }

   public abstract void trasaccciones();

    public static int getSaldo() {
        return saldo;
    }

    public static void setSaldo(int saldo) {
        ClasePadre.saldo = saldo;
    }

}
