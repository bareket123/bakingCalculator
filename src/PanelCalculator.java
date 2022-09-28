import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.Document;

public class PanelCalculator  extends JPanel {
   private   JTextField input;
   private JComboBox comboBoxMaterials;

   public PanelCalculator() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.MAGENTA);
       input =new JTextField();
       input.setPreferredSize(new Dimension(Model.INPUT_WIDTH,Model.INPUT_HEIGHT));
       comboBoxMaterials=new JComboBox(Materials.values());

        JPanel inputPanel= new JPanel();
        inputPanel.add(input);
        inputPanel.add(comboBoxMaterials);
        JPanel numbers= new JPanel();
        numbers.setLayout(new GridLayout(4,3));


        JButton b1 = new JButton(Model.B1);
        JButton b2 = new JButton(Model.B2);
        JButton b3 = new JButton(Model.B3);
        JButton b4 = new JButton(Model.B4);
        JButton b5 = new JButton(Model.B5);
        JButton b6 = new JButton(Model.B6);
        JButton b7 = new JButton(Model.B7);
        JButton b8 = new JButton(Model.B8);
        JButton b9 = new JButton(Model.B8);
        JButton point = new JButton(Model.POINT);
        JButton b0 = new JButton(Model.B0);

        JButton [] numbersArray= {b1,b2,b3,b4,b5,b6,b7,b8,b9,point,b0};


     for (JButton button:numbersArray) {
       button.addActionListener(new NumbersListener(button,input));

     }

       JButton doubleButton=new JButton(Model.DOUBLE_BUTTON);

     doubleButton.addActionListener(e -> {
         input.setText(String.valueOf(Double.parseDouble(input.getText())*2));
     });

        JButton gram = new JButton(String.valueOf(Materials.gram));
        gram.addActionListener(new Controller(gram,input,comboBoxMaterials));
        JButton cup = new JButton(String.valueOf(Materials.cup));
        cup.addActionListener(new Controller(cup,input,comboBoxMaterials));
        JButton mil = new JButton(String.valueOf(Materials.mil));
        mil.addActionListener(new Controller(mil,input,comboBoxMaterials));
        JButton spoon = new JButton(String.valueOf(Materials.spoon));
        spoon.addActionListener(new Controller(spoon,input,comboBoxMaterials));
        JButton bag = new JButton(String.valueOf(Materials.bag));
        bag.addActionListener(new Controller(bag,input,comboBoxMaterials));


        JPanel resultPanel=new JPanel();
        JButton clear=new JButton(Model.CLEAR_BUTTON);
        clear.addActionListener(e->{
         this.input.setText(null);
        });
        resultPanel.add(clear);
        add(resultPanel, BorderLayout.SOUTH);

     JPanel materials =new JPanel();
     materials.setPreferredSize(new Dimension(Model.MATERIALS_PANEL_WIDTH,Model.MATERIALS_PANEL_HEIGHT));
     materials.setLayout(new GridLayout(5,1));
     materials.add(gram);
     materials.add(cup);
     materials.add(mil);
     materials.add(spoon);
     materials.add(bag);

     add(materials,BorderLayout.EAST);

     add(inputPanel,BorderLayout.NORTH);
     numbers.add(b7);
     numbers.add(b8);
     numbers.add(b9);
     numbers.add(b4);
     numbers.add(b5);
     numbers.add(b6);
     numbers.add(b1);
     numbers.add(b2);
     numbers.add(b3);
     numbers.add(doubleButton);
     numbers.add(b0);
     numbers.add(point);

     add(numbers,BorderLayout.CENTER);

     this.setPreferredSize(new Dimension(Model.CALCULATOR_PANEL_WIDTH, Model.CALCULATOR_PANEL_HEIGHT));

    }



}
