public class Pelicula extends Contenido {
    private String director;

    public Pelicula(String titulo, int duracion, String director) {
        super(titulo, duracion);
        this.director = director;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Director: " + director);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo película (" + duracion + " min) dirigida por " + director);
    }
}