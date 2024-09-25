import java.time.LocalDate;

public class Credito extends Tarjeta{

    //Atributos
    private String nombre_titular;
    private LocalDate fecha_expiracion;
    private String codigo_verificador;

    public Credito(String nombre_titular, LocalDate fecha_expiracion, String codigo_verificador, int numero, int codigo_verificacion, Planes planes, LocalDate fecha_inicio, LocalDate fecha_cobro, LocalDate fecha_termino){
        super(numero,codigo_verificacion, planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.nombre_titular = nombre_titular;
        this.fecha_expiracion = fecha_expiracion;
        this.codigo_verificador = codigo_verificador;
    }
    
}