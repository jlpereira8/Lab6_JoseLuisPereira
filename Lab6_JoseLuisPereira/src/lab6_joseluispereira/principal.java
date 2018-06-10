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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author j0c3lwiz
 */
public class principal extends javax.swing.JFrame {
    File archivo = null;
    int ents34;
     String r="";
        String fd="";
    ArrayList<String> pels22 ;
        ArrayList<String> series;
    ArrayList<peliculas> a_peliculas = new ArrayList();
    ArrayList<series> a_series = new ArrayList();
    ArrayList<String> subtitulos = new ArrayList();
    ArrayList<String> comentarios = new ArrayList();
    ArrayList<String> actores = new ArrayList();
    ArrayList<String> pels = new ArrayList();
    ArrayList<String> idiomas2 = new ArrayList();
    ArrayList<String> subtitulos2 = new ArrayList();
    ArrayList<String> comentarios2 = new ArrayList();
    ArrayList<String> actores2 = new ArrayList();
    ArrayList<String> idiomas = new ArrayList();
    int p;
    int p2;
    int pit;
    int cont=0;
   //  admin_users ap ; 

    /**
     * Creates new form principal
     */
    public principal() {
        initComponents();
        ArrayList<String> idiomas2 = new ArrayList();
        ArrayList<String> idiomas = new ArrayList();
        idiomas.add("español");
        idiomas.add("ingles");
        idiomas.add("portugues");
        idiomas2.add("italiano");
        idiomas2.add("aleman");
        idiomas2.add("español");
        //String id, String nombre, int num_temps, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String duracion, int rating, 
        //ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
        a_peliculas.add(new peliculas("112", "Rapido y Furioso", "Accion", idiomas, idiomas2, "1:20", 3, null, "V films", "HO Strutan", null));
        a_peliculas.add(new peliculas("144", "Anaconda", "Terror", idiomas2, idiomas, "1:50", 5, null, "aop films", "Tromasnsa", null));
        a_peliculas.add(new peliculas("982", "Duro de matar", "Accion", idiomas2, idiomas2, "1:43", 2, null, "Voila fils", "homensa", null));
        a_peliculas.add(new peliculas("043", "Deadpool", "Accion", idiomas, idiomas, "2:20", 5, null, "Sony", "Elver rod", null));
        a_peliculas.add(new peliculas("118", "X-men", "Accion", idiomas2, idiomas, "1:10", 4, null, "Ver films", "Strutan", null));
        a_peliculas.add(new peliculas("167", "Star Wars", "Fantasia", idiomas2, idiomas2, "3:20", 3, null, "OP lims", "Hutan", null));
        a_peliculas.add(new peliculas("124", "Batman", "Accion", idiomas2, idiomas, "2:20", 5, null, "Vamansa", "HO Strutan", null));
        a_peliculas.add(new peliculas("412", "Harry Potter", "Fantasia", idiomas, idiomas, "1:26", 3, null, "Verea films", "Hsan", null));
        a_peliculas.add(new peliculas("712", "Anastasia", "Romance", idiomas, idiomas, "1:20", 2, null, "Fre films", "oalbnsaan", null));
        a_peliculas.add(new peliculas("119", "Titanic", "Romance", idiomas2, idiomas2, "4:20", 3, null, "VR fils", "polaploadas", null));
        //
        a_series.add(new series("331", "Breaking Bad", 5, "Accion", idiomas, idiomas2, "1:00", 5, null, "Sony", "Jonhsa", null));
        a_series.add(new series("321", "Dark", 5, "Terror", idiomas2, idiomas2, "1:20", 3, null, "polas", "Strema", null));
        a_series.add(new series("341", "Flash", 3, "Fantasia", idiomas, idiomas, "1:00", 4, null, "Opals", "Ahsa", null));
        a_series.add(new series("353", "Grey's Anatomy", 5, "Romance", idiomas, idiomas2, "1:00", 5, null, "Sony", "Jonhsa", null));
        a_series.add(new series("392", "Nomadas", 5, "Accion", idiomas2, idiomas2, "1:20", 5, null, "Rony", "Panhsa", null));
        a_series.add(new series("731", "Vikingos", 5, "Accion", idiomas, idiomas2, "1:00", 5, null, "Sony", "Jonhsa", null));
        a_series.add(new series("391", "Stranger things", 3, "Fantasia", idiomas2, idiomas2, "1:00", 5, null, "Solassa", "JoPLoas", null));
        a_series.add(new series("951", "OC", 5, "Romance", idiomas, idiomas, "1:40", 4, null, "Panasonic", "Stemebsa", null));
        a_series.add(new series("561", "Outlander", 5, "Romance", idiomas, idiomas2, "1:00", 5, null, "Sony", "Jonhsa", null));
        a_series.add(new series("731", "Amityville", 5, "Terror", idiomas2, idiomas2, "1:31", 1, null, "Jolsa", "Persnhsa", null));

    }
    public void escribirarchivo()
            throws IOException {
        File archivo=null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        for (int i = 0; i < pel_favs.size(); i++) {
            r+=pel_favs.get(i)+",";
        }
        for (int i = 0; i < ser_favs.size(); i++) {
            fd+=ser_favs.get(i)+",";
        }
        try {
            archivo= new File("./info_usuarios.txt");
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (usuario t : lista) {
                bw.write(t.getCorreo() + ";");
                bw.write(t.getContra() + ";");
                bw.write(r);
                bw.write(fd);
                
            }
            
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
    public void mod_pelis(int e,ArrayList<String> v3,String categoria,ArrayList<String>v2,String director,String duracion,String id,ArrayList<String>v,String nombre,String productor,int t,ArrayList<String>v1 ){
        a_peliculas.get(e).setActores(v3);
        a_peliculas.get(e).setCategoria(categoria);
        a_peliculas.get(e).setComentarios(v2);
        a_peliculas.get(e).setDirector(director);
        a_peliculas.get(e).setHora(duracion);
        a_peliculas.get(e).setId(id);
        a_peliculas.get(e).setIdiomas(v);
        a_peliculas.get(e).setNombre(nombre);
        a_peliculas.get(e).setProductora(productor);
        a_peliculas.get(e).setRating(t);
        a_peliculas.get(e).setSubtitulos(v1);
    }
    public void mod_series(int e,ArrayList<String> v3,String categoria,ArrayList<String>v2,String director,String duracion,String id,ArrayList<String>v,String nombre,String productor,int t,int t2,ArrayList<String>v1 ){
        a_series.get(e).setActores(v3);
        a_series.get(e).setCategoria(categoria);
        a_series.get(e).setComentarios(v2);
        a_series.get(e).setDirector(director);       
        a_series.get(e).setId(id);
        a_series.get(e).setIdiomas(v);
        a_series.get(e).setNombre(nombre);
        a_series.get(e).setProductora(productor);
        a_series.get(e).setRating(t);
        a_series.get(e).setNum_temps(t2);
        a_series.get(e).setSubtitulos(v1);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrar = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        re_correo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        re_contra = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        re_fecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        re_pelix = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        re_series = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        re_tarjeta = new javax.swing.JTextField();
        re_guardar = new javax.swing.JButton();
        admin_peliculas = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pe_id = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pe_nombre = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        pe_categoria = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pe_idiomas = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pe_subt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        pe_duracion = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        pe_rating = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        pe_comments = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pe_productor = new javax.swing.JTextField();
        pe_director = new javax.swing.JTextField();
        pe_actores = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        seriesera = new javax.swing.JDialog();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        se_id = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        se_nombre = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        se_categora = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        se_idiomas = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        se_subs = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        se_duracion = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        se_rating = new javax.swing.JSpinner();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        se_actores1 = new javax.swing.JTextField();
        se_director1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        se_productor1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        se_comments1 = new javax.swing.JTextField();
        bt_enviar_series = new javax.swing.JButton();
        adminbb = new javax.swing.JDialog();
        Listar = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        peliculas_olabb = new javax.swing.JButton();
        series_olabb = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        mod_lista = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        mod_lista2 = new javax.swing.JList<>();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ta_eliminar = new javax.swing.JList<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        ta_eliminar2 = new javax.swing.JList<>();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        ta_va2 = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_va1 = new javax.swing.JList<>();
        principal = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_peliculas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_series = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jt_favs = new javax.swing.JTree();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        mod_peliculas = new javax.swing.JDialog();
        jLabel52 = new javax.swing.JLabel();
        pe_id1 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        pe_nombre1 = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        pe_categoria1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        pe_idiomas1 = new javax.swing.JTextField();
        pe_subt1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        pe_duracion1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        pe_rating1 = new javax.swing.JSpinner();
        pe_comments1 = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        pe_productor1 = new javax.swing.JTextField();
        pe_director1 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        pe_actores1 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        mod_series = new javax.swing.JDialog();
        se_actores2 = new javax.swing.JTextField();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        se_director2 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        se_productor2 = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        se_comments2 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        se_rating1 = new javax.swing.JSpinner();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        se_duracion1 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        se_subs1 = new javax.swing.JTextField();
        se_idiomas1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        se_categora1 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        num_temps = new javax.swing.JSpinner();
        jLabel79 = new javax.swing.JLabel();
        se_nombre1 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        se_id1 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        is_correo = new javax.swing.JTextField();
        is_contra = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel6.setText("Registro");

        jLabel7.setText("Correo");

        jLabel8.setText("Contraseña");

        jLabel9.setText("Fecha de nacimiento");

        jLabel10.setText("Ingrese su lista de");

        jLabel11.setText("peliculas utilizando \" , \"");

        jLabel12.setText("Ingrese su lista de");

        jLabel13.setText("series utilizando \" , \"");

        jLabel14.setText("Tarjeta de Credito");

        re_guardar.setText("Guardar");
        re_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                re_guardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout registrarLayout = new javax.swing.GroupLayout(registrar.getContentPane());
        registrar.getContentPane().setLayout(registrarLayout);
        registrarLayout.setHorizontalGroup(
            registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarLayout.createSequentialGroup()
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel7)
                        .addGap(42, 42, 42)
                        .addComponent(re_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(re_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel9)
                        .addGap(5, 5, 5)
                        .addComponent(re_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registrarLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)))
                            .addGroup(registrarLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel14)))
                        .addGap(18, 18, 18)
                        .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(re_pelix)
                            .addComponent(re_series)
                            .addComponent(re_tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(re_guardar)))
                .addGap(101, 101, 101))
        );
        registrarLayout.setVerticalGroup(
            registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7))
                    .addComponent(re_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addComponent(re_contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel9))
                    .addComponent(re_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(re_pelix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registrarLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarLayout.createSequentialGroup()
                        .addComponent(re_series, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(re_tarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(re_guardar)
                .addGap(33, 33, 33))
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel15.setText("Peliculas");

        jLabel16.setText("ID");

        jLabel17.setText("Nombre");

        jLabel18.setText("Categoria");

        jLabel19.setText("Idiomas disponibles");

        jLabel20.setText("utilizando \",\"");

        jLabel21.setText("Subtitulos disponibles");

        jLabel22.setText("utilizando \",\"");

        jLabel23.setText("Duracion");

        jLabel24.setText("Rating");

        pe_rating.setModel(new javax.swing.SpinnerNumberModel(2, 0, 5, 1));

        jLabel25.setText("Añadir comentarios");

        jLabel26.setText("Productor");

        jLabel27.setText("Director");

        jLabel28.setText("Lista de actores");

        jLabel29.setText("utilizando \",\"");

        jButton2.setText("Guardar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout admin_peliculasLayout = new javax.swing.GroupLayout(admin_peliculas.getContentPane());
        admin_peliculas.getContentPane().setLayout(admin_peliculasLayout);
        admin_peliculasLayout.setHorizontalGroup(
            admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_peliculasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pe_director, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pe_comments, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pe_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(32, 32, 32)
                        .addComponent(pe_id, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel15)
                        .addGroup(admin_peliculasLayout.createSequentialGroup()
                            .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(pe_idiomas)
                                .addComponent(pe_categoria)
                                .addComponent(pe_subt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))))
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pe_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pe_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(admin_peliculasLayout.createSequentialGroup()
                            .addComponent(jLabel26)
                            .addGap(18, 18, 18)
                            .addComponent(pe_productor, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, admin_peliculasLayout.createSequentialGroup()
                            .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(pe_actores)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        admin_peliculasLayout.setVerticalGroup(
            admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(admin_peliculasLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15)
                .addGap(44, 44, 44)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pe_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pe_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(pe_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(pe_idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(pe_subt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(pe_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(pe_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(pe_comments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(pe_productor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(pe_director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(admin_peliculasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(admin_peliculasLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addComponent(pe_actores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32))
        );

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel30.setText("Series");

        jLabel31.setText("ID");

        jLabel32.setText("Nombre");

        jLabel33.setText("Numero de temporadas");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel34.setText("Categoria");

        jLabel35.setText("Lista de idiomas");

        jLabel36.setText("utilizando \",\"");

        jLabel37.setText("utilizando \",\"");

        jLabel38.setText("Lista de subtitulos");

        jLabel39.setText("Duracion de series");

        jLabel40.setText("Rating");

        se_rating.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel41.setText("Lista de actores");

        jLabel42.setText("utilizando \",\"");

        jLabel43.setText("Director");

        jLabel44.setText("Productor");

        jLabel45.setText("Añadir comentarios");

        bt_enviar_series.setText("Enviar");
        bt_enviar_series.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviar_seriesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout serieseraLayout = new javax.swing.GroupLayout(seriesera.getContentPane());
        seriesera.getContentPane().setLayout(serieseraLayout);
        serieseraLayout.setHorizontalGroup(
            serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serieseraLayout.createSequentialGroup()
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serieseraLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(serieseraLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(serieseraLayout.createSequentialGroup()
                                .addComponent(jLabel40)
                                .addGap(18, 18, 18)
                                .addComponent(se_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel39)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(se_duracion))
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel32)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(se_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(18, 18, 18)
                                    .addComponent(se_id, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel33)
                                    .addGap(18, 18, 18)
                                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel34)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(se_categora, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel35)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(se_idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel36)
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel38)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(se_subs))
                                .addComponent(jLabel37))
                            .addGroup(serieseraLayout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(se_director1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(serieseraLayout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(se_comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(serieseraLayout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addGap(18, 18, 18)
                                    .addComponent(se_productor1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, serieseraLayout.createSequentialGroup()
                                    .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel42, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bt_enviar_series)
                                        .addComponent(se_actores1)))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        serieseraLayout.setVerticalGroup(
            serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serieseraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(se_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(se_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(se_categora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(se_idiomas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(se_subs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(se_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(se_rating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(se_comments1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(se_productor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(se_director1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(serieseraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(serieseraLayout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addComponent(se_actores1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_enviar_series)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel46.setText("Agregar Peliculas");

        jLabel47.setText("Agregar Series");

        peliculas_olabb.setText("Peliculas");
        peliculas_olabb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peliculas_olabbMouseClicked(evt);
            }
        });

        series_olabb.setText("Series");
        series_olabb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                series_olabbMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(peliculas_olabb)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(series_olabb)
                        .addGap(19, 19, 19)))
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peliculas_olabb)
                    .addComponent(series_olabb))
                .addContainerGap(322, Short.MAX_VALUE))
        );

        Listar.addTab("Agregar", jPanel1);

        jLabel50.setText("Modificar Peliculas");

        jLabel51.setText("Modificar Series");

        mod_lista.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(mod_lista);

        mod_lista2.setModel(new DefaultListModel());
        jScrollPane9.setViewportView(mod_lista2);

        jButton10.setText("Modificar Peliculas");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton11.setText("Modificar Series");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        jButton12.setText("Actualizar");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton11)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(jButton12)
                        .addGap(86, 86, 86)
                        .addComponent(jLabel51)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jButton12))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addContainerGap(79, Short.MAX_VALUE))
        );

        Listar.addTab("Modificar", jPanel3);

        ta_eliminar.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(ta_eliminar);

        ta_eliminar2.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(ta_eliminar2);

        jButton7.setText("Eliminar Series");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton8.setText("Eliminar Peliculas ");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        jButton9.setText("Actualizar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jButton9))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton7)
                        .addGap(48, 48, 48)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton9)
                .addGap(5, 5, 5)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton7))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        Listar.addTab("Eliminar", jPanel4);

        jButton3.setText("Listar Peliculas");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Listar Series");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        ta_va2.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(ta_va2);

        ta_va1.setModel(new DefaultListModel());
        jScrollPane1.setViewportView(ta_va1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(94, 94, 94))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(32, 32, 32))
        );

        Listar.addTab("Listar", jPanel2);

        javax.swing.GroupLayout adminbbLayout = new javax.swing.GroupLayout(adminbb.getContentPane());
        adminbb.getContentPane().setLayout(adminbbLayout);
        adminbbLayout.setHorizontalGroup(
            adminbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminbbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Listar)
                .addContainerGap())
        );
        adminbbLayout.setVerticalGroup(
            adminbbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminbbLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Listar, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_peliculas.setModel(new DefaultListModel());
        jScrollPane3.setViewportView(jl_peliculas);

        jl_series.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_series);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Favoritos");
        jt_favs.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane5.setViewportView(jt_favs);

        jLabel48.setText("Peliculas");

        jLabel49.setText("Series");

        jButton5.setText("Enviar a Favoritos");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        jButton6.setText("Enviar a Favoritos");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton15.setText("txt");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal.getContentPane());
        principal.getContentPane().setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(165, 165, 165))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton15)
                .addGap(66, 66, 66)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(46, 46, 46)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addGap(33, 33, 33))
        );

        mod_peliculas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setText("ID");
        mod_peliculas.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 118, -1, -1));
        mod_peliculas.getContentPane().add(pe_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 115, 140, -1));

        jLabel53.setText("Nombre");
        mod_peliculas.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 158, -1, -1));
        mod_peliculas.getContentPane().add(pe_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 155, 144, -1));

        jLabel54.setText("Categoria");
        mod_peliculas.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 123, -1));
        mod_peliculas.getContentPane().add(pe_categoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 173, -1));

        jLabel55.setText("Idiomas disponibles");
        mod_peliculas.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 123, -1));

        jLabel56.setText("utilizando \",\"");
        mod_peliculas.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 123, -1));
        mod_peliculas.getContentPane().add(pe_idiomas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 173, -1));
        mod_peliculas.getContentPane().add(pe_subt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 173, -1));

        jLabel57.setText("Subtitulos disponibles");
        mod_peliculas.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jLabel58.setText("utilizando \",\"");
        mod_peliculas.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 123, -1));
        mod_peliculas.getContentPane().add(pe_duracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 351, 169, -1));

        jLabel59.setText("Duracion");
        mod_peliculas.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 354, -1, -1));

        jLabel60.setText("Rating");
        mod_peliculas.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 394, -1, -1));

        pe_rating1.setModel(new javax.swing.SpinnerNumberModel(2, 0, 5, 1));
        mod_peliculas.getContentPane().add(pe_rating1, new org.netbeans.lib.awtextra.AbsoluteConstraints(108, 391, -1, -1));
        mod_peliculas.getContentPane().add(pe_comments1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 431, 203, -1));

        jLabel61.setText("Añadir comentarios");
        mod_peliculas.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 434, -1, -1));

        jLabel62.setText("Productor");
        mod_peliculas.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 474, -1, -1));
        mod_peliculas.getContentPane().add(pe_productor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 471, 208, -1));
        mod_peliculas.getContentPane().add(pe_director1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 511, 205, -1));

        jLabel63.setText("Director");
        mod_peliculas.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 514, -1, -1));

        jLabel64.setText("Lista de actores");
        mod_peliculas.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 551, 123, -1));

        jLabel65.setText("utilizando \",\"");
        mod_peliculas.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 574, 123, -1));
        mod_peliculas.getContentPane().add(pe_actores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 551, 153, -1));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel66.setText("Modificar Peliculas");
        mod_peliculas.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 13, -1, -1));

        jButton13.setText("Guardar cambios");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        mod_peliculas.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 630, -1, -1));

        jLabel67.setText("utilizando \",\"");

        jLabel68.setText("Lista de actores");

        jLabel69.setText("Director");

        jLabel70.setText("Productor");

        jLabel71.setText("Añadir comentarios");

        se_rating1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 5, 1));

        jLabel72.setText("Rating");

        jLabel73.setText("Duracion de series");

        jLabel74.setText("utilizando \",\"");

        jLabel75.setText("Lista de subtitulos");

        jLabel76.setText("Lista de idiomas");

        jLabel77.setText("utilizando \",\"");

        jLabel78.setText("Categoria");

        num_temps.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel79.setText("Numero de temporadas");

        jLabel80.setText("Nombre");

        jLabel81.setText("ID");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel82.setText("Modificar Series");

        jButton14.setText("Guardar cambios");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mod_seriesLayout = new javax.swing.GroupLayout(mod_series.getContentPane());
        mod_series.getContentPane().setLayout(mod_seriesLayout);
        mod_seriesLayout.setHorizontalGroup(
            mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mod_seriesLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mod_seriesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(169, 169, 169))
            .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mod_seriesLayout.createSequentialGroup()
                    .addGap(75, 75, 75)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mod_seriesLayout.createSequentialGroup()
                            .addComponent(jLabel72)
                            .addGap(18, 18, 18)
                            .addComponent(se_rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel73)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(se_duracion1))
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(se_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(18, 18, 18)
                                .addComponent(se_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel79)
                                .addGap(18, 18, 18)
                                .addComponent(num_temps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(se_categora1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(se_idiomas1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel77)
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel75)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(se_subs1))
                            .addComponent(jLabel74))
                        .addGroup(mod_seriesLayout.createSequentialGroup()
                            .addComponent(jLabel69)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(se_director2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mod_seriesLayout.createSequentialGroup()
                            .addComponent(jLabel71)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(se_comments2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mod_seriesLayout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addGap(18, 18, 18)
                                .addComponent(se_productor2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mod_seriesLayout.createSequentialGroup()
                                .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(se_actores2))))
                    .addContainerGap(76, Short.MAX_VALUE)))
        );
        mod_seriesLayout.setVerticalGroup(
            mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mod_seriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 595, Short.MAX_VALUE)
                .addComponent(jButton14)
                .addGap(23, 23, 23))
            .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mod_seriesLayout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel81)
                        .addComponent(se_id1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel80)
                        .addComponent(se_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel79)
                        .addComponent(num_temps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(se_categora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel76)
                        .addComponent(se_idiomas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel77)
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel75)
                        .addComponent(se_subs1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel74)
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(se_duracion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(se_rating1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel71)
                        .addComponent(se_comments2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel70)
                        .addComponent(se_productor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel69)
                        .addComponent(se_director2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(mod_seriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mod_seriesLayout.createSequentialGroup()
                            .addComponent(jLabel68)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel67))
                        .addComponent(se_actores2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(89, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Correo ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel3.setText("Iniciar Sesion");

        jButton1.setText("Entrar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel4.setText("No tienes cuenta?");

        jLabel5.setText("Haz click aqui");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(is_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                    .addComponent(is_contra))
                                .addGap(28, 28, 28))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel3)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(is_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(is_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        registrar.setModal(true);//para solo poder a acceder a una ventana
        registrar.pack();
        registrar.setLocationRelativeTo(this);//centra con el frame principal
        registrar.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void re_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_re_guardarMouseClicked
        //String correo, String contra, String fecha, ArrayList<String> peliculas, ArrayList<String> series_fav, int tarjeta

        /*admin_users ap = new admin_users("./Usuarios.txt");
        
        usuario p = new usuario(re_correo.getText(), re_contra.getText(), re_fecha.getText(), pels, series, ents);
        ap.cargarArchivo();
        ap.setpersonas(p);
        try {
            ap.escribirarchivo();
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        //String correo, String contra, String fecha, ArrayList<String> peliculas, ArrayList<String> series_fav, int tarjeta
        String correo, contra, fecha, peliculas, series_fav;
        int tarj;
        int aux = 1;
        for (usuario u : lista) {
            if (re_correo.getText().equals(u.getCorreo())) {
                aux = 0;
            }
        }
        if (re_correo.getText().equals("admin")) {
            aux = 0;
        }
        if (aux == 1) {
        pels22 = new ArrayList();
        series = new ArrayList();
        String tokens[] = re_pelix.getText().split(",");
        String tokens2[] = re_series.getText().split(",");
        ents34 = Integer.valueOf(re_tarjeta.getText());
        for (int i = 0; i < tokens.length; i++) {
            pels.add(tokens[i]);
        }
        for (int i = 0; i < tokens2.length; i++) {
            series.add(tokens2[i]);
        }
            lista.add(new usuario(re_correo.getText(), re_contra.getText(), re_fecha.getText(), pels, series, ents34));
            JOptionPane.showMessageDialog(this, "El usuario se registro correctamente");
            cont++;
            re_correo.setText("");
            re_contra.setText("");
            re_fecha.setText("");
            re_pelix.setText("");
            re_series.setText("");
            re_tarjeta.setText("");
            //ap.setpersonas(new usuario(re_correo.getText(), re_contra.getText(), re_fecha.getText(), pels, series, ents));
            registrar.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El usuario ya esta registrado");
        }


    }//GEN-LAST:event_re_guardarMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
// String id, String nombre, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String hora, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores)

        if (is_correo.getText().equals("admin") && is_contra.getText().equals("admin")) {
            adminbb.setModal(true);//para solo poder a acceder a una ventana
            adminbb.pack();
            adminbb.setLocationRelativeTo(this);//centra con el frame principal
            adminbb.setVisible(true);
        } else {
            String cor = is_correo.getText();
            String contra = is_contra.getText();
            for (usuario u : lista) {
                if (cor.equals(u.getCorreo()) && contra.equals(u.getContra())) {
                    principal.setModal(true);
                    principal.pack();
                    principal.setLocationRelativeTo(this);
                    principal.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario y/o contrasena no son correctos");
                }
            }
        }
        DefaultListModel modelo = (DefaultListModel) jl_peliculas.getModel();
        for (int i = 0; i < a_peliculas.size(); i++) {
            modelo.addElement(a_peliculas.get(i));
        }
        DefaultListModel modelo2 = (DefaultListModel) jl_series.getModel();
        for (int i2 = 0; i2 < a_series.size(); i2++) {
            modelo2.addElement(a_series.get(i2));
        }
        jl_peliculas.setModel(modelo2);
        jl_peliculas.setModel(modelo);

    }//GEN-LAST:event_jButton1MouseClicked

    private void bt_enviar_seriesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviar_seriesMouseClicked
        //String id, String nombre, int num_temps, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos,
        //String duracion, int rating, ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
        int aux = 1;
        for (series s : a_series) {
            if (pe_id.getText().equals(s.getId())) {
                aux = 0;
            }
        }
        if (aux == 1) {
            subtitulos = new ArrayList();
            comentarios = new ArrayList();
            actores = new ArrayList();
            String tokens[] = se_idiomas.getText().split(",");
            String tokens2[] = se_subs.getText().split(",");
            String tokens3[] = se_comments1.getText().split(",");
            String tokens4[] = se_actores1.getText().split(",");
            p2 = (Integer) se_rating.getValue();
            pit = (Integer) jSpinner2.getValue();
            // String olabb = Integer.toString(p);
//        Integer ents = Integer.valueOf(re_tarjeta.getText());
            for (int i = 0; i < tokens.length; i++) {
                idiomas.add(tokens[i]);
            }
            for (int i = 0; i < tokens2.length; i++) {
                subtitulos.add(tokens2[i]);
            }
            for (int i = 0; i < tokens3.length; i++) {
                comentarios.add(tokens3[i]);
            }
            for (int i = 0; i < tokens4.length; i++) {
                actores.add(tokens4[i]);
            }
            a_series.add(new series(se_id.getText(), se_nombre.getText(), pit, se_categora.getText(), idiomas, subtitulos, se_duracion.getText(), p, comentarios, se_productor1.getText(), se_director1.getText(), actores));
            JOptionPane.showMessageDialog(this, "La series se registro correctamente");
            se_actores1.setText("");
            se_categora.setText("");
            se_comments1.setText("");
            se_director1.setText("");
            se_duracion.setText("");
            se_id.setText("");
            se_idiomas.setText("");
            se_nombre.setText("");
            se_productor1.setText("");
            se_subs.setText("");
            seriesera.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: La serie ya esta registrada");
        }


    }//GEN-LAST:event_bt_enviar_seriesMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        //String id, String nombre, String categoria, ArrayList<String> idiomas, ArrayList<String> subtitulos, String hora, int rating, 
        //ArrayList<String> comentarios, String productora, String director, ArrayList<String> actores
        int tarj;
        int aux = 1;
        for (peliculas p : a_peliculas) {
            if (pe_id.getText().equals(p.getId())) {
                aux = 0;
            }
        }
        if (aux == 1) {
            String tokens[] = pe_idiomas.getText().split(",");
            String tokens2[] = pe_subt.getText().split(",");
            String tokens3[] = pe_comments.getText().split(",");
            String tokens4[] = pe_actores.getText().split(",");
            p = (Integer) pe_rating.getValue();
            //int pit=(Integer)jSpinner2.getValue();
            // String olabb = Integer.toString(p);
//        Integer ents = Integer.valueOf(re_tarjeta.getText());
            for (int i = 0; i < tokens.length; i++) {
                idiomas2.add(tokens[i]);
            }
            for (int i = 0; i < tokens2.length; i++) {
                subtitulos2.add(tokens2[i]);
            }
            for (int i = 0; i < tokens3.length; i++) {
                comentarios2.add(tokens3[i]);
            }
            for (int i = 0; i < tokens4.length; i++) {
                actores2.add(tokens4[i]);
            }
            a_peliculas.add(new peliculas(pe_id.getText(), pe_nombre.getText(), pe_categoria.getText(), idiomas2, subtitulos2, pe_duracion.getText(), p, comentarios2, pe_productor.getText(), pe_director.getText(), actores2));
            JOptionPane.showMessageDialog(this, "La peliculas se registro correctamente");
            pe_actores.setText("");
            pe_categoria.setText("");
            pe_comments.setText("");
            pe_director.setText("");
            pe_duracion.setText("");
            pe_id.setText("");
            pe_idiomas.setText("");
            pe_nombre.setText("");
            pe_productor.setText("");
            pe_subt.setText("");
            admin_peliculas.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "ERROR: La pelicula YA esta registrada");
        }


    }//GEN-LAST:event_jButton2MouseClicked

    private void peliculas_olabbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peliculas_olabbMouseClicked
        // TODO add your handling code here:

        admin_peliculas.setModal(true);//para solo poder a acceder a una ventana
        admin_peliculas.pack();
        admin_peliculas.setLocationRelativeTo(this);//centra con el frame principal
        admin_peliculas.setVisible(true);
    }//GEN-LAST:event_peliculas_olabbMouseClicked

    private void series_olabbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_series_olabbMouseClicked
        // TODO add your handling code here:
        seriesera.setModal(true);//para solo poder a acceder a una ventana
        seriesera.pack();
        seriesera.setLocationRelativeTo(this);//centra con el frame principal
        seriesera.setVisible(true);
    }//GEN-LAST:event_series_olabbMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) ta_va1.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < a_peliculas.size(); i++) {
            modelo.addElement(a_peliculas.get(i));
        }
        ta_va1.setModel(modelo);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if (jl_peliculas.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL1 = (DefaultTreeModel) jt_favs.getModel();
            DefaultMutableTreeNode raiz1 = (DefaultMutableTreeNode) modeloARBOL1.getRoot();
            DefaultListModel modeloLISTA2 = (DefaultListModel) jl_peliculas.getModel();
            String categoria;
            String ID;
            String nombre;
            categoria = ((peliculas) modeloLISTA2.getElementAt(jl_peliculas.getSelectedIndex())).getCategoria();
            ID = ((peliculas) modeloLISTA2.getElementAt(jl_peliculas.getSelectedIndex())).getId();
            nombre = ((peliculas) modeloLISTA2.getElementAt(jl_peliculas.getSelectedIndex())).getNombre();
            int centinela = -1;
            for (int i = 0; i < raiz1.getChildCount(); i++) {
                if (raiz1.getChildAt(i).toString().equals(categoria)) {
                    pel_favs.add(raiz1.getChildAt(i).toString());
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(
                            new peliculas(ID, nombre, categoria));
                    ((DefaultMutableTreeNode) raiz1.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }
            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(categoria);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new peliculas(ID, nombre, categoria));
                n.add(p);
                raiz1.add(n);
            }
            modeloARBOL1.reload();
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas seleccionadas");
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        if (jl_series.getSelectedIndex() >= 0) {
            DefaultTreeModel modeloARBOL2 = (DefaultTreeModel) jt_favs.getModel();
            DefaultMutableTreeNode raiz2 = (DefaultMutableTreeNode) modeloARBOL2.getRoot();
            DefaultListModel modeloLISTA2 = (DefaultListModel) jl_series.getModel();
            String categoria;
            String ID;
            String nombre;
            categoria = ((series) modeloLISTA2.getElementAt(jl_series.getSelectedIndex())).getCategoria();
            ID = ((series) modeloLISTA2.getElementAt(jl_series.getSelectedIndex())).getId();
            nombre = ((series) modeloLISTA2.getElementAt(jl_series.getSelectedIndex())).getNombre();
            int centinela = -1;
            for (int i = 0; i < raiz2.getChildCount(); i++) {
                if (raiz2.getChildAt(i).toString().equals(categoria)) {
                    ser_favs.add(raiz2.getChildAt(i).toString());
                    DefaultMutableTreeNode p = new DefaultMutableTreeNode(
                            new series(ID, nombre, categoria));
                    ((DefaultMutableTreeNode) raiz2.getChildAt(i)).add(p);
                    centinela = 1;
                }
            }
            if (centinela == -1) {
                DefaultMutableTreeNode n = new DefaultMutableTreeNode(categoria);
                DefaultMutableTreeNode p = new DefaultMutableTreeNode(new series(ID, nombre, categoria));
                n.add(p);
                raiz2.add(p);
            }
            modeloARBOL2.reload();
            //System.out.println(ser_favs);
        } else {
            JOptionPane.showMessageDialog(this, "No hay personas seleccionadas");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

        DefaultListModel modelo = (DefaultListModel) ta_va2.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < a_series.size(); i++) {
            modelo.addElement(a_series.get(i));
        }
        ta_va2.setModel(modelo);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:

        DefaultListModel mod = (DefaultListModel) ta_eliminar.getModel();
        String bb = JOptionPane.showInputDialog(this, "Ingrese la posicion que desea eliminar ");
        int en = Integer.parseInt(bb);
        a_peliculas.remove(en);
        mod.remove(en);


    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        DefaultListModel modelo = (DefaultListModel) ta_eliminar.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < a_peliculas.size(); i++) {
            modelo.addElement(a_peliculas.get(i));
        }
        DefaultListModel modelo2 = (DefaultListModel) ta_eliminar2.getModel();
        modelo2.removeAllElements();
        for (int i2 = 0; i2 < a_series.size(); i2++) {
            modelo2.addElement(a_series.get(i2));
        }
        ta_eliminar.setModel(modelo);
        ta_eliminar2.setModel(modelo2);
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        DefaultListModel mod = (DefaultListModel) ta_eliminar2.getModel();
        String bb2 = JOptionPane.showInputDialog(this, "Ingrese la posicion que desea eliminar ");
        int en2 = Integer.parseInt(bb2);
        a_series.remove(en2);
        mod.remove(en2);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        // TODO add your handling code here:
        DefaultListModel mod = (DefaultListModel) mod_lista.getModel();
        String b = JOptionPane.showInputDialog(this, "Ingrese la posicion que desea modificar ");
        int e = Integer.parseInt(b);
        mod_peliculas.setModal(true);//para solo poder a acceder a una ventana
        mod_peliculas.pack();
        mod_peliculas.setLocationRelativeTo(this);//centra con el frame principal
        mod_peliculas.setVisible(true);
        String actores = pe_actores1.getText();
        String categoria = pe_categoria1.getText();
        String comemnts = pe_comments1.getText();
        String director = pe_director1.getText();
        String duracion = pe_duracion1.getText();
        String id = pe_id1.getText();
        String idiomas = pe_idiomas1.getText();
        String nombre = pe_nombre1.getText();
        String productor = pe_productor1.getText();
        int t = (int) pe_rating1.getValue();
        String subtitulos = pe_subt1.getText();
        String tokens[] = idiomas.split(",");
        String tokens2[] = subtitulos.split(",");
        String tokens3[] = comemnts.split(",");
        String tokens4[] = actores.split(",");
        //int pit=(Integer)jSpinner2.getValue();
        // String olabb = Integer.toString(p);
//        Integer ents = Integer.valueOf(re_tarjeta.getText());
        ArrayList<String> v = new ArrayList();
        ArrayList<String> v1 = new ArrayList();
        ArrayList<String> v2 = new ArrayList();
        ArrayList<String> v3 = new ArrayList();
        for (int i = 0; i < tokens.length; i++) {
            v.add(tokens[i]);
        }
        for (int i = 0; i < tokens2.length; i++) {
            v1.add(tokens2[i]);
        }
        for (int i = 0; i < tokens3.length; i++) {
            v2.add(tokens3[i]);
        }
        for (int i = 0; i < tokens4.length; i++) {
            v3.add(tokens4[i]);
        }
        mod_pelis(e,v3, categoria,v2,director, duracion, id,v,nombre,productor, t,v1 );

    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
      //JOptionPane.showMessageDialog(this, "La pelicula se modifico correctamente");
       mod_peliculas.dispose();
       
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        // AKI PRRO mmmmmmmmmmmmmmmmmmmmm
         DefaultListModel modelo = (DefaultListModel) mod_lista.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < a_peliculas.size(); i++) {
            modelo.addElement(a_peliculas.get(i));
        }
        DefaultListModel modelo2 = (DefaultListModel) mod_lista2.getModel();
        modelo2.removeAllElements();
        for (int i2 = 0; i2 < a_series.size(); i2++) {
            modelo2.addElement(a_series.get(i2));
        }
        ta_eliminar.setModel(modelo);
        ta_eliminar2.setModel(modelo2);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        //MODIFICAR poooosaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
        
        DefaultListModel mod = (DefaultListModel) mod_lista2.getModel();
        String b = JOptionPane.showInputDialog(this, "Ingrese la posicion que desea modificar ");
        int e = Integer.parseInt(b);
        mod_series.setModal(true);//para solo poder a acceder a una ventana
        mod_series.pack();
        mod_series.setLocationRelativeTo(this);//centra con el frame principal
        mod_series.setVisible(true);
        String actores = se_actores2.getText();
        String categoria = se_categora1.getText();
        String comemnts = se_comments2.getText();
        String director = se_director2.getText();
        String duracion = se_duracion1.getText();
        String id = se_id1.getText();
        String idiomas = se_idiomas1.getText();
        String nombre = se_nombre1.getText();
        String productor = pe_productor1.getText();
        int t = (int) se_rating1.getValue();
        int t2 = (int) num_temps.getValue();
        String subtitulos = se_subs1.getText();
        String tokens[] = idiomas.split(",");
        String tokens2[] = subtitulos.split(",");
        String tokens3[] = comemnts.split(",");
        String tokens4[] = actores.split(",");
        //int pit=(Integer)jSpinner2.getValue();
        // String olabb = Integer.toString(p);
//        Integer ents = Integer.valueOf(re_tarjeta.getText());
        ArrayList<String> v = new ArrayList();
        ArrayList<String> v1 = new ArrayList();
        ArrayList<String> v2 = new ArrayList();
        ArrayList<String> v3 = new ArrayList();
        for (int i = 0; i < tokens.length; i++) {
            v.add(tokens[i]);
        }
        for (int i = 0; i < tokens2.length; i++) {
            v1.add(tokens2[i]);
        }
        for (int i = 0; i < tokens3.length; i++) {
            v2.add(tokens3[i]);
        }
        for (int i = 0; i < tokens4.length; i++) {
            v3.add(tokens4[i]);
        }
        mod_series(e,v3, categoria,v2,director, duracion, id,v,nombre,productor, t,t2,v1 );
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
       //JOptionPane.showMessageDialog(this, "La serie se modifico correctamente");
       mod_series.dispose();
    }//GEN-LAST:event_jButton14MouseClicked

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        System.out.println(r);
        try {
            // TODO add your handling code here:
            escribirarchivo();
        } catch (IOException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton15MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Listar;
    private javax.swing.JDialog admin_peliculas;
    private javax.swing.JDialog adminbb;
    private javax.swing.JButton bt_enviar_series;
    private javax.swing.JTextField is_contra;
    private javax.swing.JTextField is_correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JList<String> jl_peliculas;
    private javax.swing.JList<String> jl_series;
    private javax.swing.JTree jt_favs;
    private javax.swing.JList<String> mod_lista;
    private javax.swing.JList<String> mod_lista2;
    private javax.swing.JDialog mod_peliculas;
    private javax.swing.JDialog mod_series;
    private javax.swing.JSpinner num_temps;
    private javax.swing.JTextField pe_actores;
    private javax.swing.JTextField pe_actores1;
    private javax.swing.JTextField pe_categoria;
    private javax.swing.JTextField pe_categoria1;
    private javax.swing.JTextField pe_comments;
    private javax.swing.JTextField pe_comments1;
    private javax.swing.JTextField pe_director;
    private javax.swing.JTextField pe_director1;
    private javax.swing.JTextField pe_duracion;
    private javax.swing.JTextField pe_duracion1;
    private javax.swing.JTextField pe_id;
    private javax.swing.JTextField pe_id1;
    private javax.swing.JTextField pe_idiomas;
    private javax.swing.JTextField pe_idiomas1;
    private javax.swing.JTextField pe_nombre;
    private javax.swing.JTextField pe_nombre1;
    private javax.swing.JTextField pe_productor;
    private javax.swing.JTextField pe_productor1;
    private javax.swing.JSpinner pe_rating;
    private javax.swing.JSpinner pe_rating1;
    private javax.swing.JTextField pe_subt;
    private javax.swing.JTextField pe_subt1;
    private javax.swing.JButton peliculas_olabb;
    private javax.swing.JDialog principal;
    private javax.swing.JTextField re_contra;
    private javax.swing.JTextField re_correo;
    private javax.swing.JTextField re_fecha;
    private javax.swing.JButton re_guardar;
    private javax.swing.JTextField re_pelix;
    private javax.swing.JTextField re_series;
    private javax.swing.JTextField re_tarjeta;
    private javax.swing.JDialog registrar;
    private javax.swing.JTextField se_actores1;
    private javax.swing.JTextField se_actores2;
    private javax.swing.JTextField se_categora;
    private javax.swing.JTextField se_categora1;
    private javax.swing.JTextField se_comments1;
    private javax.swing.JTextField se_comments2;
    private javax.swing.JTextField se_director1;
    private javax.swing.JTextField se_director2;
    private javax.swing.JTextField se_duracion;
    private javax.swing.JTextField se_duracion1;
    private javax.swing.JTextField se_id;
    private javax.swing.JTextField se_id1;
    private javax.swing.JTextField se_idiomas;
    private javax.swing.JTextField se_idiomas1;
    private javax.swing.JTextField se_nombre;
    private javax.swing.JTextField se_nombre1;
    private javax.swing.JTextField se_productor1;
    private javax.swing.JTextField se_productor2;
    private javax.swing.JSpinner se_rating;
    private javax.swing.JSpinner se_rating1;
    private javax.swing.JTextField se_subs;
    private javax.swing.JTextField se_subs1;
    private javax.swing.JButton series_olabb;
    private javax.swing.JDialog seriesera;
    private javax.swing.JList<String> ta_eliminar;
    private javax.swing.JList<String> ta_eliminar2;
    private javax.swing.JList<String> ta_va1;
    private javax.swing.JList<String> ta_va2;
    // End of variables declaration//GEN-END:variables
ArrayList<usuario> lista = new ArrayList();
ArrayList<String> pel_favs=new ArrayList();
ArrayList<String> ser_favs=new ArrayList();
}
