Aim: To create a GUI using GridLayout.

Algorithm:
1. Import awt package.
2. Create a Frame.
3. Set GridLayout.
4. Add buttons.
5. Display the frame.
Program:
import java.awt.*;

class Grid {
    public static void main(String[] args) {
        Frame f = new Frame("Grid Layout");
        f.setLayout(new GridLayout(2, 2));

        f.add(new Button("One"));
        f.add(new Button("Two"));
        f.add(new Button("Three"));
        f.add(new Button("Four"));

        f.setSize(300, 300);
        f.setVisible(true);
    }
}
