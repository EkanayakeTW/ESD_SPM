/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;

import MainFiles.Dbconfig;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class Form_I01 extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    /**
     * Creates new form Form_I01
     */
    public Form_I01() {
        initComponents();
        con=Dbconfig.connect();
        
        stu_id.setText(Login.username_.getText());
        stu_id.setEditable(false);
        
           try{
            String ITnbr =Login.username_.getText();
            String sql="select * from formi01p1 where student_ID=?";
            
             pst=(PreparedStatement) con.prepareStatement(sql);
             pst.setString(1,ITnbr);
             rs=pst.executeQuery();
             if(rs.next()){
                 
                 name.setText("Login As "+rs.getString("student_name"));
                 name.setForeground(Color.red);
                 stu_name.setText(rs.getString("student_name"));
                 
             }
             
            
        }catch(Exception e){
            e.getMessage();
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
        jLabel6 = new javax.swing.JLabel();
        stu_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stu_address = new javax.swing.JTextField();
        stu_home_phone = new javax.swing.JTextField();
        stu_email = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        stu_cgpa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        stu_semester = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        stu_year = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        stu_name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        stu_mobile_phone = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Faculty Of Computing");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 470, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Form I-1 (Part 1)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 170, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Internship Acceptance Form");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 320, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Student ID No");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        stu_id.setBackground(new java.awt.Color(240, 240, 240));
        stu_id.setBorder(null);
        stu_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stu_idActionPerformed(evt);
            }
        });
        getContentPane().add(stu_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 460, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Email Addresses");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 120, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Home Phone");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 110, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setText("Mobile Phone");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 110, -1));

        stu_address.setBackground(new java.awt.Color(240, 240, 240));
        stu_address.setBorder(null);
        getContentPane().add(stu_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 610, -1));

        stu_home_phone.setBackground(new java.awt.Color(240, 240, 240));
        stu_home_phone.setBorder(null);
        getContentPane().add(stu_home_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 610, -1));

        stu_email.setBackground(new java.awt.Color(240, 240, 240));
        stu_email.setBorder(null);
        getContentPane().add(stu_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 610, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel12.setText("*Use a Comma(,) to seperate multiple e-mail addresses");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setText("CGPA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, 60, -1));

        stu_cgpa.setBackground(new java.awt.Color(240, 240, 240));
        stu_cgpa.setBorder(null);
        getContentPane().add(stu_cgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 90, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setText("Semester");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        stu_semester.setBackground(new java.awt.Color(240, 240, 240));
        stu_semester.setBorder(null);
        getContentPane().add(stu_semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 90, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setText("Year");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 470, 60, -1));

        stu_year.setBackground(new java.awt.Color(240, 240, 240));
        stu_year.setBorder(null);
        getContentPane().add(stu_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 90, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        jLabel16.setText("(To be filled by student)");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setText("Student's Name");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        stu_name.setBackground(new java.awt.Color(240, 240, 240));
        stu_name.setBorder(null);
        getContentPane().add(stu_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 610, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("Submit to Employer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setText("Demo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 560, -1, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setText("View My Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, -1, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setText("< Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        stu_mobile_phone.setBackground(new java.awt.Color(240, 240, 240));
        stu_mobile_phone.setBorder(null);
        getContentPane().add(stu_mobile_phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 610, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton5.setText("Edit My Details");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 560, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 460, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 610, -1));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 610, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 610, -1));
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 610, -1));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 610, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 90, -1));
        getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, 90, -1));
        getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 90, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 140, 30));

        jLabel1.setText("<- LogOut");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 60, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S_images/user.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          
        String student_id=stu_id.getText();
        String student_name=stu_name.getText();
        String student_address=stu_address.getText();
        String student_home_phone=stu_home_phone.getText();
        String student_mobile_phone=stu_mobile_phone.getText();
        String student_email=stu_email.getText();
        String student_semester=stu_semester.getText();
        String student_year=stu_year.getText();
        String student_cgpa=stu_cgpa.getText();
        
        String student_id_=stu_id.getText();
        String student_name_=stu_name.getText();
        String student_address_=stu_address.getText();
        String student_home_phone_=stu_home_phone.getText();
        String student_mobile_phone_=stu_mobile_phone.getText();
        String student_email_=stu_email.getText();
        String student_semester_=stu_semester.getText();
        String  student_year_=stu_year.getText();
        String student_cgpa_=stu_cgpa.getText();
        
        
        
        if((student_id_.isEmpty())||(student_name_.isEmpty())||(student_address_.isEmpty())||(student_home_phone_.isEmpty())||(student_mobile_phone_.isEmpty())
                ||(student_email_.isEmpty())||(student_semester_.isEmpty())||(student_year_.isEmpty())||(student_cgpa_.isEmpty())){
                     JOptionPane.showMessageDialog(null, "Fill all fields");
        }
        else if(!student_id_.startsWith("IT")){
            JOptionPane.showMessageDialog(null, "Invalid IT number");
        }
        else if((student_home_phone_.length()!=10)||(student_mobile_phone_.length()!=10)){
            JOptionPane.showMessageDialog(null, "Invalid phone number");
        }

        else if(student_email_.indexOf('@')==0 || student_email_.indexOf('.')==0 ||student_email_.indexOf('@')>student_email_.indexOf('.')){
            JOptionPane.showMessageDialog(null, "Invalid email address");
        }
        else if((student_semester_.length()!=1)||student_year_.length()!=1){
            JOptionPane.showMessageDialog(null, "Invalid semester");
        }
        else{
        
            try{
                 String q="Insert into formi01p1(student_id,student_name,"
               + "student_address,student_home_phone,student_mobile_phone,"
               + "student_email,student_semester,student_year,student_cgpa)"
               + "values('"+student_id_+"','"+student_name_+"','"+student_address_+"'"
               + ",'"+student_home_phone_+"','"+student_mobile_phone_+"',"
               + "'"+student_email_+"','"+student_semester_+"',"
                         + "'"+student_year_+"','"+student_cgpa_+"')";
               
              pst=(PreparedStatement) con.prepareStatement(q);
              pst.execute();
              
              JOptionPane.showMessageDialog(null, "successfully added");
                
            }catch(Exception e){
                e.getMessage();
            }
        }
        
            stu_id.setText("");
            stu_name.setText("");
            stu_address.setText("");  
            stu_home_phone.setText("");  
            stu_mobile_phone.setText("");
            stu_email.setText("");
            stu_semester.setText("");
            stu_year.setText("");
            stu_cgpa.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            stu_id.setText("IT16091344");
            stu_name.setText("pavani subasinghe");
            stu_address.setText("123,galborella,kelaniya");  
            stu_home_phone.setText("0116574538");  
            stu_mobile_phone.setText("0715678900");
            stu_email.setText("pavani@gmail.com");
            stu_semester.setText("2");
            stu_year.setText("3");
            stu_cgpa.setText("3.21");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       mainForm m1=new mainForm();
       m1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String ITnbr =Login.username_.getText();
            String sql="select * from formi01p1 where student_ID=?";
            
             pst=(PreparedStatement) con.prepareStatement(sql);
             pst.setString(1,ITnbr);
             rs=pst.executeQuery();
             if(rs.next()){
                 stu_id.setText(rs.getString("student_ID"));
                 stu_name.setText(rs.getString("student_name"));
                 stu_address.setText(rs.getString("student_address"));
                 stu_home_phone.setText(rs.getString("student_home_phone"));
                 stu_mobile_phone.setText(rs.getString("student_mobile_phone"));
                 stu_email.setText(rs.getString("student_email"));
                 stu_semester.setText(rs.getString("student_semester"));
                 stu_year.setText(rs.getString("student_year"));
                 stu_cgpa.setText(rs.getString("student_cgpa"));
                 
                 stu_id.setEditable(false);
                 stu_id.setForeground(Color.gray);
                 
             }
             
            
        }catch(Exception e){
            e.getMessage();
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int x=JOptionPane.showConfirmDialog(null,"Do you really want to Update this record");
        
         if(x==0){
  
            String stno=stu_id.getText();
            String stname=stu_name.getText();
            String staddress=stu_address.getText();
            String sthphone=stu_home_phone.getText();
            String stmphone=stu_mobile_phone.getText();
            String stemail=stu_email.getText();
            String stsem=stu_semester.getText();
            String styear=stu_year.getText();
            String stcgpa=stu_cgpa.getText();
           
        if((stno.isEmpty())||(stname.isEmpty())||(staddress.isEmpty())||(sthphone.isEmpty())||(stmphone.isEmpty())||(stemail.isEmpty())||(stsem.isEmpty())||(styear.isEmpty()||stcgpa.isEmpty()))
        {
          
            JOptionPane.showMessageDialog(null, "Fill all fields");
        }
        else if(stemail.indexOf('@')==0 || stemail.indexOf('.')==0 ||stemail.indexOf('@')>stemail.indexOf('.'))
        {
            
                JOptionPane.showMessageDialog(this, "Invalid email");
        }  
        else if(stemail.indexOf('@')==-1||(stemail.indexOf('.')==-1))
                JOptionPane.showMessageDialog(this, "Please Enter Valid Email");
        else if(sthphone.length()!=10||stmphone.length()!=10)
            JOptionPane.showMessageDialog(this, "Invalid phone length!");
       
        
        else{
            String sql="Update formi01p1 set student_name='"+stname+"',student_address='"+staddress+"',student_home_phone='"+sthphone+"',student_mobile_phone='"+stmphone+"',student_email='"+stemail+"',student_semester='"+stsem+"',student_year='"+styear+"',student_cgpa='"+stcgpa+"' where student_ID='"+stno+"'";
           
            
             try {
                 pst=(PreparedStatement) con.prepareStatement(sql);
            
                 pst.execute();
                 
                 JOptionPane.showMessageDialog(this, "You successfully updated your details");

             } catch (Exception ex) {
                 ex.getMessage();
             }
        }
      
        
            stu_id.setText("");
            stu_name.setText("");
            stu_address.setText("");  
            stu_home_phone.setText("");
            stu_mobile_phone.setText("");
            stu_email.setText("");
            stu_semester.setText("");
            stu_year.setText("");
            stu_cgpa.setText("");
         }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void stu_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stu_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stu_idActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       Login l1=new Login();
       l1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(Form_I01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_I01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_I01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_I01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_I01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel name;
    private javax.swing.JTextField stu_address;
    private javax.swing.JTextField stu_cgpa;
    private javax.swing.JTextField stu_email;
    private javax.swing.JTextField stu_home_phone;
    private javax.swing.JTextField stu_id;
    private javax.swing.JTextField stu_mobile_phone;
    private javax.swing.JTextField stu_name;
    private javax.swing.JTextField stu_semester;
    private javax.swing.JTextField stu_year;
    // End of variables declaration//GEN-END:variables
}
