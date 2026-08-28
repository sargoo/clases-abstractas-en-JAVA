public class Pelicula extends Plataforma {
    private int duracion = 0;
    private int duracionCreditos = 0;
    private String descripcion;


    public Pelicula(int duracion, int duracionCreditos,String descripcion, String titulo, int lanzamiento, String Nombre , String Nacionalidad) {
        super(titulo, lanzamiento, Nombre, Nacionalidad);
        this.duracion = duracion;
        this.duracionCreditos = duracionCreditos;
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracionCreditos() {
        return duracionCreditos;
    }

    public void setDuracionCreditos(int duracionCreditos) {
        this.duracionCreditos = duracionCreditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTituloPelicula() {
        return getTitulo();
    }

    public String categoria(){

        if(this.duracion >= 120){

            return "Version extendida";
        }
        else {
            return "version estandar";
        }
    }


    @Override
    public String toString() {
        return "Pelicula{" +
                "duracion=" + duracion +
                ", duracionCreditos=" + duracionCreditos +
                ", descripcion='" + descripcion + '\'' +
                '}' + super.toString();
    }

    @Override
    public int duracionTotal() {
        return  this.duracion + this.duracionCreditos;
    }
}
