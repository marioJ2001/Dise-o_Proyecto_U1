//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Perfil {
    private String nombre;
    //private Data icono;
    private Lenguaje lenguaje_por_defecto;
    private boolean es_niño;
    private Lista_media favoritos;
    private Lista_personalizada lista_personalizada;
    private Registro_reproduccion registro_reproduccion;
    
    public Perfil(String nombre, boolean es_niño) {
        this.nombre = nombre;
        this.es_niño = es_niño;
        this.lenguaje_por_defecto = Lenguaje.ESPAÑOL;
        this.favoritos = new Lista_media();
        this.registro_reproduccion = new Registro_reproduccion();
    }

    public void agregar_pelicula_favorita(Pelicula pelicula){
        this.favoritos.agregar_pelicula(pelicula);
    }

    public void agregar_serie_favorita(Serie serie){
        this.favoritos.agregar_serie(serie);
    }

    public void crear_lista(String nombre){
        this.lista_personalizada = new Lista_personalizada(nombre);
        System.out.println("Se ha creado la lista personalizada: "+nombre);
    }

    public void agregar_pelicula_lista(Pelicula pelicula){
        this.lista_personalizada.agregar_pelicula(pelicula);
    }

    public void agregar_serie_lista(Serie serie){
        this.lista_personalizada.agregar_serie(serie);
    }

    public Boolean getEs_niño(){
        return this.es_niño;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Catalogo eliminar_pelicula (Pelicula _pelicula, Catalogo _catalogo){
        this.favoritos.eliminar_pelicula(_pelicula);
        _catalogo.eliminar_pelicula(_pelicula);
        this.registro_reproduccion.eliminar_instancia_pelicula(_pelicula);
        return _catalogo;
    }

    public Catalogo eliminar_serie (Serie _serie, Catalogo _catalogo){
        this.favoritos.elimnar_serie(_serie);
        _catalogo.eliminar_serie(_serie);
        this.registro_reproduccion.eliminar_instancia_serie(_serie);
        return _catalogo;
    }

    //public void crear_lista(){}

    public void mirar_pelicual (Instancia_pelicula pelicula){
        this.registro_reproduccion.guardar_pelicula(pelicula);
    }
}
