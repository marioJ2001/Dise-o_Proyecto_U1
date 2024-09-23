import java.util.Date;

public class Tarjeta extends Membresia{

    //Atributos
    protected int numero;
    protected int codigo_verificacion;

    public Tarjeta(int numero, int codigo_verificacion, Planes planes,Date fecha_inicio, Date fecha_cobro, Date fecha_termino, Pago forma_pago){
        super(planes, fecha_inicio, fecha_cobro, fecha_termino, forma_pago);
        this.numero = numero;
        this.codigo_verificacion = codigo_verificacion;
    }

    //private void codificar(){}
    public void print(){
        System.out.println(numero);
    }
}