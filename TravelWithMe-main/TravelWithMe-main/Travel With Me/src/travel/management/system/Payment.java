
package travel.management.system;


import java.awt.Color;
import java.awt.Image;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener {
    

    JButton b1, b2, b3, b4, b5;

    Payment() {

        setTitle("Payment");
        setBounds(500, 200, 800, 500);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 800, 500);
        add(l1);

        

        b1 = new JButton("Paytm");
        b1.setForeground(Color.black);
        b1.setBackground(Color.white);
        b1.setBounds(100, 100, 100, 40);
        b1.addActionListener(this);
        l1.add(b1);
        
        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setForeground(Color.WHITE);
        b2.setBackground(Color.BLACK);
        b2.setBounds(185, 300, 80, 40);
        l1.add(b2);

      

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new Paytm().setVisible(true);

        } else if (ae.getSource() == b2) {
            this.setVisible(false);

        }
    }



}

