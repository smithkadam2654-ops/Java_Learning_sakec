import java.awt.*;
import java.awt.event.*;

class FontDemo extends Frame implements ActionListener
{
    Label l1, l2, l3, l4;
    TextField t1, t2, t3, t4;
    Button b;

    FontDemo()
    {
        setTitle("AWT Font Demo");

        l1 = new Label("First Name:");
        l2 = new Label("Last Name:");
        l3 = new Label("City:");
        l4 = new Label("State:");

        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        t4 = new TextField(20);

        b = new Button("Change Font");

        setLayout(new GridLayout(5, 2, 10, 10));

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(l4);
        add(t4);

        add(new Label(""));
        add(b);

        b.addActionListener(this);

        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                dispose();
            }
        });

        setSize(400, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        Font f = new Font("Arial", Font.BOLD + Font.ITALIC, 20);

        t1.setFont(f);
        t2.setFont(f);
        t3.setFont(f);
        t4.setFont(f);
    }

    public static void main(String args[])
    {
        new FontDemo();
    }
}
