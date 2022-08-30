/*
    ウィンドウに背景画像を描画する（簡単な方法の）サンプル
    配置したJPanelに同じことをすれば、一部領域だけ画像にすることも可能
 */

import java.awt.*;
import javax.swing.*;

public class BackgroundSample extends JFrame {

    public BackgroundSample() {
        // 画像を読み込む
        // 画像はプロジェクトフォルダの直下（srcの上）に入れておく
        ImageIcon bgimg = new ImageIcon("monalisa.jpg");

        // JFrameのコンテントペインを画像のJLabelに差し替える
        // とりあえずこれで背景に画像が表示されるようになる
        JLabel contentPane = new JLabel(bgimg);
        this.setContentPane(contentPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("背景画像のサンプル");
        this.setLayout(new FlowLayout());
        this.setSize(bgimg.getIconWidth(), bgimg.getIconHeight());

        JButton bt = new JButton("こんにちは");
        this.add(bt);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new BackgroundSample();
    }
}