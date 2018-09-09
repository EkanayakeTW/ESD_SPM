/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import MainFiles.Dbconfig;
import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author FC
 */
public class formi1pdf extends javax.swing.JFrame {
    
     Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;

   
    public formi1pdf() {
        initComponents();
        conn=Dbconfig.connect();
        
        //load form 1 part 2 details to the table
        tableload();
        
    }
    public void tableload()
    {
        try {
            String sql="select * from formi01p2";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton1.setText("save to ppdf");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1)
                .addGap(153, 153, 153))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int r= jTable1.getSelectedRow();
         String student_id_=jTable1.getValueAt(r, 0).toString();
        String student_name_=jTable1.getValueAt(r, 1).toString();
        String student_address_=jTable1.getValueAt(r, 2).toString();
        String student_home_phone_=jTable1.getValueAt(r, 3).toString();
        String student_mobile_phone_=jTable1.getValueAt(r, 4).toString();
        String student_email_=jTable1.getValueAt(r, 5).toString();
        String student_semester_=jTable1.getValueAt(r, 6).toString();
        String  student_year_=jTable1.getValueAt(r, 7).toString();
        String student_cgpa_=jTable1.getValueAt(r, 8).toString();
        
         String emp_name=jTable1.getValueAt(r, 9).toString();
        String emp_address= jTable1.getValueAt(r, 10).toString();
        String super_name=jTable1.getValueAt(r, 11).toString();
        String super_phone=jTable1.getValueAt(r, 12).toString();
        String super_title=jTable1.getValueAt(r, 13).toString();
        String super_email=jTable1.getValueAt(r, 14).toString();
        String start_date="";
        String end_date="";
        
        String no_of_hours=jTable1.getValueAt(r, 17).toString();
        String task_list=jTable1.getValueAt(r, 18).toString();
        String learn_=jTable1.getValueAt(r, 19).toString();
        String ex_super_name=jTable1.getValueAt(r, 20).toString();
        String ldate="";
        
jTextArea1.setText("Student ID : "+student_id_+"\n student name :"+student_name_+"\n Student address :"+student_address_+"\n student phone-home :"+student_home_phone_+"\n student phone-mobile :"+student_mobile_phone_+"\n student Email : "+student_email_+ "\n semester : "+student_semester_+"\n year :"+student_year_+"\n cgpa :"+student_cgpa_+"\n Employer \n name :"+emp_name+"\n Address :"+emp_address+"\n supervisor \n name :"+super_name+"\n phone :"+super_phone+"\n title :"+super_title+"\n email :"+super_email+"\n internship start date :"+start_date+"\n internship end date :"+end_date+"\n no of hours :"+no_of_hours+"\n task :"+task_list);
         String description = jTextArea1.getText();
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int r= jTable1.getSelectedRow();
          String id=jTable1.getValueAt(r, 0).toString();
           String description = jTextArea1.getText();
           
            Document document = new Document(PageSize.A4);
            document.addAuthor(id);
            document.addTitle("Form I-3");
            System.out.println("doc created");
            
            try {
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\Dell\\Documents\\Form I-3\\"+id+"\\temp.pdf"));
            document.open();
            Paragraph para = new Paragraph(description);
            document.add(para);
            document.close();
              File merged_file = new File("C:\\Users\\Dell\\Documents\\Form I-3\\"+id+"\\Merged.pdf");
            
            boolean rename = merged_file.renameTo(new File("C:\\Users\\Dell\\Documents\\Form I-3\\"+id+"\\"+id+".pdf"));
                
            System.out.println("All successful !! ");
        } 
        catch (Exception e) {
        }
           
           
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(formi1pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formi1pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formi1pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formi1pdf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formi1pdf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
