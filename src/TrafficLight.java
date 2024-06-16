import javax.swing.*;
import java.awt.*;

class TrafficLight extends Canvas {

    @Override
    public void paint(Graphics g) {
        setBackground(Color.LIGHT_GRAY);
        // главный экран
        drawTopPanel(g);

        // главный прямоугольник
        g.setColor(Color.BLACK);
        g.fillRoundRect(250, 180, 100, 292, 15, 15);

        // цвета светофора
        drawLight(g, 265, 204, Color.RED);
        drawLight(g, 265, 286, Color.YELLOW);
        drawLight(g, 265, 379, Color.GREEN);

        // нижний прямоугольник
        g.setColor(Color.BLACK);
        g.fillRoundRect(280, 480, 40, 50, 10, 10);

        // левые треугольники
        drawLeftTriangles(g, 196, 204);
        drawLeftTriangles(g, 196, 297);
        drawLeftTriangles(g, 196, 390);

        // правые треугольники
        drawRightTriangles(g, 354, 204);
        drawRightTriangles(g, 354, 297);
        drawRightTriangles(g, 354, 390);
    }

    private void drawTopPanel(Graphics g) {
        // раскрашивание
        g.setColor(Color.BLACK);
        g.fillArc(270, 158, 60, 40, 0, 180);
        g.setColor(Color.WHITE);
        int[] xp1 = {270, 270, 278};
        int[] yp1 = {178, 170, 186};
        g.fillPolygon(xp1, yp1, 3);
        int[] xp2 = {332, 324, 332};
        int[] yp2 = {178, 178, 170};
        g.fillPolygon(xp2, yp2, 3);
    }

    private void drawLight(Graphics g, int x, int y, Color color) {
        g.setColor(Color.WHITE);
        g.fillOval(x - 5, y - 5, 80, 80);
        g.setColor(Color.BLACK);
        g.fillOval(x - 9, y + 3, 88, 88);
        g.setColor(color);
        g.fillOval(x, y, 70, 70);
    }

    private void drawLeftTriangles(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x + 40, y, 10, 50, 10, 10);
        int[] xp = {x, x + 44, x + 43};
        int[] yp = {y + 7, y + 3, y + 50};
        g.fillPolygon(xp, yp, 3);
    }

    private void drawRightTriangles(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRoundRect(x, y, 50, 10, 10, 10);
        g.fillRoundRect(x, y, 10, 50, 10, 10);
        int[] xp = {x + 50, x + 4, x + 7};
        int[] yp = {y + 7, y + 3, y + 50};
        g.fillPolygon(xp, yp, 3);
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Traffic Light");
        TrafficLight trafficLight = new TrafficLight();
        jFrame.add(trafficLight);

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        jFrame.setLocationRelativeTo(null);
    }
}