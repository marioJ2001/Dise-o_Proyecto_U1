//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Perfil {
    private String nombre;
    //private Data icono;
    private Lenguaje lenguaje_por_defecto;
    private boolean es_niño;
    private Lista_media favoritos;
    private Lista_personalizada lista_personalizada;
    private ArrayList<Registro_reproduccion> registro_reproduccion;
    
    public Perfil(String nombre, boolean es_niño) {
        this.nombre = nombre;
        this.es_niño = es_niño;
        this.lenguaje_por_defecto = Lenguaje.ESPAÑOL;
    }

    public void agregar_pelicula_favorita(Pelicula pelicula){
        favoritos.agregar_pelicula(pelicula);
    }

    public void agregar_serie_favorita(Serie serie){
        favoritos.agregar_serie(serie);
    }

    public void crear_lista(String nombre){
        lista_personalizada = new Lista_personalizada(nombre);
        System.out.println("Se ha creado la lista personalizada: "+nombre);
    }

    public void agregar_pelicula_lista(Pelicula pelicula){
        lista_personalizada.agregar_pelicula(pelicula);
    }

    public void agregar_serie_lista(Serie serie){
        lista_personalizada.agregar_serie(serie);
    }

    public String getNombre(){
        return this.nombre;
    }

    public boolean getEs_niño(){
        return this.es_niño;
    }

    public void mostrar_enlace(){
        System.out.println(lista_personalizada.getEnlace());
    
    }
}
