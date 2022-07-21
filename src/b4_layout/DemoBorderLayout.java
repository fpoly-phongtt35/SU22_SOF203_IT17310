/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_layout;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author phongtt
 */
public class DemoBorderLayout {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo BorderLayout");
        frame.setVisible(true);
        
        BorderLayout layout = new BorderLayout();
        
        JLabel lbTop = new JLabel("Top");
        JLabel lbBottom = new JLabel("Bottom");
        JLabel lbLeft = new JLabel("Left");
        JLabel lbRight = new JLabel("Right");
        JLabel lbCenter = new JLabel("Center");
        
        layout.addLayoutComponent(lbTop, BorderLayout.NORTH);
        layout.addLayoutComponent(lbBottom, BorderLayout.SOUTH);
        layout.addLayoutComponent(lbLeft, BorderLayout.WEST);
        layout.addLayoutComponent(lbRight, BorderLayout.EAST);
        layout.addLayoutComponent(lbCenter, BorderLayout.CENTER);
        
        frame.add(lbTop);
        frame.add(lbBottom);
        frame.add(lbLeft);
        frame.add(lbRight);
        frame.add(lbCenter);
        
        frame.setLayout(layout);
        
        frame.pack();
    }
}
