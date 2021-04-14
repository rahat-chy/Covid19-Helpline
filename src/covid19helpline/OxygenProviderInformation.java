/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19helpline;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class OxygenProviderInformation extends javax.swing.JFrame {

    /**
     * Creates new form OxygenProviderInformation
     */
    
    int providercnt=0;
    public OxygenProviderInformation() {
        initComponents();
        
    }
    
    String usid;
    public OxygenProviderInformation(String msg) {
        initComponents();
        usid=msg;
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 Connection connection = DriverManager.getConnection(
                         "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT * FROM OxygenProvider");
            
           

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                
               
                String ProviderID = String.valueOf(resultSet.getInt("ProviderID"));
                String ProviderName = resultSet.getString("ProviderName");
                String ProviderAddress = resultSet.getString("ProviderAddress");
                String ProviderContactNo = resultSet.getString("ProviderContactNo");
                String ProviderAvailableStock = resultSet.getString("ProviderAvailableStock");
                String PricePerUnit = resultSet.getString("PricePerUnit");
                
                //areaComboBox.addItem(ProviderAddress);
                
                String tbData[] ={ProviderID,ProviderName,ProviderAddress,ProviderContactNo,ProviderAvailableStock,PricePerUnit};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                                                
                tblModel.addRow(tbData);               
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("select distinct(ProviderAddress) from OxygenProvider");
            
    
            
           
          
            int cnt=0;
            
             
             
             
     
            while (resultSet.next()) {

       
                 providercnt++;
              String ProviderAddress = resultSet.getString("ProviderAddress");
                
                
               areaComboBox.addItem(ProviderAddress);

                
            }
            
            
           
            

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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BackToDashboardButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        areaComboBox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        providerIdTextfield = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Agency FB", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Oxygen Provider Information");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProviderID", "ProviderName", "ProviderAddress", "ProviderContactNo", "ProviderAvailableStock", "PricePerUnit"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BackToDashboardButton.setBackground(new java.awt.Color(255, 0, 0));
        BackToDashboardButton.setText("Back To Dashboard");
        BackToDashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackToDashboardButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Search By Area");

        areaComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        areaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All" }));

        jButton1.setBackground(new java.awt.Color(51, 255, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 255));
        jLabel3.setText("Purchase Oxygens");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Provider ID: ");

        purchaseButton.setBackground(new java.awt.Color(51, 255, 255));
        purchaseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        purchaseButton.setText("Purchase");
        purchaseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 204, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(304, 304, 304))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(401, 401, 401))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BackToDashboardButton)
                                .addGap(367, 367, 367))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(288, 288, 288))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(providerIdTextfield))
                                .addGap(335, 335, 335))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(purchaseButton)
                                .addGap(394, 394, 394))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(providerIdTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(purchaseButton)
                .addGap(53, 53, 53)
                .addComponent(BackToDashboardButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackToDashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackToDashboardButtonActionPerformed
        setVisible(false);
        dashboard db=new dashboard(usid);
        db.setVisible(true);
    }//GEN-LAST:event_BackToDashboardButtonActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String area = (String) areaComboBox.getSelectedItem();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                 Connection connection = DriverManager.getConnection(
                         "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet resultSet;
            
            
            if(area.equals("All"))
            {
           
                resultSet = statement.executeQuery("SELECT * FROM OxygenProvider");
            }
            else
            {
                resultSet = statement.executeQuery("SELECT * FROM OxygenProvider WHERE ProviderAddress='"+area+"'");
            }
            
           

            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0);
            while (resultSet.next()) {
                
               
                  
               
                String ProviderID = String.valueOf(resultSet.getInt("ProviderID"));
                String ProviderName = resultSet.getString("ProviderName");
                String ProviderAddress = resultSet.getString("ProviderAddress");
                String ProviderContactNo = resultSet.getString("ProviderContactNo");
                String ProviderAvailableStock = resultSet.getString("ProviderAvailableStock");
                String PricePerUnit = resultSet.getString("PricePerUnit");
                
                areaComboBox.addItem(ProviderAddress);
                
                String tbData[] ={ProviderID,ProviderName,ProviderAddress,ProviderContactNo,ProviderAvailableStock,PricePerUnit};
                DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                                                
                tblModel.addRow(tbData);               
            }
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void purchaseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseButtonActionPerformed
        String providerid = providerIdTextfield.getText();
        
           
       int mflag=0; 
       int amountcheck=0;
        
        for(int i=0 ; i<providerid.length() ; i++){
                 char c= providerid.charAt(i);
                
                if(c>='0' && c<='9')
                    continue;
                else{
                    mflag=1;
                    break;
                }
                         
        }
        if (providerid.equals("")){
            JOptionPane.showMessageDialog(this, "Please insert Provider ID");
        }
        else if(mflag==1 || Integer.parseInt(providerid)>providercnt){
            JOptionPane.showMessageDialog(this, "Please insert a Valid ID");
        }
        else{
            
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            

            Statement statement = connection.createStatement();
           

        
            
            System.out.println(providerid);
           ResultSet resultset =  statement.executeQuery("SELECT * FROM OxygenProvider WHERE ProviderID = " + providerid );  
           resultset.next();    
           String pas = resultset.getString("ProviderAvailableStock") ;
            System.out.println(pas);
          if(pas.equals("0")){
              amountcheck=1;
          }

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        if(amountcheck==0){
        int cnt=0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            

            Statement statement = connection.createStatement();
           ResultSet resultSet = statement.executeQuery("SELECT * FROM Buys");

           String amount;
            while (resultSet.next()) {
                    cnt++;

            }
            
           

            JOptionPane.showMessageDialog(this, "Purchase Done!");
            cnt++;
            //System.out.println(cnt);
            String id = Integer.toString(cnt);
               
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
            LocalDateTime now = LocalDateTime.now();
            
            String curr = now.format(dtf);
               
            statement.executeQuery("INSERT INTO Buys(PurchaseID, UserID , ProviderID , PurchaseDate) VALUES ( " + cnt + " , '" + usid + "' , '" + providerid + "' , '" + curr + "')");
            
              
                
            

            connection.close();
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=COVID19 Helpline;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            

            Statement statement = connection.createStatement();
           

        
            
            statement.executeQuery("UPDATE OxygenProvider SET ProviderAvailableStock = ProviderAvailableStock -1 WHERE ProviderID = "+ providerid  );  
                
            

            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Out of Stock!");
        }
        }
        
        providerIdTextfield.setText("");
    }//GEN-LAST:event_purchaseButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OxygenProviderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OxygenProviderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OxygenProviderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OxygenProviderInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OxygenProviderInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackToDashboardButton;
    private javax.swing.JComboBox<String> areaComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField providerIdTextfield;
    private javax.swing.JButton purchaseButton;
    // End of variables declaration//GEN-END:variables
}
