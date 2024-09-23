import java.util.Date;

public class Main{
    public static void main(String[] args){

        System.out.println("daedad");
        //Fecha Inicio del plan
        Date Fecha_In = new Date(2024, 5, 10);
        
        //Fecha Fin del plan
        Date Fecha_Fin = new Date(124, 10, 10);
        //fecha del cobro
        Date Fecha_cobro = new Date(124, 11, 10);

        
        Planes plan1 = new Planes("Juan", "Ajo", 990);

        Pago tipo_pago = Pago.Tarjeta;

        Debito tarjeta = new Debito( "20843772-1", "CSM",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin, tipo_pago);
        Paypal paypal = new Paypal("mario.jorquera@gmail.com", "dwasd", plan1, Fecha_In, Fecha_cobro, Fecha_Fin, tipo_pago);
        Credito credito = new Credito("Alonso",Fecha_Fin,"123132",1, 2, plan1, Fecha_In, Fecha_cobro, Fecha_Fin, tipo_pago);
        Codigo_de_regalo codigo = new Codigo_de_regalo("12143", "hola", Fecha_Fin, plan1, Fecha_In, Fecha_cobro, Fecha_Fin, tipo_pago);
        
        tarjeta.verificar_forma_pago();
        
    }
}
    
