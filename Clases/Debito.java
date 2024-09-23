import java.util.Date;

public class Debito extends Tarjeta{

    //Atributos
    private String rut_titular;
    private String banco;

    public Debito(String rut_titular, String banco,int numero, int codigo_verificacion, Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino, Pago forma_pago){
        super(numero,codigo_verificacion, planes, fecha_inicio, fecha_cobro, fecha_termino, forma_pago);
        this.rut_titular = rut_titular;
        this.banco = banco;
    }
    
}