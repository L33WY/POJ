package laby11.zad3.panels;

import laby11.zad3.services.BackwordController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BackowrdPanel extends JPanel implements ActionListener {

    private final static JLabel LABEL  = new JLabel("Podaj String ktory wyswietlimy od tylu");
    private final static JTextField TEXT_FIELD = new JTextField();
    private final static JButton BUTTON = new JButton("potwierdz");
    private JLabel INFO_LABEL = new JLabel();


    public BackowrdPanel() {
        initialize();
    }

    private void initialize() {
        this.setLayout(null);
        this.setBackground(new Color(199, 199, 199));

        LABEL.setForeground(Color.black);
        LABEL.setBounds(160, 50, 280, 40);
        LABEL.setHorizontalAlignment(JLabel.CENTER);

        INFO_LABEL.setForeground(Color.blue);
        INFO_LABEL.setBounds(160, 70, 280, 30);
        INFO_LABEL.setHorizontalAlignment(JLabel.CENTER);

        TEXT_FIELD.setBounds(200, 100, 200, 30);

        BUTTON.setBounds(250, 135, 100, 20);
        BUTTON.addActionListener(this);

        this.add(LABEL);
        this.add(INFO_LABEL);
        this.add(TEXT_FIELD);
        this.add(BUTTON);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BUTTON) {
            if (!TEXT_FIELD.getText().isEmpty()) {
                String reversedWord = BackwordController.reverseWord(TEXT_FIELD.getText());
                INFO_LABEL.setText(reversedWord);
            }
        }
    }
}
