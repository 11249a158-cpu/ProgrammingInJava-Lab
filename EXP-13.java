Aim: To create a GUI using CardLayout.

Algorithm:
1. Import awt package.
2. Create a Frame.
3. Set CardLayout.
4. Add two buttons as cards.
5. Display the frame.
Program:
import java.awt.*;

class Card {
    public static void main(String[] args) {
        Frame f = new Frame("Card Layout");
        CardLayout c = new CardLayout();
        f.setLayout(c);

        f.add(new Button("First"), "1");
        f.add(new Button("Second"), "2");

        c.show(f, "2");
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
