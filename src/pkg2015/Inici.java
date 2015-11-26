/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2015;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;
import projecte.*;

/**
 *
 * @author albert
 */
public class Inici extends javax.swing.JFrame {

    /**
     * Creates new form Inici
     */
    public Inici() throws ThrowPersonal {
        initComponents();
        initComponentsProveidors();
        initComponentsClients();
        initComponentsArticles();
    }

    private static boolean proLlegit;
    private static boolean cliLlegit;
    private static boolean artLlegit;
    
/*PROVEIDORS*/
    public static ArrayList<Proveidors> llistaProveidors=new ArrayList<>();   
    public static final File fProveidors = new File("proveidor.dat");
  
/*CLIENTS*/
    public static ArrayList<Clients> llistaClients=new ArrayList<>();
    public static final File fClients = new File("clients.dat");
    
/*ARTICLES*/
    public static ArrayList<Articles> llistaArticles=new ArrayList<>();
    public static final File fArticles = new File("articles.dat");
  
private void initComponentsProveidors() throws ThrowPersonal{  
    if(proLlegit == false){
        if (fProveidors.exists()) {
            ObjectInputStream entrada = null;
            try {
                entrada = new ObjectInputStream(new FileInputStream(fProveidors));
                int i = 0;
                while (true) {
                    try {
                        llistaProveidors.add((Proveidors) entrada.readObject());
                    } catch (EOFException e) {
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ProveidorsGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException e) {
                throw new ThrowPersonal("Error en tancar el fitxer...");
            } finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error en tancar el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("Fitxer nou");
        }
    proLlegit = true;   
    }
}

private void initComponentsClients() throws ThrowPersonal{  
    if(cliLlegit == false){
        if (fClients.exists()) {
            ObjectInputStream entrada = null;
            try {
                entrada = new ObjectInputStream(new FileInputStream(fClients));
                int i = 0;
                while (true) {
                    try {
                        llistaClients.add((Clients) entrada.readObject());
                    } catch (EOFException e) {
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ClientsGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            } catch (IOException e) {
                throw new ThrowPersonal("Error en tancar el fitxer...");
            } finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error en tancar el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("Fitxer nou");
        }
    cliLlegit = true;
    }
}

private void initComponentsArticles() throws ThrowPersonal{
    if (artLlegit == false){
        if (fArticles.exists()) {
            ObjectInputStream entrada = null;
            try {
                entrada = new ObjectInputStream(new FileInputStream(fArticles));
                int i = 0;
                while (true) {
                    try {
                        llistaArticles.add((Articles) entrada.readObject());
                    } catch (EOFException e) {
                        break;
                    } catch (IOException|ClassNotFoundException ex) {
                        Logger.getLogger(ArticlesGui.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            } catch (IOException e) {
                throw new ThrowPersonal("Error en tancar el fitxer...");
            } finally {
                if (entrada != null) {
                    try {
                        entrada.close();
                    } catch (IOException e) {
                        JOptionPane.showMessageDialog(this, "Error en tancar el fitxer :" + e.getMessage() + "\nL'aplicació es tancarà!!");
                        System.exit(-1);
                    }
                }
            }
        } else {
            System.out.println("Fitxer nou");
        }
    artLlegit = true;
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botoClients = new javax.swing.JButton();
        botoProveidors = new javax.swing.JButton();
        articles = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projecte Java 2015");

        botoClients.setText("Clients");
        botoClients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoClientsActionPerformed(evt);
            }
        });

        botoProveidors.setText("Proveidors");
        botoProveidors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoProveidorsActionPerformed(evt);
            }
        });

        articles.setText("Articles");
        articles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articlesActionPerformed(evt);
            }
        });

        jButton1.setText("Llistar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botoClients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botoProveidors, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                    .addComponent(articles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(botoClients)
                .addGap(18, 18, 18)
                .addComponent(botoProveidors)
                .addGap(18, 18, 18)
                .addComponent(articles)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botoClientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoClientsActionPerformed
        this.setVisible(false);
        new ClientsGui().setVisible(true);
    }//GEN-LAST:event_botoClientsActionPerformed

    private void botoProveidorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoProveidorsActionPerformed
        this.setVisible(false);
        new ProveidorsGui().setVisible(true);
    }//GEN-LAST:event_botoProveidorsActionPerformed

    private void articlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articlesActionPerformed
        this.setVisible(false);
        new ArticlesGui().setVisible(true);
    }//GEN-LAST:event_articlesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Mostrar().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Inici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inici.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Inici().setVisible(true);
                } catch (ThrowPersonal ex) {
                    Logger.getLogger(Inici.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton articles;
    private javax.swing.JButton botoClients;
    private javax.swing.JButton botoProveidors;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}

class ModelTaula<T> extends AbstractTableModel {

    private String[] columnNames;
    private List<T> dades;

    public ModelTaula(String[] nomColumnes, ArrayList<T> dades) {
        
        this.columnNames = nomColumnes;
        this.dades = dades;
    }

    public ModelTaula(ArrayList<T> dades) {
        if(dades!=null && !dades.isEmpty()){
            //Obtinc els noms de les columnes a partir de la reflexió de la classe
            Class<?> classe = dades.get(0).getClass();

            //Anoto el nº de camps de la classe
            int ncamps = classe.getDeclaredFields().length;

            //Omplo l'array de noms de columna a partir del camps de la classe. Se suposa que el format dels noms dels camps 
            //és _xnom_camp, sent x un enter major o igual que 0, per això elimino els dígits i el _
            this.columnNames=new String[ncamps];

            for(int i=0;i<ncamps;i++){
                //Busquem el primer grup de _dígits numèrics del nom de camp
                Matcher matcher = Pattern.compile("_\\d+").matcher(classe.getDeclaredFields()[i].getName());
                matcher.find();
                //El nom que mostrarem serà a partir del següent caracter que hi ha després del _grup numèric trobat
                this.columnNames[i]=classe.getDeclaredFields()[i].getName().substring(matcher.group().length()).toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_0-9]", "").toUpperCase();
                //this.columnNames[i]=classe.getDeclaredFields()[i].getName().replaceAll("[_\\d]", "").toUpperCase();
                
            }
        }
        this.dades = dades;
    }

    //Necessari per a que mostre el nom de les columnes passat al crear l'objecte
    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }
    
    //Necessari per a que mostre el número correcte de files de dades
    @Override
    public int getRowCount() {
        int cont=0;
        
        if(dades!=null) cont=dades.size();
        
        return cont;
    }

    //Necessari per a que mostre el número correcte de columnes 
    @Override
    public int getColumnCount() {
        
        int cont=0;
        
        if(columnNames!=null) cont=columnNames.length;
        
        return cont;
    }

    //Necessari per a que mostre les dades passades al crear l'objecte
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Class<?> classe = dades.get(0).getClass();
        //Anotem el nº de camps de la classe
        int ncamps = classe.getDeclaredFields().length;

        Method[] methods = new Method[ncamps];
        int i = 0;
        try {
            for (PropertyDescriptor pD : Introspector.getBeanInfo(classe).getPropertyDescriptors()) {
                Method m = pD.getReadMethod();
                if (m != null & !m.getName().equals("getClass")) {
                    methods[i++] = m;
                }              
            }
        } catch (java.beans.IntrospectionException ex) {
            //Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            return methods[columnIndex].invoke(dades.get(rowIndex));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(ModelTaula.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

        public String ThrowPersonal() {
            return "Error en obrir el fitxer. L'aplicació es tancarà!";
        }

}