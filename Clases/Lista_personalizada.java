public class Lista_personalizada {
    private String nombre;
    private Lista_media lista;
    private String enlace_publico;

    public Lista_personalizada(String nombre) {
        this.nombre = nombre;
        this.lista = new Lista_media();
        crear_enlace_publico();
    }

    private void crear_enlace_publico(){
        this.enlace_publico = "https://www.morita.com/"+this.nombre;
    }

    public void agregar_pelicula(Pelicula pelicula){
        lista.agregar_pelicula(pelicula);
    }

    public void agregar_serie(Serie serie){
        lista.agregar_serie(serie);
    }

    public String getEnlace(){
        return this.enlace_publico;
    }

}
