/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.team.factory;

import deu.cse.team.command.PayGui;
import deu.cse.team.mainmenu.UserMainMenu;
import deu.cse.team.observer.Notice;
import deu.cse.team.source.EstimateInfo;
import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.HousingTypeInfo;
import deu.cse.team.source.PaintInfo;
import deu.cse.team.source.TileInfo;
import deu.cse.team.strategy.HousingTypeGui;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author User
 */
public class TileFactoryGui extends javax.swing.JFrame {

    /**
     * Creates new form TileFactoryGui
     */
    String num;
    public TileFactoryGui() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("TileFactory Select");
    }
    
    public TileFactoryGui(String num) {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("TileFactory Select");
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

        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        JLabel1 = new javax.swing.JLabel();
        JLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("확인");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "나무", "석재", "대리석" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--선택--", "모던한", "시원한", "따듯한" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        JLabel1.setText("재질");

        JLabel2.setText("느낌");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("수량(1묶음 100장)");

        jTextField1.setColumns(3);
        jTextField1.setToolTipText("");

        jButton2.setText("취소");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("선택");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("추가 옵션");

        jLabel4.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("타일 선택");

        jLabel5.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel5.setText("↓");

        jLabel6.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        jLabel6.setText("↓");

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("주거 형태");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(31, 31, 31))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(13, 13, 13))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel1)
                    .addComponent(JLabel2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(14, 14, 14))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(51, 70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        String textureType = jComboBox1.getSelectedItem().toString();
        String moodType = jComboBox2.getSelectedItem().toString();
        String amount = jTextField1.getText();
        boolean isNumeric =  amount.matches("[+-]?\\d*(\\.\\d+)?");
        
        if("--선택--".equals(moodType) || "--선택--".equals(textureType)) {            
            
        }
        else if (!isNumeric){
            showMessageDialog(null,"수량에 숫자만 입력해주세요.");
        }
        else if ("모던한".equals(moodType)) {
            TileStore modernStore = new ModernTileStore();
            Tile tile = modernStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();
            
            int price = 0;            
            if(texture == "대리석") {
                price = 320000;
            }
            else if(texture == "나무") {
                price = 270000;
            }
            else if(texture == "석재"){
                price = 295000;
            }
            
            int A = price * Integer.parseInt(amount);
            String total = Integer.toString(A);
            
            String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", num, moodType, textureType, color, shape, design, amount, total);
            
            ArrayList<TileInfo> tileInfo = new ArrayList<>();
            
            FileMgmt fileMgmt = new FileMgmt();
            try {
                fileMgmt.writeFileData("C:\\DB\\TileList.txt", str);
            } catch (IOException ex) {
                Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        else if ("시원한".equals(moodType)) {
            TileStore coolStore = new CoolTileStore();
            Tile tile = coolStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();
            
            int price = 0;            
            if(texture == "대리석") {
                price = 320000;
            }
            else if(texture == "나무") {
                price = 270000;
            }
            else if(texture == "석재"){
                price = 295000;
            }
            
            int A = price * Integer.parseInt(amount);
            String total = Integer.toString(A);
            
            String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", num, moodType, textureType, color, shape, design, amount, total);
            
            ArrayList<TileInfo> tileInfo = new ArrayList<>();
            
            FileMgmt fileMgmt = new FileMgmt();
            try {
                fileMgmt.writeFileData("C:\\DB\\TileList.txt", str);
            } catch (IOException ex) {
                Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        }
        
        else if ("따듯한".equals(moodType)) {
            TileStore warmStore = new WarmTileStore();
            Tile tile = warmStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();
            
            int price = 0;            
            if(texture == "대리석") {
                price = 320000;
            }
            else if(texture == "나무") {
                price = 270000;
            }
            else if(texture == "석재"){
                price = 295000;
            }
            
            int A = price * Integer.parseInt(amount);
            String total = Integer.toString(A);
            
            String str = String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s", num, moodType, textureType, color, shape, design, amount, total);
                        
            ArrayList<TileInfo> tileInfo = new ArrayList<>();
            
            FileMgmt fileMgmt = new FileMgmt();
            try {
                fileMgmt.writeFileData("C:\\DB\\TileList.txt", str);
            } catch (IOException ex) {
                Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        showMessageDialog(null, "견적서 작성 완료");
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        
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
           Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
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
           Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
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
           Logger.getLogger(TileFactoryGui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String textureType = jComboBox1.getSelectedItem().toString();
        String moodType = jComboBox2.getSelectedItem().toString(); //검색 분류 추출
        
        if("--선택--".equals(moodType) || "--선택--".equals(textureType)) {            
            jTextArea1.setText("모든 항목을 선택해주세요.");
        }
        
        else if ("모던한".equals(moodType)) {
            TileStore modernStore = new ModernTileStore();
            Tile tile = modernStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();
            
            String price ="";            
            if(texture == "대리석") {
                price = "320000";
            }
            else if(texture == "나무") {
                price = "270000";
            }
            else if(texture == "석재"){
                price = "295000";
            }

            jTextArea1.setText(String.format("색상: %s\n모양: %s\n디자인: %s\n묶음당 가격: %s", color, shape, design, price ));
            
        }
        
        else if ("시원한".equals(moodType)) {
            TileStore coolStore = new CoolTileStore();
            Tile tile = coolStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();

            String price ="";            
            if(texture == "대리석") {
                price = "320000";
            }
            else if(texture == "나무") {
                price = "270000";
            }
            else if(texture == "석재"){
                price = "295000";
            }

            jTextArea1.setText(String.format("재질: %s\n색상: %s\n모양: %s\n디자인: %s\n묶음당 가격: %s", texture, color, shape, design, price ));
            
        }
        
        else if ("따듯한".equals(moodType)) {
            TileStore warmStore = new WarmTileStore();
            Tile tile = warmStore.orderTile(textureType);
            
            String texture = tile.getTexture();
            String color = tile.color.toString();
            String shape = tile.shape.toString();
            String design = tile.design.toString();
            
             String price ="";            
            if(texture == "대리석") {
                price = "320000";
            }
            else if(texture == "나무") {
                price = "270000";
            }
            else if(texture == "석재"){
                price = "295000";
            }

            jTextArea1.setText(String.format("재질: %s\n색상: %s\n모양: %s\n디자인: %s\n묶음당 가격: %s", texture, color, shape, design, price ));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TileFactoryGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TileFactoryGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TileFactoryGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TileFactoryGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TileFactoryGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel JLabel2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
