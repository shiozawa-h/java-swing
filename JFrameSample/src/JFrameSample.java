/*
    ウィンドウ（JFrame）を開くサンプル
 */

import javax.swing.*;

public class JFrameSample extends JFrame {

    public JFrameSample() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JFrameのサンプル");
        this.setSize(200, 100);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameSample();
    }
}
