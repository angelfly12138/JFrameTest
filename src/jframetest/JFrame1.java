/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframetest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author betsaue
 */
public class JFrame1 extends javax.swing.JFrame {
        
    Connection con;
    Statement stmt;
    ResultSet rs, rs1;
    int curRow = 0;
    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
        initComponents();
        DoConnect();
    }
    
    public void DoConnect( ) {
        try {
             String host = "jdbc:derby://localhost:1527/Db1";
             String uName = "test";
             String uPass= "admin";
             
             Connection con = DriverManager.getConnection(host, uName, uPass);
             
             Statement stmt = con.createStatement( );
             String SQL = "SELECT * FROM KUNDINFO";
             ResultSet rs = stmt.executeQuery( SQL );
             
             
             /*while ( rs.next( ) ) {
             int OrderID1 = rs.getInt("OrderID");
             String OrderID = Integer.toString(OrderID1);
             String Förnamn = rs.getString("Förnamn");
             String Efternamn = rs.getString("Efternamn");
             
             //System.out.println( OrderID + " " + Förnamn + " ");
             txt_Förnamn.setText(Förnamn);
             txt_Efternamn.setText(Efternamn);
            }*/
       }
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_OrderID = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Btn_NyOrder = new javax.swing.JButton();
        Btn_Avbryt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_Förnamn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_Kontakt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Adress = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_Pin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Efternamn = new javax.swing.JTextField();
        Btn_Spara = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        CB_Antal = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CB_PizzaNamn = new javax.swing.JComboBox();
        CB_Storlek = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txt_Kost = new javax.swing.JTextField();
        Btn_LäggTill = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_OrderInfo = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel7.setText("MYSTIC PIZZA COMPANY");

        jLabel1.setText("Order ID:");

        txt_OrderID.setText("0");
        txt_OrderID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_OrderIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/betsaue/Documents/pizza.jpg")); // NOI18N
        jLabel6.setText("PIZZA ORDER SYSTEM");

        Btn_NyOrder.setText("Ny Order");
        Btn_NyOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NyOrderActionPerformed(evt);
            }
        });

        Btn_Avbryt.setText("Avbryt");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Kund  Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N

        jLabel4.setText("Förnamn:");

        txt_Förnamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FörnamnActionPerformed(evt);
            }
        });

        jLabel9.setText("Kontakt:");

        jLabel10.setText("Adress:");

        jLabel12.setText("Postkod:");

        jLabel5.setText("Efternamn:");

        txt_Efternamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EfternamnActionPerformed(evt);
            }
        });

        Btn_Spara.setText("Registrera");
        Btn_Spara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SparaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Förnamn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_Adress, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Pin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Kontakt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_Spara, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Förnamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Efternamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Kontakt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Pin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txt_Adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(Btn_Spara))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pizza Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 13))); // NOI18N
        jPanel3.setToolTipText("");
        jPanel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        CB_Antal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        jLabel8.setText("Antal:");

        jLabel2.setText("Pizza Namn:");

        CB_PizzaNamn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Välj", "Margeritta", "Pepperoni", "Ost", "Mexicana", "Indiana" }));
        CB_PizzaNamn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_PizzaNamnActionPerformed(evt);
            }
        });

        CB_Storlek.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Välj", "Small", "Medium", "Large", "Family" }));
        CB_Storlek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_StorlekActionPerformed(evt);
            }
        });

        jLabel3.setText("Storlek:");

        txt_Kost.setFont(new java.awt.Font("Lucida Grande", 1, 12)); // NOI18N
        txt_Kost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_KostActionPerformed(evt);
            }
        });

        Btn_LäggTill.setText("Lägg Till");
        Btn_LäggTill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LäggTillActionPerformed(evt);
            }
        });

        tbl_OrderInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pizza Namn", "Storlek", "Antal", "Kost"
            }
        ));
        jScrollPane1.setViewportView(tbl_OrderInfo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Btn_LäggTill, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_Storlek, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CB_PizzaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CB_Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_Kost, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Antal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(CB_PizzaNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CB_Storlek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Kost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_LäggTill)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Visa Order Summary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Btn_NyOrder))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Btn_Avbryt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)))
                        .addGap(37, 37, 37)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Btn_NyOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(Btn_Avbryt))
                        .addGap(12, 12, 12))))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Pizza Information");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_KostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_KostActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_KostActionPerformed

    private void CB_PizzaNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_PizzaNamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_PizzaNamnActionPerformed

    private void txt_OrderIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_OrderIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_OrderIDActionPerformed

    private void CB_StorlekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_StorlekActionPerformed
        // TODO add your handling code here:
        //Displays the cost of the selected pizza depending on its size.
        String Small= null , Medium = null , Large=null, Family=null;
        String itemText = (String)CB_Storlek.getSelectedItem();
        
        //String itemText1 = (String)CB_Antal.getSelectedItem();

               
        if(itemText == "Small"){ 
         
         txt_Kost.setText("100Kr per Pizza");
        }
        else if(itemText == "Medium"){ 
         
         txt_Kost.setText("200Kr per Pizza");
        }
        else if(itemText == "Large"){ 
         
         txt_Kost.setText("300Kr per Pizza");
        }
        if(itemText == "Family"){ 
         
         txt_Kost.setText("500Kr per Pizza");
        }
    }//GEN-LAST:event_CB_StorlekActionPerformed

    private void Btn_LäggTillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LäggTillActionPerformed
        // TODO add your handling code here:
        String antal2="null";
        
        DefaultTableModel model =  (DefaultTableModel) tbl_OrderInfo.getModel();
        
        String antal1 = CB_Antal.getSelectedItem().toString();
        try{
                antal2 = txt_Kost.getText(0,3);
        
        
        int antal3 = Integer.parseInt(antal1)* Integer.parseInt(antal2);
        String kost = String.valueOf(antal3);
        
        model.addRow(new Object[] { CB_PizzaNamn.getSelectedItem(),CB_Storlek.getSelectedItem(),CB_Antal.getSelectedItem().toString(),kost});
        
        
        
             String host = "jdbc:derby://localhost:1527/Db1";
             String uName = "test";
             String uPass= "admin";
             
             Connection con = DriverManager.getConnection(host, uName, uPass);
             
             stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             String SQL = "SELECT * FROM PIZZAORDERINFO";
             ResultSet rs = stmt.executeQuery( SQL );
             
             rs.last();
             
             System.out.println(rs1);
             int OrderItem1 = rs.getInt("OrderItem");
             
             //String OrderItem2 = String.valueOf(OrderItem1);
             if(OrderItem1 == 0){
                 OrderItem1++;
                     
             }
             else {
                 OrderItem1++;
                 
             }
             
             
             int OrderID = Integer.parseInt(txt_OrderID.getText());
             String PizzaNamn = CB_PizzaNamn.getSelectedItem().toString();
             String Storlek = CB_Storlek.getSelectedItem().toString();
             String Antal1 = CB_Antal.getSelectedItem().toString();
             int Antal = Integer.parseInt(Antal1);
             int Kost = Integer.parseInt(kost);
             
            rs.moveToInsertRow();
            
            //rs.updateInt("OrderItem", OrderItem);
            rs.updateInt("OrderItem", OrderItem1);
            rs.updateInt("OrderID", OrderID);
            rs.updateString("PizzaNamn", PizzaNamn);
            rs.updateString("Storlek", Storlek);
            rs.updateInt("Antal", Antal);
            rs.updateInt("Kost", Kost);
            
            
            
            rs.insertRow();
            
            stmt.close();
            rs.close();
           
             
       }
        catch ( Exception err ) {
            System.out.println( err.getMessage( ) );
        }

        
        
    }//GEN-LAST:event_Btn_LäggTillActionPerformed

    private void Btn_NyOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NyOrderActionPerformed
        // TODO add your handling code here:
        
             //Clear all the text fields when the Button Ny Order is clicked.
            txt_Förnamn.setText("");
            txt_Efternamn.setText("");
            txt_Kontakt.setText("");
            txt_Adress.setText("");
            txt_Pin.setText("");
            txt_Kost.setText("");
            txt_OrderID.setText("");
            
            //Clears the Jtable when the Button Ny Order is clicked.
            DefaultTableModel model =  (DefaultTableModel) tbl_OrderInfo.getModel();
            model.setRowCount(0);
            
            try{
                String host = "jdbc:derby://localhost:1527/Db1";
                String uName = "test";
                String uPass= "admin";
             
                Connection con = DriverManager.getConnection(host, uName, uPass);
             
                stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                String SQL = "SELECT * FROM KUNDINFO";
                ResultSet rs = stmt.executeQuery( SQL );
             
                //Fetches the latest updated Order Id from KundInfo Table.
                rs.last();

                int OrderID1 = rs.getInt("OrderID");
                String OrderID = String.valueOf(OrderID1);

                txt_OrderID.setText(OrderID);
                String text = txt_OrderID.getText();     
                int count = Integer.parseInt(text);
                count++;
                String text1 = String.valueOf(count);
                txt_OrderID.setText(text1);
                
                stmt.close();
                rs.close();

        }
        catch (Exception err ) {
            System.out.println( err.getMessage( ) );
        }
  
    }//GEN-LAST:event_Btn_NyOrderActionPerformed

    private void txt_EfternamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EfternamnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EfternamnActionPerformed

    private void txt_FörnamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FörnamnActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_txt_FörnamnActionPerformed

    private void Btn_SparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SparaActionPerformed
        // TODO add your handling code here:
         
        try{
            String host = "jdbc:derby://localhost:1527/Db1";
            String uName = "test";
            String uPass= "admin";
             
            Connection con = DriverManager.getConnection(host, uName, uPass);
             
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
             String SQL = "SELECT * FROM KUNDINFO";
             ResultSet rs = stmt.executeQuery( SQL );
            
           
            int OrderID = Integer.parseInt(txt_OrderID.getText());
            String Förnamn = txt_Förnamn.getText();
            String Efternamn = txt_Efternamn.getText();
            int Kontakt = Integer.parseInt(txt_Kontakt.getText());
            String Adress = txt_Adress.getText();
            int Pin = Integer.parseInt(txt_Pin.getText());
            
            
            rs.moveToInsertRow();
            
            rs.updateInt("OrderID", OrderID);
            rs.updateString("Förnamn", Förnamn);
            rs.updateString("Efternamn", Efternamn);
            rs.updateInt("Kontakt", Kontakt);
            rs.updateString("Adress", Adress);
            rs.updateInt("Pin", Pin);
            
            
            
            rs.insertRow();
            
            stmt.close();
            rs.close();
            
        JOptionPane.showMessageDialog(this,"Kund Information har sparat!");
            
        }
        catch (Exception err ) {
            System.out.println( err.getMessage( ) );
        }
    }//GEN-LAST:event_Btn_SparaActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Avbryt;
    private javax.swing.JButton Btn_LäggTill;
    private javax.swing.JButton Btn_NyOrder;
    private javax.swing.JButton Btn_Spara;
    private javax.swing.JComboBox CB_Antal;
    private javax.swing.JComboBox CB_PizzaNamn;
    private javax.swing.JComboBox CB_Storlek;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_OrderInfo;
    private javax.swing.JTextField txt_Adress;
    private javax.swing.JTextField txt_Efternamn;
    private javax.swing.JTextField txt_Förnamn;
    private javax.swing.JTextField txt_Kontakt;
    private javax.swing.JTextField txt_Kost;
    private javax.swing.JTextField txt_OrderID;
    private javax.swing.JTextField txt_Pin;
    // End of variables declaration//GEN-END:variables
}
