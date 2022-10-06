import javax.swing.*;

public class main {
    public static void main(String[] args){
        Fram fram = new Fram();
        fram.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBorder(fram.getLayeredPane().getBorder());
    }
}
