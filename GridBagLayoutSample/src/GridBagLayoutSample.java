/*
    セルの結合もできるグリッド配置（GridBagLayout）のサンプル
 */

import java.awt.*;
import javax.swing.*;

public class GridBagLayoutSample extends JFrame {

    public GridBagLayoutSample() {
        this.setTitle("GridBagLayoutのサンプル");
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridBagLayout gbl = new GridBagLayout();
        this.setLayout(gbl);

        JButton b1 = new JButton("B1");
        JButton b2 = new JButton("B2");
        JButton b3 = new JButton("B3");
        JButton b4 = new JButton("B4");

        // 各部品の配置方法を細かく指定できる
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 2;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbl.setConstraints(b1, gbc);
        this.add(b1);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbl.setConstraints(b2, gbc);
        this.add(b2);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbl.setConstraints(b3, gbc);
        this.add(b3);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        gbc.insets = new Insets(1, 1, 1, 1);
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbl.setConstraints(b4, gbc);
        this.add(b4);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new GridBagLayoutSample();
    }
}
