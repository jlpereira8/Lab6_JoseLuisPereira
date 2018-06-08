/*
Usuarios: cuentan con un correo electrónico, contraseña, fecha de
nacimiento, lista de películas y series preferidas, tarjeta de
crédito/débito,
 */
package lab6_joseluispereira;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class usuario {
    private String correo;
    private String contra;
    private String fecha;
    private ArrayList<String> peliculas;
    private ArrayList<String> series_fav;
    private int tarjeta;

    public usuario() {
    }

    public usuario(String correo, String contra, String fecha, ArrayList<String> peliculas, ArrayList<String> series_fav, int tarjeta) {
        this.correo = correo;
        this.contra = contra;
        this.fecha = fecha;
        this.peliculas = peliculas;
        this.series_fav = series_fav;
        this.tarjeta = tarjeta;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public ArrayList<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<String> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<String> getSeries_fav() {
        return series_fav;
    }

    public void setSeries_fav(ArrayList<String> series_fav) {
        this.series_fav = series_fav;
    }

    public int getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(int tarjeta) {
        this.tarjeta = tarjeta;
    }

    @Override
    public String toString() {
        return "usuario{" + "correo=" + correo + ", contra=" + contra + ", fecha=" + fecha + ", peliculas=" + peliculas + ", series_fav=" + series_fav + ", tarjeta=" + tarjeta + '}';
    }
    
    
    
    
    
    
}
