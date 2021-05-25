package laby11.zad2.panels;

import laby11.zad2.services.GuessNumberGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel implements ActionListener {

    private final static JLabel LABEL  = new JLabel("Zgadnij o jakiej liczbie od 1 do 100 mysli pc!");
    private final static JTextField TEXT_FIELD = new JTextField();
    private final static JButton BUTTON = new JButton("potwierdz");
    private JLabel INFO_LABEL = new JLabel("Powodzenia!");
    private final GuessNumberGame game = new GuessNumberGame(this);

    public GamePanel() {
        initialize();
        this.game.startGame();
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
                try {
                    int num = Integer.parseInt(TEXT_FIELD.getText());
                    game.validateInput(num);
                } catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(this, "Podano zla wartosc!");
                }
            }
        }
    }

    public JLabel getInfoLabel() {
        return INFO_LABEL;
    }
}
