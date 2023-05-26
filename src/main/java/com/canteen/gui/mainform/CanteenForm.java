/*
 * Created by JFormDesigner on Thu Apr 13 21:12:08 CST 2023
 */

package com.canteen.gui.mainform;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;


/**
 * @author 10047
 */
public class CanteenForm {
    public CanteenForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        canteenForm = new JFrame();
        scrollPane1 = new JScrollPane();
        mainTable = new JTable();
        mainLable = new JLabel();
        mainButton_menu = new JButton();
        mainButton_order = new JButton();
        mainButton_customer = new JButton();
        mainButton_printer = new JButton();
        mainButton_onekey = new JButton();

        //======== canteenForm ========
        {
            canteenForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            canteenForm.setTitle("\u98df\u5802\u8ba2\u5355\u7ba1\u7406\u7cfb\u7edf");
            var canteenFormContentPane = canteenForm.getContentPane();
            canteenFormContentPane.setLayout(null);

            //======== scrollPane1 ========
            {

                //---- mainTable ----
                mainTable.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                        {null, null, null, null, null, null},
                    },
                    new String[] {
                        "\u4e3b\u83dc", "\u914d\u83dc1", "\u914d\u83dc2", "\u914d\u83dc3", "\u5355\u4ef7", "\u4efd\u6570"
                    }
                ));
                mainTable.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
                scrollPane1.setViewportView(mainTable);
            }
            canteenFormContentPane.add(scrollPane1);
            scrollPane1.setBounds(180, 60, 535, 280);

            //---- mainLable ----
            mainLable.setText("\u4eca\u65e5\u83dc\u5355");
            mainLable.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 20));
            canteenFormContentPane.add(mainLable);
            mainLable.setBounds(400, 15, 110, 35);

            //---- mainButton_menu ----
            mainButton_menu.setText("\u83dc\u5355\u8bbe\u7f6e");
            canteenFormContentPane.add(mainButton_menu);
            mainButton_menu.setBounds(50, 60, 95, 35);

            //---- mainButton_order ----
            mainButton_order.setText("\u8ba2\u5355\u7ba1\u7406");
            canteenFormContentPane.add(mainButton_order);
            mainButton_order.setBounds(50, 120, 95, 35);

            //---- mainButton_customer ----
            mainButton_customer.setText("\u987e\u5ba2\u7ba1\u7406");
            canteenFormContentPane.add(mainButton_customer);
            mainButton_customer.setBounds(50, 180, 95, 35);

            //---- mainButton_printer ----
            mainButton_printer.setText("\u6253\u5355\u8bbe\u7f6e");
            canteenFormContentPane.add(mainButton_printer);
            mainButton_printer.setBounds(50, 240, 95, 35);

            //---- mainButton_onekey ----
            mainButton_onekey.setText("\u4e00\u952e\u6253\u5355");
            canteenFormContentPane.add(mainButton_onekey);
            mainButton_onekey.setBounds(50, 300, 95, 35);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < canteenFormContentPane.getComponentCount(); i++) {
                    Rectangle bounds = canteenFormContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = canteenFormContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                canteenFormContentPane.setMinimumSize(preferredSize);
                canteenFormContentPane.setPreferredSize(preferredSize);
            }
            canteenForm.setSize(800, 420);
            canteenForm.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame canteenForm;
    private JScrollPane scrollPane1;
    private JTable mainTable;
    private JLabel mainLable;
    private JButton mainButton_menu;
    private JButton mainButton_order;
    private JButton mainButton_customer;
    private JButton mainButton_printer;
    private JButton mainButton_onekey;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
