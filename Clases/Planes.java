public class Planes{
    
    // atributos
    private String nombre;
    private String descripcion;
    protected float costo;
    private int pantalla_activa;
    private Plan_de_pago tipo_plan;
    
    // metodos
    public Planes(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = 0;
        this.tipo_plan = Plan_de_pago.Gratis;
        this.pantalla_activa = 0;
    }

    protected void actualizar_plan(Plan_de_pago tipo_plan){
        if (tipo_plan == Plan_de_pago.Standart) {
            this.tipo_plan = Plan_de_pago.Standart;
            this.costo = 990;
        }
        if (tipo_plan == Plan_de_pago.Premium) {
            this.tipo_plan = Plan_de_pago.Premium;
            this.costo = 1990;
        }
    }
    
}