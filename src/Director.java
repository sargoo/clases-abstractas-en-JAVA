public class Director {
    private String nombre;
    private String nacionalidad;

    public Director(String nombre, String nacionalidad) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return  this.nombre;
    }

    public void setNombre (String nombre){

        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return  this.nacionalidad;
    }

    public void setNacionalidad (String nacionalidad){

        this.nacionalidad = nacionalidad;
    }

    public String mostrarDirector() {
        return  "Director: " + this.nombre + " nacionalidad: " + this.nacionalidad;
    }
}
