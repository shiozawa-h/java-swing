/*
    色付きのボタンのサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JButtonTransparentSample extends JFrame implements ActionListener {

    public JButtonTransparentSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("色付きのJButtonのサンプル");
        this.setSize(200, 100);
        this.setLayout(new FlowLayout());

        JButton bt = new JButton("色付きのボタン");

        // 字のフォント
        Font font = new Font("メイリオ", Font.PLAIN, 20);
        bt.setFont(font);

        // 字の色
        bt.setForeground(new Color(255, 0, 0));

        // ボタンの枠の形と側面の色
        // （これをやると押している最中の色の変化が無効化されてしまう）
        //bt.setBorder(new SoftBevelBorder(BevelBorder.RAISED,
        //        new Color(255, 255, 100), new Color(200, 200, 100)));

        // 背景の色
        bt.setBackground(new Color(255, 255, 0));
        // うまくいかない場合は以下を加えてみる
        bt.setOpaque(true);
        //bt.setBorderPainted(false);

        bt.addActionListener(this);
        this.add(bt);
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
