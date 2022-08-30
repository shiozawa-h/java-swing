/*
    匿名クラスを利用して、イベントを処理するサンプル
    new ActionListener() で、ActionListenerインタフェースを
    実装する（その場でしか使わない）匿名のクラスを作ることができる。
    これによって、フレームの処理がすっきりする。
    また、この匿名クラスは内部クラスになるので、
    それが所属するクラスのフィールドにアクセスすることもできる。

    IntelliJ IDEA の Swing UI Designer はこの機能を使ってる。
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class EventHandlerClassSample extends JFrame {

    public EventHandlerClassSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("匿名クラスによるイベント処理のサンプル");
        this.setSize(400, 100);
        this.setLayout(new FlowLayout());

        JButton bt = new JButton("OK");

        // このイベント処理専用の匿名の内部クラスを生成し使用する
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();
                System.out.println(b.getText());
            }
        });

        this.add(bt);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlerClassSample();
    }
}
