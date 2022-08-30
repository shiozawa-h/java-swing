import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// ダイアログボックスの構成
class MyDialog extends JDialog implements ActionListener {

    public MyDialog(JFrame owner) {
        super(owner);
        this.setLayout(new FlowLayout());
        this.setTitle("JDialogのサンプル");
        this.setSize(100, 70);

        JButton bt = new JButton("OK");
        bt.addActionListener(this);
        this.add(bt);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
        this.getParent().remove(this);
    }
}
