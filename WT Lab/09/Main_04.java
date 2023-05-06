import java.applet.Applet;
import java.awt.*;

public class Main_04 extends Applet {
    private String rollNumber = "2129011";
    private String name = "Aditya Choudhury";
    private String branch = "Computer Science";
    private String section = "CSCE-02";

    public void paint(Graphics g) {
        g.drawString("Roll Number: " + rollNumber, 20, 20);
        g.drawString("Name: " + name, 20, 40);
        g.drawString("Branch: " + branch, 20, 60);
        g.drawString("Section: " + section, 20, 80);
    }
}
