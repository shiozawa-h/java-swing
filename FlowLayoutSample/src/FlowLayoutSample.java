import javax.swing.*;
import java.awt.*;

public class FlowLayoutSample extends JFrame {
    FlowLayoutSample() {
        this.setTitle("FlowLayoutのサンプル");
        this.setSize(300, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 2));

        this.add(new JButton("Cat"));
        this.add(new JButton("Giraffe"));
        this.add(new JButton("Lion"));
        this.add(new JButton("Hippopotamus"));

        this.setVisible(true);

    }
    public static void main(String[] args) {
        new FlowLayoutSample();
    }
}