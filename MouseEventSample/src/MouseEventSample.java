import javax.swing.*;
import java.awt.*;

public class MouseEventSample extends JFrame {

    private CanvasPanel canvas;

    public MouseEventSample() {
        super("MouseEventSample");
        this.setLayout(new BorderLayout());
        this.setSize(400, 200);

        canvas = new CanvasPanel();
        this.add(canvas);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventSample();
    }
}
