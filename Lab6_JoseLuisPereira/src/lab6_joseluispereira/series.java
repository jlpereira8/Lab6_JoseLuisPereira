/*
 *Series::::: cuentan con un ID (único), nombre, numero de temporadas,
categoría, lista de idiomas disponibles, lista de subtítulos disponibles,
duración de los episodios (hora y minutos), rating (1 a 5), lista de
comentarios, productora, director, lista de actores (nombre y apellido).
 */
package lab6_joseluispereira;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class series {
    private String id;
    private String nombre;
    private int num_temps;
    private String categoria;
    private ArrayList<String> idiomas;
    private ArrayList<String> subtitulos;
    private String duracion;
    private int rating;
    private ArrayList<String> comentarios;
    private String productora;
    private String director;
    private ArrayList<String> actores;

    public series(String id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    
    public series() {
    }

    public series(String id, String nombre, int num_temps, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String duracion, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores) {
        this.id = id;
        this.nombre = nombre;
        this.num_temps = num_temps;
        this.categoria = categoria;
        this.idiomas = idiomas;
        this.subtitulos = subtitulos;
        this.duracion = duracion;
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

    public int getNum_temps() {
        return num_temps;
    }

    public void setNum_temps(int num_temps) {
        this.num_temps = num_temps;
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

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
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
        return "series{" + "nombre=" + nombre + '}';
    }

    

    
    
    
    
}
