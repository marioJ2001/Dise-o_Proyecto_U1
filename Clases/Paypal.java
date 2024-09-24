import java.util.Date;

public class Paypal extends Membresia{  

    //Atributos
    private String correo_usuario;
    private String token_verificacion;

    public Paypal(String correo_usuario, String token_verificacion, Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.correo_usuario = correo_usuario;
        this.token_verificacion = token_verificacion;
    }
    
}