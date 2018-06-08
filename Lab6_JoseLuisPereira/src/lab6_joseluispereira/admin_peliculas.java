/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_joseluispereira;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class admin_peliculas {

    private ArrayList<peliculas> listaPersonas = new ArrayList();
    private File archivo = null;

    public admin_peliculas(String path) {
        archivo = new File(path);
    }

    public ArrayList<peliculas> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<peliculas> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "admin_peliculas{" + "listaPersonas=" + listaPersonas + ", archivo=" + archivo + '}';
    }

    public void setpersonas(peliculas p) {
        this.listaPersonas.add(p);

    }

    public void escribirarchivo()
            throws IOException {
        //String id, String nombre, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String hora, int rating, 
        //ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (peliculas t : listaPersonas) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getIdiomas() + ";");
                bw.write(t.getSubtitulos() + ";");
                bw.write(t.getHora() + ";");
                bw.write(t.getRating() + ";");
                bw.write(t.getComentarios() + ";");
                bw.write(t.getProductora() + ";");
                bw.write(t.getDirector() + ";");
                bw.write(t.getActores() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
            
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    //String id, String nombre, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String hora, int rating, 
                    //ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
                    String id, nombre, categoria, subs, hora;
                    int rating;
                    String productora, director;
                    id = sc.next();
                    nombre = sc.next();
                    categoria = sc.next();
                    ArrayList<String> idiomas = new ArrayList();
                    ArrayList<String> subtitulos = new ArrayList();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        idiomas.add(s2.next());
                    }
                    Scanner s3 = new Scanner(sc.next());
                    s3.useDelimiter(",");
                    while (s3.hasNext()) {
                        subtitulos.add(s3.next());
                    }
                    hora=sc.next();
                    rating=sc.nextInt();
                    ArrayList<String> comentarios = new ArrayList();
                    Scanner s4 = new Scanner(sc.next());
                    s4.useDelimiter(",");
                    while (s4.hasNext()) {
                        comentarios.add(s4.next());
                    }
                    productora=sc.next();
                    director=sc.next();
                    ArrayList<String> actores = new ArrayList();
                    Scanner s5 = new Scanner(sc.next());
                    s5.useDelimiter(",");
                    while (s5.hasNext()) {
                        comentarios.add(s5.next());
                    }
                    listaPersonas.add(new peliculas(id,nombre,categoria,idiomas,subtitulos,hora,rating,comentarios,productora,director,actores));
                    listaPersonas.get(listaPersonas.size() - 1).setIdiomas(idiomas);
                    listaPersonas.get(listaPersonas.size() - 1).setSubtitulos(subtitulos);
                    listaPersonas.get(listaPersonas.size() - 1).setComentarios(comentarios);
                    listaPersonas.get(listaPersonas.size() - 1).setActores(actores);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

}
