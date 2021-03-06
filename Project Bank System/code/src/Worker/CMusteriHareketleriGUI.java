package Worker;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import Login.LoginGUI;
import functions.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirac
 */
public class CMusteriHareketleriGUI extends javax.swing.JDialog {
    DefaultTableModel model;
    WorkerOperations mti = new WorkerOperations();
    
    
    /**
     * Creates new form CMusteriHareketleriGUI
     */
    public CMusteriHareketleriGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel)islem_tablosu.getModel();
        setTitle("Müşteri işlemleri");
    }
    public void islemGoruntule(int id){
        model.setRowCount(0);  
        
        ArrayList<OperationsTable> iT = new ArrayList<OperationsTable>();
        
        iT = mti.musterininIslemleriGetir(id);
        
        if(iT != null){
            for(OperationsTable i : iT){
                Object[] eklenecek = {i.getIslem_no(),i.getKaynak(),i.getHedef(),i.getIslem(),i.getTutar(),i.getKaynak_bakiye(),i.getHedef_bakiye(),i.getTarih()};
                model.addRow(eklenecek);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        islem_tablosu = new javax.swing.JTable();
        geri_butonu = new javax.swing.JButton();
        geri_butonu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		CalisanGUI calisanGUI = new CalisanGUI();
				calisanGUI.setVisible(true);
				dispose();
        	}
        });
        cikis_butonu = new javax.swing.JButton();
        cikis_butonu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		LoginGUI lGUI = new LoginGUI();
				lGUI.setVisible(true);
				dispose();
        	}
        });
        jLabel1 = new javax.swing.JLabel();
        id_alani = new javax.swing.JTextField();
        getir_butonu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        islem_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "işlem no", "Kaynak ", "Hedef", "işlem", "Tutar", "Kaynak Bakiye", "Hedef Bakiye", "Tarih"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(islem_tablosu);
        if (islem_tablosu.getColumnModel().getColumnCount() > 0) {
            islem_tablosu.getColumnModel().getColumn(0).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(1).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(2).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(3).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(4).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(5).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(6).setResizable(false);
            islem_tablosu.getColumnModel().getColumn(7).setResizable(false);
        }

        geri_butonu.setText("Geri");

        cikis_butonu.setText("Çıkış");

        jLabel1.setText("Getirmek istediginiz müşterinin ID numarası: ");

        getir_butonu.setText("getir");
        getir_butonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getir_butonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(geri_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cikis_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(id_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(getir_butonu, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geri_butonu)
                    .addComponent(cikis_butonu))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getir_butonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getir_butonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getir_butonuActionPerformed
        int id = Integer.parseInt(id_alani.getText().toString());
        
        islemGoruntule(id);
        
    }//GEN-LAST:event_getir_butonuActionPerformed

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
            java.util.logging.Logger.getLogger(CMusteriHareketleriGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CMusteriHareketleriGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CMusteriHareketleriGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CMusteriHareketleriGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CMusteriHareketleriGUI dialog = new CMusteriHareketleriGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton cikis_butonu;
    private javax.swing.JButton geri_butonu;
    private javax.swing.JButton getir_butonu;
    private javax.swing.JTextField id_alani;
    private javax.swing.JTable islem_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
