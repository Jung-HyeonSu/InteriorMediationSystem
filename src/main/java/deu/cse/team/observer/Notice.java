/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deu.cse.team.observer;

import deu.cse.team.mainmenu.AdminMainMenu;
import deu.cse.team.source.FileMgmt;
import deu.cse.team.source.NoticeInfo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 정현수
 */
public class Notice extends javax.swing.JFrame {

    /**
     * Creates new form Notice
     */
    public Notice() {
        initComponents();
        setLocationRelativeTo(this);
        setTitle("Notice");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("맑은 고딕", 0, 18)); // NOI18N
        jLabel1.setText("공지사항");

        jLabel2.setText("공지사항 입력:");

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("변경");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("유형:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "고객", "업체", "모두" }));

        jLabel4.setText("날씨 정보:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "포함", "불포함" }));

        jButton2.setText("이전");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(186, 186, 186))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String type = jComboBox1.getSelectedItem().toString();
        String weatherSelect = jComboBox2.getSelectedItem().toString();

        if (weatherSelect.equals("포함")) {
            // 날씨 정보를 가져오는 부분
            URL url;//URL 주소 객체
            URLConnection connection;//URL접속을 가지는 객체

            InputStream is;//URL접속에서 내용을 읽기위한 Stream
            InputStreamReader isr;
            BufferedReader br;

            String weatherID = null; //날씨 ID
            String weather = null; //날씨 이름

            try {
                //URL객체를 생성하고 해당 URL로 접속한다
                url = new URL("http://api.openweathermap.org/data/2.5/weather?id=1838524&APPID=585b07845acf5ad33eb46532f8b54809");
                //id 1835847=서울,  1838524=부산  현재 부산으로 설정됨
                connection = url.openConnection();
                //내용을 읽어오기위한 InputStream객체를 생성한다
                is = connection.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);

                //내용을 읽어서 화면에 출력한다
                String buf = null;
                while (true) {
                    buf = br.readLine();
                    if (buf == null) {
                        break;
                    }
                    //System.out.println(buf);
                    //int a2 = buf.indexOf("temp");
                    int a3 = buf.indexOf("id");
                    //double temp=Double.parseDouble(buf.substring(a2+6, a2+12))-273.15;
                    weatherID = buf.substring(a3 + 4, a3 + 7);
                    //System.out.println("서울의 현재 온도(섭씨):"+temp);
                    //System.out.println("today weather id: "+weatherID);
                }
            } catch (MalformedURLException mue) {
                System.err.println("잘못된 URL입니다.");
                System.exit(1);
            } catch (IOException ioe) {
                System.err.println("IOException " + ioe);
                ioe.printStackTrace();
                System.exit(1);
            }

            if (weatherID.substring(0, 1).equals("2")) {
                weather = "[천둥]";
            } else if (weatherID.substring(0, 1).equals("3")) {
                weather = "[이슬비]";
            } else if (weatherID.substring(0, 1).equals("5")) {
                weather = "[비]";
            } else if (weatherID.substring(0, 1).equals("6")) {
                weather = "[눈]";
            } else if (weatherID.substring(0, 1).equals("7")) {
                weather = "[대기]";
            } else if (weatherID.substring(0, 1).equals("8") && weatherID.substring(2, 3).equals("0")) {
                weather = "[맑음]";
            } else if (weatherID.substring(0, 1).equals("8") && !weatherID.substring(2, 3).equals("0")) {
                weather = "[구름]";
            }
            String notice = "오늘의 날씨는 " + weather + "입니다. " + jTextArea1.getText();
            WeatherData weatherData = new WeatherData();
            
            FileMgmt fileMgmt = new FileMgmt();
            if (type.equals("고객")) {
                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        if(noticeInfo.get(i).getType().equals("고객")){
                            noticeInfo.get(i).setNotice(notice);
                        }
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }           
            else if (type.equals("업체")) {
                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        if(noticeInfo.get(i).getType().equals("업체")){
                            noticeInfo.get(i).setNotice(notice);
                        }
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (type.equals("모두")) {

                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        noticeInfo.get(i).setNotice(notice);
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else{ //불포함
            String notice = jTextArea1.getText();
            FileMgmt fileMgmt = new FileMgmt();
            if (type.equals("고객")) {
                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        if(noticeInfo.get(i).getType().equals("고객")){
                            noticeInfo.get(i).setNotice(notice);
                        }
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (type.equals("업체")) {
                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        if(noticeInfo.get(i).getType().equals("업체")){
                            noticeInfo.get(i).setNotice(notice);
                        }
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (type.equals("모두")) {
                ArrayList<NoticeInfo> noticeInfo = new ArrayList<>();
                fileMgmt.readNoticeFileData("C:\\DB\\Notice.txt");
                fileMgmt.splitNoticeFileData();
                try {   
                    PrintWriter pw = new PrintWriter("C:\\DB\\Notice.txt");
                    noticeInfo = fileMgmt.returnNoticeInfo();
                    String data;
                    for (int i = 0; i < noticeInfo.size(); i++) {
                        noticeInfo.get(i).setNotice(notice);
                        data = String.format("%s\t%s",
                            noticeInfo.get(i).getType(),
                            noticeInfo.get(i).getNotice());
                        pw.println(data);
                    }
                    pw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Notice.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        JOptionPane.showMessageDialog(null, "공지사항이 변경되었습니다.");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
