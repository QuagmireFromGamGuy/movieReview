import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;


public class moviereview extends JFrame implements ActionListener{
    JButton button;
    JTextField textfield;
    static String userInput;
    JFrame frame;
    moviereview(){
        //make frame panel and shi
        frame = new JFrame("Movie Review App", null);
        button = new JButton("Enter", null);
        button.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.setPreferredSize(new Dimension(500, 200));
        textfield = new JTextField(); 
        textfield.setPreferredSize(new Dimension(250, 40));
        JLabel label1 = new JLabel("Welcome to start menu list of commands are as follows:");
        JLabel writeReview = new JLabel("To write review enter in textfield *writeReview");
        JLabel returnReviews = new JLabel("To return reviews enter in textfield *listReviews");

        
        frame.add(button);
        frame.add(textfield);
        frame.add(label1);
        frame.add(writeReview);
        frame.add(returnReviews);
      
        //frame.add(panel, BorderLayout.CENTER);
        
        
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == button){
            userInput = textfield.getText();
            textfield.setText("");
            
            
        
            
        }
        if(userInput.equals("*writeReview")){
                new reviewPage();
                
                //review glizzy = new review("Glizzo", 3.9);
                //System.out.println(glizzy.toString());

            } else if(userInput.equals("*listReviews")){
                new listPage();

            }

    }
    
    
    public static void main(String[] args) throws Exception {
        
        new moviereview();
        
    }
}
