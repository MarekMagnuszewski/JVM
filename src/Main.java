import javax.swing.*;
import java.awt.*;

public class Main {

    private JTextField text;
    private JButton addObjectButton;
    private JPanel jPanel;

    public static void main(String[] args) {
        Main main=new Main();

        JFrame jFrame=new JFrame();
        jFrame.setContentPane(main.jPanel);
        jFrame.setSize(300,300);
        
        jFrame.setLocationRelativeTo(jFrame);
        jFrame.setVisible(true);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       //System.out.println("Hello World!");
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
