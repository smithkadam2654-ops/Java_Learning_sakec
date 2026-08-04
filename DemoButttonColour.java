import java.awt.*;

class DemoButtonColour {
    public static void main(String args[]) {

        Frame f = new Frame("Example");

        Button b = new Button("Click");

        b.setBackground(Color.BLUE);
        b.setForeground(Color.WHITE);

        f.add(b);

        f.setSize(700, 300);
        f.setVisible(true);
    }
}