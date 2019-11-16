package view;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import model.bitacoraModel;

public class registroBitacora extends javax.swing.JDialog {

    public registroBitacora(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setTitle("Registros en la bitácora");
        //Instancia de la clase alumno
        bitacoraModel tablaRegistro = new bitacoraModel();
        //Metodo para llenar la tabla
        tablaRegistro.mostrarRegistros(tblRegistro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistro = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnActualizarTabla = new javax.swing.JMenu();
        btnSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        tblRegistro.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        tblRegistro.setForeground(new java.awt.Color(51, 51, 51));
        tblRegistro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistro);

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        btnActualizarTabla.setBackground(new java.awt.Color(255, 255, 255));
        btnActualizarTabla.setForeground(new java.awt.Color(102, 102, 102));
        btnActualizarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_actualizar.png"))); // NOI18N
        btnActualizarTabla.setText("Actualizar Tabla");
        btnActualizarTabla.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnActualizarTabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarTablaMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnActualizarTabla);

        btnSalir.setBackground(new java.awt.Color(255, 255, 255));
        btnSalir.setForeground(new java.awt.Color(102, 102, 102));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_salir.png"))); // NOI18N
        btnSalir.setText("Salir del programa");
        btnSalir.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarTablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarTablaMouseClicked
        //Instancia de la clase alumno
        bitacoraModel tablaRegistro = new bitacoraModel();
        //Metodo para llenar la tabla
        tablaRegistro.mostrarRegistros(tblRegistro);
        //Acomodar tabla
        tblRegistro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int margin = 2;
        int vColIndex = 1;
        packColumns(tblRegistro, margin);
        packColumn(tblRegistro, vColIndex, margin);
    }//GEN-LAST:event_btnActualizarTablaMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Acomodar tabla
        tblRegistro.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        int margin = 2;
        int vColIndex = 1;
        packColumns(tblRegistro, margin);
        packColumn(tblRegistro, vColIndex, margin);
    }//GEN-LAST:event_formWindowActivated

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        //Salir del programa
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    //Metodo para acomodar tabla
    public void packColumns(JTable table, int margin) {
        for (int c = 0; c < (table.getColumnCount()); c++) {
            packColumn(table, c, 2);
        }
    }

    //Metodo para acomodar tabla
    public void packColumn(JTable table, int vColIndex, int margin) {
        DefaultTableColumnModel colModel = (DefaultTableColumnModel) table.
                getColumnModel();
        TableColumn col = colModel.getColumn(vColIndex);
        int width = 0;
        TableCellRenderer renderer = col.getHeaderRenderer();
        if (renderer == null) {
            renderer = table.getTableHeader().getDefaultRenderer();
        }
        Component comp = renderer.getTableCellRendererComponent(
                table, col.getHeaderValue(), false, false, 0, 0);
        width = comp.getPreferredSize().width;
        for (int r = 0; r < table.getRowCount(); r++) {
            renderer = table.getCellRenderer(r, vColIndex);
            comp = renderer.getTableCellRendererComponent(
                    table, table.getValueAt(r, vColIndex), false, false, r,
                    vColIndex);
            width = Math.max(width, comp.getPreferredSize().width);
        }
        width += 2 * margin;
        col.setPreferredWidth(width);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registroBitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registroBitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registroBitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registroBitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registroBitacora dialog = new registroBitacora(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnActualizarTabla;
    private javax.swing.JMenu btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistro;
    // End of variables declaration//GEN-END:variables
}
