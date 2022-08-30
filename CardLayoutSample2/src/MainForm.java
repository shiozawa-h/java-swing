import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm {
    public JPanel panel1;
    private JPanel card1;
    private JPanel card2;
    private JButton button1;
    private JButton button2;

    public MainForm() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) panel1.getLayout();
                cl.show(card1.getParent(), "Card2");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) panel1.getLayout();
                cl.show(card2.getParent(), "Card1");
            }
        });
    }
}
