package panels;

import javax.swing.*;
import java.awt.*;

public class MayaPanel extends JPanel {

    private JLabel savingsLabel;
    private JLabel allowanceLabel;
    private JLabel addMoreLabel;
    private JLabel totalLabel;

    private double savings = 0;
    private double allowance = 0;
    private double addMore = 0;

    public MayaPanel(){

        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.decode("#E5E5E5"));

        ImageIcon mayaIcon =
                new ImageIcon(getClass().getResource("/images/maya.png"));

        JLabel logoLabel = new JLabel(mayaIcon);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
        userPanel.setBackground(Color.decode("#E5E5E5"));

        JLabel nameLabel = new JLabel("Juan Dela Cruz");
        JLabel accountLabel = new JLabel("*** *** 789");

        userPanel.add(nameLabel);
        userPanel.add(accountLabel);

        topPanel.add(logoLabel, BorderLayout.WEST);
        topPanel.add(userPanel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);
    }
}