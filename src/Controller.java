import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    private JButton material;
    private String materialNameToConvert;
    private JTextField input;
    private double currentInput ;
    private JComboBox comboBoxMaterials;
    private Materials currentMaterial ;
    public Controller(JButton material,JTextField input, JComboBox comboBoxMaterials){
        this.material=material;
        this.materialNameToConvert=material.getText();
        this.input=input;
        this.comboBoxMaterials=comboBoxMaterials;
        this.currentMaterial=Materials.gram;
        comboBoxMaterials.addActionListener(e->{
            currentMaterial=Materials.values()[comboBoxMaterials.getSelectedIndex()];
        });

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.currentInput=Double.parseDouble(input.getText());
        switch (materialNameToConvert){
            case "gram":
                switch (currentMaterial){
                    case gram:
                        input.setText("it is the same material!");
                        break;
                    case cup:
                        input.setText(String.valueOf(currentInput*140));
                        break;
                    case mil:
                        input.setText(String.valueOf(currentInput/1000));
                        break;
                    case spoon: case bag:
                        input.setText(String.valueOf(currentInput*10));
                        break;
                }
                break;
            case "cup":
                switch (currentMaterial){
                    case gram:
                        input.setText(String.valueOf(currentInput/140));
                        break;
                    case cup:
                        input.setText("it is the same material!");
                        break;
                    case mil:
                        input.setText(String.valueOf(currentInput/240));
                        break;
                    case spoon: case bag:
                        input.setText(String.valueOf(currentInput/14));
                        break;
                }
                break;
            case "mil":
                switch (currentMaterial){
                    case gram:
                        input.setText(String.valueOf(currentInput/1000));
                        break;
                    case cup:
                        input.setText(String.valueOf(currentInput*240));
                        break;
                    case mil:
                        input.setText("it is the same material!");
                        break;
                    case spoon: case bag:
                        input.setText(String.valueOf(currentInput*15));
                        break;

                }
                break;
            case "spoon":
                switch (currentMaterial){
                    case gram:
                        input.setText(String.valueOf(currentInput/10));
                        break;
                    case cup:
                        input.setText(String.valueOf(currentInput*14));
                        break;
                    case mil:
                        input.setText(String.valueOf(currentInput/15));
                        break;
                    case spoon:
                        input.setText("it is the same material!");
                        break;
                    case bag:
                        input.setText("Use the same amount");
                        break;

                }
                break;
            case "bag":
                switch (currentMaterial){
                    case gram:
                        input.setText(String.valueOf(currentInput/10));
                        break;
                    case cup:
                        input.setText(String.valueOf(currentInput*14));
                        break;
                    case mil:
                        input.setText(String.valueOf(currentInput/15));
                        break;
                    case spoon:
                        input.setText("Use the same amount");
                        break;
                    case bag:
                        input.setText("it is the same material!");
                        break;

                }
                break;




        }

    }
}
