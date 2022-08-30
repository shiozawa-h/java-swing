/*
    画像の上に透明なボタンを置くサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JButtonTransparentSample extends JFrame implements ActionListener {

    public JButtonTransparentSample() {
        // 画像を読み込む
        ImageIcon img = new ImageIcon("worldmap2003.jpg");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("背景が透明なJButtonのサンプル");
        this.setSize(new Dimension(img.getIconWidth() + 50, img.getIconHeight() + 50));
        this.setLayout(new BorderLayout());

        // 画像表示のためのラベルを作る
        JLabel imglabel = new JLabel(img);
        this.add(imglabel);

        JButton bt = new JButton("背景が透明なボタン");
        bt.setFont(new Font("メイリオ", Font.PLAIN, 32));
        bt.setForeground(new Color(0, 100, 0));
        bt.addActionListener(this);

        // 背景と境界線を描画しない
        bt.setContentAreaFilled(false);
        //bt.setBorderPainted(false);

        // 画像表示ラベルの中に、座標を指定してボタンを組み込む
        bt.setBounds(400, 400, 300, 50);
        imglabel.add(bt);

        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton bt = (JButton) e.getSource();
        System.out.println(bt.getText());
    }

    public static void main(String[] args) {
        new JButtonTransparentSample();
    }
}
