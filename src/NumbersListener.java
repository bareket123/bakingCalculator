import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumbersListener implements ActionListener {
 private final JButton button;
 private final JTextField textField;
    public NumbersListener(JButton button,JTextField text){
        this.button=button;
        this.textField=text;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.textField.setText(this.textField.getText() + button.getText());
    }
}
