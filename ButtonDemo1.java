import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends JFrame implements ActionListener {

    JButton b;

    ButtonDemo() {
        b = new JButton("Click");
        b.setBounds(100,100,100,40);
        b.addActionListener(this);

        add(b);
        setLayout(null);
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new ButtonDemo();
    }
}