import java.util.ArrayList;

public class Lista_media {
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Serie> series;

    public Lista_media(){
        peliculas = new ArrayList<>();
        series = new ArrayList<>();
    }
    public void agregar_pelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public void agregar_serie(Serie serie){
        series.add(serie);
    }
    
    public ArrayList<Pelicula> getPeliculas(){
        return this.peliculas;
    }

    public void eliminar_pelicula (Pelicula pelicula){
        this.peliculas.remove(pelicula);
    }

    public void elimnar_serie (Serie serie){
        this.series.remove(serie);
    }

}
