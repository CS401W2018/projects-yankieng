import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class BeachHut extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        var dy =-40;
        g.drawString("A: Kncok, knock!",10,10);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,400,400);

        g.setColor(Color.GRAY);
        g.fillOval(-300, 300, 1000, 1000);

        //The body of the prince
        g.setColor(Color.GREEN);
        g.fillRect(175,150+dy,50,100);
        g.fillRect(175,250+dy,20,70);
        g.fillRect(205,250+dy,20,70);

        //Draw the little prince's head
        g.setColor(new Color(189,127,93));
        g.fillOval(175, 90+dy, 50, 60);

        //draw a bow tie
        g.setColor(Color.RED);
        g.fillOval(191,140+dy,10,15); 
        g.fillOval(200, 140+dy, 10, 15);
    }
    public static void main(String[] args) {
        var window = new JFrame();
        window.setSize(400,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new BeachHut());
        window.setVisible(true);
    }
}