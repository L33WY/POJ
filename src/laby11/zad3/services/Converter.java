package laby11.zad3.services;

import laby11.zad2.panels.GamePanel;
import laby11.zad3.panels.BackowrdPanel;
import laby5.zad5.B;

import javax.swing.*;
import java.awt.*;

public class Converter {

    private static final JFrame mainFrame = new JFrame();

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    private static int SCREEN_WIDTH;
    private static int SCREEN_HEIGHT;

    public Converter() {
        resolveScreenSize();
        initializeFrame();
    }

    private void initializeFrame() {
        mainFrame.setTitle("Word in backwords");
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH / 2 , SCREEN_HEIGHT / 2 );

        mainFrame.setLayout(null);

        BackowrdPanel backowrdPanel = new BackowrdPanel();
        backowrdPanel.setBounds(0, 0, WIDTH, HEIGHT);

        mainFrame.add(backowrdPanel);

        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

    private void resolveScreenSize() {
        final Toolkit toolkit = Toolkit.getDefaultToolkit();
        final Dimension screenSize = toolkit.getScreenSize();
        SCREEN_HEIGHT = screenSize.height;
        SCREEN_WIDTH = screenSize.width;
    }
}
