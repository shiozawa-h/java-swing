/*
    チェックボックス（複数選択ボタン）のサンプル
    似たようなものに、トグルボタン（JToggleButton）がある
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JCheckBoxSample extends JFrame implements ChangeListener {

    private JCheckBox cb;

    public JCheckBoxSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JCheckBoxのサンプル");
        this.setSize(200, 100);

        cb = new JCheckBox("Off");
        cb.addChangeListener(this);
        this.add(cb);
        this.setVisible(true);
    }

    public void stateChanged(ChangeEvent e) {
        JCheckBox cb = (JCheckBox) e.getSource();

        // 選択状態を取得
        if (cb.isSelected()) {
            cb.setText("On");
        } else {
            cb.setText("Off");
        }
    }

    public static void main(String[] args) {
        new JCheckBoxSample();
    }
}