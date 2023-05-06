import java.applet.Applet;
import java.awt.*;

public class Main_05 extends Applet {
    public void paint(Graphics g) {
        // Draw face
        g.setColor(new Color(128, 0, 128));
        g.fillOval(50, 50, 100, 100);

        // Draw eyes
        g.setColor(Color.WHITE);
        g.fillOval(70, 70, 20, 20);
        g.fillOval(110, 70, 20, 20);

        // Draw pupils
        g.setColor(Color.BLACK);
        g.fillOval(77, 77, 6, 6);
        g.fillOval(117, 77, 6, 6);

        // Draw mouth
        g.setColor(Color.BLACK);
        g.drawArc(70, 90, 60, 40, 180, 180);
    }
}
    