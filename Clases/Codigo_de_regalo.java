import java.util.Date;

public class Codigo_de_regalo extends Membresia{

    // atributos
    private String codigo;
    private String descripcion;
    private Date fecha_expiracion;
    
    public Codigo_de_regalo(String codigo, String descripcion, Date fecha_expiracion,Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino, Pago forma_pago){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino, forma_pago);
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha_expiracion = fecha_expiracion;
    }
    
}