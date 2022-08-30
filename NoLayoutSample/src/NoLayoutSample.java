import javax.swing.*;

public class NoLayoutSample extends JFrame {

    private JButton b1;

    public NoLayoutSample() {
        this.setTitle("座標指定のサンプル");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        b1 = new JButton("Button");
        b1.setBounds(20, 50, 80, 30);
        this.add(b1);

        this. setVisible(true);
    }

    public static void main(String[] args) {
        new NoLayoutSample();
    }
}