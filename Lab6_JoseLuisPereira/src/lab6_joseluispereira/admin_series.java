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

/**
 *
 * @author j0c3lwiz
 */
public class admin_series {

    private ArrayList<series> listaPersonas = new ArrayList();
    private File archivo = null;

    public admin_series(String path) {
        archivo = new File(path);
    }

    public ArrayList<series> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<series> listaPersonas) {
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
        return "admin_series{" + "listaPersonas=" + listaPersonas + '}';
    }

    public void setpersonas(series p) {
        this.listaPersonas.add(p);

    }

    public void escribirarchivo()
            throws IOException {
        //String id, String nombre, int num_temps, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos,
        //String duracion, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (series t : listaPersonas) {
                bw.write(t.getId() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getNum_temps() + ";");
                bw.write(t.getCategoria() + ";");
                bw.write(t.getIdiomas() + ";");
                bw.write(t.getSubtitulos() + ";");
                bw.write(t.getDuracion() + ";");
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
                    //String id, String nombre, int num_temps, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos,
                    //String duracion, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
                    String id, nombre;
                    int num_temps;
                    String categoria,duracion;
                    int rating;
                    String productora,director;
                    id=sc.next();
                    nombre=sc.next();
                    num_temps=sc.nextInt();
                    categoria=sc.next();
                    ArrayList<String> idiomas2 = new ArrayList();
                    ArrayList<String> subtitulos2 = new ArrayList();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        idiomas2.add(s2.next());
                    }
                    Scanner s3 = new Scanner(sc.next());
                    s3.useDelimiter(",");
                    while (s3.hasNext()) {
                        subtitulos2.add(s3.next());
                    }
                    duracion=sc.next();
                    rating=sc.nextInt();
                    ArrayList<String> comentarios = new ArrayList();
                    Scanner s4 = new Scanner(sc.next());
                    s4.useDelimiter(",");
                    while (s4.hasNext()) {
                        comentarios.add(s4.next());
                    }
                    productora = sc.next();
                    director = sc.next();
                    ArrayList<String> actores = new ArrayList();
                    Scanner s5 = new Scanner(sc.next());
                    s5.useDelimiter(",");
                    while (s5.hasNext()) {
                        comentarios.add(s5.next());
                    }
                    listaPersonas.add(new series(id, nombre,num_temps, categoria, idiomas2, subtitulos2, duracion, rating, comentarios, productora, director, actores));
                    listaPersonas.get(listaPersonas.size() - 1).setIdiomas(idiomas2);
                    listaPersonas.get(listaPersonas.size() - 1).setSubtitulos(subtitulos2);
                    listaPersonas.get(listaPersonas.size() - 1).setComentarios(comentarios);
                    listaPersonas.get(listaPersonas.size() - 1).setActores(actores);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

}
