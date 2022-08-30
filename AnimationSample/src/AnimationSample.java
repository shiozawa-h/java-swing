import javax.swing.*;
import java.awt.*;

public class AnimationSample extends JFrame {

    private CanvasPanel canvas;

    public AnimationSample() {
        this.setTitle("Animation(Timer) Sample");
        this.setLayout(new BorderLayout());
        this.setSize(400, 200);

        canvas = new CanvasPanel();
        this.add(canvas);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new AnimationSample();
    }
}
