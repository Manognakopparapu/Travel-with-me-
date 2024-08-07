
package travel.management.system;


import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Feedback extends JFrame implements ChangeListener, ActionListener {

    
    JPanel panel;
    JLabel label;
    JLabel tag;
    JSlider slider;
    JButton button;
    String username;

    Feedback(String user) {

        username=user;

        setLayout(null);

        
        tag = new JLabel("Travel With Me ");
        tag.setBounds(75, 30, 440, 40);
        tag.setForeground(Color.BLACK);
        tag.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 25));
        add(tag);

        label = new JLabel();
        slider = new JSlider(0, 5, 3);
        slider.setBounds(50, 90, 500, 50);

        slider.setPreferredSize(new Dimension(250, 250));

        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(1);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(5);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));

        slider.setOrientation(SwingConstants.HORIZONTAL);
        

        label.setText("Rating " + slider.getValue());
        label.setBounds(260, 150, 150, 40);

        slider.addChangeListener(this);

        button = new JButton("Submit");
        button.setLocation(260, 200);
        button.setSize(80, 40);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.white);
        button.addActionListener(this);
        add(button);

        add(label);
        add(slider);

        

        setBounds(500, 200, 600, 300);
        setVisible(true);
        setTitle("Ratings");
        

    }

    @Override
    public void stateChanged(ChangeEvent e) {

        label.setText("Rating = " + slider.getValue());

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {

        int rating = slider.getValue();

        String q = "insert into feedback values ('" + username + "','" + rating + "')";
        try {
            Conns c = new Conns();
            c.stmt.executeUpdate(q);
            JOptionPane.showMessageDialog(null, "Thank you for your response!");
            this.setVisible(false);
            System.exit(0);
        }catch(Exception ae){
            ae.printStackTrace();

        }
        

    }


}

