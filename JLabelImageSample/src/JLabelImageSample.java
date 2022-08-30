/*
    画像表示（JLabel）のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class JLabelImageSample extends JFrame {

    public JLabelImageSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("画像表示（JLabel）のサンプル");
        this.setSize(400, 300);

        // 画像はプロジェクトフォルダの直下（srcの上）に入れておく
        ImageIcon img = new ImageIcon("sharaku_small.jpg");

        // 文字列と画像の両方を指定したい時は new JLabel("文字列", 画像) とする
        JLabel label = new JLabel(img);

        this.add(label);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelImageSample();
    }
}