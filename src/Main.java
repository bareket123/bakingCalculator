import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public static void main(String[] args) {
       new Main();


    }
    public Main(){
        this.setBackground(Color.blue);
        //this.setSize(new Dimension(1000,700));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //this.setResizable(false);
        this.setVisible(true);
        PanelCalculator panelCalculator = new PanelCalculator();
       this.getContentPane().add(panelCalculator);
      this.pack();
    }
}
