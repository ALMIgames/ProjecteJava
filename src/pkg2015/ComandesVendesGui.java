
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
import projecte.Clients;

public class ComandesVendesGui extends javax.swing.JFrame {

    public ComandesVendesGui() {
        initComponents();
        initComponentsMeus();
    }
        
    private void initComponentsMeus(){

        //Posem un listener a la taula de comandes vendes per modificar que actualitze els jtextfileds al canviar de fila seleccionada
        taulaModelCV.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // Si seleccionem una comanda vendes posem les seues dades als jtextfields corresponents i els activem 
                int i=taulaModelCV.getSelectedRow();
                if(i!=-1){
                    
                    //modNomCom.setText(vector.get(i).get2nomCom());
                    modCodi.setText(taulaModelCV.getModel().getValueAt(i, 0).toString());
                    modDataAlta.setText(taulaModelCV.getModel().getValueAt(i, 1).toString());
                    modClient.setText(taulaModelCV.getModel().getValueAt(i, 2).toString());
                    modRef.setText(taulaModelCV.getModel().getValueAt(i, 3).toString());
                    modResponsable.setText(taulaModelCV.getModel().getValueAt(i, 4).toString());
                    modDataEntrega.setText(taulaModelCV.getModel().getValueAt(i, 5).toString());
                    modObsEntrega.setText(taulaModelCV.getModel().getValueAt(i, 6).toString());
                    modNotes.setText((String)taulaModelCV.getModel().getValueAt(i, 7).toString());
                    modImportPreDesc.setText((String)taulaModelCV.getModel().getValueAt(i, 8).toString());
                    modDescompte.setText(taulaModelCV.getModel().getValueAt(i, 9).toString()); 
                    modImportBrut.setText(taulaModelCV.getModel().getValueAt(i, 10).toString()); 
                    modImportNet.setText((String)taulaModelCV.getModel().getValueAt(i, 11).toString()); 
                          
                    
                    modCodi.setEnabled(true);
                    modDataAlta.setEnabled(false);
                    modClient.setEnabled(true);
                    modRef.setEnabled(true);
                    modResponsable.setEnabled(true);
                    modDataEntrega.setEnabled(true);
                    modObsEntrega.setEnabled(true);
                    modNotes.setEnabled(true);
                    modImportPreDesc.setEnabled(true);
                    modDescompte.setEnabled(true);
                    modImportBrut.setEnabled(true);
                    modImportNet.setEnabled(true); 
                                        
                }
                
                //Si no hem seleccionat cap fila resetejem els jtextfields i els desactivem
                else{
                    modCodi.setText("");
                    modDataAlta.setText("");
                    modClient.setText("");
                    modRef.setText("");
                    modResponsable.setText("");
                    modDataEntrega.setText("");
                    modObsEntrega.setText("");
                    modNotes.setText("");
                    modImportPreDesc.setText("");
                    modDescompte.setText("");
                    modImportBrut.setText("");
                    modImportNet.setText(""); 
                    
                    modCodi.setEnabled(false);
                    modDataAlta.setEnabled(false);
                    modClient.setEnabled(false);
                    modRef.setEnabled(false);
                    modResponsable.setEnabled(false);
                    modDataEntrega.setEnabled(false);
                    modObsEntrega.setEnabled(false);
                    modNotes.setEnabled(false);
                    modImportPreDesc.setEnabled(false);
                    modDescompte.setEnabled(false);
                    modImportBrut.setEnabled(false);
                    modImportNet.setEnabled(false); 
                   
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
        taulaModelCV = new javax.swing.JTable();
        btn_actualitzar = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        modDataEntrega = new javax.swing.JTextField();
        modCodi = new javax.swing.JTextField();
        modClient = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        modResponsable = new javax.swing.JTextField();
        modDataAlta = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        modNotes = new javax.swing.JTextArea();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        modDescompte = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        modObsEntrega = new javax.swing.JTextArea();
        jTextField39 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        modImportBrut = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        modImportPreDesc = new javax.swing.JTextField();
        modRef = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        modImportNet = new javax.swing.JTextField();
        btn_actualitzar1 = new javax.swing.JButton();
        panel_insert = new javax.swing.JPanel();
        jTextField13 = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        addDescompte = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        addResponsable = new javax.swing.JTextField();
        addClient = new javax.swing.JTextField();
        addCodi = new javax.swing.JTextField();
        addDataEntrega = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        addRef = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        addObsEntrega = new javax.swing.JTextArea();
        jTextField37 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        addNotes = new javax.swing.JTextArea();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        addImportPreDesc = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        addImportBrut = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        addImportNet = new javax.swing.JTextField();
        btn_save1 = new javax.swing.JButton();

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

        taulaModelCV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Codi", "Data Alta", "Client", "Ref", "Responsable", "Data Entrega", "Notes Entrega", "Notes", "Import Inicial", "Descompte", "Import Brut", "Imort Net", "Index"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        taulaModelCV.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(taulaModelCV);
        if (taulaModelCV.getColumnModel().getColumnCount() > 0) {
            taulaModelCV.getColumnModel().getColumn(1).setPreferredWidth(45);
            taulaModelCV.getColumnModel().getColumn(4).setPreferredWidth(8);
            taulaModelCV.getColumnModel().getColumn(5).setPreferredWidth(25);
            taulaModelCV.getColumnModel().getColumn(6).setPreferredWidth(25);
            taulaModelCV.getColumnModel().getColumn(7).setPreferredWidth(8);
            taulaModelCV.getColumnModel().getColumn(8).setPreferredWidth(10);
            taulaModelCV.getColumnModel().getColumn(9).setPreferredWidth(8);
            taulaModelCV.getColumnModel().getColumn(10).setPreferredWidth(10);
            taulaModelCV.getColumnModel().getColumn(11).setPreferredWidth(8);
            taulaModelCV.getColumnModel().getColumn(12).setPreferredWidth(8);
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
        jTextField15.setText("Modificar comandes de vendes");
        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });

        jTextField35.setEditable(false);
        jTextField35.setBackground(new java.awt.Color(255, 255, 204));
        jTextField35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField35.setText("Responsable");
        jTextField35.setFocusable(false);
        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(255, 255, 204));
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField14.setText("Data Entrega");
        jTextField14.setFocusable(false);

        modDataEntrega.setBackground(new java.awt.Color(204, 255, 255));
        modDataEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDataEntregaKeyTyped(evt);
            }
        });

        modCodi.setBackground(new java.awt.Color(204, 255, 255));
        modCodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modCodiActionPerformed(evt);
            }
        });
        modCodi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modCodiKeyTyped(evt);
            }
        });

        modClient.setBackground(new java.awt.Color(204, 255, 255));
        modClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modClientActionPerformed(evt);
            }
        });
        modClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modClientKeyTyped(evt);
            }
        });

        jTextField44.setEditable(false);
        jTextField44.setBackground(new java.awt.Color(255, 255, 204));
        jTextField44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField44.setText("Notes");
        jTextField44.setFocusable(false);

        modResponsable.setBackground(new java.awt.Color(204, 255, 255));
        modResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modResponsableKeyTyped(evt);
            }
        });

        modDataAlta.setBackground(new java.awt.Color(204, 255, 255));
        modDataAlta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDataAltaKeyTyped(evt);
            }
        });

        modNotes.setColumns(20);
        modNotes.setRows(5);
        jScrollPane8.setViewportView(modNotes);

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(255, 255, 204));
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField16.setText("Client");
        jTextField16.setFocusable(false);

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(255, 255, 204));
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField17.setText("Data Comanda");
        jTextField17.setFocusable(false);
        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(255, 255, 204));
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField18.setText("Codi");
        jTextField18.setFocusable(false);

        jTextField38.setEditable(false);
        jTextField38.setBackground(new java.awt.Color(255, 255, 204));
        jTextField38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField38.setText("Descompte (%)");
        jTextField38.setFocusable(false);

        modDescompte.setBackground(new java.awt.Color(204, 255, 255));
        modDescompte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modDescompteKeyTyped(evt);
            }
        });

        modObsEntrega.setColumns(20);
        modObsEntrega.setRows(5);
        jScrollPane9.setViewportView(modObsEntrega);

        jTextField39.setEditable(false);
        jTextField39.setBackground(new java.awt.Color(255, 255, 204));
        jTextField39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField39.setText("Notes entrega");
        jTextField39.setFocusable(false);

        jTextField45.setEditable(false);
        jTextField45.setBackground(new java.awt.Color(255, 255, 204));
        jTextField45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField45.setText("Import Net (€)");
        jTextField45.setFocusable(false);
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        modImportBrut.setBackground(new java.awt.Color(204, 255, 255));
        modImportBrut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modImportBrutKeyTyped(evt);
            }
        });

        jTextField33.setEditable(false);
        jTextField33.setBackground(new java.awt.Color(255, 255, 204));
        jTextField33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField33.setText("Referencia");
        jTextField33.setFocusable(false);

        jTextField46.setEditable(false);
        jTextField46.setBackground(new java.awt.Color(255, 255, 204));
        jTextField46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField46.setText("Import Brut (€)");
        jTextField46.setFocusable(false);
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });

        modImportPreDesc.setBackground(new java.awt.Color(204, 255, 255));
        modImportPreDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modImportPreDescKeyTyped(evt);
            }
        });

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

        jTextField47.setEditable(false);
        jTextField47.setBackground(new java.awt.Color(255, 255, 204));
        jTextField47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField47.setText("Import Inicial (€)");
        jTextField47.setFocusable(false);
        jTextField47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField47ActionPerformed(evt);
            }
        });

        modImportNet.setBackground(new java.awt.Color(204, 255, 255));
        modImportNet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modImportNetKeyTyped(evt);
            }
        });

        btn_actualitzar1.setText("Detall comanda");
        btn_actualitzar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualitzar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_modificarLayout = new javax.swing.GroupLayout(panel_modificar);
        panel_modificar.setLayout(panel_modificarLayout);
        panel_modificarLayout.setHorizontalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_modificarLayout.createSequentialGroup()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                                .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_modificarLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_actualitzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_modificarLayout.createSequentialGroup()
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modCodi))
                                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_modificarLayout.createSequentialGroup()
                                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(modDataAlta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(modDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(panel_modificarLayout.createSequentialGroup()
                                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(modImportBrut, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel_modificarLayout.createSequentialGroup()
                                                .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(modImportNet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(panel_modificarLayout.createSequentialGroup()
                                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modClient, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(modImportPreDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panel_modificarLayout.setVerticalGroup(
            panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_modificarLayout.createSequentialGroup()
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_actualitzar, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_actualitzar1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modImportPreDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modDataAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modImportNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_modificarLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(modResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modImportBrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        panel_insert.setMaximumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setMinimumSize(new java.awt.Dimension(1000, 800));
        panel_insert.setPreferredSize(new java.awt.Dimension(1000, 800));
        panel_insert.setVisible(false);

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(204, 204, 255));
        jTextField13.setFont(new java.awt.Font("Ubuntu Light", 1, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField13.setText("Afegir comanda de vendes");
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
        jTextField32.setText("Referencia");
        jTextField32.setFocusable(false);

        addDescompte.setBackground(new java.awt.Color(204, 255, 255));
        addDescompte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addDescompteKeyTyped(evt);
            }
        });

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 204));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Codi");
        jTextField5.setFocusable(false);

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 204));
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.setText("Client");
        jTextField11.setFocusable(false);

        addResponsable.setBackground(new java.awt.Color(204, 255, 255));
        addResponsable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addResponsableKeyTyped(evt);
            }
        });

        addClient.setBackground(new java.awt.Color(204, 255, 255));
        addClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addClientActionPerformed(evt);
            }
        });
        addClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addClientKeyTyped(evt);
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

        addDataEntrega.setBackground(new java.awt.Color(204, 255, 255));
        addDataEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addDataEntregaKeyTyped(evt);
            }
        });

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(255, 255, 204));
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField12.setText("Data Entrega");
        jTextField12.setFocusable(false);

        jTextField34.setEditable(false);
        jTextField34.setBackground(new java.awt.Color(255, 255, 204));
        jTextField34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField34.setText("Responsable");
        jTextField34.setFocusable(false);
        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

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
        jTextField36.setText("Notes entrega");
        jTextField36.setFocusable(false);

        addObsEntrega.setColumns(20);
        addObsEntrega.setRows(5);
        jScrollPane6.setViewportView(addObsEntrega);

        jTextField37.setEditable(false);
        jTextField37.setBackground(new java.awt.Color(255, 255, 204));
        jTextField37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField37.setText("Descompte (%)");
        jTextField37.setFocusable(false);

        addNotes.setColumns(20);
        addNotes.setRows(5);
        jScrollPane7.setViewportView(addNotes);

        jTextField40.setEditable(false);
        jTextField40.setBackground(new java.awt.Color(255, 255, 204));
        jTextField40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField40.setText("Notes");
        jTextField40.setFocusable(false);

        jTextField41.setEditable(false);
        jTextField41.setBackground(new java.awt.Color(255, 255, 204));
        jTextField41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField41.setText("Import Inicial (€)");
        jTextField41.setFocusable(false);
        jTextField41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField41ActionPerformed(evt);
            }
        });

        addImportPreDesc.setBackground(new java.awt.Color(204, 255, 255));
        addImportPreDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addImportPreDescKeyTyped(evt);
            }
        });

        jTextField42.setEditable(false);
        jTextField42.setBackground(new java.awt.Color(255, 255, 204));
        jTextField42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField42.setText("Import Brut (€)");
        jTextField42.setFocusable(false);
        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        addImportBrut.setBackground(new java.awt.Color(204, 255, 255));
        addImportBrut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addImportBrutKeyTyped(evt);
            }
        });

        jTextField43.setEditable(false);
        jTextField43.setBackground(new java.awt.Color(255, 255, 204));
        jTextField43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField43.setText("Import Net (€)");
        jTextField43.setFocusable(false);
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });

        addImportNet.setBackground(new java.awt.Color(204, 255, 255));
        addImportNet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                addImportNetKeyTyped(evt);
            }
        });

        btn_save1.setText("Detall comanda");
        btn_save1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_save1MouseClicked(evt);
            }
        });
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_insertLayout = new javax.swing.GroupLayout(panel_insert);
        panel_insert.setLayout(panel_insertLayout);
        panel_insertLayout.setHorizontalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addCodi, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(addDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(addResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addImportNet, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addClient, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(14, 14, 14)
                                        .addComponent(addDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addImportBrut, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel_insertLayout.createSequentialGroup()
                                        .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(addImportPreDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panel_insertLayout.createSequentialGroup()
                                .addGap(468, 468, 468)
                                .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        panel_insertLayout.setVerticalGroup(
            panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_insertLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCodi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addRef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addImportPreDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addImportBrut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addDescompte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_insertLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addResponsable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addImportNet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(634, Short.MAX_VALUE))
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
                    modDataAlta.setText("");
                    modClient.setText("");
                    modRef.setText("");
                    modResponsable.setText("");
                    modDataEntrega.setText("");
                    modObsEntrega.setText("");
                    modNotes.setText("");
                    modImportPreDesc.setText("");
                    modDescompte.setText("");
                    modImportBrut.setText("");
                    modImportNet.setText("");
                   
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

            //LLegim el fitxer i omplim el vector en les comandes vendes contingudes dins ell
            try {
                //Obrim el fitxer per lectura
                entrada = new ObjectInputStream(new FileInputStream(f));

                //Index del vector per guardar les comandes vendes trobades
                int i = 0;
                while (true) {
                    try {
                        vector.add((ComandesVendes) entrada.readObject());
                        System.out.println(vector);
                    } catch (EOFException e) {
                        System.out.println("eofe");
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ComandesVendesGui.class.getName()).log(Level.SEVERE, null, ex);
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
        // Quan tanquem l'aplicació guardem les comandes vendes valides al fixer

        //Declarem la comanda vendes
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
        
        int index=0;
        
                //Resetejem els camps de text.
                    modCodi.setText("");
                    modDataAlta.setText("");
                    modClient.setText("");
                    modRef.setText("");
                    modResponsable.setText("");
                    modDataEntrega.setText("");
                    modObsEntrega.setText("");
                    modNotes.setText("");
                    modImportPreDesc.setText("");
                    modDescompte.setText("");
                    modImportBrut.setText("");
                    modImportNet.setText("");
                    
        vector.get(index).setCodi(Integer.parseInt(modCodi.getText().trim()));
        vector.get(index).setDataAlta(modDataAlta.getText().trim());
        vector.get(index).setClient(modClient.getText().trim());  /*objecte*/
        vector.get(index).setRef(modRef.getText().trim());
        vector.get(index).setResponsable(modResponsable.getText().trim());
        vector.get(index).setDataEntrega(modDataEntrega.getText().trim());
        vector.get(index).setObsEntrega(modObsEntrega.getText().trim());
        vector.get(index).setNotes(modNotes.getText().trim());
        vector.get(index).setImportPreDesc(Integer.parseInt(modImportPreDesc.getText().trim()));
        vector.get(index).setDescompte(Integer.parseInt(modDescompte.getText().trim()));
        vector.get(index).setImportBrut(Integer.parseInt(modImportBrut.getText().trim()));
        vector.get(index).setImportNet(Integer.parseInt(modImportNet.getText().trim()));
        
        //I ara actualitzo la taula
        
        taulaModelCV.setValueAt(vector.get(index).getCodi(),taulaModelCV.getSelectedRow(), 0);
        taulaModelCV.setValueAt(vector.get(index).getDataAlta(),taulaModelCV.getSelectedRow(), 1);
        taulaModelCV.setValueAt(vector.get(index).getClient(),taulaModelCV.getSelectedRow(), 2); /*objecte*/
        taulaModelCV.setValueAt(vector.get(index).getRef(),taulaModelCV.getSelectedRow(), 3);
        taulaModelCV.setValueAt(vector.get(index).getResponsable(),taulaModelCV.getSelectedRow(), 4);
        taulaModelCV.setValueAt(vector.get(index).getDataEntrega(),taulaModelCV.getSelectedRow(), 5);
        taulaModelCV.setValueAt(vector.get(index).getObsEntrega(),taulaModelCV.getSelectedRow(), 6);
        taulaModelCV.setValueAt(vector.get(index).getNotes(),taulaModelCV.getSelectedRow(), 7);
        taulaModelCV.setValueAt(vector.get(index).getImportPreDesc(),taulaModelCV.getSelectedRow(), 8);
        taulaModelCV.setValueAt(vector.get(index).getDescompte(),taulaModelCV.getSelectedRow(), 9);
        taulaModelCV.setValueAt(vector.get(index).getImportBrut(),taulaModelCV.getSelectedRow(), 10);
        taulaModelCV.setValueAt(vector.get(index).getImportNet(),taulaModelCV.getSelectedRow(), 11);
        
                
        // Finalment desactivo jtextfields i botó d'actualitzar
                    modCodi.setEnabled(false);
                    modDataAlta.setEnabled(false);
                    modClient.setEnabled(false);
                    modRef.setEnabled(false);
                    modResponsable.setEnabled(false);
                    modDataEntrega.setEnabled(false);
                    modObsEntrega.setEnabled(false);
                    modNotes.setEnabled(false);
                    modImportPreDesc.setEnabled(false);
                    modDescompte.setEnabled(false);
                    modImportBrut.setEnabled(false);
                    modImportNet.setEnabled(false);
                           
    }//GEN-LAST:event_btn_actualitzarActionPerformed

    private void button_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_modificarMouseClicked
        //Ocultem els altres jpanels
        panel_insert.setVisible(false);
        panel_modificar.setVisible(true);
        
//Fem visible el jpanel de modificar i inicialment desactivem el botó d'actualitzar canvis i els quadres de text

        btn_actualitzar.setEnabled(false);
        modCodi.setEnabled(false);
        modDataAlta.setEnabled(false);
        modClient.setEnabled(false);
        modRef.setEnabled(false);
        modResponsable.setEnabled(false);
        modDataEntrega.setEnabled(false);
        modObsEntrega.setEnabled(false);
        modNotes.setEnabled(false);
        modImportPreDesc.setEnabled(false);
        modDescompte.setEnabled(false);
        modImportBrut.setEnabled(false);
        modImportNet.setEnabled(false);
              
        //Omplim la taula en les comandes vendes del vector

        //LLegim el vector i anem omplint la taula
        //Index del vector
        int i;
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        
        String dataAlta;
        dataAlta = date.toString().trim();
                
    }//GEN-LAST:event_button_modificarMouseClicked

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void button_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_modificarActionPerformed
        ModelTaula<ComandesVendes> mt = new ModelTaula(vector);
        
        //Li assigno el model a la taula
        taulaModelCV.setModel(mt);
    }//GEN-LAST:event_button_modificarActionPerformed

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button_addActionPerformed

    private void addRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addRefKeyTyped

    private void addRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRefActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void addDataEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addDataEntregaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addDataEntregaKeyTyped

    private void addCodiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addCodiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addCodiKeyTyped

    private void addCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addCodiActionPerformed

    private void addClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addClientKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addClientKeyTyped

    private void addClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addClientActionPerformed

    private void addResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addResponsableKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addResponsableKeyTyped

    private void addDescompteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addDescompteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addDescompteKeyTyped

    private void btn_saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveMouseClicked

        //Creem l'objecte comanda vendes recuperant les dades introduïdes per l'usuari
        //Miro la data actual i la guardo a date.
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();

        String dataAlta;
        dataAlta = date.toString().trim();

        int Codi;
        Codi=Integer.parseInt(addCodi.getText());

        float ImportPreDesc;
        ImportPreDesc=Integer.parseInt(addImportPreDesc.getText());

        int Descompte;
        Descompte=Integer.parseInt(addDescompte.getText());

        float ImportBrut;
        ImportBrut=Integer.parseInt(addImportBrut.getText());

        float ImportNet;
        ImportNet=Integer.parseInt(addImportNet.getText());

        projecte.ComandesVendes comandaVendes = new projecte.ComandesVendes(
            Codi,
            dataAlta,
            addClient.getText(), /*Objecte*/
            addRef.getText(),
            addResponsable.getText(),
            addDataEntrega.getText(),
            addObsEntrega.getText(),
            addObsEntrega.getText(),
            ImportPreDesc,
            Descompte,
            ImportBrut,
            ImportNet
        );

        //El guardem a la primera posició lliure del vector
        vector.add(comandaVendes);
        //Si arribem aquí la comanda vendes s'ha guardat
        JOptionPane.showMessageDialog(this, "Comanda vendes guardada correctament!!");
        //Resetejem els camps de text.
        addCodi.setText("");
        addClient.setText("");
        addRef.setText("");
        addResponsable.setText("");
        addDataEntrega.setText("");
        addObsEntrega.setText("");
        addObsEntrega.setText("");
        addImportPreDesc.setText("");
        addDescompte.setText("");
        addImportBrut.setText("");
        addImportNet.setText("");
    }//GEN-LAST:event_btn_saveMouseClicked

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void addImportPreDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addImportPreDescKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addImportPreDescKeyTyped

    private void jTextField41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField41ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void addImportBrutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addImportBrutKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addImportBrutKeyTyped

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void addImportNetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addImportNetKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_addImportNetKeyTyped

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void modDataEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDataEntregaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modDataEntregaKeyTyped

    private void modCodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modCodiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modCodiActionPerformed

    private void modCodiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modCodiKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modCodiKeyTyped

    private void modClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modClientActionPerformed

    private void modClientKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modClientKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modClientKeyTyped

    private void modResponsableKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modResponsableKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modResponsableKeyTyped

    private void modDataAltaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDataAltaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modDataAltaKeyTyped

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void modDescompteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modDescompteKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modDescompteKeyTyped

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void modImportBrutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modImportBrutKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modImportBrutKeyTyped

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void modImportPreDescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modImportPreDescKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modImportPreDescKeyTyped

    private void modRefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modRefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modRefActionPerformed

    private void modRefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modRefKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modRefKeyTyped

    private void jTextField47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField47ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField47ActionPerformed

    private void modImportNetKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modImportNetKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_modImportNetKeyTyped

    private void btn_save1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_save1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save1MouseClicked

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void btn_actualitzar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualitzar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actualitzar1ActionPerformed

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
            java.util.logging.Logger.getLogger(ComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComandesVendesGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComandesVendesGui().setVisible(true);
            }
        });
    }

    //Variables nostres
    //Vector per guardar les comandes vendes durant l'execució
    private static ArrayList<ComandesVendes> vector=new ArrayList<>();

    //Nom del fitxer de comandes vendes
    private static final File f = new File("comandesVendes.dat");
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addClient;
    private javax.swing.JTextField addCodi;
    private javax.swing.JTextField addDataEntrega;
    private javax.swing.JTextField addDescompte;
    private javax.swing.JTextField addImportBrut;
    private javax.swing.JTextField addImportNet;
    private javax.swing.JTextField addImportPreDesc;
    private javax.swing.JTextArea addNotes;
    private javax.swing.JTextArea addObsEntrega;
    private javax.swing.JTextField addRef;
    private javax.swing.JTextField addResponsable;
    private javax.swing.JButton btn_actualitzar;
    private javax.swing.JButton btn_actualitzar1;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_modificar;
    private javax.swing.JLayeredPane first_panel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField modClient;
    private javax.swing.JTextField modCodi;
    private javax.swing.JTextField modDataAlta;
    private javax.swing.JTextField modDataEntrega;
    private javax.swing.JTextField modDescompte;
    private javax.swing.JTextField modImportBrut;
    private javax.swing.JTextField modImportNet;
    private javax.swing.JTextField modImportPreDesc;
    private javax.swing.JTextArea modNotes;
    private javax.swing.JTextArea modObsEntrega;
    private javax.swing.JTextField modRef;
    private javax.swing.JTextField modResponsable;
    private javax.swing.JPanel panel_insert;
    private javax.swing.JPanel panel_modificar;
    private javax.swing.JTable taulaModelCV;
    // End of variables declaration//GEN-END:variables
}
