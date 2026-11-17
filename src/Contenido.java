public abstract class Contenido {
    private String titulo;
    protected int duracion;

    public Contenido(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + " | Duración: " + duracion + " min");
    }

    public abstract void reproducir();
}