import java.time.LocalDate;
import java.util.ArrayList;
import java.time.LocalTime;


public class Main{
    public static void main(String[] args){
        //Catalogo
        Catalogo Catalogo = new Catalogo();
        
        //Peliculas TE
        Pelicula Sherk = new Pelicula("Sherk", "Andrew Adamson", 90, 3000, "La mejor pelicula de su año es goooood", LocalDate.of(2001, 7, 12), Restriccion_edad.TE, 4.9);
        ArrayList<String> Sherkelenco = new ArrayList<>();
        Sherkelenco.add("Mike Mayers");
        Sherkelenco.add("Eddie Murphy");
        Sherkelenco.add("Cameron Diaz");
        Sherk.setElenco(Sherkelenco);
        
        //Peliculas Brocacochis
        Pelicula ToyStory = new Pelicula("Toy Story", "John Lazzeter", 81, 500, "Tienes cancer Andy", LocalDate.of(1996, 1, 4), Restriccion_edad.NIÑO, 4.5);
        ArrayList<String> ToitoriElenco = new ArrayList<>();
        ToitoriElenco.add("Tom Hanks");
        ToitoriElenco.add("Tim Allen");
        ToitoriElenco.add("Wallace Shawn");
        ToyStory.setElenco(ToitoriElenco);

        Pelicula Mario = new Pelicula("Super Mario Bros Movie", "Aaron Horvath", 92, 0, "Piches", LocalDate.of(2023, 4, 5), Restriccion_edad.NIÑO, 4.3);
        ArrayList<String> MarioElenco = new ArrayList<>();
        MarioElenco.add("Chris Pratt");
        MarioElenco.add("Jack Black");
        MarioElenco.add("Ana Taylo Joy");
        Mario.setElenco(MarioElenco);

        //Peliculas Adolescente
        Pelicula Crepusculo = new Pelicula("Crepusculo", "Bill Condon", 130, 0, "Pelicula de vampiros cariñosos", LocalDate.of(2009, 1, 1), Restriccion_edad.ADOLESCENTE, 3.4);
        ArrayList<String> CrepusculoElenco = new ArrayList<>();
        CrepusculoElenco.add("Robert Pattinson");
        CrepusculoElenco.add("Taylor Loutner");
        CrepusculoElenco.add("Kristen Steward");
        Crepusculo.setElenco(CrepusculoElenco);
        
        Pelicula Deadpool = new Pelicula("Deadpool", "Tim Miller", 108, 4000, "Unas tres lucas", LocalDate.of(2016, 2, 11), Restriccion_edad.ADOLESCENTE, 4.2);
        ArrayList<String> DeadpoolElenco = new ArrayList<>();
        DeadpoolElenco.add("Ryan Reynolds");
        DeadpoolElenco.add("Morena Bacarind");
        DeadpoolElenco.add("Gina Carano");
        Deadpool.setElenco(DeadpoolElenco);
        
        //Peliculas Adultos
        Pelicula Alien = new Pelicula("Alien", "James Cameron", 117, 7, "Pelicula de aliens", LocalDate.of(1979, 12, 25), Restriccion_edad.ADULTO, 4.5);
        ArrayList<String> AlienElenco = new ArrayList<>();
        AlienElenco.add("Sigourney Weaver");
        AlienElenco.add("Tom Skerritt");
        AlienElenco.add("Bolaji Badejo");
        Alien.setElenco(AlienElenco);
        
        Pelicula Viernes13 = new Pelicula("Viernes 13", "Sean S. Cunningham", 95, 7, "Aca sale el Jason (archivo)", LocalDate.of(1980, 5, 9), Restriccion_edad.ADULTO, 3.2);
        ArrayList<String> Viernes13Elenco = new ArrayList<>();
        Viernes13Elenco.add("Kane Hodder");
        Viernes13Elenco.add("Corei Feldman");
        Viernes13Elenco.add("Crispin Glover");
        Viernes13.setElenco(Viernes13Elenco);

        Catalogo.guardar_pelicula(Sherk);
        Catalogo.guardar_pelicula(ToyStory);
        Catalogo.guardar_pelicula(Mario);
        Catalogo.guardar_pelicula(Crepusculo);
        Catalogo.guardar_pelicula(Deadpool);
        Catalogo.guardar_pelicula(Alien);
        Catalogo.guardar_pelicula(Viernes13);   


        //Series
        //Jojos
        Serie Jojos = new Serie("Jojo's", Restriccion_edad.ADOLESCENTE);
        Episodio jojosEp1 = new Episodio(1,"Dio,  el Invasor", "Naokatsu Tsuda", LocalDate.of(2012,10,05), "Dio se muda con los Joestars", LocalTime.of(0,23));
        Episodio jojosEp2 = new Episodio(2,"Una carta del Pasado", "Naokatsu Tsuda", LocalDate.of(2012,10,12), "Jonathan descubre una carta que revela los oscuros secretos de Dio", LocalTime.of(0,23));
        Episodio jojosEp3 = new Episodio(3,"Juventud con Dio", "Naokatsu Tsuda", LocalDate.of(2012,10,19), "Jonathan busca pruebas para desenmascarar a Dio", LocalTime.of(0,23));
        Episodio jojosEp4 = new Episodio(4,"Overdrive", "Toshiyuki Kato", LocalDate.of(2012,10,026), "Jonathan empieza su entrenamiento en el arte del Hamon", LocalTime.of(0,23));
        Temporada temporada = new Temporada(1, LocalDate.of(2012,10,05));
        ArrayList<String> jojoelenco = new ArrayList<>();

        //Elenco (Seiyūs)
        jojoelenco.add("Toru Okawa");
        jojoelenco.add("Takehito Koyasu");
        jojoelenco.add("Daisuke Ono");
        jojoelenco.add("Yoku Shioya");
        jojoelenco.add("Yōji Ueda");
        jojosEp1.setElenco(jojoelenco);
        jojosEp2.setElenco(jojoelenco);
        jojosEp3.setElenco(jojoelenco);
        jojosEp4.setElenco(jojoelenco);
        //Episodios agregados
        temporada.addEpisodio(jojosEp1);
        temporada.addEpisodio(jojosEp2);
        temporada.addEpisodio(jojosEp3);
        temporada.addEpisodio(jojosEp4);
        Jojos.addTemporada(temporada);
        Catalogo.guardar_serie(Jojos);
        
        //Shingeki no Kyojin 
        Serie attackOnTitan = new Serie("Attack on Titan", Restriccion_edad.ADOLESCENTE);
        Episodio attackOnTitanEp1 = new Episodio(1, "To You, in 2000 Years", "Tetsuro Araki", LocalDate.of(2013, 4, 6), "Eren y Mikasa ven la destrucción de su ciudad", LocalTime.of(0, 24));
        Episodio attackOnTitanEp2 = new Episodio(2, "That Day: The Fall of Shiganshina, Part 2", "Tetsuro Araki", LocalDate.of(2013, 4, 13), "Eren, Mikasa y Armin huyen después de que los titanes invaden Shiganshina", LocalTime.of(0, 24));
        Episodio attackOnTitanEp3 = new Episodio(3, "A Dim Light Amid Despair: Humanitys Comeback, Part 1", "Tetsuro Araki", LocalDate.of(2013, 4, 20), "Eren, Mikasa y Armin se alistan en el ejército para luchar contra los titanes", LocalTime.of(0, 24));
        Episodio attackOnTitanEp4 = new Episodio(4, "The Night of the Closing Ceremony: Humanitys Comeback, Part 2", "Tetsuro Araki", LocalDate.of(2013, 4, 27), "Tras tres años de entrenamiento, Eren y sus compañeros se gradúan como soldados", LocalTime.of(0, 24));
        ArrayList<String> shingekiElenco1 = new ArrayList<>();
        //Elenco (Seiyūs)
        shingekiElenco1.add("Yuki Kaji");
        shingekiElenco1.add("Yui Ishikawa");
        shingekiElenco1.add("Marian Inoue");
        attackOnTitanEp1.setElenco(shingekiElenco1);
        attackOnTitanEp2.setElenco(shingekiElenco1);
        attackOnTitanEp3.setElenco(shingekiElenco1);
        attackOnTitanEp4.setElenco(shingekiElenco1);
        Temporada temporadaAttack1 = new Temporada(1, LocalDate.of(2013, 4, 6));
        //Episodios agregados
        temporadaAttack1.addEpisodio(attackOnTitanEp1);
        temporadaAttack1.addEpisodio(attackOnTitanEp2);
        temporadaAttack1.addEpisodio(attackOnTitanEp3);
        temporadaAttack1.addEpisodio(attackOnTitanEp4);
        attackOnTitan.addTemporada(temporadaAttack1);
        Catalogo.guardar_serie(attackOnTitan);
        
        //Rompiendo malo
        Serie breakingBad = new Serie("Breaking Bad", Restriccion_edad.ADOLESCENTE);
        Episodio breakingBadEp1 = new Episodio(1, "Pilot", "Vince Gilligan", LocalDate.of(2008, 1, 20), "Walter White descubre su diagnóstico", LocalTime.of(0, 58));
        Episodio breakingBadEp2 = new Episodio(2, "Cat's in the Bag...", "Adam Bernstein", LocalDate.of(2008, 1, 27), "Tras su primer intento de cocinar metanfetaminas, Walter y Jesse deben lidiar con las consecuencias: dos cadáveres en su caravana", LocalTime.of(0, 48));
        Episodio breakingBadEp3 = new Episodio(3, "...And the Bag's in the River", "Adam Bernstein", LocalDate.of(2008, 2, 10), "Mientras Jesse intenta deshacerse del cuerpo de uno de los gánsteres, Walter debe lidiar con el segundo hombre, que aún está vivo.", LocalTime.of(0, 48));
        Episodio breakingBadEp4 = new Episodio(4, "Cancer Man", "Jim McKay", LocalDate.of(2008, 2, 17), "Walter revela a su familia que tiene cáncer de pulmón", LocalTime.of(0, 58));
        ArrayList<String> breakingBadElenco1 = new ArrayList<>();
        //Elenco
        breakingBadElenco1.add("Brayan Cranston");
        breakingBadElenco1.add("Aaron Paul");
        breakingBadElenco1.add("Anna Gunn");
        breakingBadEp1.setElenco(breakingBadElenco1);
        breakingBadEp2.setElenco(breakingBadElenco1);
        breakingBadEp3.setElenco(breakingBadElenco1);
        breakingBadEp4.setElenco(breakingBadElenco1);
        Temporada temporadaBreaking1 = new Temporada(1, LocalDate.of(2008, 1, 20));
        //Episodios agregados
        temporadaBreaking1.addEpisodio(breakingBadEp1);
        temporadaBreaking1.addEpisodio(breakingBadEp2);
        temporadaBreaking1.addEpisodio(breakingBadEp3);
        temporadaBreaking1.addEpisodio(breakingBadEp4);
        breakingBad.addTemporada(temporadaBreaking1);
        Catalogo.guardar_serie(breakingBad);
        
        //Arcane
        Serie Arcane = new Serie("Arcane", Restriccion_edad.ADOLESCENTE);
        Episodio arcaneEp1 = new Episodio(1,"Welcome to the Playground","Pascal Charrue y Arnaud Delord",LocalDate.of(2021,11,06),"Vi y Powder, dos hermanas huérfanas intentan robar en la casa de un científico para conseguir tecnología valiosa", LocalTime.of(0, 43));
        Episodio arcaneEp2 = new Episodio(2,"Some Mysteries Are Better Left Unsolved","Pascal Charrue y Arnaud Delord",LocalDate.of(2021,11,06),"Tras el fallido atraco, las tensiones aumentan entre las fuerzas del orden de Piltover y los habitantes de Zaun.", LocalTime.of(0, 43));
        Episodio arcaneEp3 = new Episodio(3,"The Base Violence Necessary for Change","Pascal Charrue y Arnaud Delord",LocalDate.of(2021,11,06),"Vi se enfrenta a una dura decisión que cambiará su vida y la de su hermana Powder.", LocalTime.of(0, 43));
        Episodio arcaneEp4 = new Episodio(4,"Happy Progress Day!","Pascal Charrue y Arnaud Delord",LocalDate.of(2021,11,06),"Han pasado varios años desde los eventos trágicos en Zaun, y Jayce ahora es un héroe en Piltover por sus avances tecnológicos.", LocalTime.of(0, 43));
        ArrayList<String> ArcaneElenco1 = new ArrayList<>();
        //Elenco
        ArcaneElenco1.add("Hailee Steinfeld");
        ArcaneElenco1.add("Ella Purnell");
        ArcaneElenco1.add("Kevin Alejandro ");
        ArcaneElenco1.add("Harry Lloyd");
        ArcaneElenco1.add("Katie Leung");
        ArcaneElenco1.add("Jason Spisak");
        arcaneEp1.setElenco(ArcaneElenco1);
        arcaneEp2.setElenco(ArcaneElenco1);
        arcaneEp3.setElenco(ArcaneElenco1);
        arcaneEp4.setElenco(ArcaneElenco1);
        Temporada temporadaArcane1 = new Temporada(1, LocalDate.of(2021,11,06));
        //Episodios agregados
        temporadaArcane1.addEpisodio(arcaneEp1);
        temporadaArcane1.addEpisodio(arcaneEp2);
        temporadaArcane1.addEpisodio(arcaneEp3);
        temporadaArcane1.addEpisodio(arcaneEp4);
        Arcane.addTemporada(temporadaArcane1);
        Catalogo.guardar_serie(Arcane);
        
        Planes plan1 = new Planes("Juan", "Ajo");
        Tarjeta tarjeta = new Tarjeta(1, 123123, plan1, LocalDate.of(2024, 11, 4), LocalDate.of(2024, 9, 29), LocalDate.of(2024,10,20));
        Cuenta cuenta1 = new Cuenta("Pepe","pepe@gmail.com","1234", tarjeta);
        
        cuenta1.crear_perfil("Esteban", false);
        cuenta1.crear_perfil("Pedro", true);
        cuenta1.crear_perfil("Jonathan", false);
        cuenta1.crear_perfil("Mario", false);
        cuenta1.crear_perfil("Alonso", true);
        
        //Primer requisito
        System.out.println("Print usuarios de la cuenta pepe:");
        cuenta1.mostrar_perfiles();
        
        //Segundo requisito
        System.out.println("\nMostrar Catalogo");
        System.out.println("Catalogo para Esteban (no es niño)");
        Catalogo.mostrar_catalogo(cuenta1.getPerfil(0).getEs_niño());
        
        System.out.println("\nCatalogo para Pedro (es niño)");
        Catalogo.mostrar_catalogo(cuenta1.getPerfil(1).getEs_niño());
        
        //tercer requisito
        System.out.println("Proceso de compra y registro de una pelicula a una cuenta");
        cuenta1.registrar_pelicula(Sherk);
        cuenta1.registrar_pelicula(Deadpool);
        cuenta1.registrar_pelicula(Alien);
        
        //cuarto requisito
        System.out.println("\nSe mostraran las peliculas adquiridas");
        cuenta1.ver_pelicuas_compradas();
        

        //Agregar favoritos
        System.out.println("\nSe agregaron a favoritos peliculas o series");
        cuenta1.getPerfil(1).agregar_pelicula_favorita(Viernes13);
        cuenta1.getPerfil(1).agregar_pelicula_favorita(ToyStory);
        cuenta1.getPerfil(2).agregar_serie_favorita(Arcane);

        //Agregar Reproducciones
        System.out.println("\nUsuario preprodujo una media");
        Instancia_pelicula verPeli1 = new Instancia_pelicula(Sherk, LocalDate.now(), true);
        verPeli1.setTiempoVisto(LocalTime.of(1,30));

        Instancia_pelicula verPeli2 = new Instancia_pelicula(Crepusculo, Crepusculo.fechaLanzamiento, true);
        verPeli2.setTiempoVisto(LocalTime.of(2, 10));

        cuenta1.getPerfil(3).mirar_pelicual(verPeli1);
        cuenta1.getPerfil(3).mirar_pelicual(verPeli2);
        
        //Eliminar perfil
        System.out.println("\nEliminacion del perfil Pedro y Esteban");
        cuenta1.eliminar_perfil("Pedro");
        cuenta1.eliminar_perfil("Esteban");
        System.out.println("\nPrint perfiles actualizado");
        cuenta1.mostrar_perfiles();

        //Eliminar elemento en favoritos
        System.out.println("\nEliminacion de un elemento media que este en favorito");
        for (int i =0; i < cuenta1.getPerfiles().size() ; i++){
            Catalogo = cuenta1.getPerfil(i).eliminar_pelicula(Viernes13, Catalogo);
            Catalogo = cuenta1.getPerfil(i).eliminar_pelicula(Sherk, Catalogo);
            Catalogo = cuenta1.getPerfil(i).eliminar_serie(Arcane, Catalogo);
        }
        System.out.println("Imprimir elementos de catalogo despues de eliminar");
        Catalogo.mostrar_catalogo(cuenta1.getPerfil(0).getEs_niño());
    
    }
}
 
