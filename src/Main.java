//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


//    Pelicula p = new Pelicula(100,5,"el hombre que araña","spiderman",2026, new Director("Sam Raimi","estadounidence"));
//    System.out.println(p.mostrarPelicula());

    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    System.out.println("Indique cuantas series/peliculas va ingresar: ");
    int maxCont = sc.nextInt();
    int contador = 0;
    Plataforma [] contenido = new Plataforma[maxCont];
    do {

        System.out.println("---MENU PLATAFORMA DE STREAMING---");
        System.out.println("1.Cargar nueva pelicula/serie: ");
        System.out.println("2. Buscar pelicula/serie por nombre: ");
        System.out.println("3. Mostrar solo series que son miniseries.");
        System.out.println("4. Mostrar SOLO PELICULAS que sean de un director determinado: ");
        opcion = sc.nextInt();

        switch (opcion){
            case 1 ->{
                if(contador >=  maxCont){
                    System.out.println("No se pueden ingresar mas peliculas/series.");
                }
                else
                    System.out.println("Ingrese 1 para cargar una pelicula o 2 para cargar una serie:");
                int opcionCarga = sc.nextInt();
                if(opcionCarga == 1){
                    Pelicula p = new Pelicula(0,0,"","",0,new Director("", ""));
                    System.out.println("Ingrese titulo de la pelicula:");
                    p.setTtitulo(sc.next());
                    System.out.println("Ingrese descripcion de la pelicula:");
                    p.setDescripcion(sc.next());
                    sc.nextLine();
                    System.out.println("Ingrese duracion de la pelicula:");
                    p.setDuracion(sc.nextInt());
                    System.out.println("Ingrese duracion de los creditos");
                    p.setDuracionCreditos(sc.nextInt());
                    System.out.println("Ingrese año de lanzamiento: ");
                    p.setLanzamiento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese Nombre del director: ");
                    p.getDirector().setNombre(sc.next());
                    System.out.println("Ingrese nacionalidad del director: ");
                    p.getDirector().setNacionalidad(sc.next());
                    contenido[contador] = p;
                    contador++;
                }
                else{
                    Serie s = new Serie(0,0,false,"",0,new Director("", ""));
                    System.out.println("Ingrese titulo de la pelicula:");
                    s.setTtitulo(sc.next());
                    sc.nextLine();
                    System.out.println("Ingrese cantidad de episodios: ");
                    s.setCantEpisodios(sc.nextInt());
                    System.out.println("Ingrese cantidad de temporadas");
                    s.setCantTemporadas(sc.nextInt());
                    System.out.println("Indique si la serie ya finalizo (SI = 1, NO = 0): ");
                    s.setFinalizada(sc.nextInt() == 1);
                    System.out.println("Ingrese año de lanzamiento: ");
                    s.setLanzamiento(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese Nombre del director: ");
                    s.getDirector().setNombre(sc.next());
                    System.out.println("Ingrese nacionalidad del director: ");
                    s.getDirector().setNacionalidad(sc.next());
                    contenido[contador] = s;
                    contador++;
                }



            }

            case 2 -> {
                System.out.println("Ingrese titulo de la pelicula");
            }
        }

    }while( opcion != 7);
}
