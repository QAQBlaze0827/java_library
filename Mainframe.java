
import java.awt.Container;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class Mainframe extends JFrame { 
    // private JButton btn1 = new JButton("按鈕");
    private JPanel panel = new JPanel();
    private Container cp;
    public Mainframe(){
        init();
    }
    private void init(){
        //這邊處理視窗的基本設定
        this.setTitle("Login Library System");
        this.setSize(600,350);
        this.setLocation(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //處理版面
        cp = this.getContentPane();
        cp.setLayout(null);
        panel.setBounds(0, 0, 400, 400);
        cp.add(panel);
        panel.setLayout(null);
        //這邊處理元件
        JLabel userLabel = new JLabel("User:");
        /* 这个方法定义了组件的位置。
         * setBounds(x, y, width, height)
         * x 和 y 指定左上角的新位置，由 width 和 height 指定新的大小。
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * 创建文本域用于用户输入
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,300,25);
        panel.add(userText);

        // 输入密码的文本域
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,300,25);
        panel.add(passwordText);

        // 创建登录按钮
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
        loginButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                // String password = passwordText.getText();
                if("admin".equals(userText.getText()) && "password".equals(passwordText.getPassword())){
                    System.out.println("Login Success");
                }
                else{
                    System.out.println("Login Fail");
                }
            }
        });
            
    }

}
class people{
    private String username;
    private String password;
}
class admin extends people{
    private String adminname;
    private String adminpassword;
    public void name(){
        this.adminname = "admin";
        this.adminpassword = "password";
    }
    public String getadminname(){
        return adminname;
    }
    public String getadminpassword(){
        return adminpassword;
    }
}