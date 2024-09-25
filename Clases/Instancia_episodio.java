import java.time.LocalTime;

public class Instancia_episodio {
    private boolean visto;
    private boolean ultimo_visto;
    private LocalTime tiempo_visto;
    private Episodio episodio;
    
    public Instancia_episodio(Episodio episodio) {
        this.episodio = episodio;
        this.visto = false;
        this.ultimo_visto = false;
    }

    public void setTiempo_visto(LocalTime tiempo_visto) {
        this.tiempo_visto = tiempo_visto;
    }
    
    public void ver_Episodio (){
        this.visto = true;
    }

    public boolean getUltimo_visto() {
        return this.ultimo_visto;
    }

    public Episodio getEpisodio(){
        return this.episodio;
    }

    public void setUltimo_visto(boolean ultimo_visto) {
        this.ultimo_visto = ultimo_visto;
    }
}
