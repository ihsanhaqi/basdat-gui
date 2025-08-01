/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basdatgui;

import AllClass.Pelajar;
import AllClass.PelajarDAO;
import java.net.URL;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
import util.DatabaseConnection;


/**
 *
 * @author Regina Anky Chandra
 */
public class SignUpFrame extends javax.swing.JFrame {

    /**
     * Creates new form BerandaFrame
     */
    public SignUpFrame() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        labelJudulContent = new javax.swing.JLabel();
        labelJudulContent1 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        idTextField = new javax.swing.JTextField();
        DaftarBtn = new javax.swing.JButton();
        tanggalLahirTextField = new javax.swing.JTextField();
        alamatTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        noHpTextField = new javax.swing.JTextField();
        jenisKelaminComboBox = new javax.swing.JComboBox<>();
        asalSekolahTextField = new javax.swing.JTextField();
        angkatanTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        SignInKlik = new javax.swing.JLabel();
        SignUpKlik = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        panelMain.setMinimumSize(new java.awt.Dimension(800, 600));
        panelMain.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        labelJudulContent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelJudulContent.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudulContent.setText("Intel Bimbingan Belajar");

        labelJudulContent1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelJudulContent1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudulContent1.setText("Sign Up Siswa");

        namaTextField.setForeground(new java.awt.Color(153, 153, 153));
        namaTextField.setText("Nama Lengkap");
        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        idTextField.setForeground(new java.awt.Color(153, 153, 153));
        idTextField.setText("ID");
        idTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTextFieldActionPerformed(evt);
            }
        });

        DaftarBtn.setText("Daftar");
        DaftarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarBtnActionPerformed(evt);
            }
        });

        tanggalLahirTextField.setForeground(new java.awt.Color(153, 153, 153));
        tanggalLahirTextField.setText("Tanggal Lahir [yyyy-MM-dd]");
        tanggalLahirTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanggalLahirTextFieldActionPerformed(evt);
            }
        });

        alamatTextField.setForeground(new java.awt.Color(153, 153, 153));
        alamatTextField.setText("Alamat");
        alamatTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamatTextFieldActionPerformed(evt);
            }
        });

        emailTextField.setForeground(new java.awt.Color(153, 153, 153));
        emailTextField.setText("Email");
        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });

        noHpTextField.setForeground(new java.awt.Color(153, 153, 153));
        noHpTextField.setText("Nomor HP");
        noHpTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noHpTextFieldActionPerformed(evt);
            }
        });

        jenisKelaminComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        asalSekolahTextField.setForeground(new java.awt.Color(153, 153, 153));
        asalSekolahTextField.setText("Asal Sekolah");
        asalSekolahTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asalSekolahTextFieldActionPerformed(evt);
            }
        });

        angkatanTextField.setForeground(new java.awt.Color(153, 153, 153));
        angkatanTextField.setText("Angkatan");
        angkatanTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                angkatanTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelJudulContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelJudulContent1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(namaTextField)
                            .addComponent(DaftarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tanggalLahirTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                            .addComponent(alamatTextField)
                            .addComponent(emailTextField)
                            .addComponent(noHpTextField)
                            .addComponent(jenisKelaminComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asalSekolahTextField)
                            .addComponent(angkatanTextField))
                        .addGap(96, 96, 96)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(labelJudulContent)
                .addGap(18, 18, 18)
                .addComponent(labelJudulContent1)
                .addGap(18, 18, 18)
                .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggalLahirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(alamatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noHpTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenisKelaminComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(asalSekolahTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(angkatanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(DaftarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        SignInKlik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SignInKlik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignInKlik.setText("<html><u>Sign In</u>");
        SignInKlik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInKlikMouseClicked(evt);
            }
        });

        SignUpKlik.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SignUpKlik.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignUpKlik.setText("<html><u>Sign Up</u>");
        SignUpKlik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpKlikMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(373, Short.MAX_VALUE)
                .addComponent(SignInKlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SignUpKlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SignUpKlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignInKlik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 191, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void idTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTextFieldActionPerformed

    private void tanggalLahirTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanggalLahirTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalLahirTextFieldActionPerformed

    private void alamatTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamatTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alamatTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void noHpTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noHpTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noHpTextFieldActionPerformed

    private void DaftarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarBtnActionPerformed
        String id = idTextField.getText().trim();
        String nama = namaTextField.getText().trim();
        String tanggalLahir = tanggalLahirTextField.getText().trim(); // format: yyyy-MM-dd
        String alamat = alamatTextField.getText().trim();
        String email = emailTextField.getText().trim();
        String noHp = noHpTextField.getText().trim();
        String jenisKelamin = (String) jenisKelaminComboBox.getSelectedItem();
        String asalSekolah = asalSekolahTextField.getText().trim();
        String angkatan = angkatanTextField.getText().trim();
        
        // Validasi sederhana
        if (id.isEmpty() || nama.isEmpty() || email.isEmpty() || tanggalLahir.isEmpty() ||
            alamat.isEmpty() || noHp.isEmpty() || jenisKelamin == null) {
            JOptionPane.showMessageDialog(this, "Semua data harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        java.sql.Date sqlTanggal;
        try {
            sqlTanggal = java.sql.Date.valueOf(tanggalLahir); // throws IllegalArgumentException jika format salah
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Format tanggal lahir tidak valid! Gunakan format yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO pelajar (id_pelajar, nama, tanggal_lahir, alamat, email, nomor_hp, jenis_kelamin, asal_sekolah, angkatan) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

            stmt.setString(1, id);
            stmt.setString(2, nama);
            stmt.setDate(3, sqlTanggal);
            stmt.setString(4, alamat);
            stmt.setString(5, email);
            stmt.setString(6, noHp);
            stmt.setString(7, jenisKelamin);
            stmt.setString(8, asalSekolah);
            stmt.setString(9, angkatan);

            int inserted = stmt.executeUpdate();
            if (inserted > 0) {
                JOptionPane.showMessageDialog(this, "Pendaftaran berhasil!");
//                // Kosongkan form
//                idTextField.setText("");
//                namaTextField.setText("");
//                tanggalLahirTextField.setText("");
//                alamatTextField.setText("");
//                emailTextField.setText("");
//                noHpTextField.setText("");
//                jenisKelaminComboBox.setSelectedIndex(0);
                PelajarDAO dao = new PelajarDAO();
                Pelajar pelajar = dao.getPelajarById(id);
                Pelajar.setCurrentPelajar(pelajar);
                new BiodataFrame().setVisible(true);
                this.dispose();
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_DaftarBtnActionPerformed

    private void SignUpKlikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpKlikMouseClicked
        SignUpFrame SignUp = new SignUpFrame();
        SignUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignUpKlikMouseClicked

    private void SignInKlikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInKlikMouseClicked
        SignInFrame SignIn = new SignInFrame();
        SignIn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SignInKlikMouseClicked

    private void asalSekolahTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asalSekolahTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asalSekolahTextFieldActionPerformed

    private void angkatanTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_angkatanTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_angkatanTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarBtn;
    private javax.swing.JLabel SignInKlik;
    private javax.swing.JLabel SignUpKlik;
    private javax.swing.JTextField alamatTextField;
    private javax.swing.JTextField angkatanTextField;
    private javax.swing.JTextField asalSekolahTextField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JComboBox<String> jenisKelaminComboBox;
    private javax.swing.JLabel labelJudulContent;
    private javax.swing.JLabel labelJudulContent1;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField noHpTextField;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextField tanggalLahirTextField;
    // End of variables declaration//GEN-END:variables
}
