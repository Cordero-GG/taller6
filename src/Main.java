import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("Interestelar", 169, "Christopher Nolan"));
        peliculas.add(new Pelicula("Dune", 155, "Denis Villeneuve"));

        List<Serie> series = new ArrayList<>();
        series.add(new Serie("Breaking Bad", 50, 5));
        series.add(new Serie("Dark", 60, 3));

        System.out.println("--- LISTA DE PELÍCULAS ---");
        for (Pelicula p : peliculas) {
            p.mostrarInfo();
            p.reproducir();
        }

        System.out.println("\n--- LISTA DE SERIES ---");
        for (Serie s : series) {
            s.mostrarInfo();
            s.reproducir();
        }

        System.out.println("\n--- LISTA DE CONTENIDO (POLIMORFISMO) ---");
        List<Contenido> contenidos = new ArrayList<>();
        contenidos.addAll(peliculas);
        contenidos.addAll(series);

        for (Contenido c : contenidos) {
            c.mostrarInfo();
            c.reproducir();
        }
    }
}