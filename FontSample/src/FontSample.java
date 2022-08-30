/*
    フォント（Font）のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class FontSample extends JFrame {

    public FontSample() {
        this.setTitle("フォント設定のサンプル");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 150);
        this.setLayout(new FlowLayout());

        Font font1 = new Font("メイリオ", Font.PLAIN, 48);
        JLabel label1 = new JLabel("こんにちは");
        label1.setFont(font1);
        this.add(label1);

        Font font2 = new Font("Times New Roman", Font.BOLD, 24);
        JLabel label2 = new JLabel("Good morning!");
        label2.setFont(font2);
        this.add(label2);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new FontSample();
    }
}
