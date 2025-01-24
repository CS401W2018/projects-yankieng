import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class first202 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        g.drawString("A: Kncok, knock!",10,10);
    }
    
    public static void main(String[] args) {
        var window = new JFrame();
        window.setSize(200,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new first202());
        window.setVisible(true);
    }
}