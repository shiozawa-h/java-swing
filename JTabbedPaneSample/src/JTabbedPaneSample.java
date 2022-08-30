/*
    タブ（JTabbedPane）による表示切替のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class JTabbedPaneSample extends JFrame {

    JTabbedPane tabbedPane;
    JPanel panel1, panel2;

    public JTabbedPaneSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTabbedPaneのサンプル");
        this.setSize(400, 400);

        tabbedPane = new JTabbedPane();
        this.add(tabbedPane);

        // 1つめのパネルを作る
        panel1 = new JPanel();
        JButton b1 = new JButton("B1");
        panel1.add(b1);

        // 1つめのパネルをタブに追加する
        tabbedPane.addTab("タブ1", panel1);

        // 2つめのパネルを作る
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");
        panel2.add(b2, BorderLayout.NORTH);
        panel2.add(b3, BorderLayout.CENTER);
        panel2.add(b4, BorderLayout.SOUTH);

        // 2つめのパネルをタブに追加する
        tabbedPane.addTab("タブ2", panel2);

        // タブ2の方を選択状態にする
        tabbedPane.setSelectedComponent(panel2);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneSample();
    }
}