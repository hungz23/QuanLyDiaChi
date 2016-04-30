/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address.AddressManagement;

import java.awt.Color;
import entity.AddressManagement.*;
import java.beans.Beans;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author QuestionBoy
 */


public class AddressManagementGUI extends javax.swing.JFrame {
    

    /**
     * Creates new form AddressManagementGUI
     */
    public AddressManagementGUI() {
        initComponents();
         if (!Beans.isDesignTime()) {
            AddressManagementPUEntityManager.getTransaction().begin();
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

        AddressManagementPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("AddressManagementPU").createEntityManager();
        addressQuery = java.beans.Beans.isDesignTime() ? null : AddressManagementPUEntityManager.createQuery("SELECT a FROM Address a");
        addressList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : addressQuery.getResultList();
        provinceQuery = java.beans.Beans.isDesignTime() ? null : ((javax.persistence.EntityManager)AddressManagementPUEntityManager).createNamedQuery("Province.findAll");
        provinceList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : ((javax.persistence.Query)provinceQuery).getResultList();
        add = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        provinceText = new javax.swing.JTextField();
        infoListView = new javax.swing.JScrollPane();
        infoList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        add.setText("Thêm");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        searchButton.setText("Tìm");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        provinceText.setForeground(new java.awt.Color(204, 204, 204));
        provinceText.setText("Nhập tên tỉnh");
        provinceText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                provinceTextMouseClicked(evt);
            }
        });

        infoList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        infoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                infoListValueChanged(evt);
            }
        });
        infoListView.setViewportView(infoList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(provinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(searchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(add))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(infoListView, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(provinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchButton))
                .addGap(42, 42, 42)
                .addComponent(infoListView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(add)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        AddressManagementGUI.this.setVisible(false);
        //AddressManagementGUI.this.dispose();
        new AddAddressGUI().setVisible(true);

    }//GEN-LAST:event_addActionPerformed

    private void provinceTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_provinceTextMouseClicked
        // TODO add your handling code here:
        provinceText.setText("");
        provinceText.setForeground(Color.black);
    }//GEN-LAST:event_provinceTextMouseClicked

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        // TODO add your handling code here:
        
        //provinceList.clear();
        
        //DefaultListModel model= new DefaultListModel();
        //for(District a: data){
          //  model.addElement(a.getName());
           // System.out.println("1---"+ a.getName());
        //}
        //jList1 = new javax.swing.JList<>(model);
        
        //org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, data, jList1);
        //bindingGroup.addBinding(jListBinding);



    }//GEN-LAST:event_searchButtonMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String provinceName=provinceText.getText();
        javax.persistence.Query query=AddressManagementPUEntityManager.createNamedQuery("Province.findByName").setParameter("name", provinceName+"%");
        java.util.List<Province> result=query.getResultList();
        DefaultListModel model= new DefaultListModel();
        for(Province a:result){
            model.addElement(a.getName());
        }
        infoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    infoListValueChanged(evt);
                }
            });
        infoList=new JList(model);
        infoListView.setViewportView(infoList);
    }//GEN-LAST:event_searchButtonActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_addMouseClicked

    private void infoListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_infoListValueChanged
        // TODO add your handling code here:
        ListModel model1=infoList.getModel();
        String provinceid=new String();
        String provinceName=(String) model1.getElementAt(evt.getFirstIndex());
        javax.persistence.Query query=AddressManagementPUEntityManager.createNamedQuery("Province.findByName").setParameter("name", provinceName);
        java.util.List<Province> provinceList=query.getResultList();
        for(Province province: provinceList){
            provinceid=province.getProvinceid();System.out.println(province.getName());
        }
        query=AddressManagementPUEntityManager.createNamedQuery("District.findByProvinceid").setParameter("provinceid", provinceid);
        java.util.List<District> districtList=query.getResultList();
        
        DefaultListModel model= new DefaultListModel();
        for(District district:districtList){
            model.addElement(district.getName());
        }
        infoList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
        public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                    infoListValueChanged(evt);
                }
            });
        infoList=new JList(model);
        infoListView.setViewportView(infoList);
        
        // Textfield
        provinceText.setText("Nhập tên huyện");
        provinceText.setForeground(new java.awt.Color(204, 204, 204));
    }//GEN-LAST:event_infoListValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
      /*  try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddressManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddressManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddressManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddressManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddressManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager AddressManagementPUEntityManager;
    private javax.swing.JButton add;
    private java.util.List<entity.AddressManagement.Address> addressList;
    private javax.persistence.Query addressQuery;
    private javax.swing.JList<String> infoList;
    private javax.swing.JScrollPane infoListView;
    private java.util.List provinceList;
    private javax.persistence.Query provinceQuery;
    private javax.swing.JTextField provinceText;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
