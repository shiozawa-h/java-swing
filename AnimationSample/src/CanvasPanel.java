import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class CanvasPanel extends JPanel implements ActionListener {

    private Image image;
    private javax.swing.Timer timer;  // Swingのタイマークラス
    private int frameCount = 0;       // 現在までの描画コマ数

    public CanvasPanel() {
        try {
            BufferedImage bimg = ImageIO.read(new File("ringo.jpg"));
            // 画像のリサイズ
            image = bimg.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // フレームの時間間隔を千分の1秒単位で指定し、タイマーをセットする
        // 毎秒30コマなら1000/30=33.333になるが・・・
        timer = new Timer(33, this);

        // 初回までの間隔を0.2秒に設定して、タイマーを開始する
        timer.setInitialDelay(200);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Graphics2D g = (Graphics2D) gr;

        // 領域のサイズを得る
        Dimension size = getSize();

        // 背景を塗りつぶす
        g.setColor(Color.white);
        g.fillRect(0, 0, size.width - 1, size.height - 1);

        // 画像を表示する
        int x = frameCount * 2 % size.width - 50;
        int y = 50;
        g.drawImage(image, x, y, null);

        frameCount++;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
}
