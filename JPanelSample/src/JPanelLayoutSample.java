/*
    パネルを使った複雑なレイアウトのサンプル
    パネルは「何もしない土台」なので、
    入れ子にして複雑なレイアウトの実現に使える
 */

import java.awt.*;
import javax.swing.*;

public class JPanelLayoutSample extends JFrame {

    public JPanelLayoutSample() {
        // 全体は1行2列のグリッドレイアウト（縦→横なのに注意）
        this.setLayout(new GridLayout(1, 2));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JPanelを使った複雑なレイアウトのサンプル");
        this.setSize(200, 200);

        // ボーダーレイアウトのパネルを載せる
        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());

        JButton b1 = new JButton("B1");
        p1.add(b1, BorderLayout.CENTER);

        // もう1つボーダーレイアウトのパネルを載せる
        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());

        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");

        p2.add(b2, BorderLayout.NORTH);
        p2.add(b3, BorderLayout.CENTER);
        p2.add(b4, BorderLayout.SOUTH);

        this.add(p1);
        this.add(p2);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelLayoutSample();
    }
}