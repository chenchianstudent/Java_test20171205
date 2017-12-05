import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame {
    private ArrayList<MoveObject> moList = new ArrayList<MoveObject>();
    private ArrayList<Thread> moThreadList = new ArrayList<Thread>();
    private JPanel jpns = new JPanel(new GridLayout(1, 2, 5, 5));
    private JPanel jpnc = new JPanel(null);
    private JButton jbtnAddObj = new JButton("Add");
    private JButton jbtnExit = new JButton("Exit");
    private Container cp;

    public MainFrame() {
        init();
    }

    private void init() {
        this.setBounds(50,50,1200,700);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(5,5));
        cp.add(jpnc,BorderLayout.CENTER);
        cp.add(jpns,BorderLayout.SOUTH);
        jbtnAddObj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moList.add(new MoveObject(MainFrame.this.getWidth(),MainFrame.this.getHeight(),jpnc()));
            }
        });

    }
}
