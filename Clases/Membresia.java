import java.util.Date;

public class Membresia {
    protected Planes planes;
    protected Date fecha_inicio;
    protected Date fecha_cobro;
    protected Date fecha_termino;
    protected Pago forma_pago;

    //Constructor, de ser necesario
    public Membresia(Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino){
        this.planes = planes;
        this.fecha_inicio = fecha_inicio;
        this.fecha_cobro = fecha_cobro;
        this.fecha_termino = fecha_termino;
    }
    
    //Metodos
    protected void encriptar(){
        System.out.println("Encriptando...");
    }
    protected void desencriptar(){
        System.out.println("Desencriptando...");
    }

    protected void verificar_sesion(){
        System.out.println("Verificando sesion...");
    }
    
    protected void actualizar_forma_pago(Pago forma_pago){
        if (forma_pago == Pago.Debito) {
            this.forma_pago = Pago.Debito;
        }
        if (forma_pago == Pago.Credito) {
            this.forma_pago = Pago.Credito;
        }
        if (forma_pago == Pago.Paypal) {
            this.forma_pago = Pago.Paypal;
        }
        if (forma_pago == Pago.Pago_por_terceros) {
            this.forma_pago = Pago.Pago_por_terceros;
        }
        if (forma_pago == Pago.Codigo_de_regalo) {
            this.forma_pago = Pago.Codigo_de_regalo;
        }
    }
}
