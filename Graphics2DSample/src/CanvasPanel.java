import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import javax.imageio.ImageIO;

// 絵を描くためのパネルを定義する
public class CanvasPanel extends JPanel {

    private BufferedImage image;

    public CanvasPanel() {
        try {
            image = ImageIO.read(new File("ringo.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // paintComponentをオーバーライドして描画する
    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Graphics2D g = (Graphics2D) gr;

        // 領域のサイズを得る
        Dimension size = getSize();

        // 背景を塗りつぶす
        g.setColor(Color.white);
        g.fillRect(0, 0, size.width - 1, size.height - 1);

        // 線の色と太さ
        g.setColor(new Color(100, 100, 255));
        g.setStroke(new BasicStroke(4));

        // 図形描画メソッドで描画する
        g.drawLine(0, 0, size.width, size.height);
        g.drawOval(size.width / 2, size.height / 2, 200, 200);

        // 画像を表示する
        g.drawImage(image, 20, 20, null);
        g.drawImage(image, 400, 200, 100, 100, null);

        // 色を指定して文字を表示する
        g.setColor(Color.black);
        g.drawString("あいうえお", 400, 100);

        Font font = new Font("メイリオ", Font.PLAIN, 24);
        g.setFont(font);
        g.drawString("かきくけこ", 100, 400);
    }
}
