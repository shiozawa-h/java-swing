/*
    ウィンドウ（JFrame）を開くサンプル
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JFrameOpenSample extends JFrame implements ActionListener {

    JButton bt;
    SecondFrame frame;

    public JFrameOpenSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("2枚目のウィンドウを開くサンプル");
        this.setSize(200, 100);
        this.setLayout(new FlowLayout());

        bt = new JButton("OK");
        bt.addActionListener(this);
        this.add(bt);

        frame = new SecondFrame();

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (!frame.isVisible())
            frame.setVisible(true);
        else
            frame.setVisible(false);
    }

    public static void main(String[] args) {
        new JFrameOpenSample();
    }
}
