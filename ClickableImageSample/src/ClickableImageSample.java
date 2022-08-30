/*
    画像のクリック位置取得のサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ClickableImageSample extends JFrame implements MouseListener {

    JLabel label;

    public ClickableImageSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("画像のクリック位置取得のサンプル");

        // 画像はプロジェクトフォルダの直下（srcの上）に入れておく
        ImageIcon img = new ImageIcon("worldmap2003.jpg");
        label = new JLabel(img);

        this.setSize(img.getIconWidth() + 50, img.getIconHeight() + 50);

        // 画像のクリックイベントを取得する
        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    // MouseListenerのイベント
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("clicked:" + e.getX() + "," + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) { }
    @Override
    public void mouseReleased(MouseEvent e) { }
    @Override
    public void mouseEntered(MouseEvent e) { }
    @Override
    public void mouseExited(MouseEvent e) { }

    public static void main(String[] args) {
        new ClickableImageSample();
    }
}