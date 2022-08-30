/*
    コンボボックス（JComboBox）のサンプル
    メニューとして使える
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComboBoxSample extends JFrame implements ActionListener {

    private JComboBox cbox;
    
    public JComboBoxSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JComboBoxのサンプル");
        this.setSize(200, 120);

        cbox = new JComboBox();
        cbox.addItem("選択してください");
        cbox.addItem("選択肢1");
        cbox.addItem("選択肢2");
        cbox.addItem("選択肢3");

        cbox.addActionListener(this);
        this.add(cbox);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox) e.getSource();
        System.out.println(cb.getSelectedItem());
    }

    public static void main(String[] args) {
        new JComboBoxSample();
    }
}