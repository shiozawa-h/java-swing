/*
    文字列入力欄（TextField）のサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JTextFieldSample extends JFrame implements ActionListener {

    private JTextField tf;

    public JTextFieldSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTextFieldのサンプル");
        this.setSize(300, 200);

        tf = new JTextField("入力してENTERキー", 15);  // 文字数
        tf.addActionListener(this);
        this.add(tf);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JTextField tf = (JTextField) e.getSource();
        System.out.println(tf.getText());
    }

    public static void main(String[] args) {
        new JTextFieldSample();
    }
}