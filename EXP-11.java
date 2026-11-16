Aim: To create a GUI using BorderLayout.

Algorithm:
1. Import awt package.
2. Create a Frame.
3. Set BorderLayout.
4. Add buttons in five regions.
5. Display the frame.
Program:
import java.awt.*;

class Border {
    public static void main(String[] args) {
        Frame f = new Frame("Border Layout");
        f.setLayout(new BorderLayout());

        f.add(new Button("North"), BorderLayout.NORTH);
        f.add(new Button("South"), BorderLayout.SOUTH);
        f.add(new Button("East"), BorderLayout.EAST);
        f.add(new Button("West"), BorderLayout.WEST);
        f.add(new Button("Center"), BorderLayout.CENTER);

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
