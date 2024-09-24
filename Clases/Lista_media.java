import java.util.ArrayList;

public class Lista_media {
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Serie> series;

    public void agregar_pelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    public void agregar_serie(Serie serie){
        this.series.add(serie);
    }
    
}
