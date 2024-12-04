
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Mainframe extends JFrame {
    private JLabel label1 = new JLabel("OwO");
    private JButton btn1 = new JButton("按鈕");
    private Container cp;
    public Mainframe(){
        init();
    }
    private void init(){
        this.setTitle("Library Management System");
        this.setSize(800,600);
        this.setLocation(0,0);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        cp = this.getContentPane();
        cp.setLayout(null);
        label1.setBounds(400, 300, 200, 200);
        cp.add(label1);
        btn1.setBounds(300, 300, 100, 50);
        cp.add(btn1);
    }
}
