import java.awt.*;

class DemoButtonColour {
    public static void main(String args[]) {

        Frame f = new Frame("Example");

        Button b = new Button("Click");

        b.setBackground(Color.BLUE);   // Button background
        b.setForeground(Color.WHITE);  // Button text color (optional)

        f.add(b);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}