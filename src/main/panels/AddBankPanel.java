package main.panels;

import main.app.MainFrame;
import main.model.Bank;
import main.model.BankStore;

import javax.swing.*;
import java.awt.*;

public class AddBankPanel extends JPanel {

    private MainFrame mainFrame;

    public  AddBankPanel(MainFrame mainFrame){
        this.mainFrame = mainFrame;

        setLayout(new GridLayout(4,2));

        JTextField bankName = new JTextField();
        JTextField accNum = new JTextField();

        JButton chooseLogo = new JButton("Choose Logo");

        final  String[] logoPath = {""};

        chooseLogo.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(null);

            if(result == JFileChooser.APPROVE_OPTION){
                logoPath[0] = fileChooser.getSelectedFile().getAbsolutePath();
            }
        });

        JButton confirm = new JButton("Confrim");

        confirm.addActionListener(e -> {
            Bank bank = new Bank(
                    bankName.getText(),
                    accNum.getText(),
                    logoPath[0]
            );

            BankStore.addBank(bank);

            mainFrame.showPanel("dashboard");
        });

        add(new JLabel("Bank Name"));
        add(bankName);

        add(new JLabel("Account Number"));
        add(accNum);

        add(chooseLogo);
        add(confirm);
    }
}
