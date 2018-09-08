/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;
import MainFiles.Dbconfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import net.proteanit.sql.DbUtils;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class Form_I03P2 extends javax.swing.JFrame {
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps;
    /**
     * Creates new form Form_I03
     */
    public Form_I03P2() {
        initComponents();
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButton_accept);
        bg.add(jRadioButton_reject);
        
        con = Dbconfig.connect();
        tableload ();
    }
  public void tableload (){
       try{
           String sql = "select * From formi03p1";
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           table.setModel(DbUtils.resultSetToTableModel(rs));
       }catch(Exception e){
       
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtTitle = new javax.swing.JTextField();
        txtspecial = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        txtSuName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        btreport = new javax.swing.JButton();
        btaccept = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        btreject = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtTo = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        caldate = new com.toedter.calendar.JDateChooser();
        jRadioButton_accept = new javax.swing.JRadioButton();
        jRadioButton_reject = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1400, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Intern's Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("INTERN'S DAILY DIARY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Internship Information");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, -1, -1));

        jLabel5.setText("Student ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        txtid.setEditable(false);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 230, -1));

        jLabel6.setText("Intern's Private Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txtaddress.setEditable(false);
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 660, -1));

        jLabel7.setText("Contact Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        txtcontact.setEditable(false);
        getContentPane().add(txtcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 660, -1));

        jLabel8.setText("Overall Internship Period From");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, -1));

        txtmail.setEditable(false);
        getContentPane().add(txtmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 660, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        jLabel9.setText("(To be filled by the intern -Please ensure to email duly filled form after the compleation of the intership to saman.g@sliit.lk)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Intern's information");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("*Use comma (,) to seperate multiple e-mail address providing both company e-mail and personal e-mail");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, -1, -1));

        jLabel11.setText("Email Address");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel12.setText("Period To:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 540, -1, -1));

        jLabel13.setText("Internship Title");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel14.setText("Specialisation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        txtname.setEditable(false);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 230, -1));

        txtTitle.setEditable(false);
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 230, -1));

        txtspecial.setEditable(false);
        getContentPane().add(txtspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 230, -1));

        jLabel15.setText("Description");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, -1, -1));

        comment.setColumns(20);
        comment.setRows(5);
        jScrollPane2.setViewportView(comment);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 470, 390, 90));

        jLabel16.setText("Supervisor Name");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, -1, -1));
        getContentPane().add(txtSuName, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 650, 240, -1));

        jLabel17.setText("Date");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 660, -1, -1));

        jLabel18.setText("Comment");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 500, -1, -1));

        description.setEditable(false);
        description.setColumns(20);
        description.setRows(5);
        jScrollPane3.setViewportView(description);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 630, 70));

        btreport.setText("Generate Report");
        getContentPane().add(btreport, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 640, -1, -1));

        btaccept.setText("Submit comment");
        btaccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btacceptActionPerformed(evt);
            }
        });
        getContentPane().add(btaccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 640, -1, -1));

        btedit.setText("Edit");
        getContentPane().add(btedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 70, -1));

        btreject.setText("Reject");
        btreject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btrejectActionPerformed(evt);
            }
        });
        getContentPane().add(btreject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 640, 70, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Student Name", "Student Address", "Contact No", "Student e-mail", "Internship Title", "Specialisation", "From", "To", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1290, 100));

        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 690, -1, -1));
        getContentPane().add(txtTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, 230, -1));
        getContentPane().add(txtFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 230, -1));
        getContentPane().add(caldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 660, -1, -1));

        jRadioButton_accept.setText("Accept");
        getContentPane().add(jRadioButton_accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 580, -1, -1));

        jRadioButton_reject.setText("Reject");
        getContentPane().add(jRadioButton_reject, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 600, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int r = table.getSelectedRow();
        
        String id = table.getValueAt(r, 0).toString();
        String name = table.getValueAt(r, 1).toString();
        String address = table.getValueAt(r, 2).toString();
        String contact = table.getValueAt(r, 3).toString();
        String mail = table.getValueAt(r, 4).toString();
        String title = table.getValueAt(r, 5).toString();
        String specialisation = table.getValueAt(r, 6).toString();
        String from = table.getValueAt(r, 7).toString();
        String to = table.getValueAt(r, 8).toString();
        String description = table.getValueAt(r, 9).toString();
        
        txtname.setText(name);
        txtid.setText(id);
        txtaddress.setText(address);
        txtcontact.setText(contact);
        txtmail.setText(mail);
        txtTitle.setText(title);
        txtspecial.setText(specialisation);
        txtFrom.setText(from);
        txtTo.setText(to);
        //this.description.setText(description);
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//           int r = table.getSelectedRow();
//           
//             String id = table.getValueAt(r, 0).toString();
//           
//        String FILE_NAME = id +".pdf";
//       PdfReader reader;
//
//        try {
//
//            reader = new PdfReader("E:\\SLIIT\\3rd year\\2nd semester\\SPM\\PDF\\"+FILE_NAME);
//
//            // pageNumber = 1
//           
//            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1-3);
//           
//            System.out.println(textFromPage);
//
//            reader.close();
//            
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
         int r = table.getSelectedRow();
        String id = table.getValueAt(r, 0).toString();
        try {
            
            String command = "rundll32 url.dll, FileProtocolHandler "+
                    "C:\\Users\\Dell\\Documents\\Form I-3\\"+id+"\\"+id+".pdf";
            Runtime.getRuntime().exec(command);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Check file details");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btacceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btacceptActionPerformed
        // TODO add your handling code here:
        if (jRadioButton_accept.isSelected()) {
             SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd"); 
        String d =Date_Format.format(caldate.getDate());
        
        int r = table.getSelectedRow();
        String id = table.getValueAt(r, 0).toString();
        
        String comment = this.comment.getText();
        String sname = txtSuName.getText();
        
        try {
            java.util.Date da= caldate.getDate();
            
            if (da == null | comment == null | sname == null) 
                {
                System.out.println("Fill needed information");
                } 
            else 
                {

                java.sql.Date sqldate1 = new java.sql.Date(da.getTime());
               
             
                }
             java.sql.Statement sql = con.createStatement();
             java.sql.Statement s = con.createStatement();
            
            sql.executeUpdate("Update formi03p2 set supervisor_name = '"+sname+"',marked_date = '"+d+"',comment = '"+comment+"' WHERE student_ID = '"+id+"'");
            
            //
                SaveToPdf sp = new SaveToPdf();
                String string1 = "Supervisor Name : "+sname+"\nMarked Date : "+d+"\nComment :\n"+comment;
                sp.addContent_ExistingPDF_Accept(id, comment);
                
                System.out.println("SUCEESSFULLY SAVED TO PDF");
            //
            
              JOptionPane.showMessageDialog(rootPane, "Successfully Add Comment");
            }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        else if(jRadioButton_reject.isSelected()){
             SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy-MM-dd"); 
        String d =Date_Format.format(caldate.getDate());
        
        int r = table.getSelectedRow();
        String id = table.getValueAt(r, 0).toString();
        
        String comment = this.comment.getText();
        String sname = txtSuName.getText();
        
        try {
            java.util.Date da= caldate.getDate();
            
            if (da == null | comment == null | sname == null) 
                {
                System.out.println("Fill needed information");
                } 
            else 
                {

                java.sql.Date sqldate1 = new java.sql.Date(da.getTime());
               
             
                }
             java.sql.Statement sql = con.createStatement();
             java.sql.Statement s = con.createStatement();
            
            sql.executeUpdate("Update formi03p2 set supervisor_name = '"+sname+"',marked_date = '"+d+"',comment = '"+comment+"' WHERE student_ID = '"+id+"'");
            
            //
                SaveToPdf sp = new SaveToPdf();
                String string1 = "Supervisor Name : "+sname+"\nMarked Date : "+d+"\nComment :\n"+comment;
                sp.addContent_ExistingPDF_Reject(id, comment);
                
                System.out.println("SUCEESSFULLY SAVED TO PDF");
            //
            
              JOptionPane.showMessageDialog(rootPane, "Successfully Add Comment");
            }catch(Exception e)
        {
            e.printStackTrace();
        }
        }
        
    }//GEN-LAST:event_btacceptActionPerformed

    private void btrejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btrejectActionPerformed
        // TODO add your handling code here:
//        Reject_mail rm = new Reject_mail();
//        rm.setVisible(true);
       // this.dispose();
    }//GEN-LAST:event_btrejectActionPerformed

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
            java.util.logging.Logger.getLogger(Form_I03P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_I03P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_I03P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_I03P2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_I03P2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btaccept;
    private javax.swing.JButton btedit;
    private javax.swing.JButton btreject;
    private javax.swing.JButton btreport;
    private com.toedter.calendar.JDateChooser caldate;
    private javax.swing.JTextArea comment;
    private javax.swing.JTextArea description;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JRadioButton jRadioButton_accept;
    private javax.swing.JRadioButton jRadioButton_reject;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtSuName;
    private javax.swing.JTextField txtTitle;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtspecial;
    // End of variables declaration//GEN-END:variables
}
