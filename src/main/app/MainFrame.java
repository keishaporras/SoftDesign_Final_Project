cardLayout = new CardLayout();
mainPanel = new JPanel(cardLayout);

        mainPanel.add(new DashBoardPanel(this), "Dashboard");
        mainPanel.add(new BDOPanel(this), "BDO");
        mainPanel.add(new BPIPanel(this), "BPI");
        mainPanel.add(new MayaPanel(this), "Maya");
        mainPanel.add(new AboutPanel(this), "About");
        mainPanel.add(new DashBoardPanel(this), "dashboard");
        mainPanel.add(new BDOPanel(this), "bdo");
        mainPanel.add(new BPIPanel(this), "bpi");
        mainPanel.add(new MayaPanel(this), "maya");
        mainPanel.add(new AboutPanel(this), "about");

add(mainPanel);
