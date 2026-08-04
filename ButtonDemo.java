import java.awt.*;
import java.awt.event.*;

class ButtonDemo extends Frame implements ActionListener {

    Button b;

    ButtonDemo() {

        b = new Button("Click");

        b.setBounds(100, 100, 80, 30);

        add(b);

        b.addActionListener(this);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String args[]) {
        new ButtonDemo();
    }
}