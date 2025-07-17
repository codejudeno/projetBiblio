/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GestionDonnee;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author DevJudeno
 */
public class interfacePrincipale extends javax.swing.JFrame {

    /**
     * Creates new form interfacePrincipale
     */
    public interfacePrincipale() {
        initComponents();
        setLocationRelativeTo(null);
        menuFalse();

        btnLivre.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               new ui_Livre().setVisible(true);
            }
        });
// Mete bouton an transparan san border
btnDashboard.setContentAreaFilled(false);
btnDashboard.setBorderPainted(false);
btnDashboard.setFocusPainted(false);
btnDashboard.setOpaque(false);

btnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDashboard.setContentAreaFilled(true);  // mete background pou hover
        btnDashboard.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
        btnDashboard.setBorderPainted(false);
        btnDashboard.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDashboard.setContentAreaFilled(false); // retire background
    }
});
        
 // Mete bouton an transparan san border
btnLivre.setContentAreaFilled(false);
btnLivre.setBorderPainted(false);
btnLivre.setFocusPainted(false);
btnLivre.setOpaque(false);

btnLivre.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnLivre.setContentAreaFilled(true);  // mete background pou hover
        btnLivre.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
        btnLivre.setBorderPainted(false);
        btnLivre.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnLivre.setContentAreaFilled(false); // retire background
    }
});

btnAdherant.setContentAreaFilled(false);
btnAdherant.setBorderPainted(false);
btnAdherant.setFocusPainted(false);
btnAdherant.setOpaque(false);

btnAdherant.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnAdherant.setContentAreaFilled(true);  // mete background pou hover
        btnAdherant.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
        btnAdherant.setBorderPainted(false);
        btnAdherant.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnAdherant.setContentAreaFilled(false); // retire background
    }
});

btnEmprunt.setContentAreaFilled(false);
btnEmprunt.setBorderPainted(false);
btnEmprunt.setFocusPainted(false);
btnEmprunt.setOpaque(false);

btnEmprunt.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnEmprunt.setContentAreaFilled(true);  // mete background pou hover
        btnEmprunt.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
        btnEmprunt.setBorderPainted(false);
        btnEmprunt.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnEmprunt.setContentAreaFilled(false); // retire background
    }
});

btnRetourEmprunt.setContentAreaFilled(false);
btnRetourEmprunt.setBorderPainted(false);
btnRetourEmprunt.setFocusPainted(false);
btnRetourEmprunt.setOpaque(false);

btnRetourEmprunt.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnRetourEmprunt.setContentAreaFilled(true);  // mete background pou hover
        btnRetourEmprunt.setBackground(new java.awt.Color(1,52,110));// koulè hover la
        
        btnRetourEmprunt.setBorderPainted(false);
        btnRetourEmprunt.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnRetourEmprunt.setContentAreaFilled(false); // retire background
    }
});

btnCategorie.setContentAreaFilled(false);
btnCategorie.setBorderPainted(false);
btnCategorie.setFocusPainted(false);
btnCategorie.setOpaque(false);

btnCategorie.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnCategorie.setContentAreaFilled(true);  // mete background pou hover
        btnCategorie.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
        btnCategorie.setBorderPainted(false);
        btnCategorie.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnCategorie.setContentAreaFilled(false); // retire background
    }
});


        comboBoxrapport.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                comboBoxrapport.setBackground(new java.awt.Color(1, 52, 110)); // Koulè hover
                comboBoxrapport.repaint();
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comboBoxrapport.setBackground(new java.awt.Color(255, 255, 255)); // Transparent background
                comboBoxrapport.repaint();
            }
        });

btnConnecter.setContentAreaFilled(false);
btnConnecter.setBorderPainted(false);
btnConnecter.setFocusPainted(false);
btnConnecter.setOpaque(false);

btnConnecter.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
         btnConnecter.setContentAreaFilled(true);  // mete background pou hover
        btnConnecter.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
       btnConnecter.setBorderPainted(false);
        btnConnecter.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnConnecter.setContentAreaFilled(false); // retire background
    }
});

btnDeconnecter.setContentAreaFilled(false);
btnDeconnecter.setBorderPainted(false);
btnDeconnecter.setFocusPainted(false);
btnDeconnecter.setOpaque(false);

btnDeconnecter.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseEntered(java.awt.event.MouseEvent evt) {
        btnDeconnecter.setContentAreaFilled(true);  // mete background pou hover
        btnDeconnecter.setBackground(new java.awt.Color(1,52,110)); // koulè hover la
        
       btnDeconnecter.setBorderPainted(false);
        btnDeconnecter.setOpaque(false);
    }
    public void mouseExited(java.awt.event.MouseEvent evt) {
        btnDeconnecter.setContentAreaFilled(false); // retire background
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

        jPanel1 = new javax.swing.JPanel();
        roundedPanel1 = new GestionDonnee.RoundedPanel();
        jButton1 = new javax.swing.JButton();
        roundedPanel2 = new GestionDonnee.RoundedPanel();
        jLabel4 = new javax.swing.JLabel();
        PersonneConnecter = new javax.swing.JLabel("Hi "+Session.roleUtilisateur+ ", "+Session.nomUtilisateur);
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnConnecter = new javax.swing.JButton();
        btnDeconnecter = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLivre = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        btnAdherant = new javax.swing.JButton();
        btnEmprunt = new javax.swing.JButton();
        btnRetourEmprunt = new javax.swing.JButton();
        btnCategorie = new javax.swing.JButton();
        roundedPanel3 = new GestionDonnee.RoundedPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        comboBoxrapport = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1253, 699));

        jPanel1.setBackground(new java.awt.Color(1, 4, 88));

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(248, 246, 246));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\settings_24px.png")); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        roundedPanel2.setBackground(new java.awt.Color(1, 51, 126));

        jLabel4.setFont(new java.awt.Font("Schadow BT", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Livre + Organisation = Bookcraft. Belle journée à toi !");

        PersonneConnecter.setBackground(new java.awt.Color(1, 44, 88));
        PersonneConnecter.setFont(new java.awt.Font("Schadow BT", 1, 25)); // NOI18N
        PersonneConnecter.setForeground(new java.awt.Color(255, 255, 255));
        //PersonneConnecter.setText("Hi Administrateur Printemps Judeno Steevenson,");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\icom adm.png")); // NOI18N

        javax.swing.GroupLayout roundedPanel2Layout = new javax.swing.GroupLayout(roundedPanel2);
        roundedPanel2.setLayout(roundedPanel2Layout);
        roundedPanel2Layout.setHorizontalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PersonneConnecter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        roundedPanel2Layout.setVerticalGroup(
            roundedPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(PersonneConnecter, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.CardLayout());

        btnConnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConnecter.setForeground(new java.awt.Color(1, 4, 88));
        btnConnecter.setText("Se Connecter");
        btnConnecter.setPreferredSize(new java.awt.Dimension(130, 27));
        btnConnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnecterActionPerformed(evt);
            }
        });
        jPanel2.add(btnConnecter, "card2");

        btnDeconnecter.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDeconnecter.setForeground(new java.awt.Color(1, 4, 88));
        btnDeconnecter.setText("Se Deconnecter");
        btnDeconnecter.setPreferredSize(new java.awt.Dimension(130, 27));
        btnDeconnecter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeconnecterActionPerformed(evt);
            }
        });
        jPanel2.add(btnDeconnecter, "card3");

        jLabel5.setBackground(new java.awt.Color(1, 44, 88));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(1, 44, 88));
        jLabel5.setText("Accueil");

        jLabel6.setBackground(new java.awt.Color(1, 44, 88));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 44, 88));
        jLabel6.setText("Lundi 20 Juillet 2025");
        jLabel6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jPanel3.setBackground(new java.awt.Color(253, 253, 253));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 3, true));

        jLabel7.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel7.setText("Total Livres");

        jLabel12.setBackground(new java.awt.Color(153, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(1, 4, 88));
        jLabel12.setText("100");

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\books_80px.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(253, 253, 253));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 176, 225), 3, true));

        jLabel8.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel8.setText("Total Adherants");

        jLabel14.setBackground(new java.awt.Color(153, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(1, 4, 88));
        jLabel14.setText("100");

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\people_80px.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(161, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel5.setBackground(new java.awt.Color(253, 253, 253));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(16, 55, 13), 3, true));

        jLabel9.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel9.setText("Total Emprunts");

        jLabel11.setBackground(new java.awt.Color(153, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(1, 4, 88));
        jLabel11.setText("100");

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\borrow_book_80px.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(7, 7, 7))))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 15, 64), 3, true));

        jLabel16.setBackground(new java.awt.Color(253, 253, 253));
        jLabel16.setFont(new java.awt.Font("NSimSun", 0, 24)); // NOI18N
        jLabel16.setText("Total Reotur");

        jLabel17.setBackground(new java.awt.Color(153, 0, 0));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(1, 4, 88));
        jLabel17.setText("100");

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\rotate_left_100px.png")); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(378, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(16, 16, 16)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton3.setBackground(new java.awt.Color(248, 246, 246));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("?");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 12)); // NOI18N
        jLabel23.setText("© 2025 Bookcraft — Tous droits réservés. | Développé par DAMCO | Bien organisé, bien lu.");

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundedPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(roundedPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(roundedPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addComponent(roundedPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe Script", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Boocraft");

        btnLivre.setBackground(new java.awt.Color(1, 44, 88));
        btnLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLivre.setForeground(new java.awt.Color(255, 255, 255));
        btnLivre.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\book_24px.png")); // NOI18N
        btnLivre.setText("  Livre");
        btnLivre.setBorderPainted(false);
        btnLivre.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnDashboard.setBackground(new java.awt.Color(1, 44, 88));
        btnDashboard.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\home_24px.png")); // NOI18N
        btnDashboard.setText("  Accueil");
        btnDashboard.setBorderPainted(false);
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDashboardActionPerformed(evt);
            }
        });

        btnAdherant.setBackground(new java.awt.Color(1, 44, 88));
        btnAdherant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAdherant.setForeground(new java.awt.Color(255, 255, 255));
        btnAdherant.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\person_24px.png")); // NOI18N
        btnAdherant.setText("  Adherant");
        btnAdherant.setBorderPainted(false);
        btnAdherant.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdherant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdherantActionPerformed(evt);
            }
        });

        btnEmprunt.setBackground(new java.awt.Color(1, 44, 88));
        btnEmprunt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        btnEmprunt.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\borrow_book_24px.png")); // NOI18N
        btnEmprunt.setText("  Emprunt");
        btnEmprunt.setBorderPainted(false);
        btnEmprunt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnRetourEmprunt.setBackground(new java.awt.Color(1, 44, 88));
        btnRetourEmprunt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRetourEmprunt.setForeground(new java.awt.Color(255, 255, 255));
        btnRetourEmprunt.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\rotate_24px.png")); // NOI18N
        btnRetourEmprunt.setText("  Retour Emprunt");
        btnRetourEmprunt.setBorderPainted(false);
        btnRetourEmprunt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnCategorie.setBackground(new java.awt.Color(1, 44, 88));
        btnCategorie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCategorie.setForeground(new java.awt.Color(255, 255, 255));
        btnCategorie.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\categorize_24px.png")); // NOI18N
        btnCategorie.setText("  Categorie");
        btnCategorie.setBorderPainted(false);
        btnCategorie.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        roundedPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 51));
        jLabel21.setText("         Gérer vos Taches");

        jLabel22.setIcon(new javax.swing.ImageIcon("C:\\NetBeansProjects\\netbeansBoockraft\\icon\\list_100px.png")); // NOI18N

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ajouter une tache");

        javax.swing.GroupLayout roundedPanel3Layout = new javax.swing.GroupLayout(roundedPanel3);
        roundedPanel3.setLayout(roundedPanel3Layout);
        roundedPanel3Layout.setHorizontalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(roundedPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel22)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        roundedPanel3Layout.setVerticalGroup(
            roundedPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        comboBoxrapport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxrapport.setForeground(new java.awt.Color(255, 255, 255));
        comboBoxrapport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rapport Livre", "Rapport Adherant", "Rapport Emprunt", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLivre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdherant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmprunt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRetourEmprunt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCategorie, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundedPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBoxrapport, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAdherant, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetourEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCategorie, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxrapport, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundedPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void  btnLivreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
       new ui_Livre().setVisible(true);
    }
    private void btnAdherantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdherantActionPerformed
        // TODO add your handling code here:
        new ui_Livre().setVisible(true);
    }//GEN-LAST:event_btnAdherantActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnDeconnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeconnecterActionPerformed
        menuFalse();
    }//GEN-LAST:event_btnDeconnecterActionPerformed

    private void btnConnecterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnecterActionPerformed
                      new class_Connecter().setVisible(true);
                        dispose();
    }//GEN-LAST:event_btnConnecterActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(interfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfacePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PersonneConnecter;
    private javax.swing.JButton btnAdherant;
    private javax.swing.JButton btnCategorie;
    private javax.swing.JButton btnConnecter;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnDeconnecter;
    private javax.swing.JButton btnEmprunt;
    private javax.swing.JButton btnLivre;
    private javax.swing.JButton btnRetourEmprunt;
    private javax.swing.JComboBox<String> comboBoxrapport;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private GestionDonnee.RoundedPanel roundedPanel1;
    private GestionDonnee.RoundedPanel roundedPanel2;
    private GestionDonnee.RoundedPanel roundedPanel3;
    private boolean allowDisable = true;

    public void menuFalse(){
        if(!allowDisable)
            return;
        btnLivre.setEnabled(false);
        btnAdherant.setEnabled(false);
        btnEmprunt.setEnabled(false);
        btnRetourEmprunt.setEnabled(false);
        btnCategorie.setEnabled(false);
        comboBoxrapport.setEnabled(false);
        btnDeconnecter.setVisible(false);
        btnConnecter.setVisible(true);
    }
    public void menuTrue(){
        btnLivre.setEnabled(true);
        btnAdherant.setEnabled(true);
        btnEmprunt.setEnabled(true);
        btnRetourEmprunt.setEnabled(true);
        btnCategorie.setEnabled(true);
        comboBoxrapport.setEnabled(true);
        btnDeconnecter.setVisible(true);
        btnConnecter.setVisible(false);
        allowDisable = true;
    }
}
