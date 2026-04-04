package main.panels;

public class MayaPanel extends JPanel {
    private z savingsLabel;
    private Jlabel allowanceLabel;
    private Jlabel addMoreLabel;
    private Jlabel totalLabel;

    private double savings=0;
    private double allowance=0;
    private double addMore=0;

    public MayaPanel(){
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setBackground(Color.decode("#E5E5E5"));

        ImageIcon mayaIcon = new ImageIcon(getClass().getResource("/images/maya.png"));
        JLabel logoLabel = new JLabel (mayaIcon);

        JPanel userPanel = new JPanel();
        userPanel.setLayout(new BoxLayout(userPanel, BoxLayout.Y_axis));
        userPanel.setBackground(Color.decode("#E5E5E5"));
        JLabel nameLabel = new JLabel("Juan Dela Cruz");
        JLabel accountLabel = new JLabel(" *** *** 789");

        userPanel.add(nameLabel);
        userPanel.add(accountLabel);
        topPanel.add(logoLabel, BorderLayout.WEST);
        topPanel.add(userPanel, Borderlayout.CENTER);

        add(topPanel, Borderlayout.NORTH);





    }


}
