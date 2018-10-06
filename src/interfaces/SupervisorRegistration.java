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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Ekanayaketw
 */
public class SupervisorRegistration extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    /**
     * Creates new form StudentRegistration
     */
    public SupervisorRegistration() {
        initComponents();
         con=Dbconfig.connect();
         tableload();
        
    }
        public void AddRegistration()
    
    {
        
        
        String id = suid.getText();
        String name =suname.getText();
        String supervisor_gender=sugender.getText();
        String contact =sucontact.getText();
        String email =suemail.getText();
        String Password1 =supw1.getText();
        String Password2=supw2.getText();
        String Dept =sudept.getText();
        
        
        if((id.isEmpty())||(name.isEmpty())||(contact.isEmpty())
                ||(email.isEmpty())
                ||(Password1.isEmpty())||(Password2.isEmpty())
                ||(Dept.isEmpty())){
            suid.setBackground(Color.GREEN);
            suname.setBackground(Color.GREEN);
            sugender.setBackground(Color.GREEN);
            sucontact.setBackground(Color.GREEN);
            suemail.setBackground(Color.GREEN);
            sudept.setBackground(Color.GREEN);
            supw1.setBackground(Color.GREEN);
            supw2.setBackground(Color.GREEN);
           
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
            
        }
        else if(!id.startsWith("SPR")){
            JOptionPane.showMessageDialog(null, "Invalid SPR number");
        }
        else if((contact.length()!=10)){
            JOptionPane.showMessageDialog(null, "Invalid phone number");
        }

        else if(email.indexOf('@')==0 || email.indexOf('.')==0 ||email.indexOf('@')>email.indexOf('.')){
            JOptionPane.showMessageDialog(null, "Invalid email address");
        
        } else
        
        try{
                 String x="Insert into supervisorsorregistration(supervisor_id,supervisor_name,"
               + "gender,contact_number,email,password1,"
               + "password2,Dept)"
               + "values('"+id+"','"+name+"','"+supervisor_gender+"','"+contact+"','"+email+"'"
               + ",'"+Password1+"','"+Password2+"',"
               + "'"+Dept+"')";
                System.out.println("2nd");
              pst=(PreparedStatement) con.prepareStatement(x);
              System.out.println("3d");
              pst.execute();
              tableload();
                 
                JOptionPane.showMessageDialog(null, "successfully added to the"
                        + " supervisorsorregistration");
                
            }catch(Exception e){
                e.getMessage();
            }
          
        
    }
     public void tableload()
    {
        try {
            String sql="select * from supervisorsorregistration";
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
            
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        pw = new javax.swing.JLabel();
        repw = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        campus = new javax.swing.JLabel();
        suid = new javax.swing.JTextField();
        sugender = new javax.swing.JTextField();
        sucontact = new javax.swing.JTextField();
        sudept = new javax.swing.JTextField();
        supw1 = new javax.swing.JPasswordField();
        reset = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        supw2 = new javax.swing.JPasswordField();
        suemail = new javax.swing.JTextField();
        suname = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        view = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        Demo1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        fake = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 51));
        setName("StudentRegistration"); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Supervisor Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 240, 30));

        jLabel3.setText("Supervisor Id");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 100, 20));

        jLabel5.setText("Supervisor Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, 20));

        contact.setText("Contact Number");
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, 20));

        email.setText("Email Address");
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 20));

        pw.setText("Password");
        jPanel1.add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 70, 20));

        repw.setText("Re-enter Password");
        jPanel1.add(repw, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 100, 20));

        gender.setText("Gender");
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 90, 20));

        campus.setText("Department");
        jPanel1.add(campus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 90, 20));
        jPanel1.add(suid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 200, 30));
        jPanel1.add(sugender, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 200, 30));
        jPanel1.add(sucontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 210, 30));
        jPanel1.add(sudept, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 210, 30));
        jPanel1.add(supw1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 210, 30));

        reset.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 600, -1, -1));

        add1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        add1.setText("Add");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel1.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));
        jPanel1.add(supw2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 210, 30));
        jPanel1.add(suemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 210, 30));
        jPanel1.add(suname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 560, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(548, 628));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        view.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        view.setText("View ");
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, -1, -1));

        delete.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel2.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 600, -1, -1));

        edit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, -1));

        Demo1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Demo1.setText("Demo");
        Demo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Demo1ActionPerformed(evt);
            }
        });
        jPanel2.add(Demo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, -1));

        fake.setText("fake");
        jPanel2.add(fake, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 50, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, -1, 650));

        jLabel15.setText("<- LogOut");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/S_images/user.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 0, 50, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Demo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Demo1ActionPerformed
        // TODO add your handling code here:
        
        suid.setText("SPR15023156");
        suname.setText("Bihandu Sanchith");
        sugender.setText("Male");
        sucontact.setText("0772359578");
        suemail.setText("B@gmail.com");
        supw1.setText("but123");
        supw2.setText("but123");
        sudept.setText("SE");
        
        
    }//GEN-LAST:event_Demo1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        suid.setText("");
        suname.setText("");
        sugender.setText("");
        sucontact.setText("");
        suemail.setText("");
        sudept.setText("");
        supw1.setText("");
        supw2.setText("");
        sudept.setText("");
        
    }//GEN-LAST:event_resetActionPerformed

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        String id = suid.getText();
        String name =suname.getText();
        String supervisor_gender=sugender.getText();
        String contact =sucontact.getText();
        String email =suemail.getText();
        String Password1 =supw1.getText();
        String Password2=supw2.getText();
        String Dept =sudept.getText();
        
        
        if((id.isEmpty())||(name.isEmpty())||(contact.isEmpty())
                ||(email.isEmpty())
                ||(Password1.isEmpty())||(Password2.isEmpty())
                ||(Dept.isEmpty())){
            suid.setBackground(Color.GREEN);
            suname.setBackground(Color.GREEN);
            sugender.setBackground(Color.GREEN);
            sucontact.setBackground(Color.GREEN);
            suemail.setBackground(Color.GREEN);
            sudept.setBackground(Color.GREEN);
            supw1.setBackground(Color.GREEN);
            supw2.setBackground(Color.GREEN);
           
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
            
        }
        else if(!id.startsWith("SPR")){
            JOptionPane.showMessageDialog(null, "Invalid SPR number");
        }
        else if((contact.length()!=10)){
            JOptionPane.showMessageDialog(null, "Invalid phone number");
        }

        else if(email.indexOf('@')==0 || email.indexOf('.')==0 ||email.indexOf('@')>email.indexOf('.')){
            JOptionPane.showMessageDialog(null, "Invalid email address");
        
        } else
        
        try{
                 String x="Insert into supervisorsorregistration(supervisor_id,supervisor_name,"
               + "gender,contact_number,email,password1,"
               + "password2,Dept)"
               + "values('"+id+"','"+name+"','"+supervisor_gender+"','"+contact+"','"+email+"'"
               + ",'"+Password1+"','"+Password2+"',"
               + "'"+Dept+"')";
                System.out.println("2nd");
              pst=(PreparedStatement) con.prepareStatement(x);
              System.out.println("3d");
              pst.execute();
              tableload();
                 
                JOptionPane.showMessageDialog(null, "successfully added to the"
                        + " SupervisorRegistration");
                
            }catch(Exception e){
                e.getMessage();
            }
        
    }//GEN-LAST:event_add1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        try{
        DefaultTableModel model=(DefaultTableModel)table.getModel();
         int row =table.getSelectedRow();
        
        String supervisor_ID = table.getValueAt(row,0).toString();
        String supervisor_name = table.getValueAt(row,1).toString();
        String supervisor_gender = table.getValueAt(row,2).toString();
        String contact = table.getValueAt(row,3).toString();
        String email = table.getValueAt(row,4).toString();
        String password1 = table.getValueAt(row,5).toString();
        String password2 = table.getValueAt(row,6).toString();
        String department = table.getValueAt(row,7).toString();
       

        suid.setText(supervisor_ID);
        suname.setText(supervisor_name);
        sugender.setText(supervisor_gender);
        sucontact.setText(contact);
        suemail.setText(email);
        supw1.setText(password1);
        supw2.setText(password2);
        sudept.setText(department);
        }catch(Exception e){
            e.getMessage();
        }
       
                               
    }//GEN-LAST:event_tableMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         int x = JOptionPane.showConfirmDialog(null, "Do you want to update this record");
        
        if (x==0){
            String id = suid.getText();
            String name = suname.getText();
            String gender=sugender.getText();
            String contact = sucontact.getText();
            String mail = suemail.getText();
            String pw = supw1.getText();
            String pw1 =supw2.getText();
            String dept=sudept.getText();
            
           
            
            try{
                String sql = "Update supervisorsorregistration set supervisor_name = '"+name+"',"
                        + "gender = '"+gender+"',"
                        + "contact_number = '"+contact+"',email = '"+mail+"',"
                        + "password1 = '"+pw+"',password2 = '"+pw1+"',Dept='"+dept+"',"
                        + "where supervisor_id ='"+id+"'";
                pst =(PreparedStatement)con.prepareStatement(sql);
                pst.execute();
                tableload();
            }catch(Exception e){
               e.getMessage();
            }
            
          
        }
                                  
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete this record");
        
        if (x==0){
            String id = suid.getText();
            
            
            try{
                String sql = "delete from supervisorsorregistration where supervisor_id ='"+id+"'";
                pst =(PreparedStatement)con.prepareStatement(sql);
                pst.execute();
                tableload();
            }catch(Exception e){
               e.getMessage();
            }
            
          
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        Login l1=new Login();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    

        
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
            java.util.logging.Logger.getLogger(SupervisorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupervisorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupervisorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupervisorRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupervisorRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Demo1;
    private javax.swing.JButton add1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel campus;
    private javax.swing.JLabel contact;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fake;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pw;
    private javax.swing.JLabel repw;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sucontact;
    private javax.swing.JTextField sudept;
    private javax.swing.JTextField suemail;
    private javax.swing.JTextField sugender;
    private javax.swing.JTextField suid;
    private javax.swing.JTextField suname;
    private javax.swing.JPasswordField supw1;
    private javax.swing.JPasswordField supw2;
    private javax.swing.JTable table;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
