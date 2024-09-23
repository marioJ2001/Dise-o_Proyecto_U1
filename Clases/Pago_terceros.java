import java.util.Date;

public class Pago_terceros extends Membresia{

    //Atributos
    private int numero_cliente;
    private int numero_ref_proveedor;
    
    //Constructor
    public Pago_terceros(int numero_cliente, int numero_ref_proveedor, Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino, Pago forma_pago){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino, forma_pago);
        this.numero_cliente = numero_cliente;
        this.numero_ref_proveedor = numero_ref_proveedor;
    }

}