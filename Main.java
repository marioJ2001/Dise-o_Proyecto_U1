import java.util.Date;

public class Main{
    public static void main(String[] args){


        //Fecha Inicio del plan
        Date Fecha_In = new Date(2024, 5, 10);
        
        //Fecha Fin del plan
        Date Fecha_Fin = new Date(124, 10, 10);
        //fecha del cobro
        Date Fecha_cobro = new Date(124, 11, 10);

        
        Planes plan1 = new Planes("Juan", "Ajo", 990);
        //crear membresia
        Membresia M = new Membresia(plan1, Fecha_In, Fecha_cobro, Fecha_Fin, Pago.Tarjeta);
        
        //imprimir datos de la membresia
        
        
    }
}
    
