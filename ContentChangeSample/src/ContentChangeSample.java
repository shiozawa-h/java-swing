/*
    ウィンドウ内の表示切替のサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ContentChangeSample extends JFrame implements ActionListener {

    JPanel panel1, panel2;
    JButton b1, b2, b3, b4;

    public ContentChangeSample() {
        this.setTitle("ウィンドウ内の表示切替サンプル");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 1つめのパネルを作る
        panel1 = new JPanel();
        b1 = new JButton("B1");
        b1.addActionListener(this);
        panel1.add(b1);

        // パネルをタブに追加する
        this.add(panel1);

        // 2つめのパネルを作っておく
        panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());
        b2 = new JButton("B2");
        b3 = new JButton("B3");
        b4 = new JButton("B4");
        panel2.add(b2, BorderLayout.NORTH);
        panel2.add(b3, BorderLayout.CENTER);
        panel2.add(b4, BorderLayout.SOUTH);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if ((JButton) e.getSource() == b1) {
            // パネル1を削除する
            panel1.setVisible(false);
            this.remove(panel1);

            // パネル2を追加して表示する
            this.add(panel2);
            panel2.setVisible(true);

            // ウィンドウの再描画
            this.repaint();

        } else {
            // パネル2を削除する
            panel2.setVisible(false);
            this.remove(panel2);

            // パネル1を追加して表示する
            this.add(panel1);
            panel1.setVisible(true);

            // ウィンドウの再描画
            this.repaint();
        }
    }

    public static void main(String[] args) {
        new ContentChangeSample();
    }
}