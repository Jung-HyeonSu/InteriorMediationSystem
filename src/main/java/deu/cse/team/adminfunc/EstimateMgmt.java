/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.team.adminfunc;

import deu.cse.team.factory.TileFactoryGui;
import deu.cse.team.source.EstimateInfo;
import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.HousingTypeInfo;
import deu.cse.team.source.PaintInfo;
import deu.cse.team.source.PayTypeInfo;
import deu.cse.team.source.ReplyInfo;
import deu.cse.team.source.TileInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class EstimateMgmt extends javax.swing.JFrame {

    /**
     * Creates new form EstimateMgmt
     */
    public EstimateMgmt() {
        initComponents();
        setLocationRelativeTo(this);
        loadEstimateData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton3.setText("확인");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("취소");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("정말로 삭제하시겠습니까?");

        jLabel3.setText("삭제된 데이터는 복구할 수 없습니다.");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton3)
                        .addGap(35, 35, 35)
                        .addComponent(jButton4)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel1.setText("견적 관리");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "아이디", "주문서 번호"
            }
        ));
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jButton1.setText("삭제");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("취소");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(this);
        jDialog1.setSize(300, 200);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jDialog1.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int row = jTable1.getSelectedRow();
        String num = String.valueOf(jTable1.getValueAt(row, 1));
        //Estimate 삭제
        FileMgmt fileMgmt = new FileMgmt();
        ArrayList<EstimateInfo> estimateInfo = new ArrayList<>();
        fileMgmt.readEstimateFileData("C:\\DB\\EstimateList.txt");
        fileMgmt.splitEstimateFileData();
        try {   
            PrintWriter pw = new PrintWriter("C:\\DB\\EstimateList.txt");
            estimateInfo = fileMgmt.returnEstimateInfo();
            String data;
            for (int i = 0; i < estimateInfo.size(); i++) {
                if(!num.equals(estimateInfo.get(i).getNum())){
                data = String.format("%s\t%s\t%s", estimateInfo.get(i).getId(), estimateInfo.get(i).getNum(), estimateInfo.get(i).getPay());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //HousingType 삭제
        FileMgmt fileMgmt2 = new FileMgmt();
        ArrayList<HousingTypeInfo> housingTypeInfo = new ArrayList<>();
        fileMgmt2.readHousingTypeFileData("C:\\DB\\HousingTypeList.txt");
        fileMgmt2.splitHousingTypeFileData();
        try {   
            PrintWriter pw = new PrintWriter("C:\\DB\\HousingTypeList.txt");
            housingTypeInfo = fileMgmt2.returnHousingTypeInfo();
            String data;
            for (int i = 0; i < housingTypeInfo.size(); i++) {
                if(!num.equals(housingTypeInfo.get(i).getNum())){
                    data = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", 
                            housingTypeInfo.get(i).getNum(), 
                            housingTypeInfo.get(i).getHousingtype(),
                            housingTypeInfo.get(i).getCeilingtype(),
                            housingTypeInfo.get(i).getFloortype(),
                            housingTypeInfo.get(i).getWalltype(),
                            housingTypeInfo.get(i).getWindowtype(),
                            housingTypeInfo.get(i).getHeight(),
                            housingTypeInfo.get(i).getAflatnumber());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //paint 삭제
        FileMgmt fileMgmt3 = new FileMgmt();
        ArrayList<PaintInfo> paintInfo = new ArrayList<>();
        fileMgmt3.readPaintFileData("C:\\DB\\Paint.txt");
        fileMgmt3.splitPaintFileData();
        try {   
            PrintWriter pw = new PrintWriter("C:\\DB\\Paint.txt");
            paintInfo = fileMgmt3.returnPaintInfo();
            String data;
            for (int i = 0; i < paintInfo.size(); i++) {
                if(!num.equals(paintInfo.get(i).getNum())){
                data = String.format("%s\t%s\t%s\t%s", paintInfo.get(i).getNum(), paintInfo.get(i).getType(),paintInfo.get(i).getColor(),paintInfo.get(i).getMoney());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //tileList 삭제
        FileMgmt fileMgmt4 = new FileMgmt();
        ArrayList<TileInfo> tileInfo = new ArrayList<>();
        fileMgmt4.readTileFileData("C:\\DB\\TileList.txt");
        fileMgmt4.splitTileFileData();
        try {   
            PrintWriter pw = new PrintWriter("C:\\DB\\TileList.txt");
            tileInfo = fileMgmt4.returnTileInfo();
            String data;
            for (int i = 0; i < tileInfo.size(); i++) {
                if(!num.equals(tileInfo.get(i).getNum())){
                data = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", tileInfo.get(i).getNum(), tileInfo.get(i).getMood(),tileInfo.get(i).getTexture(),tileInfo.get(i).getColor(),tileInfo.get(i).getShape(),tileInfo.get(i).getDesign(),tileInfo.get(i).getAmount(),tileInfo.get(i).getTotal());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Reply 삭제
        FileMgmt fileMgmt5 = new FileMgmt();
        ArrayList<ReplyInfo> replyInfo = new ArrayList<>();
        fileMgmt5.readReplyFileData("C:\\DB\\ReplyList.txt");
        fileMgmt5.splitReplyFileData();
        try {
            PrintWriter pw = new PrintWriter("C:\\DB\\ReplyList.txt");
            replyInfo = fileMgmt5.returnReplyInfo();
            String data;
            for (int i = 0; i < replyInfo.size(); i++) {
                if(!num.equals(replyInfo.get(i).getNum())){
                data = String.format("%s\t%s\t%s\t%s", replyInfo.get(i).getId(), replyInfo.get(i).getNum(), replyInfo.get(i).getPrice(), replyInfo.get(i).getSelect());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //PayTypeList 삭제
        FileMgmt fileMgmt6 = new FileMgmt();
        ArrayList<PayTypeInfo> payTypeInfo = new ArrayList<>();
        fileMgmt6.readPayTypeFileData("C:\\DB\\PayTypeList.txt");
        fileMgmt6.splitPayTypeFileData();
        try {   
            PrintWriter pw = new PrintWriter("C:\\DB\\PayTypeList.txt");
            payTypeInfo = fileMgmt6.returnPayTypeInfo();
            String data;
            for (int i = 0; i < payTypeInfo.size(); i++) {
                if(!num.equals(payTypeInfo.get(i).getNum())){
                data = String.format("%s\t%s", payTypeInfo.get(i).getNum(), payTypeInfo.get(i).getPaytype());
                pw.println(data);
            }
        }
        pw.close();
        } 
        catch (IOException ex) {
           Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
        jDialog1.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void loadEstimateData() {
        ArrayList<EstimateInfo> estimateInfo = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        try {
            FileMgmt fileMgmt = new FileMgmt();
            fileMgmt.readEstimateFileData("C:\\DB\\EstimateList.txt");
            fileMgmt.splitEstimateFileData();
            estimateInfo = fileMgmt.returnEstimateInfo();
            for (int i = 0; i < estimateInfo.size(); i++) {
                model.addRow(new Object[]{estimateInfo.get(i).getId(), estimateInfo.get(i).getNum()});
            }
        } catch (IOException ex) {
            Logger.getLogger(EstimateMgmt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(EstimateMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstimateMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstimateMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstimateMgmt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstimateMgmt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
