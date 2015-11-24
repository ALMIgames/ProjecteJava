
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
import projecte.ComandesVendes;
import projecte.DetallComandesVendes;
import projecte.Articles;


public class DetallComandesVendesGui extends javax.swing.JFrame {

    public DetallComandesVendesGui() {
        initComponents();
        initComponentsMeus();
    }
    
    private void initComponentsMeus(){

        //Posem un listener a la taula de detalls de cv (comandes vendes) per modificar que actualitze els jtextfileds al canviar de fila seleccionada
        taulaModelDetallCV.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Si seleccionem un detall de cv posem les seues dades als jtextfields corresponents i els activem 
                int i=taulaModelDetallCV.getSelectedRow();
                if(i!=-1){
                    
                    //modNomCom.setText(vector.get(i).get2nomCom());
                    modCodi.setText(taulaModelDetallCV.getModel().getValueAt(i, 0).toString());
                    modComandaVendes.setText(taulaModelDetallCV.getModel().getValueAt(i, 1).toString());
                    modUts.setText(taulaModelDetallCV.getModel().getValueAt(i, 2).toString());
                    modArticle.setText(taulaModelDetallCV.getModel().getValueAt(i, 3).toString());
                    modRef.setText(taulaModelDetallCV.getModel().getValueAt(i, 4).toString());
                    modNom.setText(taulaModelDetallCV.getModel().getValueAt(i, 5).toString());
                    modDescripcio.setText(taulaModelDetallCV.getModel().getValueAt(i, 6).toString());
                    modAcabat.setText((String)taulaModelDetallCV.getModel().getValueAt(i, 7).toString());
                    modAlt.setText((String)taulaModelDetallCV.getModel().getValueAt(i, 8).toString());
                    modAmple.setText(taulaModelDetallCV.getModel().getValueAt(i, 9).toString()); 
                    modFondo.setText(taulaModelDetallCV.getModel().getValueAt(i, 10).toString()); 
                    modNotes.setText((String)taulaModelDetallCV.getModel().getValueAt(i, 11).toString()); 
                    modImportUt.setText((String)taulaModelDetallCV.getModel().getValueAt(i, 12).toString()); 
                    modImportTotal.setText(taulaModelDetallCV.getModel().getValueAt(i, 13).toString()); 
                    
                    
                    modCodi.setEnabled(true);
                    modComandaVendes.setEnabled(false);
                    modUts.setEnabled(true);
                    modArticle.setEnabled(true);
                    modRef.setEnabled(true);
                    modNom.setEnabled(true);
                    modDescripcio.setEnabled(true);
                    modAcabat.setEnabled(true);
                    modAlt.setEnabled(true);
                    modAmple.setEnabled(true);
                    modFondo.setEnabled(true);
                    modNotes.setEnabled(true); 
                    modImportUt.setEnabled(true); 
                    modImportTotal.setEnabled(true);
                    
                }
                
                //Si no hem seleccionat cap fila resetejem els jtextfields i els desactivem
                else{
                    modCodi.setText("");
                    modComandaVendes.setText("");
                    modUts.setText("");
                    modArticle.setText("");
                    modRef.setText("");
                    modNom.setText("");
                    modDescripcio.setText("");
                    modAcabat.setText("");
                    modAlt.setText("");
                    modAmple.setText("");
                    modFondo.setText("");
                    modNotes.setText(""); 
                    modImportUt.setText(""); 
                    modImportTotal.setText("");

                    modCodi.setEnabled(false);
                    modComandaVendes.setEnabled(false);
                    modUts.setEnabled(false);
                    modArticle.setEnabled(false);
                    modRef.setEnabled(false);
                    modNom.setEnabled(false);
                    modDescripcio.setEnabled(false);
                    modAcabat.setEnabled(false);
                    modAlt.setEnabled(false);
                    modAmple.setEnabled(false);
                    modFondo.setEnabled(false);
                    modNotes.setEnabled(false); 
                    modImportUt.setEnabled(false); 
                    modImportTotal.setEnabled(false);
                }

                //Sempre que cliquem la taula desactivem el botó d'actualitzar fins que no es canvien els valors dels jtextfields
                btn_actualitzar.setEnabled(false);
            }
        });      
    }
    
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
        taulaModelDetallCV = new javax.swing.JTable();
        btn_actualitzar = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        modArticle = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        modAlt = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        modFondo = new javax.swing.JTextField();
        modAcabat = new javax.swing.JTextField();
        modCodi = new javax.swing.JTextField();
        modAmple = new javax.swing.JTextField();
        modDescripcio = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        modNom = new javax.swing.JTextField();
        modUts = new javax.swing.JTextField();
        modComandaVendes = new javax.swing.JTextField();
        modRef = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        modNotes = new javax.swing.JTextArea();
        jTextField49 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        modImportUt = new javax.swing.JTextField();
        modImportTotal = new javax.swing.JTextField();
        panel_insert = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        addArticle = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        addNom = new javax.swing.JTextField();
        addUts = new javax.swing.JTextField();
        addComandaVendes = new javax.swing.JTextField();
        addCodi = new javax.swing.JTextField();
        addDescripcio = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        addAlt = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        addRef = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        addNotes = new javax.swing.JTextArea();
        jTextField37 = new javax.swing.JTextField();
        addFondo = new javax.swing.JTextField();
        addAcabat = new javax.swing.JTextField();
        addAmple = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        btn_actualitzar1 = new javax.swing.JButton();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        addImportTotal = new javax.swing.JTextField();
        addImportUt = new javax.swing.JTextField();

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

        taulaModelDetallCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codi", "Codi Comanda", "Uts", "Codi Article", "Ref", "Nom", "Descripcio", "Acabat", "Alt", "Ample", "Fondo", "Notes", "ImportUt", "ImportTotal", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
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
        taulaModelDetallCV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(taulaModelDetallCV);
        if (taulaModelDetallCV.getColumnModel().getColumnCount() > 0) {
            taulaModelDetallCV.getColumnModel().getColumn(1).setPreferredWidth(45);
            taulaModelDetallCV.getColumnModel().getColumn(3).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(4).setPreferredWidth(25);
            taulaModelDetallCV.getColumnModel().getColumn(5).setPreferredWidth(25);
            taulaModelDetallCV.getColumnModel().getColumn(6).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(7).setPreferredWidth(10);
            taulaModelDetallCV.getColumnModel().getColumn(9).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(10).setPreferredWidth(10);
            taulaModelDetallCV.getColumnModel().getColumn(11).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(12).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(13).setPreferredWidth(8);
            taulaModelDetallCV.getColumnModel().getColumn(14).setPreferredWidth(8);
        }

        btn_actualitzar.setText("Modificar");
        btn_actualitzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualitzarActionPerformed(evt);
            }
        });

        jTextField15.setBackground(new java.awt.Color(204, 204, 255));
        jTextField15.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField15.setText("Modificar detall de la comanda de vendes");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(255, 255, 204));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("Referencia");
        jTextField40.setFocusable(false);

        modArticle.setBackground(new java.awt.Color(204, 255, 255));
        modArticle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modArticleKeyTyped(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(255, 255, 204));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Codi");
        jTextField14.setFocusable(false);

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 204));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Nom");
        jTextField16.setFocusable(false);
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 204));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Descripcio");
        jTextField17.setFocusable(false);

        jTextField21.setEditable(false);
        jTextField21.setBackground(new java.awt.Color(255, 255, 204));
        jTextField21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField21.setText("Fondo (mm)");
        jTextField21.setFocusable(false);

        modAlt.setBackground(new java.awt.Color(204, 255, 255));
        modAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAltKeyTyped(evt);
            }
        });

        jTextField22.setEditable(false);
        jTextField22.setBackground(new java.awt.Color(255, 255, 204));
        jTextField22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField22.setText("Alt (mm)");
        jTextField22.setFocusable(false);

        jTextField41.setEditable(false);
        jTextField41.setBackground(new java.awt.Color(255, 255, 204));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("Unitats");
        jTextField41.setFocusable(false);

        jTextField42.setEditable(false);
        jTextField42.setBackground(new java.awt.Color(255, 255, 204));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("Codi Article");
        jTextField42.setFocusable(false);

        modFondo.setBackground(new java.awt.Color(204, 255, 255));
        modFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modFondoKeyTyped(evt);
            }
        });

        modAcabat.setBackground(new java.awt.Color(204, 255, 255));
        modAcabat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAcabatKeyTyped(evt);
            }
        });

        modCodi.setBackground(new java.awt.Color(204, 255, 255));

        modAmple.setBackground(new java.awt.Color(204, 255, 255));
        modAmple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modAmpleKeyTyped(evt);
            }
        });

        modDescripcio.setBackground(new java.awt.Color(204, 255, 255));
        modDescripcio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDescripcioKeyTyped(evt);
            }
        });

        jTextField23.setEditable(false);
        jTextField23.setBackground(new java.awt.Color(255, 255, 204));
        jTextField23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField23.setText("Ample (mm)");
        jTextField23.setFocusable(false);

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(255, 255, 204));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("Acabat");
        jTextField43.setFocusable(false);

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(255, 255, 204));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("Codi Comanda");
        jTextField44.setFocusable(false);

        modNom.setBackground(new java.awt.Color(204, 255, 255));
        modNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modNomKeyTyped(evt);
            }
        });

        modUts.setBackground(new java.awt.Color(204, 255, 255));
        modUts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modUtsKeyTyped(evt);
            }
        });

        modComandaVendes.setBackground(new java.awt.Color(204, 255, 255));

        modRef.setBackground(new java.awt.Color(204, 255, 255));
        modRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modRefActionPerformed(evt);
            }
        });
        modRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modRefKeyTyped(evt);
            }
        });

        jTextField45.setEditable(false);
        jTextField45.setBackground(new java.awt.Color(255, 255, 204));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("Notes");
        jTextField45.setFocusable(false);

        modNotes.setColumns(20);
        modNotes.setRows(5);
        jScrollPane7.setViewportView(modNotes);

        jTextField49.setEditable(false);
        jTextField49.setBackground(new java.awt.Color(255, 255, 204));
        jTextField49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField49.setText("Import Unitat (€)");
        jTextField49.setFocusable(false);
        jTextField49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField49ActionPerformed(evt);
            }
        });

        jTextField50.setEditable(false);
        jTextField50.setBackground(new java.awt.Color(255, 255, 204));
        jTextField50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField50.setText("Import Total (€)");
        jTextField50.setFocusable(false);
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });

        modImportUt.setBackground(new java.awt.Color(204, 255, 255));
        modImportUt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modImportUtKeyTyped(evt);
            }
        });

        modImportTotal.setBackground(new java.awt.Color(204, 255, 255));
        modImportTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modImportTotalKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                            .addComponent(modAmple)
                            .addComponent(modAlt)))
                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(modImportTotal))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panel_modificarLayout.createSequentialGroup()
                                    .addComponent(modCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modComandaVendes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(modNom, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(4, 4, 4)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_modificarLayout.createSequentialGroup()
                                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modImportUt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_modificarLayout.createSequentialGroup()
                                    .addComponent(modArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(modUts, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(233, Short.MAX_VALUE))
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modComandaVendes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modImportUt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modImportTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modAmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(433, Short.MAX_VALUE))
        );

        panel_insert.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_insert.setVisible(false);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 204, 255));
        jTextField13.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Afegir detall a la comanda de vendes");
        jTextField13.setFocusable(false);
        jTextField13.setRequestFocusEnabled(false);
        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });

        jTextField32.setEditable(false);
        jTextField32.setBackground(new java.awt.Color(255, 255, 204));
        jTextField32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField32.setText("Referencia");
        jTextField32.setFocusable(false);

        addArticle.setBackground(new java.awt.Color(204, 255, 255));
        addArticle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addArticleKeyTyped(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Codi");
        jTextField5.setFocusable(false);

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 204));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("Nom");
        jTextField9.setFocusable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Codi Comanda");
        jTextField11.setFocusable(false);

        addNom.setBackground(new java.awt.Color(204, 255, 255));
        addNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addNomKeyTyped(evt);
            }
        });

        addUts.setBackground(new java.awt.Color(204, 255, 255));
        addUts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addUtsKeyTyped(evt);
            }
        });

        addComandaVendes.setBackground(new java.awt.Color(204, 255, 255));
        addComandaVendes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addComandaVendesActionPerformed(evt);
            }
        });
        addComandaVendes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addComandaVendesKeyTyped(evt);
            }
        });

        addCodi.setBackground(new java.awt.Color(204, 255, 255));
        addCodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCodiActionPerformed(evt);
            }
        });
        addCodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addCodiKeyTyped(evt);
            }
        });

        addDescripcio.setBackground(new java.awt.Color(204, 255, 255));
        addDescripcio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addDescripcioKeyTyped(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Descripcio");
        jTextField12.setFocusable(false);

        addAlt.setBackground(new java.awt.Color(204, 255, 255));
        addAlt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAltKeyTyped(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 204));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Alt (mm)");
        jTextField18.setFocusable(false);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 204));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("Unitats");
        jTextField34.setFocusable(false);

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 204));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("Codi Article");
        jTextField35.setFocusable(false);

        addRef.setBackground(new java.awt.Color(204, 255, 255));
        addRef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRefActionPerformed(evt);
            }
        });
        addRef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addRefKeyTyped(evt);
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
        jTextField37.setText("Acabat");
        jTextField37.setFocusable(false);

        addFondo.setBackground(new java.awt.Color(204, 255, 255));
        addFondo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addFondoKeyTyped(evt);
            }
        });

        addAcabat.setBackground(new java.awt.Color(204, 255, 255));
        addAcabat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAcabatKeyTyped(evt);
            }
        });

        addAmple.setBackground(new java.awt.Color(204, 255, 255));
        addAmple.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addAmpleKeyTyped(evt);
            }
        });

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(255, 255, 204));
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField19.setText("Ample (mm)");
        jTextField19.setFocusable(false);

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(255, 255, 204));
        jTextField20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20.setText("Fondo (mm)");
        jTextField20.setFocusable(false);

        btn_actualitzar1.setText("Afegir");
        btn_actualitzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualitzar1ActionPerformed(evt);
            }
        });

        jTextField47.setEditable(false);
        jTextField47.setBackground(new java.awt.Color(255, 255, 204));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("Import Unitat (€)");
        jTextField47.setFocusable(false);
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        jTextField48.setEditable(false);
        jTextField48.setBackground(new java.awt.Color(255, 255, 204));
        jTextField48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField48.setText("Import Total (€)");
        jTextField48.setFocusable(false);
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        addImportTotal.setBackground(new java.awt.Color(204, 255, 255));
        addImportTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addImportTotalKeyTyped(evt);
            }
        });

        addImportUt.setBackground(new java.awt.Color(204, 255, 255));
        addImportUt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addImportUtKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panel_insertLayout = new javax.swing.GroupLayout(panel_insert);
        panel_insert.setLayout(panel_insertLayout);
        panel_insertLayout.setHorizontalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addAmple, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addAlt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(panel_insertLayout.createSequentialGroup()
                                                .addComponent(addCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addComandaVendes, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(addNom))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_insertLayout.createSequentialGroup()
                                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(addAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel_insertLayout.createSequentialGroup()
                                                .addComponent(addArticle, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addImportTotal)
                                    .addComponent(addImportUt)
                                    .addComponent(addUts)))))
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_actualitzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        panel_insertLayout.setVerticalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_actualitzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addComandaVendes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addUts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addAcabat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addImportUt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addImportTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addAlt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addAmple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(598, Short.MAX_VALUE))
        );

        first_panel.setLayer(panel_modificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        first_panel.setLayer(panel_insert, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                    modCodi.setText("");
                    modComandaVendes.setText("");
                    modUts.setText("");
                    modArticle.setText("");
                    modRef.setText("");
                    modNom.setText("");
                    modDescripcio.setText("");
                    modAcabat.setText("");
                    modAlt.setText("");
                    modAmple.setText("");
                    modFondo.setText("");
                    modNotes.setText("");
                    modImportUt.setText("");
                    modImportTotal.setText("");
   
        //Fem visible el jpanel d'afegir
        panel_insert.setVisible(true);

    }//GEN-LAST:event_button_addMouseClicked

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        //En apretar el botó Sortir tanquem el programa en el mètode dispose() que fa que s'execute el mètode formWindowClosed()
        this.dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Mètode que s'executa quan obrim l'aplicació

        //Si el fixer existix creem un vector i l'omplim en les dades del fitxer i en cas contrari el dixem sense dades     
        if (f.exists()) {
            ObjectInputStream entrada = null;

            //LLegim el fitxer i omplim el vector en els detalls cv continguts dins ell
            try {
                //Obrim el fitxer per lectura
                entrada = new ObjectInputStream(new FileInputStream(f));

                //Index del vector per guardar els detalls cv trobats
                int i = 0;
                while (true) {
                    try {
                        vector.add((DetallComandesVendes) entrada.readObject());
                        System.out.println(vector);
                    } catch (EOFException e) {
                        System.out.println("eofe");
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(DetallComandesVendesGui.class.getName()).log(Level.SEVERE, null, ex);
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
        // Quan tanquem l'aplicació guardem els detalls cv vàlids al fixer

        //Declarem el detall cv
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

     
    private void button_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_modificarMouseClicked
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);
        panel_modificar.setVisible(true);
        
//Fem visible el jpanel de modificar i inicialment desactivem el botó d'actualitzar canvis i els quadres de text

        btn_actualitzar.setEnabled(false);
        modCodi.setEnabled(false);
        modComandaVendes.setEnabled(false);
        modUts.setEnabled(false);
        modArticle.setEnabled(false);
        modRef.setEnabled(false);
        modNom.setEnabled(false);
        modDescripcio.setEnabled(false);
        modAcabat.setEnabled(false);
        modAlt.setEnabled(false);
        modAmple.setEnabled(false);
        modFondo.setEnabled(false);
        modNotes.setEnabled(false);
        modImportUt.setEnabled(false);
        modImportTotal.setEnabled(false);
        
        //Omplim la taula en els detalls cv del vector

        //LLegim el vector i anem omplint la taula
        //Index del vector
        int i;
        
    }//GEN-LAST:event_button_modificarMouseClicked

    private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
        ModelTaula<DetallComandesVendes> mt = new ModelTaula(vector);
        
        //Li assigno el model a la taula
        taulaModelDetallCV.setModel(mt);
    }//GEN-LAST:event_button_modificarActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void addArticleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addArticleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addArticleKeyTyped

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void addNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addNomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addNomKeyTyped

    private void addUtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addUtsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addUtsKeyTyped

    private void addComandaVendesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addComandaVendesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addComandaVendesActionPerformed

    private void addComandaVendesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addComandaVendesKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addComandaVendesKeyTyped

    private void addCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCodiActionPerformed

    private void addCodiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addCodiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addCodiKeyTyped

    private void addDescripcioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addDescripcioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addDescripcioKeyTyped

    private void addAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAltKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAltKeyTyped

    private void addRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRefActionPerformed

    private void addRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addRefKeyTyped

    private void addFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addFondoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addFondoKeyTyped

    private void addAcabatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAcabatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAcabatKeyTyped

    private void addAmpleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addAmpleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addAmpleKeyTyped

    private void btn_actualitzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualitzar1ActionPerformed
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);

        int index=0;

        //Resetejem els camps de text.
        modCodi.setText("");
        modComandaVendes.setText("");
        modUts.setText("");
        modArticle.setText("");
        modRef.setText("");
        modNom.setText("");
        modDescripcio.setText("");
        modAcabat.setText("");
        modAlt.setText("");
        modAmple.setText("");
        modFondo.setText("");
        modNotes.setText("");
        modImportUt.setText("");
        modImportTotal.setText("");

        vector.get(index).setCodi(Integer.parseInt(modCodi.getText().trim()));
        vector.get(index).setComandaVendes(modComandaVendes.getText().trim()); /*objecte*/
        vector.get(index).setUts(Integer.parseInt(modUts.getText().trim()));  
        vector.get(index).setArticle(modArticle.getText().trim()); /*objecte*/
        vector.get(index).setRef(modRef.getText().trim());
        vector.get(index).setNom(modNom.getText().trim());
        vector.get(index).setDescripcio(modDescripcio.getText().trim());
        vector.get(index).setAcabat(modAcabat.getText().trim());
        vector.get(index).setAlt(Integer.parseInt(modAlt.getText().trim()));
        vector.get(index).setAmple(Integer.parseInt(modAmple.getText().trim()));
        vector.get(index).setFondo(Integer.parseInt(modFondo.getText().trim()));
        vector.get(index).setNotes(modNotes.getText().trim());
        vector.get(index).setImportUt(Integer.parseInt(modImportUt.getText().trim()));
        vector.get(index).setImportTotal(Integer.parseInt(modImportTotal.getText().trim()));

        //I ara actualitzo la taula

        taulaModelDetallCV.setValueAt(vector.get(index).getCodi(),taulaModelDetallCV.getSelectedRow(), 0);
        taulaModelDetallCV.setValueAt(vector.get(index).getComandaVendes(),taulaModelDetallCV.getSelectedRow(), 1);
        taulaModelDetallCV.setValueAt(vector.get(index).getUts(),taulaModelDetallCV.getSelectedRow(), 2); /*objecte*/
        taulaModelDetallCV.setValueAt(vector.get(index).getArticle(),taulaModelDetallCV.getSelectedRow(), 3);
        taulaModelDetallCV.setValueAt(vector.get(index).getRef(),taulaModelDetallCV.getSelectedRow(), 4);
        taulaModelDetallCV.setValueAt(vector.get(index).getNom(),taulaModelDetallCV.getSelectedRow(), 5);
        taulaModelDetallCV.setValueAt(vector.get(index).getDescripcio(),taulaModelDetallCV.getSelectedRow(), 6);
        taulaModelDetallCV.setValueAt(vector.get(index).getAcabat(),taulaModelDetallCV.getSelectedRow(), 7);
        taulaModelDetallCV.setValueAt(vector.get(index).getAlt(),taulaModelDetallCV.getSelectedRow(), 8);
        taulaModelDetallCV.setValueAt(vector.get(index).getAmple(),taulaModelDetallCV.getSelectedRow(), 9);
        taulaModelDetallCV.setValueAt(vector.get(index).getFondo(),taulaModelDetallCV.getSelectedRow(), 10);
        taulaModelDetallCV.setValueAt(vector.get(index).getNotes(),taulaModelDetallCV.getSelectedRow(), 11);
        taulaModelDetallCV.setValueAt(vector.get(index).getImportUt(),taulaModelDetallCV.getSelectedRow(), 12);
        taulaModelDetallCV.setValueAt(vector.get(index).getImportTotal(),taulaModelDetallCV.getSelectedRow(), 13);

        // Finalment desactivo jtextfields i botó d'actualitzar
        modCodi.setEnabled(false);
        modComandaVendes.setEnabled(false);
        modUts.setEnabled(false);
        modArticle.setEnabled(false);
        modRef.setEnabled(false);
        modNom.setEnabled(false);
        modDescripcio.setEnabled(false);
        modAcabat.setEnabled(false);
        modAlt.setEnabled(false);
        modAmple.setEnabled(false);
        modFondo.setEnabled(false);
        modNotes.setEnabled(false);
        modImportUt.setEnabled(false);
        modImportTotal.setEnabled(false);

    }//GEN-LAST:event_btn_actualitzar1ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void btn_actualitzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualitzarActionPerformed
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);

        int index=0;

        //Resetejem els camps de text.
        modCodi.setText("");
        modComandaVendes.setText("");
        modUts.setText("");
        modArticle.setText("");
        modRef.setText("");
        modNom.setText("");
        modDescripcio.setText("");
        modAcabat.setText("");
        modAlt.setText("");
        modAmple.setText("");
        modFondo.setText("");
        modNotes.setText("");
        modImportUt.setText("");
        modImportTotal.setText("");
        

        vector.get(index).setCodi(Integer.parseInt(modCodi.getText().trim()));
        vector.get(index).setComandaVendes(modComandaVendes.getText().trim());
        vector.get(index).setUts(Integer.parseInt(modUts.getText().trim()));
        vector.get(index).setArticle(modArticle.getText().trim());
        vector.get(index).setRef(modRef.getText().trim());
        vector.get(index).setNom(modNom.getText().trim());
        vector.get(index).setDescripcio(modDescripcio.getText().trim());
        vector.get(index).setAcabat(modAcabat.getText().trim());
        vector.get(index).setAlt(Integer.parseInt(modAlt.getText().trim()));
        vector.get(index).setAmple(Integer.parseInt(modAmple.getText().trim()));
        vector.get(index).setFondo(Integer.parseInt(modFondo.getText().trim()));
        vector.get(index).setNotes(modNotes.getText().trim());
        vector.get(index).setImportUt(Integer.parseInt(modImportTotal.getText().trim()));
        vector.get(index).setImportTotal(Integer.parseInt(modImportUt.getText().trim()));

        //I ara actualitzo la taula

        taulaModelDetallCV.setValueAt(vector.get(index).getCodi(),taulaModelDetallCV.getSelectedRow(), 0);
        taulaModelDetallCV.setValueAt(vector.get(index).getComandaVendes(),taulaModelDetallCV.getSelectedRow(), 1);
        taulaModelDetallCV.setValueAt(vector.get(index).getUts(),taulaModelDetallCV.getSelectedRow(), 2);
        taulaModelDetallCV.setValueAt(vector.get(index).getArticle(),taulaModelDetallCV.getSelectedRow(), 3);
        taulaModelDetallCV.setValueAt(vector.get(index).getRef(),taulaModelDetallCV.getSelectedRow(), 4);
        taulaModelDetallCV.setValueAt(vector.get(index).getNom(),taulaModelDetallCV.getSelectedRow(), 5);
        taulaModelDetallCV.setValueAt(vector.get(index).getDescripcio(),taulaModelDetallCV.getSelectedRow(), 6);
        taulaModelDetallCV.setValueAt(vector.get(index).getAcabat(),taulaModelDetallCV.getSelectedRow(), 7);
        taulaModelDetallCV.setValueAt(vector.get(index).getAlt(),taulaModelDetallCV.getSelectedRow(), 8);
        taulaModelDetallCV.setValueAt(vector.get(index).getAmple(),taulaModelDetallCV.getSelectedRow(), 9);
        taulaModelDetallCV.setValueAt(vector.get(index).getFondo(),taulaModelDetallCV.getSelectedRow(), 10);
        taulaModelDetallCV.setValueAt(vector.get(index).getNotes(),taulaModelDetallCV.getSelectedRow(), 11);
        taulaModelDetallCV.setValueAt(vector.get(index).getImportUt(),taulaModelDetallCV.getSelectedRow(), 12);
        taulaModelDetallCV.setValueAt(vector.get(index).getImportTotal(),taulaModelDetallCV.getSelectedRow(), 13);

        // Finalment desactivo jtextfields i botó d'actualitzar
        modCodi.setEnabled(false);
        modComandaVendes.setEnabled(false);
        modUts.setEnabled(false);
        modArticle.setEnabled(false);
        modRef.setEnabled(false);
        modNom.setEnabled(false);
        modDescripcio.setEnabled(false);
        modAcabat.setEnabled(false);
        modAlt.setEnabled(false);
        modAmple.setEnabled(false);
        modFondo.setEnabled(false);
        modNotes.setEnabled(false);
        modImportUt.setEnabled(false);
        modImportTotal.setEnabled(false);
    }//GEN-LAST:event_btn_actualitzarActionPerformed

    private void modArticleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modArticleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modArticleKeyTyped

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void modAltKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAltKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAltKeyTyped

    private void modFondoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modFondoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modFondoKeyTyped

    private void modAcabatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAcabatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAcabatKeyTyped

    private void modAmpleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modAmpleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modAmpleKeyTyped

    private void modDescripcioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDescripcioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modDescripcioKeyTyped

    private void modNomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modNomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modNomKeyTyped

    private void modUtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modUtsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modUtsKeyTyped

    private void modRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modRefActionPerformed

    private void modRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modRefKeyTyped

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void addImportTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addImportTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addImportTotalKeyTyped

    private void addImportUtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addImportUtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addImportUtKeyTyped

    private void jTextField49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField49ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField49ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void modImportUtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modImportUtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modImportUtKeyTyped

    private void modImportTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modImportTotalKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modImportTotalKeyTyped

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
            java.util.logging.Logger.getLogger(DetallComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetallComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetallComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetallComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetallComandesVendesGui().setVisible(true);
            }
        });
    }

    //Variables nostres
    //Vector per guardar els detalls cv durant l'execució
    private static ArrayList<DetallComandesVendes> vector=new ArrayList<>();

    //Nom del fitxer de detalls cv
    private static final File f = new File("detallComandesVendes.dat");
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addAcabat;
    private javax.swing.JTextField addAlt;
    private javax.swing.JTextField addAmple;
    private javax.swing.JTextField addArticle;
    private javax.swing.JTextField addCodi;
    private javax.swing.JTextField addComandaVendes;
    private javax.swing.JTextField addDescripcio;
    private javax.swing.JTextField addFondo;
    private javax.swing.JTextField addImportTotal;
    private javax.swing.JTextField addImportUt;
    private javax.swing.JTextField addNom;
    private javax.swing.JTextArea addNotes;
    private javax.swing.JTextField addRef;
    private javax.swing.JTextField addUts;
    private javax.swing.JButton btn_actualitzar;
    private javax.swing.JButton btn_actualitzar1;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_modificar;
    private javax.swing.JLayeredPane first_panel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField modAcabat;
    private javax.swing.JTextField modAlt;
    private javax.swing.JTextField modAmple;
    private javax.swing.JTextField modArticle;
    private javax.swing.JTextField modCodi;
    private javax.swing.JTextField modComandaVendes;
    private javax.swing.JTextField modDescripcio;
    private javax.swing.JTextField modFondo;
    private javax.swing.JTextField modImportTotal;
    private javax.swing.JTextField modImportUt;
    private javax.swing.JTextField modNom;
    private javax.swing.JTextArea modNotes;
    private javax.swing.JTextField modRef;
    private javax.swing.JTextField modUts;
    private javax.swing.JPanel panel_insert;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JTable taulaModelDetallCV;
    // End of variables declaration//GEN-END:variables
}
