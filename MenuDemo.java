import java.awt.*;

class MenuDemo{
    public static void main(String args[]){
        Frame f=new Frame("Menu Example");

        MenuBar mb=new MenuBar();

        Menu m=new Menu("File");
        Menu n=new Menu("Edit");

        MenuItem mi=new MenuItem("Open");

        m.add(mi);
        mb.add(m);
        mb.add(n);
        f.setMenuBar(mb);
        f.setSize(400,300);
        f.setVisible(true);
    }
}