import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


public class Episodio {
    private int numero;
    private String nombre;
    private String director;
    private ArrayList<String> elenco ;
    private LocalDate lanzamiento;
    private String descripcion;
    private LocalTime duracion;


    public Episodio(int numero,
                    String nombre,
                    String director,
                    LocalDate lanzamiento,
                    String descripcion,
                    LocalTime duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.director = director;
        this.lanzamiento = lanzamiento;
        this.descripcion = descripcion;
        this.duracion = duracion;

    }

    public void setElenco(String elenco) {
        this.elenco.add(elenco);
    }
    
    
}
