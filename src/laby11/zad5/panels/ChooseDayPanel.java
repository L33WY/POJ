package laby11.zad5.panels;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ChooseDayPanel extends JPanel implements ActionListener {

    private final static JLabel LABEL  = new JLabel("Podaj date aby spradzic jaki to dzien tygodnia");
    private final static JTextField TEXT_FIELD = new JTextField();
    private final static JButton BUTTON = new JButton("potwierdz");
    private final JLabel INFO_LABEL = new JLabel();

    public ChooseDayPanel() {
        initialize();
    }

    private void initialize() {
        this.setLayout(null);
        this.setBackground(new Color(99, 199, 99));

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
                    Date date = new SimpleDateFormat("dd/M/yyyy").parse(TEXT_FIELD.getText());
                    System.out.println(date.getDay());
                    this.displayDayOfWeek(date.getDay());
                } catch (Exception error) {
                    JOptionPane.showMessageDialog(this, "Data musi byc w formacie dd/M/yyyy");
                }
            }
        }
    }

    private void displayDayOfWeek(int day) {
        String formula = "To jest ";
        switch (day) {
           case 1: INFO_LABEL.setText(formula + "poniedzialek"); break;
           case 2: INFO_LABEL.setText(formula + "wtorek"); break;
           case 3: INFO_LABEL.setText(formula + "sroda"); break;
           case 4: INFO_LABEL.setText(formula + "czwartek");break;
           case 5: INFO_LABEL.setText(formula + "piatek");break;
           case 6: INFO_LABEL.setText(formula + "sobota");break;
           case 0: INFO_LABEL.setText(formula + "niedziela");break;
        }
    }
}
