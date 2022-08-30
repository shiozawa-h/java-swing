/*
    ダイアログボックス（JDialog）を開くサンプル
    メッセージ表示などに使う
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JDialogSample extends JFrame implements ActionListener {

    public JDialogSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JDialogのサンプル");
        this.setSize(200, 100);

        JButton bt = new JButton("ダイアログを開く");
        bt.addActionListener(this);
        this.add(bt);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // ダイアログボックスを開く
        MyDialog dlg = new MyDialog(this);
        dlg.setVisible(true);
    }

    public static void main(String[] args) {
        new JDialogSample();
    }
}

