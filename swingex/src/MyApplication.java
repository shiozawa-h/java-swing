
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ボタンのイベントはActionListenerインタフェースで受け取る必要がある
public class MyApplication implements ActionListener {

   private final JFrame fr;
   private final JLabel lb;
   private final JButton bt1, bt2;
   private int x = 0;

   public MyApplication() {
      this.fr = new JFrame("Swingサンプルアプリケーション");
      this.fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.fr.setSize(400, 300);
      this.fr.setLayout(null);

      this.lb = new JLabel("0");
      this.lb.setFont(new Font("Sans-serif", Font.PLAIN, 32));
      this.lb.setBounds(200, 100, 50, 50);
      this.fr.add(this.lb);

      this.bt1 = new JButton("増やす");
      this.bt1.setBounds(50, 200, 100, 50);
      this.bt1.addActionListener(this);  // ボタンのインベント通知先を設定
      this.fr.add(this.bt1);

      this.bt2 = new JButton("減らす");
      this.bt2.setBounds(250, 200, 100, 50);
      this.bt2.addActionListener(this);  // ボタンのインベント通知先を設定
      this.fr.add(this.bt2);

      this.fr.setVisible(true);
   }

   // インベントハンドラ
   @Override
   public void actionPerformed(ActionEvent e) {
      JButton b = (JButton) e.getSource();
      if (b == this.bt1) {
         this.x++;
      } else if (b == this.bt2) {
         this.x--;
      }
      this.lb.setText(Integer.toString(x));
   }

   public static void main(String[] args) {
      new MyApplication();
   }
}
