package deu.cse.team.strategy;

import deu.cse.team.decorator.AddOption;
import deu.cse.team.factory.TileFactoryGui;
import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.HousingTypeInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class HousingTypeGui extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    String num;
    
    public HousingTypeGui() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("HousingType Select");
    }
    
    public HousingTypeGui(String num) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("HousingType Select");
        
        this.num = num;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextFieldtype = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxWallBh = new javax.swing.JComboBox<>();
        jComboBoxFloorBh = new javax.swing.JComboBox<>();
        jComboBoxCeilingBh = new javax.swing.JComboBox<>();
        jComboBoxWindowBh = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldtype1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxWallBh1 = new javax.swing.JComboBox<>();
        jComboBoxFloorBh1 = new javax.swing.JComboBox<>();
        jComboBoxCeilingBh1 = new javax.swing.JComboBox<>();
        jComboBoxWindowBh1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxType = new javax.swing.JComboBox<>();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBoxWallBh2 = new javax.swing.JComboBox<>();
        jComboBoxFloorBh2 = new javax.swing.JComboBox<>();
        jComboBoxCeilingBh2 = new javax.swing.JComboBox<>();
        jComboBoxWindowBh2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel5.setText("주택유형");

        jTextFieldtype.setEnabled(false);

        jLabel4.setText("창문");

        jLabel2.setText("벽");

        jLabel3.setText("바닥");

        jLabel6.setText("천장");

        jComboBoxWallBh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxFloorBh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxCeilingBh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxWindowBh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jLabel7.setText("주택유형");

        jTextFieldtype1.setEnabled(false);

        jLabel8.setText("창문");

        jLabel9.setText("벽");

        jLabel10.setText("바닥");

        jLabel11.setText("천장");

        jComboBoxWallBh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxFloorBh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxCeilingBh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        jComboBoxWindowBh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "가능", "불가능" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("주택유형선택");

        jComboBoxType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "아파트", "빌라", "주택" }));
        jComboBoxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHousingType(evt);
            }
        });

        jButtonOk.setText("확인");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancel.setText("취소");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel13.setText("창문");

        jLabel14.setText("벽");

        jLabel15.setText("바닥");

        jLabel16.setText("천장");

        jComboBoxWallBh2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "가능", "불가능" }));
        jComboBoxWallBh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWallBh2ActionPerformed(evt);
            }
        });

        jComboBoxFloorBh2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "가능", "불가능" }));
        jComboBoxFloorBh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFloorBh2ActionPerformed(evt);
            }
        });

        jComboBoxCeilingBh2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "가능", "불가능" }));
        jComboBoxCeilingBh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCeilingBh2ActionPerformed(evt);
            }
        });

        jComboBoxWindowBh2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "가능", "불가능" }));
        jComboBoxWindowBh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxWindowBh2ActionPerformed(evt);
            }
        });

        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel17.setText("평수");

        jLabel18.setText("층고");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonOk)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 131, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxWallBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jComboBoxCeilingBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBoxWindowBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFloorBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jComboBoxCeilingBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jComboBoxFloorBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jComboBoxWallBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14))
                    .addComponent(jComboBoxWindowBh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOk)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxHousingType(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHousingType
        // TODO add your handling code here:
        String type = jComboBoxType.getSelectedItem().toString(); //검색 분류 추출
        
        if("--선택--".equals(type)) {
            jComboBoxWallBh2.setSelectedIndex(0);
            jComboBoxCeilingBh2.setSelectedIndex(0);
            jComboBoxFloorBh2.setSelectedIndex(0);
            jComboBoxWindowBh2.setSelectedIndex(0);
        }
        
        else if ("아파트".equals(type)) {
            HousingType apart = new Apart();
            if("가능".equals(apart.WallBehavior.WallAble())){
                jComboBoxWallBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWallBh2.setSelectedIndex(2);
            }
            if("가능".equals(apart.CeilingBehavior.CeilingAble())){
                jComboBoxCeilingBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxCeilingBh2.setSelectedIndex(2);
            }
            if("가능".equals(apart.FloorBehavior.FloorAble())){
                jComboBoxFloorBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxFloorBh2.setSelectedIndex(2);
            }
            if("가능".equals(apart.WindowBehavior.WindowAble())){
                jComboBoxWindowBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWindowBh2.setSelectedIndex(2);
            }
            
        }
        
        else if ("빌라".equals(type)) {
            HousingType villa = new Villa();
            if("가능".equals(villa.WallBehavior.WallAble())){
                jComboBoxWallBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWallBh2.setSelectedIndex(2);
            }
            if("가능".equals(villa.CeilingBehavior.CeilingAble())){
                jComboBoxCeilingBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxCeilingBh2.setSelectedIndex(2);
            }
            if("가능".equals(villa.FloorBehavior.FloorAble())){
                jComboBoxFloorBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxFloorBh2.setSelectedIndex(2);
            }
            if("가능".equals(villa.WindowBehavior.WindowAble())){
                jComboBoxWindowBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWindowBh2.setSelectedIndex(2);
            }
            
        }
        
        else if ("주택".equals(type)) {
            HousingType housing = new Housing();
            if("가능".equals(housing.WallBehavior.WallAble())){
                jComboBoxWallBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWallBh2.setSelectedIndex(2);
            }
            if("가능".equals(housing.CeilingBehavior.CeilingAble())){
                jComboBoxCeilingBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxCeilingBh2.setSelectedIndex(2);
            }
            if("가능".equals(housing.FloorBehavior.FloorAble())){
                jComboBoxFloorBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxFloorBh2.setSelectedIndex(2);
            }
            if("가능".equals(housing.WindowBehavior.WindowAble())){
                jComboBoxWindowBh2.setSelectedIndex(1);
            }
            else{
                jComboBoxWindowBh2.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_jComboBoxHousingType

    //확인버튼
    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        // TODO add your handling code here:        
                
        String H = jTextField1.getText();
        String F = jTextField2.getText();
        boolean HisNumeric =  H.matches("[+-]?\\d*(\\.\\d+)?");
        boolean FisNumeric =  F.matches("[+-]?\\d*(\\.\\d+)?");
        
        if("--선택--".equals(jComboBoxType.getSelectedItem().toString())) {
            showMessageDialog(null,"유형을 선택해주세요.");
        }
        else if( !HisNumeric || "".equals(jTextField1.getText())){
            showMessageDialog(null,"층고를 정수로 0보다 큰 값을 입력해주세요.");
        }
        else if( !FisNumeric || "".equals(jTextField2.getText())){
            showMessageDialog(null,"평수를 정수로 0보다 큰 값을 입력해주세요.");
        }
        else if("--선택--".equals(jComboBoxCeilingBh2.getSelectedItem().toString())) {
            showMessageDialog(null,"천장 변경 여부를 선택해주세요.");
        }
        else if("--선택--".equals(jComboBoxFloorBh2.getSelectedItem().toString())) {
            showMessageDialog(null,"바닥 변경 여부를 선택해주세요.");
        }
        else if("--선택--".equals(jComboBoxWallBh2.getSelectedItem().toString())) {
            showMessageDialog(null,"벽 변경 여부를 선택해주세요.");
        }
        else if("--선택--".equals(jComboBoxWindowBh2.getSelectedItem().toString())) {
            showMessageDialog(null,"창문 변경 여부를 선택해주세요.");
        }          
        else {
            String htype = jComboBoxType.getSelectedItem().toString();
            String ceiling = jComboBoxCeilingBh2.getSelectedItem().toString();
            String floor = jComboBoxFloorBh2.getSelectedItem().toString();
            String wall = jComboBoxWallBh2.getSelectedItem().toString();
            String window = jComboBoxWindowBh2.getSelectedItem().toString();
            String height = jTextField1.getText();
            String aflatnumber = jTextField2.getText();
            
            
            String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", num, htype, ceiling, floor, wall, window, height, aflatnumber);
            
            ArrayList<HousingTypeInfo> housingtypeInfo = new ArrayList<>();
            
            FileMgmt fileMgmt = new FileMgmt();
            try {
                fileMgmt.writeFileData("C:\\DB\\HousingTypeList.txt", str);
            } catch (IOException ex) {
                Logger.getLogger(HousingTypeGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            AddOption addOption = new AddOption();
            addOption.setVisible(true);     
            dispose();
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

    //취소버튼
    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtonCancelActionPerformed
    
    //벽 유형
    private void jComboBoxWallBh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWallBh2ActionPerformed
        // TODO add your handling code here:
        // 벽 유형 가져오기
    }//GEN-LAST:event_jComboBoxWallBh2ActionPerformed

    //천장 유형
    private void jComboBoxFloorBh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFloorBh2ActionPerformed
        // TODO add your handling code here:
        // 바닥 유형 가져오기
    }//GEN-LAST:event_jComboBoxFloorBh2ActionPerformed

    //천장 유형
    private void jComboBoxCeilingBh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCeilingBh2ActionPerformed
        // TODO add your handling code here:
        // 천장 유형 가져오기
    }//GEN-LAST:event_jComboBoxCeilingBh2ActionPerformed

    //창문
    private void jComboBoxWindowBh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxWindowBh2ActionPerformed
        // TODO add your handling code here:
        // 창문 유형 가져오기
    }//GEN-LAST:event_jComboBoxWindowBh2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(HousingTypeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HousingTypeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HousingTypeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HousingTypeGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HousingTypeGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JComboBox<String> jComboBoxCeilingBh;
    private javax.swing.JComboBox<String> jComboBoxCeilingBh1;
    private javax.swing.JComboBox<String> jComboBoxCeilingBh2;
    private javax.swing.JComboBox<String> jComboBoxFloorBh;
    private javax.swing.JComboBox<String> jComboBoxFloorBh1;
    private javax.swing.JComboBox<String> jComboBoxFloorBh2;
    private javax.swing.JComboBox<String> jComboBoxType;
    private javax.swing.JComboBox<String> jComboBoxWallBh;
    private javax.swing.JComboBox<String> jComboBoxWallBh1;
    private javax.swing.JComboBox<String> jComboBoxWallBh2;
    private javax.swing.JComboBox<String> jComboBoxWindowBh;
    private javax.swing.JComboBox<String> jComboBoxWindowBh1;
    private javax.swing.JComboBox<String> jComboBoxWindowBh2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldtype;
    private javax.swing.JTextField jTextFieldtype1;
    // End of variables declaration//GEN-END:variables
}
