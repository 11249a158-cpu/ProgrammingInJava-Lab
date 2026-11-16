Aim: To draw a line and rectangle using Java applet.

Algorithm:
1. Import applet and awt packages.
2. Extend the Applet class.
3. Override paint() method.
4. Draw a line and rectangle.
5. Display the output.
Program:
import java.applet.*;
import java.awt.*;

public class Draw extends Applet {
    public void paint(Graphics g) {
        g.drawLine(20, 30, 150, 30);
        g.drawRect(20, 50, 100, 60);
    }
}
//result:the program is successfully executed
