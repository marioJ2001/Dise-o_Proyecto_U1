public class Planes{
    
    // atributos
    private String nombre;
    private String descripcion;
    private float costo;
    private int pantalla_activa;
    private Plan_de_pago tipo_plan;
    
    // metodos
    public Planes(String nombre, String descripcion, float costo){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.costo = costo;
        this.tipo_plan = Plan_de_pago.Gratis;
        this.pantalla_activa = 0;
    }
    
}