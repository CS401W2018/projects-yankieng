import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LittlePrince extends JPanel {

public LittlePrince() {

}

    @Override
    public void paintComponent(Graphics g) {
    var w = getWidth();
    var h = getHeight();
    var dy = 30;

    //SET THE BACKGROUND COLOR
    g.setColor(Color.BLACK);
    g.fillRect(0, 0, w, h);

    //DRAW THE GROUND
    g.setColor(Color.DARK_GRAY);
    g.fillOval(dy + -50, 300, 500, 100);

    //DRAW THE LITTLE PRINCE
    g.setColor(Color.WHITE);
    g.fillRect(dy + 160, 185, 50, 90); //THE BODY OF THE PRINCE
    g.fillRect(dy + 160, 270, 15, 40); // THE LEGS
    g.fillRect(dy + 195, 270, 15, 40);
    g.fillOval(dy + 160, 125, 50, 60); //THE HEAD'S PRINCE

    }

    public static void main(String[] args) {
    JFrame window = new JFrame();
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(400, 400);
    window.setContentPane(new LittlePrince());
    window.setVisible(true);
    }
}