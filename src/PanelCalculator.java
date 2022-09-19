import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.text.Document;

public class PanelCalculator  extends JPanel {
   private   JTextField input;
   private JComboBox comboBoxMaterials;
   private Materials current;

   public PanelCalculator() {
        this.setLayout(new BorderLayout());
        this.setBackground(Color.MAGENTA);

       input =new JTextField();
       input.setPreferredSize(new Dimension(900,60));
       comboBoxMaterials=new JComboBox(Materials.values());
       comboBoxMaterials.addActionListener(new ComboListener());

        JPanel inputPanel= new JPanel();
        inputPanel.add(input);
        inputPanel.add(comboBoxMaterials);
        JPanel numbers= new JPanel();
        numbers.setLayout(new GridLayout(4,3));


        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        JButton point = new JButton(".");
        JButton zeroNumber = new JButton("0");

        JButton [] numbersArray= {b1,b2,b3,b4,b5,b6,b7,b8,b9,point,zeroNumber};


     for (JButton button:numbersArray) {
       button.addActionListener(new NumbersListener(button,input));

     }


        JButton doubleButton=new JButton("X");

        JButton gram = new JButton("Gram");
        gram.addActionListener(e->{

            double currentInput=Integer.parseInt(input.getText());
            switch (current){
                case gram:
                    input.setText("it is the same amount!");
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


        });
        JButton cup = new JButton("Cup");
        JButton mil = new JButton("Mil");
        JButton spoon = new JButton("Spoon");
        JButton bag = new JButton("Bag");

        JButton [] materialsArray={gram,cup,mil,spoon,bag};

        JPanel resultPanel=new JPanel();
        JButton clear=new JButton("Clear");
        clear.addActionListener(e->{
         this.input.setText(null);
        });
        resultPanel.add(clear);
        add(resultPanel, BorderLayout.SOUTH);

     JPanel materials =new JPanel();
     materials.setPreferredSize(new Dimension(300,600));
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
     numbers.add(zeroNumber);
     numbers.add(point);

     add(numbers,BorderLayout.CENTER);




        this.setPreferredSize(new Dimension(1000, 700));


    }
    private class ComboListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            current=Materials.values()[comboBoxMaterials.getSelectedIndex()];
        }
    }

}
