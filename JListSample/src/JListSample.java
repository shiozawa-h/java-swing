/*
    項目選択リスト（JList）のサンプル
 */

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class JListSample extends JFrame implements ListSelectionListener {

    private JList list;

    public JListSample() {
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JListのサンプル");
        this.setSize(200, 120);

        // 項目は文字列の配列で用意する
        String[] data = {"項目1", "項目2", "項目3", "項目4"};
        list = new JList(data);
        list.addListSelectionListener(this);
        this.add(list);
        this.setVisible(true);
    }

    public void valueChanged(ListSelectionEvent e) {
        JList l = (JList) e.getSource();
        System.out.println(l.getSelectedValue());
    }

    public static void main(String[] args) {
        new JListSample();
    }
}