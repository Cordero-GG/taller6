public class Serie extends Contenido {
    private int temporadas;

    public Serie(String titulo, int duracion, int temporadas) {
        super(titulo, duracion);
        this.temporadas = temporadas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Temporadas: " + temporadas);
    }

    @Override
    public void reproducir() {
        System.out.println("Reproduciendo serie de " + temporadas + " temporadas (" + duracion + " min/ep)");
    }
}