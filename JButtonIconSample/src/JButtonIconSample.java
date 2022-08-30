/*
    ボタン（JButton）にアイコンを表示するサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonIconSample extends JFrame implements ActionListener {

    private JButton bt;

    public JButtonIconSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JButtonのアイコン表示のサンプル");
        this.setSize(400, 400);
        this.setLayout(new FlowLayout());

        ImageIcon icon = new ImageIcon("ringo.jpg");
        bt = new JButton(icon);
        bt.addActionListener(this);
        this.add(bt);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        System.out.println("Pushed");
    }

    public static void main(String[] args) {
        new JButtonIconSample();
    }
}
