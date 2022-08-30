/*
    ラムダ式を利用して、イベントを処理するサンプル
    匿名のクラスをさらに発展させ、ラムダ式でイベント処理を記述する。
 */

import java.awt.*;
import javax.swing.*;

class EventHandlerLambdaSample extends JFrame {

    public EventHandlerLambdaSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("ラムダ式によるイベント処理のサンプル");
        this.setSize(400, 100);
        this.setLayout(new FlowLayout());

        JButton bt = new JButton("OK");

        // ラムダ式（匿名関数）でイベント処理を記述する
        bt.addActionListener(e -> {
            JButton b = (JButton) e.getSource();
            System.out.println(b.getText());
            }
        );

        this.add(bt);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new EventHandlerLambdaSample();
    }
}


