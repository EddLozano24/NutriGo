/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrigo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Rene
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(new java.awt.Color(225, 255, 239));
        setIconImage(new ImageIcon(getClass().getResource("../img/recursos/Icono.png")).getImage());
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
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btn_inicio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btn_pacientes = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btn_dietas = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btn_citas = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btn_perfil = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setMinimumSize(new java.awt.Dimension(900, 500));

        jPanel1.setBackground(new java.awt.Color(131, 214, 167));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(912, 72));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setRollover(true);

        jSeparator5.setForeground(new java.awt.Color(0, 255, 122));
        jToolBar2.add(jSeparator5);

        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Home.png"))); // NOI18N
        btn_inicio.setText("Inicio");
        btn_inicio.setBorderPainted(false);
        btn_inicio.setContentAreaFilled(false);
        btn_inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_inicio.setFocusable(false);
        btn_inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_inicio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_inicio);

        jSeparator1.setBackground(new java.awt.Color(75, 194, 158));
        jSeparator1.setForeground(new java.awt.Color(75, 194, 158));
        jToolBar2.add(jSeparator1);

        btn_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Pacientes.png"))); // NOI18N
        btn_pacientes.setText("Pacientes");
        btn_pacientes.setBorderPainted(false);
        btn_pacientes.setContentAreaFilled(false);
        btn_pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pacientes.setFocusable(false);
        btn_pacientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_pacientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_pacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pacientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pacientesMouseExited(evt);
            }
        });
        btn_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacientesActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_pacientes);

        jSeparator2.setBackground(new java.awt.Color(75, 194, 158));
        jSeparator2.setForeground(new java.awt.Color(75, 194, 158));
        jToolBar2.add(jSeparator2);

        btn_dietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Dietas.png"))); // NOI18N
        btn_dietas.setText("Dietas");
        btn_dietas.setBorderPainted(false);
        btn_dietas.setContentAreaFilled(false);
        btn_dietas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dietas.setFocusable(false);
        btn_dietas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_dietas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_dietas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dietasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dietasMouseExited(evt);
            }
        });
        btn_dietas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dietasActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_dietas);

        jSeparator3.setBackground(new java.awt.Color(75, 194, 158));
        jSeparator3.setForeground(new java.awt.Color(75, 194, 158));
        jToolBar2.add(jSeparator3);

        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Citas.png"))); // NOI18N
        btn_citas.setText("Citas");
        btn_citas.setBorderPainted(false);
        btn_citas.setContentAreaFilled(false);
        btn_citas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_citas.setFocusable(false);
        btn_citas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_citas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_citasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_citasMouseExited(evt);
            }
        });
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_citas);

        jSeparator4.setBackground(new java.awt.Color(75, 194, 158));
        jSeparator4.setForeground(new java.awt.Color(75, 194, 158));
        jToolBar2.add(jSeparator4);

        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Perfil.png"))); // NOI18N
        btn_perfil.setText("Perfil");
        btn_perfil.setBorderPainted(false);
        btn_perfil.setContentAreaFilled(false);
        btn_perfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_perfil.setFocusable(false);
        btn_perfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_perfil.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_perfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_perfilMouseExited(evt);
            }
        });
        btn_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perfilActionPerformed(evt);
            }
        });
        jToolBar2.add(btn_perfil);

        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu/Salir.png"))); // NOI18N
        btn_cerrar.setText("Cerrar Sesion");
        btn_cerrar.setBorderPainted(false);
        btn_cerrar.setContentAreaFilled(false);
        btn_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cerrar.setFocusable(false);
        btn_cerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseExited(evt);
            }
        });
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btn_cerrar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 471, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pacientesActionPerformed

    private void btn_dietasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dietasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dietasActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_perfilActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "Estas seguro(a) que desea cerrar sesion", "Cerrar sesion", JOptionPane.YES_NO_OPTION);
        if (x==0)
        {
            this.setVisible(false);
            Login l = new Login();
            l.setVisible(true);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
        btn_inicio.setForeground(Color.white);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Home_2.png")));
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
        btn_inicio.setForeground(Color.black);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Home.png")));
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_pacientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacientesMouseEntered
        btn_pacientes.setForeground(Color.white);
        btn_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Pacientes_2.png")));
    }//GEN-LAST:event_btn_pacientesMouseEntered

    private void btn_pacientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacientesMouseExited
        btn_pacientes.setForeground(Color.black);
        btn_pacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Pacientes.png")));
    }//GEN-LAST:event_btn_pacientesMouseExited

    private void btn_dietasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dietasMouseEntered
        btn_dietas.setForeground(Color.white);
        btn_dietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Dietas_2.png")));
    }//GEN-LAST:event_btn_dietasMouseEntered

    private void btn_dietasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dietasMouseExited
        btn_dietas.setForeground(Color.black);
        btn_dietas.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Dietas.png")));
    }//GEN-LAST:event_btn_dietasMouseExited

    private void btn_citasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citasMouseEntered
        btn_citas.setForeground(Color.white);
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Citas_2.png")));
    }//GEN-LAST:event_btn_citasMouseEntered

    private void btn_citasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citasMouseExited
        btn_citas.setForeground(Color.black);
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Citas.png")));
    }//GEN-LAST:event_btn_citasMouseExited

    private void btn_perfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseEntered
        btn_perfil.setForeground(Color.white);
        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Perfil_2.png")));
    }//GEN-LAST:event_btn_perfilMouseEntered

    private void btn_perfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_perfilMouseExited
        btn_perfil.setForeground(Color.black);
        btn_perfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Perfil.png")));
    }//GEN-LAST:event_btn_perfilMouseExited

    private void btn_cerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseEntered
        btn_cerrar.setForeground(Color.white);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Salir_2.png")));
    }//GEN-LAST:event_btn_cerrarMouseEntered

    private void btn_cerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseExited
        btn_cerrar.setForeground(Color.black);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/menu/Salir.png")));
    }//GEN-LAST:event_btn_cerrarMouseExited

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_citas;
    private javax.swing.JButton btn_dietas;
    private javax.swing.JButton btn_inicio;
    private javax.swing.JButton btn_pacientes;
    private javax.swing.JButton btn_perfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar2;
    // End of variables declaration//GEN-END:variables
}
