/*
 * Created by JFormDesigner on Thu Apr 13 21:31:31 CST 2023
 */

package com.canteen.gui.orderform;

import java.awt.*;
import javax.swing.*;

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
        table1 = new JTable();

        //======== orderForm ========
        {
            orderForm.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            orderForm.setTitle("\u8ba2\u5355\u7ba1\u7406");
            var orderFormContentPane = orderForm.getContentPane();
            orderFormContentPane.setLayout(null);
            orderFormContentPane.add(table1);
            table1.setBounds(60, 30, 280, 180);

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
            orderForm.setSize(400, 300);
            orderForm.setLocationRelativeTo(orderForm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame orderForm;
    private JTable table1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
