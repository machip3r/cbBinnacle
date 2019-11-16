package view;

import controller.blocked;
import java.awt.Cursor;
import javax.swing.*;
import model.bitacoraModel;

public class apagar extends javax.swing.JFrame {

    public static int id_bitacora;

    public apagar() {
        initComponents();
        //Mostrar siempre al frente
        this.setAlwaysOnTop(true);
        //Posicion
        this.setLocation(1250, 650);
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //Opacidad abajo
        this.setOpacity(0.4f);
        int confirm = 2;
        new blocked(this).block(confirm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblApagar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        lblApagar.setBackground(new java.awt.Color(255, 255, 255));
        lblApagar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_apagar.png"))); // NOI18N
        lblApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApagarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblApagarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblApagarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblApagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        //Opacidad normal
        this.setOpacity(1.0f);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        //Opacidad abajo
        this.setOpacity(0.4f);
    }//GEN-LAST:event_formMouseExited

    private void lblApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApagarMouseClicked
        Runtime r = Runtime.getRuntime();
        bitacoraModel metodos = new bitacoraModel();
        int decision = JOptionPane.showConfirmDialog(null, "¿Desea apagar el equipo?", "Confirmar apagado", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (decision == JOptionPane.YES_OPTION) {
            try {
                bloqueo.id_bitacora = id_bitacora;
                //Metodo para insertar fecha y hora final
                metodos.fechaHora(id_bitacora);
                //Metodo para apagar el equipo
                r.exec("shutdown -s -t 0");
            } catch (Exception e) {
                System.exit(0);
            }
        } else {
            this.setOpacity(0.4f);
        }
    }//GEN-LAST:event_lblApagarMouseClicked

    private void lblApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApagarMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        //Opacidad normal
        this.setOpacity(1.0f);
    }//GEN-LAST:event_lblApagarMouseEntered

    private void lblApagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApagarMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        //Opacidad abajo
        this.setOpacity(0.4f);
    }//GEN-LAST:event_lblApagarMouseExited

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(apagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(apagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(apagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(apagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new apagar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblApagar;
    // End of variables declaration//GEN-END:variables
}
