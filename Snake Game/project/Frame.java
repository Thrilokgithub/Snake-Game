import javax.swing.JFrame;

public class Frame extends JFrame{
    Frame(){
        this.setTitle("SnakeGame");
        this.add(new Panel());
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        this.setResizable(false);
        this.pack();


    }
}