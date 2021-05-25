package laby11.zad1.service;

import laby11.zad1.panel.CelsiusPanel;
import laby11.zad1.panel.FahrenheitPanel;

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
        mainFrame.setTitle("C and F converter");
        mainFrame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(WIDTH, HEIGHT);
        mainFrame.setLocation(SCREEN_WIDTH / 2 , SCREEN_HEIGHT / 2 );

        mainFrame.setLayout(null);



        final CelsiusPanel celsiusPanel = new CelsiusPanel();
        celsiusPanel.setBounds(0, 0, WIDTH /2, HEIGHT );
        mainFrame.add(celsiusPanel);

        final FahrenheitPanel fahrenheitPanel = new FahrenheitPanel();
        fahrenheitPanel.setBounds(300, 0, WIDTH /2, HEIGHT );
        mainFrame.add(fahrenheitPanel);

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
