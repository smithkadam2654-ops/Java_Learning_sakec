import java.awt.*;

class Demo1{
    public static void main(String args []){
        Frame f=new Frame("Example");

        Button b= new Button("Click");

        f.add(b);
        f.setSize(300,300);
        f.setVisible(true);
        f.setBackground(Color.BLUE);
    }
}