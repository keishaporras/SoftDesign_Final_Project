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
    private double allowance = 0;
    private double addMore = 0;


    public MayaPanel(MainFrame mainFrame) {

        setLayout(new BorderLayout());
        setBackground(Color.white);

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.decode("#E5E5E5"));
        topPanel.setBorder(Borderfactpry.createEmptyBorder(15, 15, 15, 15));

        ImageIcon mayaIcon = new ImageIcon(getClass().getResource("/images/maya-logo.png"));
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
        center.setLayout(new GridLayout(3, 1, 10, 10));
        center.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));


        //SAVINGS
        Jpanel savingsPanel = createPanel("Savings");
        savingsLabel = new JLabel("PHP 0.00");
        JButton savingsButton = new JButton("Edit");
        savingsButton.addActionListener(e -> updateSavings());

        savingsPanel.add(savingsLabel, BorderLayout.CENTER);
        savingsPanel.add(savingsButton, Borderlayout.EAST);

        //ALLOWANCE
        JPanel allowancePanel = createPanel("Allowance");
        allowanceLabel = new JLabel("PHP 0.00");
        JButton allowanceBtn = new JButton("Edit");
        allowanceBtn.addActionListener(e -> updateAllowance());

        allowancePanel.add(allowanceLabel, BorderLayout.CENTER);
        allowancePanel.add(allowanceBtn, BorderLaypur.EASR);


        //ADD MORE BANKS
        JPanel addMorePanel = createPanel("Add More");
        addMoreLabel = new JLabel("PHP 0.00");
        JButton addMoreBtn = new JButton("Edit");
        addMoreBtn.addActionListener(e -> updateAllowance());

        allowancePanel.add(addMoreLabel, BorderLayout.CENTER);
        allowancePanel.add(addMoreeBtn, BorderLaypur.EASR);

        center.add(savingsPanel);
        center.add(allowancePanel);
        center.add(addMorePanel);

        add(center, BorderLayout.CENTER);


        //Now the BOTTOM PANEL
        JPanel bottom = new JPanel();
        bottom.setLayout(new BoxLayout(bottom, BoxLayout.Y_AXIS));
        bottom.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel title = new JLabel("Account Balance");
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        totalLabel = new JLabel("PHP 0.00");
        totalLabel.setFont(new Font("Arial", Font.BOLD, 25));
        totalLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton removeButton = new JButton("Remove Bank");

        JButton back = new JButton("Back");
        back.addActionListener(e -> mainFrame.showPanel("dashboard"));

        bottom.add(title);
        bottom.add(Box.createVerticalStrut(10));

        bottom.add(totalLabel);
        bottom.add(Box.createVerticalStrut(10));

        bottom.add(removeButton);
        bottom.add(Box.createVerticalStrut(10));
        bottom.add(back);

        add(bottom, BorderLayout.SOUTH);


        updateTotal();
    }

    private JPanel createPanel(String title) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(Borderfactory.createTitleBorder(title));
        return panel;
    }

    private void updateSavings() {

    }

    private void updateAllowance() {

    }

    private void updateAddMore() {

    }

    private void updateTotal() {
        double total = savings + allowance + addMore;
        totalLabel.setText("PHP" + total);

    }

    

}