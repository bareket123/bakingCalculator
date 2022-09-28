import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaterialsListener implements ActionListener{
 private JButton[] materials;
 private JComboBox comboBox;

    public MaterialsListener(JButton[] materials,JComboBox comboBox){
        this.materials=materials;
        this.comboBox=comboBox;
    }

    @Override
    public void actionPerformed(ActionEvent e) {




        for (JButton button:materials) {
            if (button==e.getSource()){
                String text=button.getText();






            }
        }
    }
}
