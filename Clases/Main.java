import java.util.Date;

public class Main{
    public static void main(String[] args){

        //Fecha Inicio del plan
        Date Fecha_In = new Date(124, 7, 10);        
        //Fecha Fin del plan
        Date Fecha_Fin = new Date(124, 10, 10);
        //fecha del cobro
        Date Fecha_cobro = new Date(124, 9, 28);

        
        Planes plan1 = new Planes("Juan", "Ajo");
        Planes plan2 = new Planes("Pedro", "Cebolla");
        plan1.actualizar_plan(Plan_de_pago.Standart);

        Pago forma_pago = Pago.Credito;

        if (forma_pago == Pago.Credito) {            
            Credito tarjeta = new Credito("Alonso", Fecha_Fin,"123132",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
            tarjeta.actualizar_forma_pago(forma_pago);
            System.out.println(tarjeta.forma_pago);
        }
        if (forma_pago == Pago.Paypal){
            Paypal paypal = new Paypal("mario.jorquera@gmail.com", "dwasd", plan2, Fecha_In, Fecha_cobro, Fecha_Fin);
            paypal.actualizar_forma_pago(forma_pago);
            System.out.println(paypal.forma_pago);
        }
        if (forma_pago == Pago.Codigo_de_regalo){
            Codigo_de_regalo codigo = new Codigo_de_regalo("12143", "hola", Fecha_Fin, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
            codigo.actualizar_forma_pago(forma_pago);
            System.out.println(codigo.forma_pago);
        }
        //Credito credito = new Credito("Alonso", Fecha_Fin,"123132",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
        //Debito tarjeta = new Debito( "20843772-1", "CSM",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);

    }
}
    
