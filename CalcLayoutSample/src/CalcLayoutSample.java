/*
    BorderLayoutとGridLayoutを組み合わせた
    電卓風レイアウトのサンプル
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class CalcLayoutSample extends JFrame implements ActionListener {

    // フレームに載せる部品
    private JLabel label;
    private JPanel keypad;
    private JButton[] key = new JButton[25];

    // フォントの生成
    private Font font = new Font("SanSerif", Font.BOLD, 24);

    public CalcLayoutSample() {
        super("電卓風レイアウトのサンプル");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // レイアウト方法を指定
        this.setLayout(new BorderLayout());

        label = new JLabel("0");

        // フォント設定，周囲に余白設定，右詰めに設定
        label.setFont(font);
        label.setBorder(new EmptyBorder(10, 10, 10, 10));
        label.setHorizontalAlignment(JLabel.RIGHT);

        // フレームの一番上の位置に置く
        this.add(label, BorderLayout.NORTH);

        // 数字ボタン用の土台を作成し，フレームの真ん中に置く
        keypad = new JPanel();
        this.add(keypad, BorderLayout.CENTER);

        // 数字ボタンのレイアウトは5×5のマス目状
        keypad.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < key.length; i++) {
            key[i] = new JButton(Integer.toString(i));
            keypad.add(key[i]);
            // この例では，すべてのボタンのインベントハンドラは共通
            key[i].addActionListener(this);
        }
        this.setVisible(true);
    }

    // ボタンが押された時の処理
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        label.setText(b.getText());
    }

    // mainメソッド
    public static void main(String[] args) {
        new CalcLayoutSample();
    }


}
