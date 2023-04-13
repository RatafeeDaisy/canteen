/*
 * Created by JFormDesigner on Thu Apr 13 21:12:08 CST 2023
 */

package com.canteen.gui.mainform;

import java.awt.*;
import javax.swing.*;

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

        //======== canteenForm ========
        {
            canteenForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            canteenForm.setTitle("\u98df\u5802\u8ba2\u5355\u7ba1\u7406\u7cfb\u7edf");
            var canteenFormContentPane = canteenForm.getContentPane();
            canteenFormContentPane.setLayout(null);
            canteenFormContentPane.add(scrollPane1);
            scrollPane1.setBounds(180, 45, 575, 265);

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
            canteenForm.setSize(790, 410);
            canteenForm.setLocationRelativeTo(canteenForm.getOwner());
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JFrame canteenForm;
    private JScrollPane scrollPane1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
