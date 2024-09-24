import java.util.ArrayList;
public class Catalogo {
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Serie> series;

    public void guardar_pelicula(Pelicula _pelicula){
        this.peliculas.add(_pelicula);
    }

    public void guardar_serie(Serie _serie){
        this.series.add(_serie);
    }
    public void eliminar_media(){
        System.out.println("hola mundo");
    }

    public void mostrar_catalogo(boolean es_niño){
        for (int i=0; i < this.peliculas.size(); i++ ) {
            if (es_niño){
                if (peliculas.get(i).getResEdad() == Restriccion_edad.NIÑO || peliculas.get(i).getResEdad() == Restriccion_edad.TE) {
                    System.out.println(peliculas.get(i).getNombre());
                }
                
            }else{
                System.out.println(peliculas.get(i).getNombre());
            }
        }
    }  
}
