package basdatgui;

import AllClass.JadwalDAO;
import AllClass.KelasDipilih;
import basdatgui.BiodataFrame;
import basdatgui.PembayaranFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author Regina Anky Chandra
 */
public class JadwalFrame extends javax.swing.JFrame {
        private static ArrayList<KelasDipilih> keranjangKelas = new ArrayList<>();
    /**
     * Creates new form BerandaFrame
     */
    public JadwalFrame() {
        initComponents();
        loadJadwalTable();
    }
    public static ArrayList<KelasDipilih> getKeranjangKelas(){
        return keranjangKelas;
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
        panelHeader = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        btnBeranda = new javax.swing.JButton();
        btnJadwal = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnBiodata = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JadwalTabel = new javax.swing.JTable();
        labelJadwal = new javax.swing.JLabel();
        klikBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 600));

        panelMain.setMinimumSize(new java.awt.Dimension(800, 600));
        panelMain.setPreferredSize(new java.awt.Dimension(1200, 800));

        panelHeader.setBackground(new java.awt.Color(255, 204, 204));

        labelJudul.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelJudul.setText("Intel Bimbingan Belajar");

        btnBeranda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBeranda.setText("BERANDA");
        btnBeranda.setBorderPainted(false);
        btnBeranda.setContentAreaFilled(false);
        btnBeranda.setFocusPainted(false);
        btnBeranda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBerandaActionPerformed(evt);
            }
        });

        btnJadwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnJadwal.setText("JADWAL");
        btnJadwal.setBorderPainted(false);
        btnJadwal.setContentAreaFilled(false);
        btnJadwal.setFocusPainted(false);
        btnJadwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJadwalActionPerformed(evt);
            }
        });

        btnPembayaran.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPembayaran.setText("PEMBAYARAN");
        btnPembayaran.setBorderPainted(false);
        btnPembayaran.setContentAreaFilled(false);
        btnPembayaran.setFocusPainted(false);
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });

        btnBiodata.setBorderPainted(false);
        btnBiodata.setContentAreaFilled(false);
        btnBiodata.setFocusPainted(false);
        btnBiodata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiodataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
                .addComponent(btnBeranda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnJadwal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPembayaran)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBiodata, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBiodata, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBeranda)
                        .addComponent(btnJadwal)
                        .addComponent(btnPembayaran)))
                .addGap(25, 25, 25))
        );

        JadwalTabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kelas ", "Mata Pelajaran", "Pengajar", "Hari", "Jam Mulai", "Jam Selesai", "Ruangan", "Kapasitas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JadwalTabel.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(JadwalTabel);
        if (JadwalTabel.getColumnModel().getColumnCount() > 0) {
            JadwalTabel.getColumnModel().getColumn(0).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(0).setPreferredWidth(10);
            JadwalTabel.getColumnModel().getColumn(1).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(1).setPreferredWidth(50);
            JadwalTabel.getColumnModel().getColumn(2).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(2).setPreferredWidth(40);
            JadwalTabel.getColumnModel().getColumn(3).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(3).setPreferredWidth(15);
            JadwalTabel.getColumnModel().getColumn(4).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(4).setPreferredWidth(10);
            JadwalTabel.getColumnModel().getColumn(5).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(5).setPreferredWidth(10);
            JadwalTabel.getColumnModel().getColumn(6).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(6).setPreferredWidth(1);
            JadwalTabel.getColumnModel().getColumn(7).setResizable(false);
            JadwalTabel.getColumnModel().getColumn(7).setPreferredWidth(1);
        }

        labelJadwal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelJadwal.setText("JADWAL");

        klikBtn.setText("<html><u>Klik disini untuk melihat kelas yang dipilih.</u><html>");
        klikBtn.setBorderPainted(false);
        klikBtn.setContentAreaFilled(false);
        klikBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klikBtn.setFocusPainted(false);
        klikBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klikBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelJadwal)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelJadwal)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(klikBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void klikBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikBtnActionPerformed
        KelasPilihanFrame kelasPilihan = new KelasPilihanFrame();
        kelasPilihan.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_klikBtnActionPerformed

    private void btnBiodataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiodataActionPerformed
        BiodataFrame biodata = new BiodataFrame();
        biodata.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBiodataActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
//        PembayaranFrame pembayaran = new PembayaranFrame();
//        pembayaran.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnJadwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJadwalActionPerformed
        JadwalFrame jadwal = new JadwalFrame();
        jadwal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJadwalActionPerformed

    private void btnBerandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBerandaActionPerformed
        BerandaFrame beranda = new BerandaFrame();
        beranda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBerandaActionPerformed

    /**
     * @param args the command line arguments
     */
        private void loadJadwalTable() {
        DefaultTableModel model = (DefaultTableModel) JadwalTabel.getModel();
        model.setRowCount(0); 

        List<KelasDipilih> dataJadwal = JadwalDAO.getAllJadwal();
        for (KelasDipilih row : dataJadwal) {
            Object[] rowData = new Object[]{
                row.getNamaKelas(),
                row.getNamaMapel(),
                row.getNamaPengajar(),
                row.getHari(),
                row.getJamMulai(),
                row.getJamSelesai(),
                row.getNamaRuangan(),
                row.getKapasitas()
            };
            model.addRow(rowData);
        }
    
        }
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
            java.util.logging.Logger.getLogger(JadwalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JadwalTabel;
    private javax.swing.JButton btnBeranda;
    private javax.swing.JButton btnBiodata;
    private javax.swing.JButton btnJadwal;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton klikBtn;
    private javax.swing.JLabel labelJadwal;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMain;
    // End of variables declaration//GEN-END:variables
}
