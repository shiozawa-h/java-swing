/*
    ボタン（JButton）のサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonSample extends JFrame implements ActionListener {

    JButton bt;

    public JButtonSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JButtonのサンプル");
        this.setSize(200, 100);
        this.setLayout(new FlowLayout());

        bt = new JButton("OK");
        bt.addActionListener(this);
        this.add(bt);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton) e.getSource();
        System.out.println(b.getText());
    }

    public static void main(String[] args) {
        new JButtonSample();
    }
}
