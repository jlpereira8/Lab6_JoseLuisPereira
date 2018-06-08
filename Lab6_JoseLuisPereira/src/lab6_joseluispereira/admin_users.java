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

    public admin_users() {
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
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (usuario t : listaPersonas) {
                bw.write(t. + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getEdad() + ";");
                
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
                    listaPersonas.add(new personas(sc.nextInt(), sc.next(), sc.nextInt()));
                    int c, e;
                    String n;
                    ArrayList<hobbie> temp = new ArrayList();
                    c = sc.nextInt();
                    n = sc.next();
                    Scanner s2 = new Scanner(sc.next());
                    s2.useDelimiter(",");
                    while (s2.hasNext()) {
                        temp.add(new hobbie(s2.nextInt(), s2.next()));
                    }//fin while
                    e = sc.nextInt();
                    listaPersonas.add(new personas(c, n, e));
                    listaPersonas.get(listaPersonas.size() - 1).setHobbies(temp);
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }
}
