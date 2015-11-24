/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2015;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import projecte.Clients;

//NOTES TODO: Canviar vector a array d'objectes
//insertar objecte a la taula complet i no per columnes (populate jtable with objects)
//fer println quan llegeixo el fitxer per comprovar que esta ple


/**
 *
 * @author alumne
 */
public class ClientsGui extends javax.swing.JFrame {

    /**
     * Creates new form PrimerGui
     */
    public ClientsGui() {
        initComponents();
        initComponentsMeus();
    }
    
    /*DESCARTADA, BUSCA PEPEPEPE, ALLA S'EXPLICA*/
    int indexupdate;
    int indexDataAlta; //Ja que no se com generar un id en autoincrement sense una base de dades
    //el que fare sera crear un id a partir de la data.
    
    private void initComponentsMeus(){
 
        //Posem un listener a la taula de clients per modificar que actualitze els jtextfileds al canviar de fila seleccionada
        taulaModelClient.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Si seleccionem un client posem les seues dades als jtextfields corresponents i els activem 
                int i=taulaModelClient.getSelectedRow();
                if(i!=-1){
                    
                    //modNomCom.setText(vector.get(i).get2nomCom());
                    modNomCom.setText(taulaModelClient.getModel().getValueAt(i, 0).toString());
                    modDataAlta.setText(taulaModelClient.getModel().getValueAt(i, 1).toString());
                    modNomFis.setText(taulaModelClient.getModel().getValueAt(i, 2).toString());
                    modCifNif.setText(taulaModelClient.getModel().getValueAt(i, 3).toString());
                    modPais.setText(taulaModelClient.getModel().getValueAt(i, 4).toString());
                    modPoblacio.setText(taulaModelClient.getModel().getValueAt(i, 5).toString());
                    modDireccio.setText(taulaModelClient.getModel().getValueAt(i, 6).toString());
                    modCp.setText((String)taulaModelClient.getModel().getValueAt(i, 7).toString());
                    modTel.setText((String)taulaModelClient.getModel().getValueAt(i, 8).toString());
                    modEmail.setText(taulaModelClient.getModel().getValueAt(i, 9).toString()); 
                    modWebsite.setText(taulaModelClient.getModel().getValueAt(i, 10).toString()); 
                    modCc.setText((String)taulaModelClient.getModel().getValueAt(i, 11).toString()); 
                    modDescompte.setText((String)taulaModelClient.getModel().getValueAt(i, 12).toString()); 
                    modNotes.setText(taulaModelClient.getModel().getValueAt(i, 13).toString()); 
                    
                    
                    modNomCom.setEnabled(true);
                    modDataAlta.setEnabled(false);
                    modNomFis.setEnabled(true);
                    modCifNif.setEnabled(true);
                    modPais.setEnabled(true);
                    modPoblacio.setEnabled(true);
                    modDireccio.setEnabled(true);
                    modCp.setEnabled(true);
                    modTel.setEnabled(true);
                    modEmail.setEnabled(true);
                    modWebsite.setEnabled(true);
                    modCc.setEnabled(true); 
                    modDescompte.setEnabled(true); 
                    modNotes.setEnabled(true);
                    
                    String data = (taulaModelClient.getModel().getValueAt(i, 1).toString());
                    indexupdate=0;
                    for(int x = 0; data != (taulaModelClient.getModel().getValueAt(x, 1).toString()); x++){
                        indexupdate++;
                    }
                    /*
                    //PEPEPEPE
                    DESCARTO LA IDEA PER QUE DESPRES NO EM SERVEIX, JA QUE DESPRES NECESSITO UN INT 
                    REFERENCIANT LA LINIA, PERO A PARTIR D'AQUI HE PENSAT QUE EN LA DATA JA QUE ES UNICA
                    PUC FER UN FOREACH PER TREURE LA LINIA QUE COINCIDEIX I TINDRE L'ID
                        
                    LLASTIMA, COMENÇAVA A AGRADAR-ME LA IDEA
                    */
                    
                    //creem l'ID a partir de la data
                    /*
                    String str = taulaModelClient.getModel().getValueAt(i, 1).toString();//agafo l'string
                    str = str.replaceAll("[^\\d.]", "");//trec tots els caracters no numerics
                    str = str.substring(0, str.length() - 4);//trec els ultims 4 digits (2015) ja que si 
                    //no es un numero massa gran per a un int i un long no el puc usar per a les funcions
                    indexDataAlta =  Integer.parseInt(str);//passo l'string a int
                    System.out.println("******************************************************************");
                    System.out.println(indexDataAlta);//per si de cas auqi el puc revisar
                    System.out.println("******************************************************************");
                   */
                }
                
                
                //Si no hem seleccionat cap fila resetejem els jtextfields i els desactivem
                else{
                    modNomCom.setText("");
                    modDataAlta.setText("");
                    modNomFis.setText("");
                    modCifNif.setText("");
                    modPais.setText("");
                    modPoblacio.setText("");
                    modDireccio.setText("");
                    modCp.setText("");
                    modTel.setText("");
                    modEmail.setText("");
                    modWebsite.setText("");
                    modCc.setText(""); 
                    modDescompte.setText(""); 
                    modNotes.setText("");

                    modNomCom.setEnabled(false);
                    modDataAlta.setEnabled(false);
                    modNomFis.setEnabled(false);
                    modCifNif.setEnabled(false);
                    modPais.setEnabled(false);
                    modPoblacio.setEnabled(false);
                    modDireccio.setEnabled(false);
                    modCp.setEnabled(false);
                    modTel.setEnabled(false);
                    modEmail.setEnabled(false);
                    modWebsite.setEnabled(false);
                    modCc.setEnabled(false); 
                    modDescompte.setEnabled(false); 
                    modNotes.setEnabled(false);
                }

                //Sempre que cliquem la taula desactivem el botó d'actualitzar fins que no es canvien els valors dels jtextfields
                btn_actualitzar.setEnabled(false);
            }
        });      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        button_add = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        button_modificar = new javax.swing.JButton();
        first_panel = new javax.swing.JLayeredPane();
        panel_modificar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taulaModelClient = new javax.swing.JTable();
        jTextField4 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        modNomFis = new javax.swing.JTextField();
        modNomCom = new javax.swing.JTextField();
        btn_actualitzar = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        modCifNif = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        modPais = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        modTel = new javax.swing.JTextField();
        modCp = new javax.swing.JTextField();
        modDireccio = new javax.swing.JTextField();
        modPoblacio = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        modDescompte = new javax.swing.JTextField();
        modCc = new javax.swing.JTextField();
        modWebsite = new javax.swing.JTextField();
        modEmail = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        modNotes = new javax.swing.JTextArea();
        modDataAlta = new javax.swing.JTextField();
        panel_insert = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        addTel = new javax.swing.JTextField();
        addCp = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        addNomFis = new javax.swing.JTextField();
        addDireccio = new javax.swing.JTextField();
        addPoblacio = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        addDescompte = new javax.swing.JTextField();
        addNomCom = new javax.swing.JTextField();
        addCifNif = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        addPais = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        addCc = new javax.swing.JTextField();
        addWebsite = new javax.swing.JTextField();
        addEmail = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        addNotes = new javax.swing.JTextArea();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manteniment d'alumnes");
        setMinimumSize(new java.awt.Dimension(1200, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setMaximumSize(new java.awt.Dimension(96, 229));
        jPanel2.setMinimumSize(new java.awt.Dimension(96, 229));
        jPanel2.setPreferredSize(new java.awt.Dimension(96, 229));

        button_add.setBackground(new java.awt.Color(255, 153, 255));
        button_add.setText("Afegir");
        button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_addMouseClicked(evt);
            }
        });
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 102, 102));
        btn_exit.setText("Sortir");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });

        button_modificar.setBackground(new java.awt.Color(255, 153, 255));
        button_modificar.setText("Modificar");
        button_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_modificarMouseClicked(evt);
            }
        });
        button_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(button_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(button_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(button_modificar)
                .addGap(120, 120, 120)
                .addComponent(btn_exit))
        );

        first_panel.setMaximumSize(new java.awt.Dimension(1000, 800));
        first_panel.setMinimumSize(new java.awt.Dimension(1000, 800));
        first_panel.setPreferredSize(new java.awt.Dimension(1000, 524));

        panel_modificar.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_modificar.setVisible(false);

        jScrollPane2.setPreferredSize(new java.awt.Dimension(800, 500));

        taulaModelClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nom Comercial", "Data d'alta", "Nom Fiscal", "CIF/NIF", "Pais", "Poblacio", "Direccio", "CP", "Telefon", "Email", "Website", "CC", "Descompte", "Notes", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taulaModelClient.setPreferredSize(new java.awt.Dimension(800, 500));
        taulaModelClient.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(taulaModelClient);
        if (taulaModelClient.getColumnModel().getColumnCount() > 0) {
            taulaModelClient.getColumnModel().getColumn(1).setPreferredWidth(45);
            taulaModelClient.getColumnModel().getColumn(3).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(4).setPreferredWidth(25);
            taulaModelClient.getColumnModel().getColumn(5).setPreferredWidth(25);
            taulaModelClient.getColumnModel().getColumn(6).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(7).setPreferredWidth(10);
            taulaModelClient.getColumnModel().getColumn(8).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(9).setPreferredWidth(10);
            taulaModelClient.getColumnModel().getColumn(10).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(11).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(12).setPreferredWidth(8);
            taulaModelClient.getColumnModel().getColumn(13).setPreferredWidth(8);
        }

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 204));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Nom Comercial");
        jTextField4.setFocusable(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 204));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("Nom Fiscal");
        jTextField6.setFocusable(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 204));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("Poblacio");
        jTextField10.setFocusable(false);

        modNomFis.setBackground(new java.awt.Color(204, 255, 255));
        modNomFis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modNomFisActionPerformed(evt);
            }
        });
        modNomFis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modNomFisKeyTyped(evt);
            }
        });

        modNomCom.setBackground(new java.awt.Color(204, 255, 255));
        modNomCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modNomComActionPerformed(evt);
            }
        });
        modNomCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modNomComKeyTyped(evt);
            }
        });

        btn_actualitzar.setText("Modificar");
        btn_actualitzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualitzarActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(204, 204, 255));
        jTextField15.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Modificar clients");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        modCifNif.setBackground(new java.awt.Color(204, 255, 255));
        modCifNif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCifNifActionPerformed(evt);
            }
        });
        modCifNif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modCifNifKeyTyped(evt);
            }
        });

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 204));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("CIF/NIF");
        jTextField7.setFocusable(false);

        modPais.setBackground(new java.awt.Color(204, 255, 255));
        modPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPaisActionPerformed(evt);
            }
        });
        modPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modPaisKeyTyped(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 204));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("Pais");
        jTextField8.setFocusable(false);

        jTextField24.setEditable(false);
        jTextField24.setBackground(new java.awt.Color(255, 255, 204));
        jTextField24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField24.setText("Direccio");
        jTextField24.setFocusable(false);

        jTextField25.setEditable(false);
        jTextField25.setBackground(new java.awt.Color(255, 255, 204));
        jTextField25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField25.setText("CP");
        jTextField25.setFocusable(false);

        jTextField26.setEditable(false);
        jTextField26.setBackground(new java.awt.Color(255, 255, 204));
        jTextField26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField26.setText("Telefon");
        jTextField26.setFocusable(false);

        jTextField27.setEditable(false);
        jTextField27.setBackground(new java.awt.Color(255, 255, 204));
        jTextField27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField27.setText("Website");
        jTextField27.setFocusable(false);

        jTextField28.setEditable(false);
        jTextField28.setBackground(new java.awt.Color(255, 255, 204));
        jTextField28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField28.setText("CC");
        jTextField28.setFocusable(false);

        jTextField30.setEditable(false);
        jTextField30.setBackground(new java.awt.Color(255, 255, 204));
        jTextField30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField30.setText("Email");
        jTextField30.setFocusable(false);

        modTel.setBackground(new java.awt.Color(204, 255, 255));
        modTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modTelKeyTyped(evt);
            }
        });

        modCp.setBackground(new java.awt.Color(204, 255, 255));
        modCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCpActionPerformed(evt);
            }
        });
        modCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modCpKeyTyped(evt);
            }
        });

        modDireccio.setBackground(new java.awt.Color(204, 255, 255));
        modDireccio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDireccioKeyTyped(evt);
            }
        });

        modPoblacio.setBackground(new java.awt.Color(204, 255, 255));
        modPoblacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPoblacioActionPerformed(evt);
            }
        });
        modPoblacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modPoblacioKeyTyped(evt);
            }
        });

        jTextField29.setEditable(false);
        jTextField29.setBackground(new java.awt.Color(255, 255, 204));
        jTextField29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField29.setText("Descompte");
        jTextField29.setFocusable(false);

        modDescompte.setBackground(new java.awt.Color(204, 255, 255));
        modDescompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modDescompteActionPerformed(evt);
            }
        });
        modDescompte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDescompteKeyTyped(evt);
            }
        });

        modCc.setBackground(new java.awt.Color(204, 255, 255));
        modCc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modCcKeyTyped(evt);
            }
        });

        modWebsite.setBackground(new java.awt.Color(204, 255, 255));
        modWebsite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modWebsiteKeyTyped(evt);
            }
        });

        modEmail.setBackground(new java.awt.Color(204, 255, 255));
        modEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modEmailActionPerformed(evt);
            }
        });
        modEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modEmailKeyTyped(evt);
            }
        });

        jTextField31.setEditable(false);
        jTextField31.setBackground(new java.awt.Color(255, 255, 204));
        jTextField31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField31.setText("Notes");
        jTextField31.setFocusable(false);

        modNotes.setColumns(20);
        modNotes.setRows(5);
        modNotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modNotesKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(modNotes);

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_modificarLayout.createSequentialGroup()
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modNomFis, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modCifNif, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modPais, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modPoblacio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modDireccio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modCp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(modTel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(modEmail)
                                    .addComponent(modWebsite)
                                    .addComponent(modCc)
                                    .addComponent(modDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane3)
                            .addComponent(modDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_modificarLayout.createSequentialGroup()
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modNomFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modCifNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_modificarLayout.createSequentialGroup()
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_modificarLayout.createSequentialGroup()
                            .addComponent(modPoblacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modDireccio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                            .addComponent(modEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        panel_insert.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_insert.setVisible(false);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 204, 255));
        jTextField13.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Afegir nous clients");
        jTextField13.setFocusable(false);
        jTextField13.setRequestFocusEnabled(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        btn_save.setText("Guardar");
        btn_save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveMouseClicked(evt);
            }
        });

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(255, 255, 204));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("Email");
        jTextField32.setFocusable(false);

        addTel.setBackground(new java.awt.Color(204, 255, 255));
        addTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addTelKeyTyped(evt);
            }
        });

        addCp.setBackground(new java.awt.Color(204, 255, 255));
        addCp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addCpKeyTyped(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Nom Comercial");
        jTextField5.setFocusable(false);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 204));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Nom Fiscal");
        jTextField9.setFocusable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Poblacio");
        jTextField11.setFocusable(false);

        addNomFis.setBackground(new java.awt.Color(204, 255, 255));
        addNomFis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addNomFisKeyTyped(evt);
            }
        });

        addDireccio.setBackground(new java.awt.Color(204, 255, 255));
        addDireccio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addDireccioKeyTyped(evt);
            }
        });

        addPoblacio.setBackground(new java.awt.Color(204, 255, 255));
        addPoblacio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPoblacioActionPerformed(evt);
            }
        });
        addPoblacio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addPoblacioKeyTyped(evt);
            }
        });

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(255, 255, 204));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("Descompte");
        jTextField33.setFocusable(false);

        addDescompte.setBackground(new java.awt.Color(204, 255, 255));
        addDescompte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addDescompteKeyTyped(evt);
            }
        });

        addNomCom.setBackground(new java.awt.Color(204, 255, 255));
        addNomCom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNomComActionPerformed(evt);
            }
        });
        addNomCom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addNomComKeyTyped(evt);
            }
        });

        addCifNif.setBackground(new java.awt.Color(204, 255, 255));
        addCifNif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addCifNifKeyTyped(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("CIF/NIF");
        jTextField12.setFocusable(false);

        addPais.setBackground(new java.awt.Color(204, 255, 255));
        addPais.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addPaisKeyTyped(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 204));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Pais");
        jTextField18.setFocusable(false);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 204));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("Direccio");
        jTextField34.setFocusable(false);

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 204));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("CP");
        jTextField35.setFocusable(false);

        addCc.setBackground(new java.awt.Color(204, 255, 255));
        addCc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addCcKeyTyped(evt);
            }
        });

        addWebsite.setBackground(new java.awt.Color(204, 255, 255));
        addWebsite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addWebsiteKeyTyped(evt);
            }
        });

        addEmail.setBackground(new java.awt.Color(204, 255, 255));
        addEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmailActionPerformed(evt);
            }
        });
        addEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addEmailKeyTyped(evt);
            }
        });

        jTextField36.setEditable(false);
        jTextField36.setBackground(new java.awt.Color(255, 255, 204));
        jTextField36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField36.setText("Notes");
        jTextField36.setFocusable(false);

        addNotes.setColumns(20);
        addNotes.setRows(5);
        jScrollPane6.setViewportView(addNotes);

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(255, 255, 204));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("Telefon");
        jTextField37.setFocusable(false);

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(255, 255, 204));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("Website");
        jTextField38.setFocusable(false);

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(255, 255, 204));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setText("CC");
        jTextField39.setFocusable(false);

        javax.swing.GroupLayout panel_insertLayout = new javax.swing.GroupLayout(panel_insert);
        panel_insert.setLayout(panel_insertLayout);
        panel_insertLayout.setHorizontalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addNomFis, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCifNif, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addPais, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addPoblacio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addDireccio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCp, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addTel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addEmail)
                                    .addComponent(addWebsite)
                                    .addComponent(addCc)
                                    .addComponent(addDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        panel_insertLayout.setVerticalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_insertLayout.createSequentialGroup()
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addNomCom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addNomFis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addCifNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panel_insertLayout.createSequentialGroup()
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_insertLayout.createSequentialGroup()
                            .addComponent(addPoblacio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addDireccio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_insertLayout.createSequentialGroup()
                            .addComponent(addEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addCc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_insertLayout.createSequentialGroup()
                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout first_panelLayout = new javax.swing.GroupLayout(first_panel);
        first_panel.setLayout(first_panelLayout);
        first_panelLayout.setHorizontalGroup(
            first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, first_panelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(first_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(765, Short.MAX_VALUE)))
        );
        first_panelLayout.setVerticalGroup(
            first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(first_panelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(first_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, first_panelLayout.createSequentialGroup()
                    .addGap(0, 806, Short.MAX_VALUE)
                    .addComponent(panel_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        first_panel.setLayer(panel_modificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        first_panel.setLayer(panel_insert, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(first_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(first_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, 800, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseClicked
        //Ocultem els altres jpanels

        panel_modificar.setVisible(false);

        //Resetejem els camps de text.
                    modNomCom.setText("");
                    modDataAlta.setText("");
                    modNomFis.setText("");
                    modCifNif.setText("");
                    modPais.setText("");
                    modPoblacio.setText("");
                    modDireccio.setText("");
                    modCp.setText("");
                    modTel.setText("");
                    modEmail.setText("");
                    modWebsite.setText("");
                    modCc.setText("");
                    modDescompte.setText("");
                    modNotes.setText("");
   

        //Fem visible el jpanel d'afegir
        panel_insert.setVisible(true);

    }//GEN-LAST:event_button_addMouseClicked

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked


        //Creem l'objecte client recuperant les dades introduïdes per l'usuari
        //Miro la data actual i la guardo a date.
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        String dataAlta;
        dataAlta = date.toString().trim();
        //dataAlta = "0";
        
        int Cp;
        Cp=Integer.parseInt(addCp.getText());
        
        int Tel;
        Tel=Integer.parseInt(addTel.getText());
        
        int Cc;
        Cc=Integer.parseInt(addCc.getText());
               

        
        projecte.Clients client = new projecte.Clients(          
            addNomCom.getText(),
            dataAlta,
            addNomFis.getText(),
            addCifNif.getText(),
            addPais.getText(),
            addPoblacio.getText(),
            addDireccio.getText(),
            Cp,
            Tel,
            addEmail.getText(),
            addWebsite.getText(),
            Cc,
            addNotes.getText(),
            addDescompte.getText()
        );

        //El guardem a la primera posició lliure del vector
        vector.add(client);
        //Si arribem aquí el client s'ha guardat
        JOptionPane.showMessageDialog(this, "Client guardat correctament!!");
        //Resetejem els camps de text.
        addNomCom.setText("");
        addNomFis.setText("");
        addCifNif.setText("");
        addPais.setText("");
        addPoblacio.setText("");
        addDireccio.setText("");
        addCp.setText("");
        addTel.setText("");
        addEmail.setText("");
        addWebsite.setText("");
        addCc.setText("");
        addDescompte.setText("");
        addNotes.setText("");

           
        

    }//GEN-LAST:event_btn_saveMouseClicked

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        //En apretar el botó Sortir tanquem el programa en el mètode dispose() que fa que s'execute el mètode formWindowClosed()
        this.dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Mètode que s'executa quan obrim l'aplicació

        //Si el fixer existix creem un vector i l'omplim en les dades del fitxer i en cas contrari el dixem sense dades     
        if (f.exists()) {
            ObjectInputStream entrada = null;

            //LLegim el fitxer i omplim el vector en els clients continguts dins ell
            try {
                //Obrim el fitxer per lectura
                entrada = new ObjectInputStream(new FileInputStream(f));

                //Index del vector per guardar els clients trobats
                int i = 0;
                while (true) {
                    try {
                        vector.add((Clients) entrada.readObject());
                    } catch (EOFException e) {
                        System.out.println("eofe");
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ClientsGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                       
                }

            } catch (IOException e) {
                //Si hi ha un error de lectura del fitxer mostrem avís i tanquem l'aplicació
                JOptionPane.showMessageDialog(this, "Error en obrir el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                System.exit(-1);
            } finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        //Si hi ha un error de tancament del fitxer mostrem avís i tanquem l'aplicació
                        JOptionPane.showMessageDialog(this, "Error en tancar el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("Fitxer nou");
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // Quan tanquem l'aplicació guardem els clients vàlids al fixer

        //Declarem el client
        ObjectOutputStream sortida = null;
        //Capturem l'excepció i escrivim
        try {
            //Pes escriure des de 0
            sortida = new ObjectOutputStream(new FileOutputStream(f));
            int i;
            for (i = 0; i < vector.size(); i++) //Escrivim els objectes al fitxer
            {
                sortida.writeObject(vector.get(i));
            }
        } catch (IOException e) {
            //Mostrem avís
            JOptionPane.showMessageDialog(this, "Error a l'escriure al fitxer:" + e.getMessage());
        } finally {
            if (sortida != null) {
                try {
                    sortida.close();
                } catch (IOException ex) {
                    //Mostremos avís
                    JOptionPane.showMessageDialog(this, "Error al tancar el fitxer:" + ex.getMessage());
                }
            }
        }

    }//GEN-LAST:event_formWindowClosed

     
    private void btn_actualitzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualitzarActionPerformed
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);
                
        //Com ja sé l'índex ja puc actualitzar el vector
            
        vector.get(indexupdate).set01nomCom(modNomCom.getText().trim());
        vector.get(indexupdate).set02dataAlta(modDataAlta.getText().trim());
        vector.get(indexupdate).set03nomFis(modNomFis.getText().trim());
        vector.get(indexupdate).set04cifNif(modCifNif.getText().trim());
        vector.get(indexupdate).set05pais(modPais.getText().trim());
        vector.get(indexupdate).set06poblacio(modPoblacio.getText().trim());
        vector.get(indexupdate).set07direccio(modDireccio.getText().trim());
        vector.get(indexupdate).set08cp(Integer.parseInt(modCp.getText().trim()));
        vector.get(indexupdate).set09tfon(Integer.parseInt(modTel.getText().trim()));
        vector.get(indexupdate).set10email(modEmail.getText().trim());
        vector.get(indexupdate).set11website(modWebsite.getText().trim());
        vector.get(indexupdate).set12cc(Integer.parseInt(modCc.getText().trim()));
        vector.get(indexupdate).set13notes(modNotes.getText().trim());
        vector.get(indexupdate).set14descompte(modDescompte.getText().trim());
        
        
        //I ara actualitzo la taula
        
        taulaModelClient.setValueAt(vector.get(indexupdate).get01nomCom(),taulaModelClient.getSelectedRow(), 0);
        taulaModelClient.setValueAt(vector.get(indexupdate).get02dataAlta(),taulaModelClient.getSelectedRow(), 1);
        taulaModelClient.setValueAt(vector.get(indexupdate).get03nomFis(),taulaModelClient.getSelectedRow(), 2);
        taulaModelClient.setValueAt(vector.get(indexupdate).get04cifNif(),taulaModelClient.getSelectedRow(), 3);
        taulaModelClient.setValueAt(vector.get(indexupdate).get05pais(),taulaModelClient.getSelectedRow(), 4);
        taulaModelClient.setValueAt(vector.get(indexupdate).get06poblacio(),taulaModelClient.getSelectedRow(), 5);
        taulaModelClient.setValueAt(vector.get(indexupdate).get07direccio(),taulaModelClient.getSelectedRow(), 6);
        taulaModelClient.setValueAt(vector.get(indexupdate).get08cp(),taulaModelClient.getSelectedRow(), 7);
        taulaModelClient.setValueAt(vector.get(indexupdate).get09tfon(),taulaModelClient.getSelectedRow(), 8);
        taulaModelClient.setValueAt(vector.get(indexupdate).get10email(),taulaModelClient.getSelectedRow(), 9);
        taulaModelClient.setValueAt(vector.get(indexupdate).get11website(),taulaModelClient.getSelectedRow(), 10);
        taulaModelClient.setValueAt(vector.get(indexupdate).get12cc(),taulaModelClient.getSelectedRow(), 11);
        taulaModelClient.setValueAt(vector.get(indexupdate).get13notes(),taulaModelClient.getSelectedRow(), 12);
        taulaModelClient.setValueAt(vector.get(indexupdate).get14descompte(),taulaModelClient.getSelectedRow(), 13);    

        
        //Resetejem els camps de text.
        modNomCom.setText("");
        modDataAlta.setText("");
        modNomFis.setText("");
        modCifNif.setText("");
        modPais.setText("");
        modPoblacio.setText("");
        modDireccio.setText("");
        modCp.setText("");
        modTel.setText("");
        modEmail.setText("");
        modWebsite.setText("");
        modCc.setText("");
        modDescompte.setText("");
        modNotes.setText("");
        
        // Finalment desactivo jtextfields i botó d'actualitzar
        modNomCom.setEnabled(false);
        modDataAlta.setEnabled(false);
        modNomFis.setEnabled(false);
        modCifNif.setEnabled(false);
        modPais.setEnabled(false);
        modPoblacio.setEnabled(false);
        modDireccio.setEnabled(false);
        modCp.setEnabled(false);
        modTel.setEnabled(false);
        modEmail.setEnabled(false);
        modWebsite.setEnabled(false);
        modCc.setEnabled(false);
        modDescompte.setEnabled(false);
        modNotes.setEnabled(false);
        
        ModelTaula<Clients> mt = new ModelTaula(vector);
        
        //Li assigno el model a la taula
        taulaModelClient.setModel(mt);
        
    }//GEN-LAST:event_btn_actualitzarActionPerformed

    private void button_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_modificarMouseClicked
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);
        panel_modificar.setVisible(true);
        
//Fem visible el jpanel de modificar i inicialment desactivem el botó d'actualitzar canvis i els quadres de text

        btn_actualitzar.setEnabled(false);
        modNomCom.setEnabled(false);
        modDataAlta.setEnabled(false);
        modNomFis.setEnabled(false);
        modCifNif.setEnabled(false);
        modPais.setEnabled(false);
        modPoblacio.setEnabled(false);
        modDireccio.setEnabled(false);
        modCp.setEnabled(false);
        modTel.setEnabled(false);
        modEmail.setEnabled(false);
        modWebsite.setEnabled(false);
        modCc.setEnabled(false);
        modDescompte.setEnabled(false);
        modNotes.setEnabled(false);
        
        //Omplim la taula en els clients del vector

        //LLegim el vector i anem omplint la taula
        //Index del vector
        int i;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        String dataAlta;
        dataAlta = date.toString().trim();

    }//GEN-LAST:event_button_modificarMouseClicked

    private void modNomComKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modNomComKeyTyped
        // En quant apretem alguna tecla activem el botó d'actualitzar
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modNomComKeyTyped

    private void modNomFisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modNomFisKeyTyped
        // En quant apretem alguna tecla activem el botó d'actualitzar
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modNomFisKeyTyped

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
        ModelTaula<Clients> mt = new ModelTaula(vector);
        
        //Li assigno el model a la taula
        taulaModelClient.setModel(mt);
    }//GEN-LAST:event_button_modificarActionPerformed

    private void modNomComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modNomComActionPerformed
        
    }//GEN-LAST:event_modNomComActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void modCifNifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modCifNifKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modCifNifKeyTyped

    private void modPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modPaisKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modPaisKeyTyped

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void modTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modTelKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modTelKeyTyped

    private void modCpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modCpKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modCpKeyTyped

    private void modDireccioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDireccioKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modDireccioKeyTyped

    private void modPoblacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPoblacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modPoblacioActionPerformed

    private void modPoblacioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modPoblacioKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modPoblacioKeyTyped

    private void modDescompteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDescompteKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modDescompteKeyTyped

    private void modCcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modCcKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modCcKeyTyped

    private void modWebsiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modWebsiteKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modWebsiteKeyTyped

    private void modEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modEmailActionPerformed

    private void modEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modEmailKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modEmailKeyTyped

    private void addTelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addTelKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addTelKeyTyped

    private void addCpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addCpKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addCpKeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void addNomFisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addNomFisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomFisKeyTyped

    private void addDireccioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addDireccioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addDireccioKeyTyped

    private void addPoblacioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPoblacioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addPoblacioActionPerformed

    private void addPoblacioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPoblacioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addPoblacioKeyTyped

    private void addDescompteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addDescompteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addDescompteKeyTyped

    private void addNomComActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNomComActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomComActionPerformed

    private void addNomComKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addNomComKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomComKeyTyped

    private void addCifNifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addCifNifKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addCifNifKeyTyped

    private void addPaisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addPaisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addPaisKeyTyped

    private void addCcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addCcKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addCcKeyTyped

    private void addWebsiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addWebsiteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addWebsiteKeyTyped

    private void addEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmailActionPerformed

    private void addEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addEmailKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addEmailKeyTyped

    private void modDescompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modDescompteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modDescompteActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void modNomFisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modNomFisActionPerformed
        
    }//GEN-LAST:event_modNomFisActionPerformed

    private void modCifNifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCifNifActionPerformed
        
    }//GEN-LAST:event_modCifNifActionPerformed

    private void modPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modPaisActionPerformed

    private void modNotesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modNotesKeyTyped
        btn_actualitzar.setEnabled(true);
    }//GEN-LAST:event_modNotesKeyTyped

    private void modCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modCpActionPerformed

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
            java.util.logging.Logger.getLogger(ClientsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientsGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientsGui().setVisible(true);
            }
        });
    }

    //Variables nostres
    //Vector per guardar els clients durant l'execució
    private static ArrayList<Clients> vector=new ArrayList<>();

    //Nom del fitxer de clients
    private static final File f = new File("clients.dat");
    
    
    //Nou v4
    
    // Columna on guardem la posició del vector on està ubicat cada objecte client
    //private static TableColumn col;

    //tableModel de les taules d0afegir i borrar que usaré en diferents moments. S'instància dins el mètode initMeusComponents()
    //private static DefaultTableModel tm;
    
    //Fi nou v4

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addCc;
    private javax.swing.JTextField addCifNif;
    private javax.swing.JTextField addCp;
    private javax.swing.JTextField addDescompte;
    private javax.swing.JTextField addDireccio;
    private javax.swing.JTextField addEmail;
    private javax.swing.JTextField addNomCom;
    private javax.swing.JTextField addNomFis;
    private javax.swing.JTextArea addNotes;
    private javax.swing.JTextField addPais;
    private javax.swing.JTextField addPoblacio;
    private javax.swing.JTextField addTel;
    private javax.swing.JTextField addWebsite;
    private javax.swing.JButton btn_actualitzar;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_modificar;
    private javax.swing.JLayeredPane first_panel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modCc;
    private javax.swing.JTextField modCifNif;
    private javax.swing.JTextField modCp;
    private javax.swing.JTextField modDataAlta;
    private javax.swing.JTextField modDescompte;
    private javax.swing.JTextField modDireccio;
    private javax.swing.JTextField modEmail;
    private javax.swing.JTextField modNomCom;
    private javax.swing.JTextField modNomFis;
    private javax.swing.JTextArea modNotes;
    private javax.swing.JTextField modPais;
    private javax.swing.JTextField modPoblacio;
    private javax.swing.JTextField modTel;
    private javax.swing.JTextField modWebsite;
    private javax.swing.JPanel panel_insert;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JTable taulaModelClient;
    // End of variables declaration//GEN-END:variables
}
