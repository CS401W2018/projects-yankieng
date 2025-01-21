import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BeachHut202 extends JPanel {

@Override
public void paintComponent(Graphics g) {
var dy = 50; //VERTICAL OFFSET (MAKE THE HOUSE FLOATING)
var w = getWidth();
var h = getHeight();

//DRAW GRADIENT BACKGROUND/SKY SUNSET
Graphics2D g2d = (Graphics2D) g;
Color color1 = new Color(255, 216, 35);
Color color2 = new Color(191, 104, 11);
GradientPaint gp = new GradientPaint(0, 0, color1, 0, h / 2, color2);
g2d.setPaint(gp);
g2d.fillRect(0, 0, w, h);

//DRAW SAND
g.setColor(new Color(240, 188, 87));
g.fillRect(0, 220, w, h);

//DRAW SEA
g.setColor(new Color(15, 8, 117));
g.fillOval(-250, 300, w + 500, h * 3 / 2);

//DRAW CLOUDS
g.setColor(new Color(177, 204, 224));
g.fillOval(15, 40, 30, 30);
g.fillOval(30, 30, 30, 30);
g.fillOval(50, 40, 35, 30);
g.fillOval(30, 50, 30, 30);

g.fillOval(125, 60, 30, 30);
g.fillOval(140, 50, 30, 30);
g.fillOval(160, 60, 35, 30);
g.fillOval(140, 70, 30, 30);

g.fillOval(225, 30, 30, 30);
g.fillOval(240, 20, 30, 30);
g.fillOval(260, 30, 35, 30);
g.fillOval(240, 40, 30, 30);

g.fillOval(325, 100, 30, 30);
g.fillOval(340, 90, 30, 30);
g.fillOval(360, 100, 35, 30);
g.fillOval(340, 110, 30, 30);

g.fillOval(345, 10, 30, 30);
g.fillOval(360, 0, 30, 30);
g.fillOval(380, 10, 35, 30);
g.fillOval(360, 20, 30, 30);

//DRAW PLANTS BACKGROUND
g.setColor(new Color(18, 69, 6));
g.fillOval(-5, 160, 50, 50);
g.fillOval(35, 140, 60, 60);
g.fillOval(180, 140, 60, 60);
g.fillOval(220, 150, 60, 60);
g.fillOval(260, 160, 50, 50);
g.fillOval(300, 150, 60, 60);
g.fillOval(330, 160, 50, 50);
g.fillOval(360, 140, 70, 70);
g.setColor(new Color(92, 51, 16));
g.fillRect(15, 205, 10, 15);
g.fillRect(55, 195, 10, 25);
g.fillRect(205, 195, 10, 25);
g.fillRect(245, 205, 10, 15);
g.fillRect(280, 205, 10, 15);
g.fillRect(320, 205, 10, 15);
g.fillRect(350, 205, 10, 15);
g.fillRect(380, 205, 10, 15);

//DRAW HOUSE
g.setColor(Color.WHITE);
g.fillRect(70, 220 - dy, 110, 90);

//DRAW ROOF
g.setColor(Color.BLACK);
g.fillRect(65, 210 - dy, 120, 10);
g.fillRect(70, 200 - dy, 110, 10);
g.fillRect(75, 190 - dy, 100, 10);
g.fillRect(80, 180 - dy, 90, 10);
g.fillRect(140, 160 - dy, 20, 20);

//DRAW DOOR AND WINDOW
g.setColor(Color.BLACK);
g.fillRect(95, 265 - dy, 25, 45);
g.fillOval(125, 230 - dy, 30, 30);

//DRAW THE SIGN NAME
g.setColor(Color.WHITE);
g.fillRect(225, 235, 100, 30);
g.fillRect(225, 265, 4, 30);
g.fillRect(321, 265, 4, 30);
g.setColor(Color.BLACK);
g.drawString("Ayu Kartika Sari", 233, 255);

//DRAW AIRPLANE
g.setColor(Color.BLACK);
g.drawLine(270, 43, 285, 43);
g.drawLine(270, 62, 285, 62);
g.fillPolygon(new int[]{285, 295, 285, 320}, new int[]{43, 51, 62, 51}, 4);
g.drawLine(155, 43, 165, 43);
g.drawLine(154, 51, 165, 51);
g.drawLine(156, 62, 165, 62);

//DRAW BANNER
g.setColor(Color.RED);
g.fillRect(170, 43, 100, 19);
g.setColor(Color.WHITE);
g.drawString("GO SEASIDERS!", 175, 57);

}

public static void main(String[] args) {
JFrame window = new JFrame();
window.setSize(400, 400);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
window.setContentPane(new BeachHut202());
window.setVisible(true);