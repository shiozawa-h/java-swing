/*
    ウィンドウ内の表示切替のサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutSample extends JFrame implements ActionListener {

    CardLayout layout;
    JPanel panel1, panel2;
    JButton bt;
    JCheckBox cb;

    public CardLayoutSample() {
        this.setTitle("ウィンドウ内の表示切替サンプル");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        layout = new CardLayout();
        this.setLayout(layout);

        // 1つめのパネルを作る
        panel1 = new JPanel();
        bt = new JButton("B1");
        bt.addActionListener(this);
        panel1.add(bt);
        this.add(panel1, "panel1");

        // 2つめのパネルを作っておく
        panel2 = new JPanel();
        cb = new JCheckBox("B2");
        cb.addActionListener(this);
        panel2.add(cb);
        this.add(panel2, "panel2");

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            layout.show(panel1.getParent(), "panel2");
        } else {
            layout.show(panel2.getParent(), "panel1");
        }
    }

    public static void main(String[] args) {
        new CardLayoutSample();
    }
}