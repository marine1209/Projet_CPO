/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projet_onitama;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JButton;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Gaspard Rouault
 */
public class Fenetre_Principale extends javax.swing.JFrame {

    GrilleDeJeu grille;
    int i;
    ArrayList<Cartes2> cartesTirees;

    /**
     * Creates new form Fenetre_Principale
     */
    public Fenetre_Principale() {
        initComponents();

        this.grille = new GrilleDeJeu(5, 5);
        PanneauGrille.setLayout(new GridLayout(5, 5));
        getContentPane().add(PanneauGrille, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 5 * 40, 5 * 40));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                CaseGrilleGraphique bouton_case = new CaseGrilleGraphique(grille.matriceCellules[i][j]);
                PanneauGrille.add(bouton_case); // ajout au Jpanel PanneauGrille
            }
        }

        PanneauCartesHaut.setLayout(new GridLayout(1, 2));
        getContentPane().add(PanneauCartesHaut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70));

        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < 2; i++) {
            //ImageIcon dragonImage=new ImageIcon("C:\\Users\\marie\\Documents\\EPF\\2A\\CPO\\cartes onitama.jpg");
            //JButton JRcarte1 = new JButton(dragonImage);
            //frame.getContentPane().add(JRcarte1, BorderLayout.CENTER);
            JButton JRcarte2 = new JButton();
            //JRcarte1.setText("→");
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    //grille.activerLigneDeCellules(j);
                    repaint();
                    //VerificationCellulesEteintes();
                }
            };
            JRcarte1.addActionListener(ecouteurClick);
            JRcarte2.addActionListener(ecouteurClick);
            //PanneauCartesHaut.add(bouton_ligne);
        }
        PanneauCartesBas.setLayout(new GridLayout(1, 2));
        getContentPane().add(PanneauCartesBas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 2 * 40, 1 * 40));
        this.pack();
        this.revalidate();
        // création du panneau de boutons verticaux (pour les lignes)
        for (i = 0; i < 2; i++) {
            JButton JBcarte1 = new JButton();
            JButton JBcarte2 = new JButton();
            //JRcarte1.setText("→");
            ActionListener ecouteurClick = new ActionListener() {
                final int j = i;

                @Override
                public void actionPerformed(ActionEvent e) {
                    //grille.activerLigneDeCellules(j);
                    repaint();
                    //VerificationCellulesEteintes();
                }
            };
            JBcarte1.addActionListener(ecouteurClick);
            JBcarte2.addActionListener(ecouteurClick);
            //PanneauCartesHaut.add(bouton_ligne);

        }
        tirageCartes();
        affichageCartes();
    }

    /**
     * Méthode qui tire 5 cartes aléatoirement
     *
     * @return un arraylist contenant les 5 cartes
     */
    public ArrayList tirerCartesAléatoire() {
        ArrayList<String> tab = new ArrayList<String>();
        tab.add("Boar");
        tab.add("Cobra");
        tab.add("Crab");
        tab.add("Crane");
        tab.add("Dragon");
        tab.add("Eel");
        tab.add("Elephant");
        tab.add("Frog");
        tab.add("Goose");
        tab.add("Horse");
        tab.add("Mantis");
        tab.add("Monkey");
        tab.add("Ox");
        tab.add("Rabbit");
        tab.add("Rooster");
        tab.add("Tiger");
        ArrayList<String> cartes_tirees = new ArrayList<String>();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int temp = random.nextInt(16 - i);
            String carte_temp = tab.get(temp);
            cartes_tirees.add(carte_temp);
            tab.remove(carte_temp);
        }
        return cartes_tirees;
    }

    public void tirageCartes() {
        ArrayList<Cartes2> cartesTirees = new ArrayList<Cartes2>();
        ArrayList<String> nomCartes = new ArrayList<String>();
        nomCartes.add("boar");
        nomCartes.add("cobra");
        nomCartes.add("crab");
        nomCartes.add("cane");
        nomCartes.add("dragon");
        nomCartes.add("eel");
        nomCartes.add("elephant");
        nomCartes.add("frog");
        nomCartes.add("goose");
        nomCartes.add("horse");
        nomCartes.add("mantis");
        nomCartes.add("monkey");
        nomCartes.add("ox");
        nomCartes.add("rabbit");
        nomCartes.add("rooster");
        nomCartes.add("tiger");
        Random random = new Random();
        for (int j = 0; j < 5; j++) {
            int nombreTireAuHasard = random.nextInt(16 - j);
            String nomCarteTiree = nomCartes.get(nombreTireAuHasard);
            cartesTirees.add(new Cartes2(nomCarteTiree));
            nomCartes.remove(nombreTireAuHasard);
        }
        this.cartesTirees = cartesTirees;
    }

    public void affichageCartes() {

        for (int j = 0; j < cartesTirees.size(); j++) {

            ImageIcon Icon = createImageIcon("/Images/"+this.cartesTirees.get(j).nom+".jpg");
                switch (j) {
        case 0:
            JBcarte1.setIcon(Icon);
            break;
        case 1:
            JBcarte2.setIcon(Icon);
            break;
        case 2:
            JRcarte1.setIcon(Icon);
            break;
        case 3:
            JRcarte2.setIcon(Icon);
            break;
        case 4:
            Bcartecote.setIcon(Icon);
            break;
        default:
            break;
    }
        }

    }
    

    private ImageIcon createImageIcon(String path) {
        URL imageURL = getClass().getResource(path);
        if (imageURL != null) {
            return new ImageIcon(imageURL);
        } else {
            System.err.println("Impossible de trouver le fichier : " + path);
            return null;
        }
    }

    /*public String tirerCarteAleatoire() {
        
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauGrille = new javax.swing.JPanel();
        PanneauCartesHaut = new javax.swing.JPanel();
        JRcarte2 = new javax.swing.JButton();
        JRcarte1 = new javax.swing.JButton();
        PanneauCartesBas = new javax.swing.JPanel();
        JBcarte2 = new javax.swing.JButton();
        JBcarte1 = new javax.swing.JButton();
        PanneauInfoJR = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PanneauInfoJB = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Bcartecote = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 1300));

        PanneauGrille.setBackground(new java.awt.Color(204, 255, 204));
        PanneauGrille.setPreferredSize(new java.awt.Dimension(235, 235));

        javax.swing.GroupLayout PanneauGrilleLayout = new javax.swing.GroupLayout(PanneauGrille);
        PanneauGrille.setLayout(PanneauGrilleLayout);
        PanneauGrilleLayout.setHorizontalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );
        PanneauGrilleLayout.setVerticalGroup(
            PanneauGrilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 235, Short.MAX_VALUE)
        );

        PanneauCartesHaut.setBackground(new java.awt.Color(255, 102, 102));
        PanneauCartesHaut.setAlignmentX(50.0F);
        PanneauCartesHaut.setAlignmentY(100.0F);
        PanneauCartesHaut.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JRcarte2.setPreferredSize(new java.awt.Dimension(100, 80));
        JRcarte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRcarte2ActionPerformed(evt);
            }
        });
        PanneauCartesHaut.add(JRcarte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 3, 300, 185));

        JRcarte1.setPreferredSize(new java.awt.Dimension(100, 80));
        JRcarte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRcarte1ActionPerformed(evt);
            }
        });
        PanneauCartesHaut.add(JRcarte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 3, 300, 185));

        PanneauCartesBas.setBackground(new java.awt.Color(51, 153, 255));
        PanneauCartesBas.setAlignmentX(50.0F);
        PanneauCartesBas.setPreferredSize(new java.awt.Dimension(610, 192));
        PanneauCartesBas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JBcarte2.setPreferredSize(new java.awt.Dimension(100, 80));
        JBcarte2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcarte2ActionPerformed(evt);
            }
        });
        PanneauCartesBas.add(JBcarte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 3, 300, 185));

        JBcarte1.setPreferredSize(new java.awt.Dimension(100, 80));
        JBcarte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcarte1ActionPerformed(evt);
            }
        });
        PanneauCartesBas.add(JBcarte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 3, 300, 185));

        PanneauInfoJR.setBackground(new java.awt.Color(255, 102, 102));
        PanneauInfoJR.setMinimumSize(new java.awt.Dimension(50, 50));
        PanneauInfoJR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Infos Joueur Rouge");
        PanneauInfoJR.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setText("Nom Joueur:");
        PanneauInfoJR.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        PanneauInfoJR.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel5.setText("Elèves : 4");
        PanneauInfoJR.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel7.setText("Sensei : 1");
        PanneauInfoJR.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        PanneauInfoJB.setBackground(new java.awt.Color(0, 153, 255));
        PanneauInfoJB.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Infos Joueur Bleu");
        PanneauInfoJB.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setText("Nom Joueur");
        PanneauInfoJB.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTextField2.setText("jTextField2");
        PanneauInfoJB.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel6.setText("Elèves : 4");
        PanneauInfoJB.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel8.setText("Sensei : 1");
        PanneauInfoJB.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Bcartecote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcartecoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(PanneauGrille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(362, 362, 362)
                .addComponent(Bcartecote, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1075, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanneauCartesBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneauCartesHaut, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanneauInfoJR, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneauInfoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PanneauCartesHaut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanneauInfoJR, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PanneauGrille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Bcartecote, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanneauCartesBas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                .addComponent(PanneauInfoJB, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBcarte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcarte2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBcarte2ActionPerformed

    private void JRcarte2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRcarte2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRcarte2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void JRcarte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRcarte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRcarte1ActionPerformed

    private void JBcarte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcarte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBcarte1ActionPerformed

    private void BcartecoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcartecoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcartecoteActionPerformed

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
            java.util.logging.Logger.getLogger(Fenetre_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre_Principale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fenetre_Principale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcartecote;
    private javax.swing.JButton JBcarte1;
    private javax.swing.JButton JBcarte2;
    private javax.swing.JButton JRcarte1;
    private javax.swing.JButton JRcarte2;
    private javax.swing.JPanel PanneauCartesBas;
    private javax.swing.JPanel PanneauCartesHaut;
    private javax.swing.JPanel PanneauGrille;
    private javax.swing.JPanel PanneauInfoJB;
    private javax.swing.JPanel PanneauInfoJR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
