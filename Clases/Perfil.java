//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Perfil {
    private String nombre;
    //private Data icono;
    private Lenguaje lenguaje_por_defecto;
    private boolean es_niño;
    private ArrayList<Lista_media> favoritos;
    private ArrayList<Lista_personalizada> lista_personalizada;
    private ArrayList<Registro_reproduccion> registro_reproduccion;
    
    public Perfil(String nombre, boolean es_niño) {
        this.nombre = nombre;
        this.es_niño = es_niño;
    }

    public void agregar_favorito(){}

    public void crear_lista(){}
}
