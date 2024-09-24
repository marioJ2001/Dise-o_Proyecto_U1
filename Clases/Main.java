import java.util.Date;

public class Main{
    public static void main(String[] args){

        System.out.println("daedad");
        //Fecha Inicio del plan
        Date Fecha_In = new Date(124, 7, 10);
        
        //Fecha Fin del plan
        Date Fecha_Fin = new Date(124, 10, 10);
        //fecha del cobro
        Date Fecha_cobro = new Date(124, 9, 28);

        
        Planes plan1 = new Planes("Juan", "Ajo");
        Planes plan2 = new Planes("Pedro", "Cebolla");
        plan1.actualizar_plan(Plan_de_pago.Standart);
        System.out.println("costo plan1: " + plan1.costo);
        System.out.println("costo plan2: " + plan2.costo);

        Pago forma_pago = Pago.Paypal;

        if (forma_pago == Pago.Tarjeta) {            
            Debito tarjeta = new Debito( "20843772-1", "CSM",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
            tarjeta.verificar_forma_pago(forma_pago);
        }
        if (forma_pago == Pago.Paypal){
            Paypal paypal = new Paypal("mario.jorquera@gmail.com", "dwasd", plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
            paypal.verificar_forma_pago(forma_pago);
            System.out.println(paypal.forma_pago);
        }
        if (forma_pago == Pago.Codigo_de_regalo){
            Codigo_de_regalo codigo = new Codigo_de_regalo("12143", "hola", Fecha_Fin, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);
            codigo.verificar_forma_pago(forma_pago);
        }
        //Credito credito = new Credito("Alonso", Fecha_Fin,"123132",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin);


    }
}
    
