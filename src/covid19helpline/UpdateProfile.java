/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19helpline;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class UpdateProfile extends javax.swing.JFrame {

    /**
     * Creates new form UpdateProfile
     */
    
    String usid,email,name,gender,address,bg,mn,age;
    public UpdateProfile() {
        initComponents();
    }
    
    public UpdateProfile(String ms) {
        initComponents();
        usid=ms;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection  connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");
          
            
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Userr WHERE UserId = '"+usid+"'");
            
             if (resultSet.next()) {
                
                
                
               
                name = resultSet.getString("UserName");
                usernameTextfield.setText(name);
                
                
                gender = resultSet.getString("UserGender");
                usergenderTextfield.setSelectedItem(gender);
                
                
                address = resultSet.getString("UserAddress");
                useraddressTextfield.setText(address);
                
                bg = resultSet.getString("UserBloodGroup");
                userbloodgroupTextfield.setSelectedItem(bg);
                
                mn = resultSet.getString("UserMobileNo");
                usermobileTextfield.setText(mn);
               
                age = String.valueOf(resultSet.getInt("UserAge"));
                userageTextfield.setText(age);
                
                
               
                
            }
            
             
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
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

        userbloodgroupTextfield = new javax.swing.JComboBox<>();
        usermobileTextfield = new javax.swing.JTextField();
        usernameTextfield = new javax.swing.JTextField();
        userageTextfield = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usergenderLabel = new javax.swing.JLabel();
        userageLabel = new javax.swing.JLabel();
        userbloodgroupLabel = new javax.swing.JLabel();
        useraddressLabel = new javax.swing.JLabel();
        usermobileLabel = new javax.swing.JLabel();
        usergenderTextfield = new javax.swing.JComboBox<>();
        useraddressTextfield = new javax.swing.JTextField();
        updatebutton = new javax.swing.JButton();
        backuserprofilebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userbloodgroupTextfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A+", "B+", "O+", "AB+", "A-", "B-", "O-", "AB-" }));

        usernameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usernameLabel.setText("Name:");

        usergenderLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usergenderLabel.setText("Gender:");

        userageLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userageLabel.setText("Age:");

        userbloodgroupLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userbloodgroupLabel.setText("Blood Group:");

        useraddressLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        useraddressLabel.setText("Address:");

        usermobileLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        usermobileLabel.setText("Mobile No.:");

        usergenderTextfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", " " }));

        updatebutton.setBackground(new java.awt.Color(0, 153, 255));
        updatebutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("UPDATE");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        backuserprofilebutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backuserprofilebutton.setText("Back To User Profile");
        backuserprofilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backuserprofilebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usernameLabel)
                            .addComponent(usergenderLabel)
                            .addComponent(userageLabel)
                            .addComponent(useraddressLabel)
                            .addComponent(userbloodgroupLabel)
                            .addComponent(usermobileLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usermobileTextfield)
                            .addComponent(userbloodgroupTextfield, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(useraddressTextfield)
                            .addComponent(userageTextfield)
                            .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usergenderTextfield, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(backuserprofilebutton))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usergenderLabel)
                    .addComponent(usergenderTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userageLabel)
                    .addComponent(userageTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(useraddressLabel)
                    .addComponent(useraddressTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userbloodgroupLabel)
                    .addComponent(userbloodgroupTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usermobileLabel)
                    .addComponent(usermobileTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(backuserprofilebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Connection connection;
    public Statement stmt;
    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        String name1 = usernameTextfield.getText();

        String gender1 = (String) usergenderTextfield.getSelectedItem();
        String age1 = userageTextfield.getText();
        String address1 = useraddressTextfield.getText();
        String bloodgroup1 = (String) userbloodgroupTextfield.getSelectedItem();
        String mobile1 = usermobileTextfield.getText();
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
             
            if ( name1.equals("") || age1.equals("") || address1.equals("") || mobile1.equals("") ||  bloodgroup1.equals("Select") || gender1.equals("Select")) {
                JOptionPane.showMessageDialog(this, "Please insert all informations");                 
            }
            
            else
            {
                
                stmt = connection.createStatement();
                String sq ="UPDATE USERR SET  UserName='"+name1+"' ,UserAge = '"+age1+"' , UserAddress='"+address1+"' , UserMobileNo = '"+mobile1+"' , UserBloodGroup='"+bloodgroup1+"' , UserGender='"+gender1+"' WHERE UserId = '"+usid+"'";
                stmt.executeUpdate(sq);
                setVisible(false);
                UserProfile up=new UserProfile(usid);
                up.setVisible(true);
                
               
                
                
                
            
            } 
            
           
                
            connection.close();
        }
        catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void backuserprofilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backuserprofilebuttonActionPerformed
        setVisible(false);
        UserProfile up=new UserProfile(usid);
        up.setVisible(true);
    }//GEN-LAST:event_backuserprofilebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backuserprofilebutton;
    private javax.swing.JButton updatebutton;
    private javax.swing.JLabel useraddressLabel;
    private javax.swing.JTextField useraddressTextfield;
    private javax.swing.JLabel userageLabel;
    private javax.swing.JTextField userageTextfield;
    private javax.swing.JLabel userbloodgroupLabel;
    private javax.swing.JComboBox<String> userbloodgroupTextfield;
    private javax.swing.JLabel usergenderLabel;
    private javax.swing.JComboBox<String> usergenderTextfield;
    private javax.swing.JLabel usermobileLabel;
    private javax.swing.JTextField usermobileTextfield;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration//GEN-END:variables
}
