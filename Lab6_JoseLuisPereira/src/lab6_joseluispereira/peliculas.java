/*
 *Películas::, cuentan con un ID (único), nombre, categoría, lista de
idiomas disponibles, lista de subtítulos disponibles, duración (hora y
minutos), rating (1 a 5), lista de comentarios, productora, director, lista
de actores.
 */
package lab6_joseluispereira;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class peliculas {
    private String id;
    private String nombre;
    private String categoria;
    private ArrayList<String> idiomas;
    private ArrayList<String> subtitulos;
    private String hora;
    private int rating;
    private ArrayList<String> comentarios;
    private String productora;
    private String director;
    private ArrayList<String> actores;

    public peliculas(String id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

   
    public peliculas(String id, String nombre, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String hora, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.idiomas = idiomas;
        this.subtitulos = subtitulos;
        this.hora = hora;
        this.rating = rating;
        this.comentarios = comentarios;
        this.productora = productora;
        this.director = director;
        this.actores = actores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }

    public ArrayList<String> getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(ArrayList<String> subtitulos) {
        this.subtitulos = subtitulos;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<String> comentarios) {
        this.comentarios = comentarios;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getActores() {
        return actores;
    }

    public void setActores(ArrayList<String> actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "peliculas{" + "nombre=" + nombre + '}';
    }

    
    
    
    
    
}
