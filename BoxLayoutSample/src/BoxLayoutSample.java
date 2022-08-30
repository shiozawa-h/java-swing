import javax.swing.*;
import java.awt.*;

public class BoxLayoutSample extends JFrame {
    BoxLayoutSample() {
        this.setTitle("BoxLayoutのサンプル");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        JButton b1 = new JButton("Cat");
        b1.setAlignmentX(0.5f);
        this.add(b1);
        JButton b2 = new JButton("Giraffe");
        b2.setAlignmentX(1.0f);
        this.add(b2);
        JButton b3 = new JButton("Lion");
        b3.setAlignmentX(0.0f);
        this.add(b3);
        JButton b4 = new JButton("Hippopotamus");
        b4.setAlignmentX(0.5f);
        this.add(b4);

        this.setVisible(true);

    }
    public static void main(String[] args) {
        new BoxLayoutSample();
    }
}