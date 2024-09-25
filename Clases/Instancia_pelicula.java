import java.time.LocalDate;
import java.time.LocalTime;

public class Instancia_pelicula {
    private Pelicula pelicula;
    private LocalDate fecha_ultima_vista;
    private Boolean visto;
    private LocalTime tiempoVisto;
    
    public Instancia_pelicula(Pelicula pelicula, LocalDate fecha_ultima_vista, Boolean visto) {
        this.pelicula = pelicula;
        this.fecha_ultima_vista = fecha_ultima_vista;
        this.visto = false;
    }

    public void setTiempoVisto(LocalTime tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }

    public Pelicula getPelicula(){
        return this.pelicula;
    }


}
