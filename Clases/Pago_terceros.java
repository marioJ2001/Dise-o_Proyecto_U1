import java.time.LocalDate;

public class Pago_terceros extends Membresia{

    //Atributos
    private int numero_cliente;
    private int numero_ref_proveedor;
    
    //Constructor
    public Pago_terceros(int numero_cliente, int numero_ref_proveedor, Planes planes,LocalDate fecha_inicio, LocalDate fecha_cobro, LocalDate fecha_termino){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.numero_cliente = numero_cliente;
        this.numero_ref_proveedor = numero_ref_proveedor;
    }

}