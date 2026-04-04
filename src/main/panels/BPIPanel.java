package panels;
import app.MainFrame;
import javax.swing.*;
import java.awt.*;


public class BPIPanel extends JPanel {
    public BPIPanel(MainFrame mainFrame) {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("BPI Panel", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}
