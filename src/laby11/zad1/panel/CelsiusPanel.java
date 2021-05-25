package laby11.zad1.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusPanel extends JPanel implements ActionListener {

    private static final JLabel LABEL = new JLabel("Celsius to Fahrenheit");
    private static final TextField TEXT_FIELD = new TextField();
    private static final JButton BUTTON = new JButton("konwertuj");
    private Double fieldValue = 0.0;

    public CelsiusPanel() {
       initialize();
    }

    public static TextField getTextField() {
        return TEXT_FIELD;
    }


    private void initialize() {
        this.setLayout(null);
        this.setBackground(new Color(100, 100, 100));
        this.setOpaque(true);

        LABEL.setForeground(Color.WHITE);
        LABEL.setBounds(50, 50, 200,30);

        TEXT_FIELD.setBounds(50, 100, 200, 25);
        TEXT_FIELD.setText(String.valueOf(this.fieldValue));

        BUTTON.setBounds(50, 125, 200, 20);
        BUTTON.addActionListener(this);

        this.add(LABEL);
        this.add(TEXT_FIELD);
        this.add(BUTTON);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==BUTTON) {
            if (!TEXT_FIELD.getText().isEmpty()) {
                try {
                    this.fieldValue = Double.parseDouble(TEXT_FIELD.getText());
                    changeValue();
                } catch (NumberFormatException error){
                    JOptionPane.showMessageDialog(this, "Podano zla wartosc!");
                }
            }
        }
    }

    private void changeValue() {
        FahrenheitPanel.getTextField().setText(String.valueOf(convertCtoF()));
    }


    private Double convertCtoF() {
        return (this.fieldValue * 1.8) + 32;
    }
}
