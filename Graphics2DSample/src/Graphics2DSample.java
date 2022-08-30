import javax.swing.*;
import java.awt.*;

public class Graphics2DSample extends JFrame {

    private CanvasPanel canvas;

    public Graphics2DSample() {
        super("Canvas");
        this.setLayout(new BorderLayout());
        this.setSize(800, 800);

        canvas = new CanvasPanel();
        this.add(canvas);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Graphics2DSample();
    }
}
