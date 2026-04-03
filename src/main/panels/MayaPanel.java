package main.panels;

import main.app.MainFrame;

import javax.swing.*;
import java.awt.*;

public class MayaPanel extends JPanel {
    private JLabel savingsLabel;
    private JLabel allowanceLabel;
    private JLabel addMoreLabel;
    private JLabel totalLabel;

    private double savings = 0;
    private double allowance=0;
    private double addMore=0;


    public MayaPanel(MainFrame mainFrame) {

        setLayout(new BorderLayout());
        setBackground(Color.white);

        JPanel topPanel= new JPanel(new BorderLayout());
        topPanel.setBackground(Color.decode("#E5E5E5"));
        topPanel.setBorder(Borderfactpry.createEmptyBorder(15,15,15,15));

        ImageIcon mayaIcon = new ImageIcon(getClass().getResource("/images/maya-logi.png"));
        JLabel logo = new JLabel(mayaIcon);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_AXIS));
        userPanel.setBackground(Color.decode("#E5E5E5"));

        JLabel name = new JLabel("JUAN DELA CRUZ");
        JLabel account = new JLabel("*** *** 789");

        userPanel.add(name);
        userPanel.add(account);

        topPanel.add(logo, BorderLayout.WEST);
        topPanel.add(userPanel, BorderLayout.CENTER);

        add(topPanel, BorderLayout.NORTH);



        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3,1,10,10));
        center.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));



        //SAVINGS
        Jpanel savingsPanel = createPanel("Savings");
        savingsLabel= new JLabel("0.00");
        JButton savingsButton = new JButton("Edit");
        savingsButton.addActionListener(e -> updateSavings());

        savingsPanel.add(savingsLabel, BorderLayout.CENTER);
        savingsPanel.add(savingsButton, Borderlayout.EAST);

        //ALLOWANCE
        






        JLabel label = new JLabel("Maya Panel", SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        add(back, BorderLayout.SOUTH);
    }
}