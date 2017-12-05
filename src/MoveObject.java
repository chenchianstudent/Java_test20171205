import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MoveObject extends JLabel implements Runnable {
    private ImageIcon imgIcon = new ImageIcon();
    private int frmW, frmH;
    private Random rand;
    private int locx, locy;
    private Timer t1;
    private JPanel jpnC;

    @Override
    public void run() {
        t1.start();
    }
    public MoveObject(int frmw,int frmh,JPanel jpnc){
        jpnC=jpnc;
        frmH=frmh;
        frmW=frmw;
        rand=new Random(System.currentTimeMillis());
        locx=rand.nextInt(frmW);
        locy=rand.nextInt(frmH);
        this.setBounds(locx,locy,260,260);
        t1=new Timer(700, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                locx=rand.nextInt(frmW);
                locy=rand.nextInt(frmH);
                MoveObject.this.setLocation(locx,locy);
                jpnc.repaint();
            }
        });
    }
}
