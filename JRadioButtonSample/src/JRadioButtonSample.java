/*
    ライジオボタン（JRadioButton；択一式ボタン）と
    ボタンのグループ化のサンプル
    同じグループのボタンは1つしかONにならない
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JRadioButtonSample extends JFrame implements ChangeListener {

    JRadioButton rb1, rb2, rb3;

    public JRadioButtonSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JRadioButtonのサンプル");
        this.setSize(200, 100);

        rb1 = new JRadioButton("On", true);  // 初期状態が選択
        rb2 = new JRadioButton("Off");
        rb3 = new JRadioButton("Off");

        rb1.addChangeListener(this);
        rb2.addChangeListener(this);
        rb3.addChangeListener(this);

        this.add(rb1);
        this.add(rb2);
        this.add(rb3);

        // ボタンを1つしか選べないようにグループ化する
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);

        this.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        JRadioButton rb = (JRadioButton) e.getSource();

        // そのボタンの選択状態を得る
        if (rb.isSelected()) {
            rb.setText("On");
        } else {
            rb.setText("Off");
        }
    }

    public static void main(String[] args) {
        new JRadioButtonSample();
    }
}