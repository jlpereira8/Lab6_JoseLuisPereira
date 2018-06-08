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


public class admin_users {
    private ArrayList<usuario> listaPersonas = new ArrayList();
    private File archivo = null;

    public admin_users(String path) {
        archivo = new File(path);
    }

    public ArrayList<usuario> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<usuario> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

       
   
    public void setpersonas(usuario p) {
        this.listaPersonas.add(p);

    }

    public void escribirarchivo()
            throws IOException {
        //String correo, String contra, String fecha, ArrayList<String> peliculas, ArrayList<String> series_fav, int tarjeta
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (usuario t : listaPersonas) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getContra() + ";");
                bw.write(t.getFecha() + ";");
                bw.write(t.getPeliculas() + ";");
                bw.write(t.getSeries_fav() + ";");
                bw.write(t.getTarjeta() + ";");      
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
                    //String correo, String contra, String fecha, ArrayList<String> peliculas, ArrayList<String> series_fav, int tarjeta ;
                    String correo,contra,fecha,peliculas;
                    int tar;
                    correo=sc.next();
                    contra=sc.next();
                    fecha=sc.next();
                    ArrayList<String> pelix = new ArrayList();
                    ArrayList<String> series=new ArrayList();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");                    
                    while (s2.hasNext()) {
                        pelix.add(s2.next());
                    }
                    peliculas=sc.next();
                    Scanner scanner3 = new Scanner(sc.next());
                    scanner3.useDelimiter(",");
                    while (scanner3.hasNext()) {
                        series.add(scanner3.next());
                    }
                    tar=sc.nextInt();
                    listaPersonas.add(new usuario(correo, contra, fecha,pelix,series,tar));
                    listaPersonas.get(listaPersonas.size() - 1).setPeliculas(pelix);
                    listaPersonas.get(listaPersonas.size() - 1).setSeries_fav(series);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
    
}
