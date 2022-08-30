/*
    グリッドレイアウト（マス目配置）のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class GridLayoutSample extends JFrame {

    public GridLayoutSample() {
        this.setTitle("BorderLayoutのサンプル");
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 3行2列のマス目に配置する（縦→横なのに注意）
        this.setLayout(new GridLayout(3, 2));

        this.add(new JButton("(1,1)"));
        this.add(new JButton("(1,2)"));
        this.add(new JButton("(2,1)"));
        this.add(new JButton("(2,2)"));
        this.add(new JButton("(3,1)"));

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridLayoutSample();
    }
}