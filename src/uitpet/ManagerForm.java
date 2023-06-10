/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uitpet;

import ClassModel.Customer;
import ClassModel.Employee;
import ClassModel.Product;
import ClassModel.Service;
import DAOmodel.CustomerDAO;
import DAOmodel.EmployeeDAO;
import DAOmodel.ProductDAO;
import DAOmodel.ServiceDAO;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Khang
 */
public class ManagerForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagerForm
     */
    int state = 1;
    public void removeClicked( int index ) {
        
        switch(index) {
            case 1 -> {
                invoiceBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                invoiceLayout.setVisible(false);
            }
            case 2 -> {
                serviceBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                serviceLayout.setVisible(false);
            }
            case 3 -> {
                invoiceTypeBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                serviceTypeLayout.setVisible(false);
            }
            case 4 -> {
                productBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                productLayout.setVisible(false);
            }
            case 5 -> {
                statisticBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                statisticLayout.setVisible(false);
            }
            case 6 -> {
                customerBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                customerLayout.setVisible(false);
            }
            case 7 -> {
                empBtn.setBorder(BorderFactory.createLineBorder(Color.white));
                empLayout.setVisible(false);
            }
        }
        
    }
    
    
    public void addToTable(JTable table, Object[] entry, int col) {
        // Get row and column count
        int rowCount = table.getRowCount();
        int colCount = table.getColumnCount();
        DefaultTableModel model = (DefaultTableModel) table.getModel(); 
        // Get Current Table Entry
        String curEntry = "";
        for (Object o : entry) {
            String e = o.toString();
            curEntry = curEntry + " " + e;
        }

        // Check against all entries
        for (int i = 0; i < rowCount; i++) {
            String rowEntry = "";
            for (int j = 0; j < colCount; j++)
                rowEntry = rowEntry + " " + table.getValueAt(i, j).toString();
            if (rowEntry.equalsIgnoreCase(curEntry)) {
                System.out.println("there");
            }
        }
        model.insertRow(0, entry);
    }

    public void clearTable( JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel(); 
        int y = table.getRowCount();
        while (y > 0) {
            model.removeRow(0);
        }
    } 
    public boolean existsInTable(JTable table, Object[] entry) {

        // Get row and column count
        int rowCount = table.getRowCount();
        int colCount = table.getColumnCount();

        // Get Current Table Entry
        String curEntry = "";
        for (Object o : entry) {
            String e = o.toString();
            curEntry = curEntry + " " + e;
        }

        // Check against all entries
        for (int i = 0; i < rowCount; i++) {
            String rowEntry = "";
            for (int j = 0; j < colCount; j++)
                rowEntry = rowEntry + " " + table.getValueAt(i, j).toString();
            if (rowEntry.equalsIgnoreCase(curEntry)) {

                System.out.println(table.getValueAt(i, 3));
                return true;
            }
        }
        return false;
    }
    
    public static void disableBtn(JButton b) {
        b.setBackground(Color.gray);
        b.setForeground(Color.white);
        b.setEnabled(false);
    }
    
    public static void updateProductListTable(){
        DefaultTableModel model = (DefaultTableModel) productListTable.getModel();
        model.setRowCount(0);
        ArrayList<Product> list = ProductDAO.getInstance().SelectAll();
        for (Product p : list){
            model.addRow(new Object[]{p.getProductCode(),p.getProductName(),p.getQuantity(),p.getImportPrice(),p.getProductPrice(),p.getProductNotes(),p.getDateAdded()});
        }
        productListTable.setModel(model);
    }
    
    public static void updateServiceTable(){
        DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
        model.setRowCount(0);
        ArrayList<Service> list = ServiceDAO.getInstance().SelectAll();
        for (Service p : list){
            model.addRow(new Object[]{p.getServiceCode(), p.getServiceName(), p.getServicePrice(), p.getServiceNotes()});
        }
        serviceTable.setModel(model);
    }
    
    public static void resetTable() {
        System.out.println("renew there");
        DefaultTableModel model = (DefaultTableModel) productListTable.getModel();
        model.fireTableDataChanged();
    }
    
    public ManagerForm() {
        initComponents();
        this.setIconImage(new ImageIcon("Images/pet-shop.PNG").getImage());
        updateProductListTable();
        updateServiceTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        invoiceBtn = new javax.swing.JLabel();
        serviceBtn = new javax.swing.JLabel();
        invoiceTypeBtn = new javax.swing.JLabel();
        productBtn = new javax.swing.JLabel();
        customerBtn = new javax.swing.JLabel();
        statisticBtn = new javax.swing.JLabel();
        empBtn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        invoiceLayout = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        serviceCombobox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productList = new javax.swing.JList<>();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        serviceList = new javax.swing.JList<>();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        serviceLayout = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        serviceTable = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        serviceTypeLayout = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        productLayout = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        productListTable = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        customerLayout = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        statisticLayout = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel18 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jPanel23 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox<>();
        empLayout = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(new ImageIcon("Image/pet-shop.PNG").getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridLayout(7, 0, 10, 0));

        invoiceBtn.setBackground(new java.awt.Color(51, 153, 255));
        invoiceBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invoiceBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoiceBtn.setText("Hóa đơn");
        invoiceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceBtnMouseClicked(evt);
            }
        });
        jPanel2.add(invoiceBtn);

        serviceBtn.setBackground(new java.awt.Color(255, 255, 255));
        serviceBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        serviceBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        serviceBtn.setText("Dịch vụ");
        serviceBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceBtnMouseClicked(evt);
            }
        });
        jPanel2.add(serviceBtn);

        invoiceTypeBtn.setBackground(new java.awt.Color(255, 255, 255));
        invoiceTypeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        invoiceTypeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoiceTypeBtn.setText("Loại hình dịch vụ");
        invoiceTypeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                invoiceTypeBtnMouseClicked(evt);
            }
        });
        jPanel2.add(invoiceTypeBtn);

        productBtn.setBackground(new java.awt.Color(255, 255, 255));
        productBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        productBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productBtn.setText("Sản phẩm");
        productBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productBtnMouseClicked(evt);
            }
        });
        jPanel2.add(productBtn);

        customerBtn.setBackground(new java.awt.Color(255, 255, 255));
        customerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        customerBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerBtn.setText("Khách hàng");
        customerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerBtnMouseClicked(evt);
            }
        });
        jPanel2.add(customerBtn);

        statisticBtn.setBackground(new java.awt.Color(255, 255, 255));
        statisticBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        statisticBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statisticBtn.setText("Thống kê");
        statisticBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statisticBtnMouseClicked(evt);
            }
        });
        jPanel2.add(statisticBtn);

        empBtn.setBackground(new java.awt.Color(255, 255, 255));
        empBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        empBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empBtn.setText("Nhân viên");
        empBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empBtnMouseClicked(evt);
            }
        });
        jPanel2.add(empBtn);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 115, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 255), 2, true));
        jPanel4.setLayout(new java.awt.CardLayout());

        invoiceLayout.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(51, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG KÝ HÓA ĐƠN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Nhân viên");

        jLabel5.setText("Nguyễn Lê Khang");

        jLabel6.setText("Ngày tạo hóa đơn");

        jLabel7.setText("22-5-2023");

        jLabel9.setText("SĐT khách hàng");

        jTextField1.setText("0865904101");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên khách hàng");

        jTextField2.setText("Ming Cu");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Loại hình dịch vụ");

        serviceCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "dich vu 1", "dich vu 2" }));
        serviceCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serviceComboboxActionPerformed(evt);
            }
        });

        jLabel10.setText("Sản phẩm");

        productList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        productList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productList);

        jLabel11.setText("Ghi chú");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        serviceList.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        serviceList.setDoubleBuffered(true);
        serviceList.setInheritsPopupMenu(true);
        serviceList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serviceListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(serviceList);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(serviceCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField1)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))
                        .addGap(17, 17, 17))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(serviceCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));

        productTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại", "Mã", "Tên", "Số lượng", "Giá thành"
            }
        ));
        productTable.setGridColor(new java.awt.Color(255, 255, 255));
        productTable.setSelectionBackground(new java.awt.Color(51, 255, 255));
        productTable.setShowGrid(true);
        jScrollPane3.setViewportView(productTable);

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Tổng Tiền: 200000000000 ");

        jButton20.setBackground(new java.awt.Color(153, 255, 153));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton20.setForeground(new java.awt.Color(102, 0, 51));
        jButton20.setText("Xóa");

        jButton21.setBackground(new java.awt.Color(153, 255, 153));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton21.setForeground(new java.awt.Color(102, 0, 51));
        jButton21.setText("Tạo hóa đơn");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(153, 255, 153));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton19.setForeground(new java.awt.Color(102, 0, 51));
        jButton19.setText("Làm mới");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(jButton21)
                .addGap(27, 27, 27)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout invoiceLayoutLayout = new javax.swing.GroupLayout(invoiceLayout);
        invoiceLayout.setLayout(invoiceLayoutLayout);
        invoiceLayoutLayout.setHorizontalGroup(
            invoiceLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        invoiceLayoutLayout.setVerticalGroup(
            invoiceLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceLayoutLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.add(invoiceLayout, "card3");

        serviceLayout.setBackground(new java.awt.Color(51, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));

        jLabel12.setText("iconserach");

        jTextField3.setText("Search...");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Đăng kí dịch vụ");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        serviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã dịch vụ", "Tên dịch vụ", "Giá", "Ghi chú"
            }
        ));
        jScrollPane5.setViewportView(serviceTable);

        jPanel11.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jButton22.setBackground(new java.awt.Color(153, 255, 153));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton22.setForeground(new java.awt.Color(102, 0, 51));
        jButton22.setText("Xóa");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(153, 255, 153));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton23.setForeground(new java.awt.Color(102, 0, 51));
        jButton23.setText("Sửa");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(153, 255, 153));
        jButton24.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton24.setForeground(new java.awt.Color(102, 0, 51));
        jButton24.setText("Thêm");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(557, Short.MAX_VALUE)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel11.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout serviceLayoutLayout = new javax.swing.GroupLayout(serviceLayout);
        serviceLayout.setLayout(serviceLayoutLayout);
        serviceLayoutLayout.setHorizontalGroup(
            serviceLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        serviceLayoutLayout.setVerticalGroup(
            serviceLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(serviceLayoutLayout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(serviceLayout, "card3");

        serviceTypeLayout.setLayout(new java.awt.BorderLayout());

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
        jScrollPane6.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 500, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 459, Short.MAX_VALUE))
        );

        serviceTypeLayout.add(jPanel9, java.awt.BorderLayout.CENTER);

        jPanel4.add(serviceTypeLayout, "card4");

        productLayout.setBackground(new java.awt.Color(153, 255, 153));
        productLayout.setForeground(new java.awt.Color(102, 0, 51));
        productLayout.setLayout(new java.awt.BorderLayout());

        productListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Giá nhập", "Giá bán", "Ghi chú", "Ngày nhập kho"
            }
        ));
        jScrollPane8.setViewportView(productListTable);

        productLayout.add(jScrollPane8, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(new java.awt.Color(153, 255, 153));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 0, 51));
        jButton7.setText("Thêm");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(153, 255, 153));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 0, 51));
        jButton8.setText("Sửa");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(153, 255, 153));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 0, 51));
        jButton9.setText("Xóa");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(553, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        productLayout.add(jPanel14, java.awt.BorderLayout.PAGE_END);

        jPanel15.setBackground(new java.awt.Color(255, 204, 204));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setText("DANH SÁCH SẢN PHẨM");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(682, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        productLayout.add(jPanel15, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(productLayout, "card5");

        customerLayout.setBackground(new java.awt.Color(153, 255, 153));
        customerLayout.setForeground(new java.awt.Color(102, 0, 51));
        customerLayout.setLayout(new java.awt.BorderLayout());

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khách hàng", "SDT", "Tên khách hàng", "Địa chỉ", "Email", "Ngày sinh"
            }
        ));
        jScrollPane9.setViewportView(customerTable);

        customerLayout.add(jScrollPane9, java.awt.BorderLayout.CENTER);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jButton10.setBackground(new java.awt.Color(153, 255, 153));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton10.setForeground(new java.awt.Color(102, 0, 51));
        jButton10.setText("Thêm");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 255, 153));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton11.setForeground(new java.awt.Color(102, 0, 51));
        jButton11.setText("Sửa");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 255, 153));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton12.setForeground(new java.awt.Color(102, 0, 51));
        jButton12.setText("Xóa");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(552, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        customerLayout.add(jPanel16, java.awt.BorderLayout.PAGE_END);

        jPanel17.setBackground(new java.awt.Color(255, 204, 204));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("DANH SÁCH KHÁCH HÀNG");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(657, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        customerLayout.add(jPanel17, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(customerLayout, "card6");

        statisticLayout.setLayout(new java.awt.BorderLayout());

        jPanel20.setLayout(new java.awt.BorderLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên sản phẩm", "Tổng số lượng", "Số lượng còn lại", "Số lượng đã bán"
            }
        ));
        jScrollPane10.setViewportView(jTable5);

        jPanel20.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Kho hàng", jPanel20);

        jPanel18.setLayout(new java.awt.BorderLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã hóa đơn", "Người tạo", "Tên khách hàng", "Ngày tạo", "Tổng tiền"
            }
        ));
        jScrollPane11.setViewportView(jTable6);

        jPanel18.add(jScrollPane11, java.awt.BorderLayout.CENTER);

        jTextField6.setText("Tìm kiếm");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel18.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Hóa đơn", jPanel18);

        jPanel19.setLayout(new java.awt.BorderLayout());

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên khách hàng", "Số điện thoại", "Địa chỉ", "Tổng hóa đơn"
            }
        ));
        jScrollPane12.setViewportView(jTable7);

        jPanel19.add(jScrollPane12, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Khách hàng quen thuộc", jPanel19);

        jPanel21.setLayout(new java.awt.BorderLayout());

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Thời gian", "Tổng hóa đơn", "Tổng doanh thu", "Doanh thu cao nhất", "Doanh thu thấp nhất", "Doanh thu trung bình"
            }
        ));
        jScrollPane13.setViewportView(jTable8);

        jPanel21.add(jScrollPane13, java.awt.BorderLayout.CENTER);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Tháng", "Năm", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(792, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel21.add(jPanel23, java.awt.BorderLayout.PAGE_START);

        jTabbedPane1.addTab("Doanh thu", jPanel21);

        statisticLayout.add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jPanel4.add(statisticLayout, "card7");

        empLayout.setBackground(new java.awt.Color(153, 255, 153));
        empLayout.setLayout(new java.awt.BorderLayout());

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Ngày sinh", "Địa chỉ", "Email", "SĐT", "Ngày vào làm", "Lương"
            }
        ));
        jScrollPane14.setViewportView(empTable);
        if (empTable.getColumnModel().getColumnCount() > 0) {
            empTable.getColumnModel().getColumn(7).setResizable(false);
        }

        empLayout.add(jScrollPane14, java.awt.BorderLayout.CENTER);

        jPanel25.setBackground(new java.awt.Color(255, 204, 204));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel19.setText("QUẢN LÝ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(670, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        empLayout.add(jPanel25, java.awt.BorderLayout.PAGE_START);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));

        jButton13.setBackground(new java.awt.Color(153, 255, 153));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton13.setForeground(new java.awt.Color(102, 0, 51));
        jButton13.setText("Thêm");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(153, 255, 153));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(102, 0, 51));
        jButton14.setText("Sửa");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(153, 255, 153));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton15.setForeground(new java.awt.Color(102, 0, 51));
        jButton15.setText("Xóa");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(583, Short.MAX_VALUE)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jButton14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        empLayout.add(jPanel26, java.awt.BorderLayout.PAGE_END);

        jPanel4.add(empLayout, "card8");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nguyễn Lê Khang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 917, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceBtnMouseClicked
        removeClicked(state);
        state = 1;
        invoiceBtn.setBackground(new Color(0x0074D9));
        invoiceBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        invoiceLayout.setVisible(true);
    }//GEN-LAST:event_invoiceBtnMouseClicked

    private void serviceBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 2;
        serviceBtn.setBackground(new Color(0x0074D9));
        serviceBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        serviceLayout.setVisible(true);
//        layout1.setVisible(false);
    }//GEN-LAST:event_serviceBtnMouseClicked

    private void invoiceTypeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_invoiceTypeBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 3;
        invoiceTypeBtn.setBackground(new Color(0x0074D9));
        invoiceTypeBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        serviceTypeLayout.setVisible(true);
    }//GEN-LAST:event_invoiceTypeBtnMouseClicked

    private void productBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 4;
        productBtn.setBackground(new Color(0x0074D9));
        productBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        productLayout.setVisible(true);
    }//GEN-LAST:event_productBtnMouseClicked

    private void customerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 6;
        customerBtn.setBackground(new Color(0x0074D9));
        customerBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        customerLayout.setVisible(true);
    }//GEN-LAST:event_customerBtnMouseClicked

    private void statisticBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statisticBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 5;
        statisticBtn.setBackground(new Color(0x0074D9));
        statisticBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        statisticLayout.setVisible(true);
    }//GEN-LAST:event_statisticBtnMouseClicked

    private void empBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empBtnMouseClicked
        // TODO add your handling code here:
        removeClicked(state);
        state = 7;
        empBtn.setBackground(new Color(0x0074D9));
        empBtn.setBorder(BorderFactory.createLineBorder(Color.black));
        empLayout.setVisible(true);
    }//GEN-LAST:event_empBtnMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void serviceComboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serviceComboboxActionPerformed
        // TODO add your handling code here:
        String serviceSelected = String.valueOf(serviceCombobox.getSelectedItem());
        DefaultListModel model = new DefaultListModel();
        if (serviceSelected.equals("dich vu 1")) {
            String[] items = { "A", "B", "C", "D" };
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        if (serviceSelected.equals("dich vu 2")) {
            String[] items = { "E", "F", "G", "H" };
            for (int i = 0; i < items.length; i++) {
                model.add(i, items[i]);
            }
        }
        serviceList.setModel(model);
    }//GEN-LAST:event_serviceComboboxActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        InputEmployeeForm data = new InputEmployeeForm();
        data.setVisible(true);
        data.pack();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void serviceListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serviceListMouseClicked
        // TODO add your handling code here:
        String value = serviceList.getSelectedValue();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel(); 
        model.insertRow(0,new Object[] { "DV","DV001",value,1,2000000 });
        System.out.println(existsInTable(productTable,new Object[] { "DV","DV001","A",1,2000000 }));
        
    }//GEN-LAST:event_serviceListMouseClicked

    private void productListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListMouseClicked
        // TODO add your handling code here:
        String value = productList.getSelectedValue();
        DefaultTableModel model = (DefaultTableModel) productTable.getModel(); 
//        model.insertRow(0,new Object[] { "SP","SP001",value,1,2000000 });

        addToTable(productTable, new Object[]{ "SP","SP001",value,1,2000000 }, ERROR);
        
    }//GEN-LAST:event_productListMouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        clearTable(productTable);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:\
        int index = serviceTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Chọn một dịch vụ để sửa");
        } 
        else {
            DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
            String code = model.getValueAt(index, 0).toString();
            String name = model.getValueAt(index, 1).toString();
            String price = model.getValueAt(index, 2).toString();
            String note = model.getValueAt(index, 3).toString();
            InputServiceForm data = new InputServiceForm(code,name,price,note,index);
            data.setVisible(true);
            data.pack();
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        InputServiceForm data = new InputServiceForm();
        data.setVisible(true);
        data.pack();

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        int index = serviceTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) serviceTable.getModel();
        String serId = (String) model.getValueAt(index, 1);
        System.out.println(serId);
        Service service = new Service();
        service.setServiceCode(serId);
        System.out.println(service);
        int deleteRow = ServiceDAO.getInstance().delete(service);
        if (index != -1) model.removeRow(index);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        int index = productListTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Chọn một sản phẩm để sửa");
        } 
        else {
            DefaultTableModel model = (DefaultTableModel) productListTable.getModel();
            String code = model.getValueAt(index, 0).toString();
            String name = model.getValueAt(index, 1).toString();
            int quantity = Integer.parseInt(model.getValueAt(index, 2).toString());
            int inPrice = Integer.parseInt(model.getValueAt(index, 3).toString());
            int outPrice = Integer.parseInt(model.getValueAt(index, 4).toString());
            String note = model.getValueAt(index, 5).toString();
            String date = model.getValueAt(index, 6).toString();
            InputProductForm data = new InputProductForm(code,name,quantity,inPrice,outPrice,note,date,index);
            data.setVisible(true);
            data.pack();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int index = productListTable.getSelectedRow();
        if (index > -1) {
            DefaultTableModel model = (DefaultTableModel) productListTable.getModel(); 
//            Lấy ra product ID của hàng đã đc người dùng select
            String productId = (String) model.getValueAt(index, 0);
            Product product = new Product();
            product.setProductCode(productId);
            model.removeRow(index);
            int deleteRow = ProductDAO.getInstance().delete(product);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        InputCustomerForm data = new InputCustomerForm();
        data.setVisible(true);
        data.pack();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        int index = customerTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Chọn một khách để sửa");
        } 
        else {
            DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
            String code = model.getValueAt(index, 0).toString();
            String name = model.getValueAt(index, 1).toString();
            String phone = model.getValueAt(index, 2).toString();
            String address = model.getValueAt(index, 3).toString();
            String email = model.getValueAt(index, 4).toString();
            String bd = model.getValueAt(index, 5).toString();
            InputCustomerForm data = new InputCustomerForm(code,name,phone,address,email,bd,index);
            data.setVisible(true);
            data.pack();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        int index = customerTable.getSelectedRow();
        if (index != -1) {
            DefaultTableModel model = (DefaultTableModel) customerTable.getModel();
            String cusId = (String) model.getValueAt(index, 0);
            System.out.println(cusId);
            Customer customer = new Customer();
            customer.setCode(cusId);
            System.out.println(customer);
            int deleteRow = CustomerDAO.getInstance().delete(customer);
            model.removeRow(index);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        int index = empTable.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Chọn một nhân viên để sửa");
        } 
        else {
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            String code = model.getValueAt(index, 0).toString();
            String name = model.getValueAt(index, 1).toString();
            String bd = model.getValueAt(index, 2).toString();
            String add = model.getValueAt(index, 3).toString();
            String email = model.getValueAt(index, 4).toString();
            String phone = model.getValueAt(index, 5).toString();
            String sd = model.getValueAt(index, 6).toString();
            int salary = Integer.parseInt(model.getValueAt(index, 7).toString());
            InputEmployeeForm data = new InputEmployeeForm(code,name,bd,add,email,phone,sd,salary,index);
            data.setVisible(true);
            data.pack();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        int index = empTable.getSelectedRow();
        if (index != -1) {
            DefaultTableModel model = (DefaultTableModel) empTable.getModel();
            model.removeRow(index);   
            String empId = (String) model.getValueAt(index, 0);
            Employee employee = new Employee();
            employee.setCode(empId);
            model.removeRow(index);
            int deleteRow = EmployeeDAO.getInstance().delete(employee);
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        InputProductForm data = new InputProductForm();
        data.setVisible(true);
        data.pack();
    }//GEN-LAST:event_jButton7ActionPerformed

    public static void replaceRowToServiceTable(Object[] data,int row) {
        DefaultTableModel modelservice = (DefaultTableModel) serviceTable.getModel(); 
        for (int i= 0;i < 4; i++) {
            modelservice.setValueAt(data[i], row, i);
        }
    }
    
    public static void addRowToServiceTable(Object[] data) {
        DefaultTableModel modelservice = (DefaultTableModel) serviceTable.getModel(); 
        modelservice.addRow(data);
    }
    
     public static void replaceRowToProductListTable(Object[] data,int row) {
        DefaultTableModel modelservice = (DefaultTableModel) productListTable.getModel(); 
        for (int i= 0;i < 7; i++) {
            modelservice.setValueAt(data[i], row, i);
        }
    }
    
    public static void addRowToProductListTable(Object[] data) {
        DefaultTableModel modelservice = (DefaultTableModel) productListTable.getModel(); 
        modelservice.addRow(data);
    }
    
    public static void replaceRowToCustomerTable(Object[] data,int row) {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel(); 
        for (int i= 0;i < 5; i++) {
            model.setValueAt(data[i], row, i);
        }
    }
    
    public static void addRowToCustomerTable(Object[] data) {
        DefaultTableModel model = (DefaultTableModel) customerTable.getModel(); 
        model.addRow(data);
    }
    
    public static void replaceRowToEmpTable(Object[] data,int row) {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel(); 
        for (int i= 0;i < model.getColumnCount(); i++) {
            model.setValueAt(data[i], row, i);
        }
    }
    
    public static void addRowToEmpTable(Object[] data) {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel(); 
        model.addRow(data);
    }
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
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel customerBtn;
    private javax.swing.JPanel customerLayout;
    private static javax.swing.JTable customerTable;
    private javax.swing.JLabel empBtn;
    private javax.swing.JPanel empLayout;
    private static javax.swing.JTable empTable;
    private javax.swing.JLabel invoiceBtn;
    private javax.swing.JPanel invoiceLayout;
    private javax.swing.JLabel invoiceTypeBtn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTable jTable8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel productBtn;
    private javax.swing.JPanel productLayout;
    private javax.swing.JList<String> productList;
    private static javax.swing.JTable productListTable;
    private javax.swing.JTable productTable;
    private javax.swing.JLabel serviceBtn;
    private javax.swing.JComboBox<String> serviceCombobox;
    private javax.swing.JPanel serviceLayout;
    private javax.swing.JList<String> serviceList;
    private static javax.swing.JTable serviceTable;
    private javax.swing.JPanel serviceTypeLayout;
    private javax.swing.JLabel statisticBtn;
    private javax.swing.JPanel statisticLayout;
    // End of variables declaration//GEN-END:variables
}
