import java.time.LocalDate;

public class Debito extends Tarjeta{

    //Atributos
    private String rut_titular;
    private String banco;

    public Debito(String rut_titular, String banco,int numero, int codigo_verificacion, Planes planes,LocalDate fecha_inicio, LocalDate fecha_cobro, LocalDate fecha_termino){
        super(numero,codigo_verificacion, planes, fecha_inicio, fecha_cobro, fecha_termino);
        this.rut_titular = rut_titular;
        this.banco = banco;
    }
    
}