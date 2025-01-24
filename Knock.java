import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Knock extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        //The word shows in the window
        g.drawString("A: Knock, knock!",10,10);
        g.drawString("B: Who's there?",10,25);
        g.drawString("A: Lettuce",10,40);
        g.drawString("B: Lettuce who?",10,55);
        g.drawString("A: Lettuce in, it's cold out here!",10,70);
    }
    
    public static void main(String[] args) {
        var window = new JFrame();
        //Set the size of the window
        window.setSize(200,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Knock());
        window.setVisible(true);
    }
}