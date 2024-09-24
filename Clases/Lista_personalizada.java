import java.util.ArrayList;

public class Lista_personalizada {
    private String nombre;
    private ArrayList<Lista_media> lista;
    private String enlace_publico;

    private void crear_enlace_publico(){
        this.enlace_publico = "https://www.morita.com/"+this.nombre;
    }

}
