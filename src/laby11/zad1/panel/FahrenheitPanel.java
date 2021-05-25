package laby11.zad1.panel;

import laby5.zad5.C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FahrenheitPanel extends JPanel implements ActionListener {

    private static final JLabel LABEL = new JLabel("Fahrenheit to Celsius");
    private static final TextField TEXT_FIELD = new TextField();
    private static final JButton BUTTON = new JButton("konwertuj");
    private Double fieldValue = 32.0;

    public FahrenheitPanel() {
        initialize();
    }

    public static TextField getTextField() {
        return TEXT_FIELD;
    }

    private void initialize() {
        this.setLayout(null);
        this.setBackground(new Color(193, 130, 110));
        this.setOpaque(true);

        LABEL.setForeground(Color.white);
        LABEL.setBounds(50, 50, 200, 30);

        TEXT_FIELD.setBounds(50, 100, 200, 25);
        TEXT_FIELD.setText(String.valueOf(fieldValue));

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
        CelsiusPanel.getTextField().setText(String.valueOf(convertFtoC()));
    }

    private Double convertFtoC() {
        return (this.fieldValue  - 32) / 1.8;
    }
}