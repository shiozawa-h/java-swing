/*
    文字表示（JLabel）のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class JLabelSample extends JFrame {

    public JLabelSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JLabelのサンプル");
        this.setSize(200, 100);

        JLabel label = new JLabel("こんにちは");
        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelSample();
    }
}
