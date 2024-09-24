import java.util.Date;

public class Credito extends Tarjeta{

    //Atributos
    private String nombre_titular;
    private Date fecha_expiracion;
    private String codigo_verificador;

    public Credito(String nombre_titular, Date fecha_expiracion, String codigo_verificador, int numero, int codigo_verificacion, Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino){
        super(numero,codigo_verificacion, planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.nombre_titular = nombre_titular;
        this.fecha_expiracion = fecha_expiracion;
        this.codigo_verificador = codigo_verificador;
    }
    
}