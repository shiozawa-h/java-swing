import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CanvasPanel extends JPanel implements MouseListener, MouseMotionListener {

    private int x, y;
    private String text = "";

    public CanvasPanel() {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Graphics2D g = (Graphics2D) gr;
        Dimension size = getSize();

        g.drawString(text, x, y);
    }

    // MouseListenerのイベント
    @Override
    public void mouseClicked(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "clicked";
        this.repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "pressed";
        this.repaint();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "released";
        this.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "entered";
        this.repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "exited";
        this.repaint();
    }

    // MouseMotionListenerのイベント
    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "moved";
        this.repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        text = "dragged";
        this.repaint();
    }
}
