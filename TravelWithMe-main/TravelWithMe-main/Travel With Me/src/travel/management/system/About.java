
package travel.management.system;

// package travel.Management.System;

import java.awt.Color;
import java.awt.Font;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.*;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    // public static void main(String[] args) {
    //     new About().setVisible(true);
    // }

    About() {
        setTitle("About_Project");
        setBounds(540, 200, 600, 550);
        setLayout(null);
        getContentPane().setBackground(Color.white);

        JLabel l1 = new JLabel("Toursim Management system - `TWS` ");
        l1.setBounds(60, 10, 400, 60);
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Tahoma", Font.PLAIN, 20));

        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Logo.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l10 = new JLabel(i3);
        l10.setBounds(470, 20, 100, 50);
        add(l10);

        add(l1);
        s = "                                                        -About Projects-          \n  "
        + "\n Welcome to Travel with Me – Your Ultimate Travel Companion!"

+ "\n Our Travel and Tourism Management System has been crafted with the goal of"
                + " automating and streamlining all travel-related processes and "
                + "activities. The primary objective is to offer a platform that"
                + " facilitates every aspect of travel, enabling seamless "
                + "operations and comprehensive travel management."

+ "\n Our application is designed to empower users with easy access to vital "
                + "information concerning their travel destinations. "
                + "From tracking tour details to obtaining crucial information "
                + "about travel agencies, our system ensures convenience and efficiency."

+ "\n Advantages of Our Project:"

+ "\n - Accuracy: Delivering precise and reliable information."
+ "\n - Streamlined Processes: Simplifying manual tasks and operations."
+ "\n - Reduced Documentation: Minimizing the burden of extensive paperwork."
+ "\n - Real-time Updates: Providing the latest and most up-to-date information."
+ "\n - User-Friendly Interface: Creating a friendly environment with warning messages for smooth navigation."
+ "\n - Comprehensive Traveler Details: Efficiently managing traveler information."
+ "\n - Booking Confirmation Notifications: Ensuring travelers receive prompt and confirmed booking notifications."

+ "\n Embark on your journey hassle-free with Travel with Me! Discover convenience, accuracy, and efficiency in travel management like never before."
        ;


        TextArea t1 = new TextArea(s, 10,40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20,100,550,300);
        add(t1);

        b1 = new JButton ("Back");
        b1.setBounds(245,420,100,25);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
    }

    
}

