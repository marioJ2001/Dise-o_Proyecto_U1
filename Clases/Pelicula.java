import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Pelicula extends Media {
    private String info_director;
    private ArrayList<String> elenco ;
    private LocalTime duracion;
    private int costo;
    //Constructor, de ser necesario
    public Pelicula(String titulo,
                String info_director,
                int duracion,
                int costo,
                String descripcion,
                LocalDate fechaLanzamiento,
                Restriccion_edad resEdad,
                double puntaje) {
    
        this.titulo = titulo;
        this.info_director = info_director;
        this.costo = costo;
        this.descrpcion = descripcion;
        this.fechaLanzamiento = fechaLanzamiento;
        this.resEdad = resEdad;
        this.puntaje = puntaje;
        }
    //Getters
    public String getInfo_director() {
        return info_director;
    }
    
    public ArrayList<String> getElenco() {
        return elenco;
    }

    public int getCosto() {
        return costo;
    }

    public String getNombre(){
        return this.titulo;
    }

    public Restriccion_edad getResEdad(){
        return this.resEdad;
    }

    //Setters
    public void setInfo_director(String info_director) {
        this.info_director = info_director;
    }
    public void setElenco(ArrayList<String> elenco) {
        this.elenco = elenco;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }    

}