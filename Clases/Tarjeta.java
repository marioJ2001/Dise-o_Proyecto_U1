import java.time.LocalDate;

public class Tarjeta extends Membresia{

    //Atributos
    protected int numero;
    protected int codigo_verificacion;

    public Tarjeta(int numero, int codigo_verificacion, Planes planes,LocalDate fecha_inicio, LocalDate fecha_cobro, LocalDate fecha_termino){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.numero = numero;
        this.codigo_verificacion = codigo_verificacion;
    }

}