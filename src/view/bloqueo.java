package view;

import controller.blocked;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import model.bitacoraModel;

public class bloqueo extends javax.swing.JFrame {

    public static int count, id_bitacora;

    public bloqueo() {
        initComponents();
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setAlwaysOnTop(true);
        int confirm = 1;
        new blocked(this).block(confirm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblErrorEquipo = new javax.swing.JLabel();
        lblErrorControl = new javax.swing.JLabel();
        lblErrorGrupo = new javax.swing.JLabel();
        lblErrorProfesor = new javax.swing.JLabel();
        lblErrorObservacion = new javax.swing.JLabel();
        lblErrorLab = new javax.swing.JLabel();
        lblErrorAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblRegistros = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacion = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNoControl = new javax.swing.JTextField();
        txtAlumno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbxEquipo = new javax.swing.JComboBox<>();
        cbxLaboratorio = new javax.swing.JComboBox<>();
        cbxGrupo = new javax.swing.JComboBox<>();
        cbxDocente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblFondoDerecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));

        lblErrorEquipo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorEquipo.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorEquipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorControl.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorControl.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorGrupo.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorGrupo.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorGrupo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorProfesor.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorProfesor.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorProfesor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorObservacion.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorObservacion.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorObservacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorLab.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorLab.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorAlumno.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        lblErrorAlumno.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 131, 145));
        jLabel1.setText("Llena los campos necesarios");

        btnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        btnAceptar.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(102, 102, 102));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAceptarMouseClicked(evt);
            }
        });

        lblRegistros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono_registro.png"))); // NOI18N
        lblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrosMouseExited(evt);
            }
        });

        txtObservacion.setColumns(20);
        txtObservacion.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtObservacion.setForeground(new java.awt.Color(51, 51, 51));
        txtObservacion.setRows(5);
        jScrollPane1.setViewportView(txtObservacion);

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(59, 152, 169));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Numero de control");

        jLabel14.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(59, 152, 169));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Laboratorio");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(59, 152, 169));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Semestre y grupo");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(59, 152, 169));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Nombre completo del alumno");

        txtNoControl.setForeground(new java.awt.Color(51, 51, 51));
        txtNoControl.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAlumno.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txtAlumno.setForeground(new java.awt.Color(51, 51, 51));
        txtAlumno.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(59, 152, 169));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Observaciones");

        jLabel13.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(59, 152, 169));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Profesor");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(59, 152, 169));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Número de la computadora");

        cbxEquipo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbxEquipo.setForeground(new java.awt.Color(51, 51, 51));
        cbxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona equipo", "PC1", "PC2", "PC3" }));

        cbxLaboratorio.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbxLaboratorio.setForeground(new java.awt.Color(51, 51, 51));
        cbxLaboratorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona laboratorio", "Laboratorio Uno", "Laboratorio Tres", "Laboratorio Ofimatica", "Aula Interactiva" }));

        cbxGrupo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbxGrupo.setForeground(new java.awt.Color(51, 51, 51));
        cbxGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona tu grupo", "3C", "3F", "5C", "5F" }));

        cbxDocente.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbxDocente.setForeground(new java.awt.Color(51, 51, 51));
        cbxDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona docente", "Luis Jesus Perez Badillo", "David Fernando Lopez Lopez", "Jairo Conde Cocoletzi", "Francisca Jimenez Mata" }));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 131, 145));
        jLabel2.setText("Por: Braulio José Baca Barbosa, CompuBac.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorControl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cbxLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblErrorObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistros)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addContainerGap(615, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cbxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtNoControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorControl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(cbxGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(cbxDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(cbxLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorLab, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorObservacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(59, 152, 169));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblFondoDerecha, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblFondoDerecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAceptarMouseClicked
        if (cbxEquipo.getSelectedIndex() == 0) {
            lblErrorEquipo.setText("*");
        } else if (txtAlumno.getText().equals("")) {
            lblErrorAlumno.setText("*");
        } else if (txtNoControl.getText().equals("")) {
            lblErrorControl.setText("*");
        } else if (cbxGrupo.getSelectedIndex() == 0) {
            lblErrorGrupo.setText("*");
        } else if (cbxDocente.getSelectedIndex() == 0) {
            lblErrorProfesor.setText("*");
        } else if (cbxLaboratorio.getSelectedIndex() == 0) {
            lblErrorLab.setText("*");
        } else if (txtObservacion.getText().equals("")) {
            lblErrorObservacion.setText("*");
        } else {
            try {
                String laboratorio = "", equipo = "";
                int docente = 0, grupo = 0;
                //Laboratorio Uno
                if (cbxLaboratorio.getSelectedIndex() == 0) {
                    laboratorio = "";
                } else if (cbxLaboratorio.getSelectedIndex() == 1) {
                    laboratorio = "LAB 1";
                    if (cbxEquipo.getSelectedIndex() == 0) {
                        equipo = "";
                    } else if (cbxEquipo.getSelectedIndex() == 1) {
                        equipo = "1";
                    } else if (cbxEquipo.getSelectedIndex() == 2) {
                        equipo = "2";
                    } else if (cbxEquipo.getSelectedIndex() == 3) {
                        equipo = "3";
                    }
                } else if (cbxLaboratorio.getSelectedIndex() == 2) {
                    laboratorio = "LAB 3";
                    if (cbxEquipo.getSelectedIndex() == 0) {
                        equipo = "";
                    } else if (cbxEquipo.getSelectedIndex() == 1) {
                        equipo = "4";
                    } else if (cbxEquipo.getSelectedIndex() == 2) {
                        equipo = "5";
                    } else if (cbxEquipo.getSelectedIndex() == 3) {
                        equipo = "6";
                    }
                } else if (cbxLaboratorio.getSelectedIndex() == 3) {
                    laboratorio = "LAB OFIMATICA";
                    if (cbxEquipo.getSelectedIndex() == 0) {
                        equipo = "";
                    } else if (cbxEquipo.getSelectedIndex() == 1) {
                        equipo = "7";
                    } else if (cbxEquipo.getSelectedIndex() == 2) {
                        equipo = "8";
                    } else if (cbxEquipo.getSelectedIndex() == 3) {
                        equipo = "9";
                    }
                } else if (cbxLaboratorio.getSelectedIndex() == 4) {
                    laboratorio = "AULA INTERACTIVA";
                    if (cbxEquipo.getSelectedIndex() == 0) {
                        equipo = "";
                    } else if (cbxEquipo.getSelectedIndex() == 1) {
                        equipo = "10";
                    } else if (cbxEquipo.getSelectedIndex() == 2) {
                        equipo = "11";
                    } else if (cbxEquipo.getSelectedIndex() == 3) {
                        equipo = "12";
                    }
                }

                for (int i = 1; i <= 4; i++) {
                    if (cbxDocente.getSelectedIndex() == i) {
                        docente = i;
                    }

                    if (cbxGrupo.getSelectedIndex() == i) {
                        grupo = i;
                    }
                }

                bitacoraModel metodos = new bitacoraModel();
                count = metodos.getCountAlumnos(txtNoControl.getText());
                if (count == 0) {
                    metodos.insertAlumno(grupo, txtNoControl.getText(), txtAlumno.getText());
                    metodos.insertBitacora(txtNoControl.getText(), txtAlumno.getText(), equipo, docente, laboratorio,
                            txtObservacion.getText());
                    id_bitacora = metodos.getIdBitacora(txtAlumno.getText());
                    apagar.id_bitacora = id_bitacora;

                    if (SystemTray.isSupported()) {
                        ImageIcon image = new ImageIcon(bloqueo.class.getResource("icon.png"));
                        TrayIcon trayicon = new TrayIcon(image.getImage(), "Bitacora", null);
                        trayicon.setImageAutoSize(true);

                        trayicon.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                login ventana = new login(null, true);
                                ventana.setVisible(true);
                            }
                        });

                        try {
                            SystemTray.getSystemTray().add(trayicon);
                        } catch (Exception e) {
                            System.exit(0);
                        }
                    }
                    apagar ventana = new apagar();
                    ventana.setVisible(true);
                    this.dispose();
                } else {
                    metodos.insertBitacora(txtNoControl.getText(), txtAlumno.getText(), equipo, docente, laboratorio,
                            txtObservacion.getText());
                    id_bitacora = metodos.getIdBitacora(txtAlumno.getText());
                    apagar.id_bitacora = id_bitacora;

                    if (SystemTray.isSupported()) {
                        ImageIcon image = new ImageIcon(bloqueo.class.getResource("icon.png"));
                        TrayIcon trayicon = new TrayIcon(image.getImage(), "Bitacora", null);
                        trayicon.setImageAutoSize(true);

                        trayicon.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseReleased(MouseEvent e) {
                                login ventana = new login(null, true);
                                ventana.setVisible(true);
                            }
                        });

                        try {
                            SystemTray.getSystemTray().add(trayicon);
                        } catch (Exception e) {
                            System.exit(0);
                        }
                    }
                    apagar ventana = new apagar();
                    ventana.setVisible(true);
                    this.dispose();
                }

            } catch (Exception e) {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_btnAceptarMouseClicked

    private void lblRegistrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrosMouseExited
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_lblRegistrosMouseExited

    private void lblRegistrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrosMouseEntered
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblRegistrosMouseEntered

    private void lblRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrosMouseClicked
        login ingresar = new login(null, true);
        ingresar.setVisible(true);
    }//GEN-LAST:event_lblRegistrosMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        //Modificar el tamaño de la imagen
        int alto, ancho;
        alto = lblFondoDerecha.getHeight();
        ancho = lblFondoDerecha.getWidth();
        ImageIcon ruta = new ImageIcon(bloqueo.class.getResource("fondo.png"));
        ImageIcon imagen = new ImageIcon(ruta.getImage().getScaledInstance(ancho, alto, Image.SCALE_DEFAULT));
        lblFondoDerecha.setIcon(imagen);
        lblFondoDerecha.repaint();
    }//GEN-LAST:event_formWindowActivated

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bloqueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bloqueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JComboBox<String> cbxDocente;
    private javax.swing.JComboBox<String> cbxEquipo;
    private javax.swing.JComboBox<String> cbxGrupo;
    private javax.swing.JComboBox<String> cbxLaboratorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorAlumno;
    private javax.swing.JLabel lblErrorControl;
    private javax.swing.JLabel lblErrorEquipo;
    private javax.swing.JLabel lblErrorGrupo;
    private javax.swing.JLabel lblErrorLab;
    private javax.swing.JLabel lblErrorObservacion;
    private javax.swing.JLabel lblErrorProfesor;
    private javax.swing.JLabel lblFondoDerecha;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtNoControl;
    private javax.swing.JTextArea txtObservacion;
    // End of variables declaration//GEN-END:variables
}
