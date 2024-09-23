
import java.util.Date;

public class Membresia {
    protected Planes planes;
    protected Date fecha_inicio;
    protected Date fecha_cobro;
    protected Date fecha_termino;
    protected Pago forma_pago;

    //Constructor, de ser necesario
    public Membresia(Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino, Pago forma_pago){
        this.planes = planes;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cobro = fecha_cobro;
        this.fecha_termino = fecha_termino;
        this.forma_pago = forma_pago;
    }
    // Super Clase
    public Membresia() {
    }
    //Metodos
    //private void encriptar(){
        // Implementar lógica para encriptar si es necesario
    //}
    //private void desencriptar(){System.out.println("Desencriptando...");}

    protected void verificar_sesion(){
        // Implementar lógica para verificar sesión si es necesario
    }
    
    protected void verificar_forma_pago() {
        System.out.println(this.forma_pago);
    }
    
    
}
