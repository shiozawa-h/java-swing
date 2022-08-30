/*
    ボーダーレイアウト（部品を辺に合わせるレイアウト）のサンプル
    余白の量なども調整できる
 */

import java.awt.*;
import javax.swing.*;

public class BorderLayoutSample extends JFrame {

    public BorderLayoutSample() {
        this.setTitle("BorderLayoutのサンプル");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new BorderLayout());

        JButton b1 = new JButton("CENTER");
        JButton b2 = new JButton("NORTH");
        JButton b3 = new JButton("SOUTH");
        JButton b4 = new JButton("EAST");
        JButton b5 = new JButton("WEST");

        this.add(b1, BorderLayout.CENTER);
        this.add(b2, BorderLayout.NORTH);
        this.add(b3, BorderLayout.SOUTH);
        this.add(b4, BorderLayout.EAST);
        this.add(b5, BorderLayout.WEST);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutSample();
    }
}