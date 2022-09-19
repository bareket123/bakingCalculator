import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersListener implements ActionListener {
 private JButton button;
 private JTextField textField;
    public NumbersListener(JButton button,JTextField text){
        this.button=button;
        this.textField=text;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.textField.setText(this.textField.getText() + button.getText());
    }
}
