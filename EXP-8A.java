Aim: To create and run a simple Java applet.

Algorithm:
1. Import applet and awt packages.
2. Create a class extending Applet.
3. Override paint() method.
4. Display a message.
5. Compile and run using an applet viewer.
Program:
import java.applet.*;
import java.awt.*;

public class MyApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello Java", 50, 50);
    }
}
//result:the program is successfully executed
