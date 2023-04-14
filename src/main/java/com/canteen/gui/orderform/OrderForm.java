/*
 * Created by JFormDesigner on Thu Apr 13 21:31:31 CST 2023
 */

package com.canteen.gui.orderform;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

/**
 * @author 10047
 */
public class OrderForm {
    public OrderForm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        orderForm = new JFrame();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        spinner1 = new JSpinner();
        label5 = new JLabel();
        label6 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        label7 = new JLabel();
        label8 = new JLabel();
        button4 = new JButton();
        button5 = new JButton();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        textField5 = new JTextField();
        textField6 = new JTextField();

        //======== orderForm ========
        {
            orderForm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            orderForm.setTitle("\u8ba2\u5355\u5f55\u5165");
            var orderFormContentPane = orderForm.getContentPane();
            orderFormContentPane.setLayout(null);

            //---- label1 ----
            label1.setText("\u987e\u5ba2\u540d\u79f0\uff1a");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 5f));
            orderFormContentPane.add(label1);
            label1.setBounds(0, 5, 85, 35);

            //---- label2 ----
            label2.setText("\u624b\u673a\u53f7\uff1a");
            label2.setFont(label2.getFont().deriveFont(label2.getFont().getSize() + 5f));
            orderFormContentPane.add(label2);
            label2.setBounds(200, 5, 80, 35);

            //---- label3 ----
            label3.setText("\u8ba2\u5355\u53f7\uff1a");
            label3.setFont(label3.getFont().deriveFont(label3.getFont().getSize() + 5f));
            orderFormContentPane.add(label3);
            label3.setBounds(420, 5, 80, 35);

            //---- label4 ----
            label4.setText("\u65e5\u671f\u65f6\u95f4\uff1a");
            label4.setFont(label4.getFont().deriveFont(label4.getFont().getSize() + 5f));
            orderFormContentPane.add(label4);
            label4.setBounds(635, 5, 90, 35);

            //---- spinner1 ----
            spinner1.setModel(new SpinnerDateModel(new java.util.Date(1713056160000L), null, null, java.util.Calendar.DAY_OF_MONTH));
            spinner1.setForeground(Color.white);
            orderFormContentPane.add(spinner1);
            spinner1.setBounds(new Rectangle(new Point(710, 10), spinner1.getPreferredSize()));

            //---- label5 ----
            label5.setText("\u5730\u5740\u8be6\u60c5\uff1a");
            label5.setFont(label5.getFont().deriveFont(label5.getFont().getSize() + 5f));
            orderFormContentPane.add(label5);
            label5.setBounds(0, 45, 85, 35);

            //---- label6 ----
            label6.setText("\u8ba2\u5355\u8be6\u60c5\uff1a");
            label6.setFont(label6.getFont().deriveFont(label6.getFont().getSize() + 5f));
            orderFormContentPane.add(label6);
            label6.setBounds(0, 85, 85, 35);

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, null, null, null, null, null},
                        {null, null, "", "", null, null, null},
                    },
                    new String[] {
                        "\u4e3b\u83dc", "\u914d\u83dc1", "\u914d\u83dc2", "\u914d\u83dc3", "\u5355\u4ef7", "\u4efd\u6570", "\u5907\u6ce8"
                    }
                ));
                table1.setPreferredScrollableViewportSize(new Dimension(449, 400));
                scrollPane1.setViewportView(table1);
            }
            orderFormContentPane.add(scrollPane1);
            scrollPane1.setBounds(0, 120, 870, 165);

            //---- button1 ----
            button1.setText("\u589e\u52a0");
            orderFormContentPane.add(button1);
            button1.setBounds(new Rectangle(new Point(595, 295), button1.getPreferredSize()));

            //---- button2 ----
            button2.setText("\u4fee\u6539");
            orderFormContentPane.add(button2);
            button2.setBounds(690, 295, 78, 30);

            //---- button3 ----
            button3.setText("\u5220\u9664");
            orderFormContentPane.add(button3);
            button3.setBounds(790, 295, 78, 30);

            //---- label7 ----
            label7.setText("\u8ba2\u5355\u603b\u4ef7\uff1a");
            label7.setFont(label7.getFont().deriveFont(label7.getFont().getSize() + 5f));
            orderFormContentPane.add(label7);
            label7.setBounds(0, 330, 85, 35);

            //---- label8 ----
            label8.setText("\u5957\u9910\u603b\u8ba1(\u4efd\uff09:");
            label8.setFont(label8.getFont().deriveFont(label8.getFont().getSize() + 5f));
            orderFormContentPane.add(label8);
            label8.setBounds(420, 330, 125, 35);

            //---- button4 ----
            button4.setText("\u63d0\u4ea4");
            orderFormContentPane.add(button4);
            button4.setBounds(525, 380, 90, 30);

            //---- button5 ----
            button5.setText("\u53d6\u6d88");
            orderFormContentPane.add(button5);
            button5.setBounds(700, 380, 90, 30);

            //---- textField1 ----
            textField1.setForeground(Color.white);
            orderFormContentPane.add(textField1);
            textField1.setBounds(80, 10, 115, textField1.getPreferredSize().height);

            //---- textField2 ----
            textField2.setForeground(Color.white);
            orderFormContentPane.add(textField2);
            textField2.setBounds(265, 10, 115, 30);

            //---- textField3 ----
            textField3.setForeground(Color.white);
            orderFormContentPane.add(textField3);
            textField3.setBounds(485, 10, 115, 30);

            //---- textField4 ----
            textField4.setForeground(Color.white);
            orderFormContentPane.add(textField4);
            textField4.setBounds(85, 50, 560, 30);

            //---- textField5 ----
            textField5.setForeground(Color.white);
            orderFormContentPane.add(textField5);
            textField5.setBounds(85, 335, 160, 30);

            //---- textField6 ----
            textField6.setForeground(Color.white);
            orderFormContentPane.add(textField6);
            textField6.setBounds(535, 335, 220, 30);

            {
                // compute preferred size
                Dimension preferredSize = new Dimension();
                for(int i = 0; i < orderFormContentPane.getComponentCount(); i++) {
                    Rectangle bounds = orderFormContentPane.getComponent(i).getBounds();
                    preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                    preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
                }
                Insets insets = orderFormContentPane.getInsets();
                preferredSize.width += insets.right;
                preferredSize.height += insets.bottom;
                orderFormContentPane.setMinimumSize(preferredSize);
                orderFormContentPane.setPreferredSize(preferredSize);
            }
            orderForm.setSize(880, 450);
            orderForm.setLocationRelativeTo(orderForm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame orderForm;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JSpinner spinner1;
    private JLabel label5;
    private JLabel label6;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel label7;
    private JLabel label8;
    private JButton button4;
    private JButton button5;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
