import java.util.ArrayList;

public class Cuenta {
    private String nombre;
    private String correo;
    private String contrasenaOG;
    private ArrayList<Perfil> perfiles;
    //private Membresía membresia;
    private ArrayList<Registro_pagos> registro_pagos;
    private Registro_compra registro_compras;
    public String contrasenaEnc;

    //Constructor
    public Cuenta(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.encriptar(contrasena);
        this.perfiles = new ArrayList<>();
        this.registro_pagos = new ArrayList<>();
    }

    private void encriptar(String contrasenaOG){
        this.contrasenaEnc = "";
        for (int i=0; i< contrasenaOG.length() ; i++){
            char temp = contrasenaOG.charAt(i);
            int ascii = (int) temp +1;
            temp = (char) ascii;
            this.contrasenaEnc = this.contrasenaEnc + temp;
        }
    }

    public String desencriptar(){
        String tempString= "";
        for (int i=0; i< this.contrasenaEnc.length() ; i++){
            char temp = this.contrasenaEnc.charAt(i);
            int ascii = (int) temp -1;
            temp = (char) ascii;
            tempString = tempString + temp;
        }
        return tempString;
    }

    public void crear_perfil(String nombre, boolean kid){
        if (this.perfiles == null){
            Perfil tempPerfil = new Perfil(nombre, kid);
            this.perfiles.add(tempPerfil);
        }else{
            if (this.perfiles.size() < 5){
                Perfil tempPerfil = new Perfil(nombre, kid);
                this.perfiles.add(tempPerfil);
            }
            else{
                System.out.println("Ha llegado al maximo de perfiles creados.");
            }
        }
    }

    public void eliminar_perfil(String nombre){
        for (int i=0; i< this.perfiles.size(); i++){
            if (this.perfiles.get(i).getNombre().equals(nombre)){
                this.perfiles.remove(i);
                System.out.println("Se eliminó a "+nombre);
            }
        }
    }

    public void mostrar_perfiles(){
        if (this.perfiles.size() == 0){
            System.out.println("No existen perfiles asociados");
        }else{
            for (int i=0; i<this.perfiles.size(); i++){
                if (this.perfiles.get(i).getEs_niño()){
                    System.out.println("Nombre: " + this.perfiles.get(i).getNombre() + "\n Infantil");
                }else{
                    System.out.println("Nombre: " + this.perfiles.get(i).getNombre() + "\n Adulto");
                }
            }
        }
    }

    public Perfil getPerfil(int i){
        return this.perfiles.get(i);
    }

    public void registrar_pelicula(Pelicula _pelicula){
        this.registro_compras.peliculas.add(_pelicula);
    }
}
