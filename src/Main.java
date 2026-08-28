//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    int contador = 0;
    Plataforma [] contenido = new Plataforma[20];
    contenido[0] = new Pelicula(148, 10, "Ciencia ficción y sueños", "Inception", 2010,"Christopher", "Nolan");
    contenido[1] = new Pelicula(175, 12, "Clásico de mafiosos", "The Godfather", 1972, "Francis Ford", "Coppola");
    contenido[2] = new Pelicula(195, 15, "Drama histórico en la SGM", "Schindler's List", 1993,"Steven", "Spielberg");
    contenido[3] = new Pelicula(136, 8, "Simulación virtual y acción", "The Matrix", 1999, "Lana", "Wachowski");
    contenido[4] = new Pelicula(154, 11, "El caballero de la noche", "The Dark Knight", 2008, "Christopher", "Nolan");
    contenido[5] = new Pelicula(90, 5, "Animación y juguetes", "Toy Story", 1995, "John", "Lasseter");
    contenido[6] = new Pelicula(117, 7, "Aventura espacial", "Interstellar Mini", 2014, "Christopher", "Nolan");
    contenido[7] = new Pelicula(169, 13, "Viaje interestelar masivo", "Interstellar", 2014, "Christopher", "Nolan");
    contenido[8] = new Pelicula(81, 4, "Animación ogro verde", "Shrek", 2001, "Andrew", "Adamson");
    contenido[9] = new Pelicula(201, 20, "Fantasía épica extendida", "The Lord of the Rings 3", 2003,"Peter", "Jackson");

// --- 10 SERIES ---
// Parámetros: cantEpisodios, cantTemporadas, finalizada, titulo, lanzamiento, Director
    contenido[10] = new Serie(62, 5, true, "Breaking Bad", 2008,"Vince", "Gilligan");
    contenido[11] = new Serie(73, 8, true, "Game of Thrones", 2011, "David", "Benioff");
    contenido[12] = new Serie(10, 1, true, "Chernobyl", 2019,"Craig", "Mazin"); // Es Miniserie
    contenido[13] = new Serie(9, 1, true, "WandaVision", 2021, "Matt", "Shakman"); // Es Miniserie
    contenido[14] = new Serie(236, 10, true, "Friends", 1994,"David", "Crane");
    contenido[15] = new Serie(7, 1, false, "Serie Incompleta", 2023, "Desconocido", "Director");
    contenido[16] = new Serie(39, 3, true, "Dark", 2017,"Baran bo", "Odar");
    contenido[17] = new Serie(8, 1, true, "The Queen's Gambit", 2020, "Scott", "Frank"); // Es Miniserie
    contenido[18] = new Serie(9, 1, false, "Miniserie No Finalizada", 2022,"Juan", "Perez");
    contenido[19] = new Serie(40, 4, false, "Stranger Things", 2016, "Matt", "Duffer");
    do {

        System.out.println("---MENU PLATAFORMA DE STREAMING---");
        System.out.println("1. Cargar nueva pelicula/serie: ");
        System.out.println("2. Buscar pelicula/serie por nombre: ");
        System.out.println("3. Mostrar solo series que son miniseries.");
        System.out.println("4. Mostrar SOLO PELICULAS que sean de un director determinado: ");
        System.out.println("5. Salir.");
        opcion = sc.nextInt();

        switch (opcion){
            case 1 ->{

            }

            case 2 -> {
                System.out.println("Ingrese titulo de la pelicula");
                sc.nextLine();
                String busqueda = sc.nextLine();
                for( int i = 0; i < 20; i++){
                    if(contenido[i].getTitulo().equals(busqueda)){
                        System.out.println("resultado encontrado:");
                        System.out.println(contenido[i].toString());
                    }
                }
            }

            case 3 ->{
                for(int i = 0 ; i < 20; i ++){
                    if(contenido[i] instanceof Serie){
                        if("Miniserie".equals(contenido[i].categoria()))
                        System.out.println(contenido[i].getTitulo());
                    }
                }
            }

            case 4 -> {
                System.out.println("Ingrese nombre del director");
                sc.nextLine();
                String busqueda  = sc.nextLine();
                for ( int i = 0; i < 20; i++){
                    if(contenido[i] instanceof Pelicula){
                        if(contenido[i].getDirectorNombre().equals(busqueda)){}
                        System.out.println("resultado encontrado:");
                        System.out.println(contenido[i].toString());
                    }
                }
            }
        }

    }while( opcion != 5);
}
