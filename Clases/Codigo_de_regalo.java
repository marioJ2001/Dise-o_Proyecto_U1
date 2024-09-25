import java.time.LocalDate;

public class Codigo_de_regalo extends Membresia{

    // atributos
    private String codigo;
    private String descripcion;
    private LocalDate fecha_expiracion;
    
    public Codigo_de_regalo(String codigo, String descripcion, LocalDate fecha_expiracion,Planes planes,LocalDate fecha_inicio, LocalDate fecha_cobro, LocalDate fecha_termino){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha_expiracion = fecha_expiracion;
    }
    
}