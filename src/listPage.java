import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
import java.util.*;
public class listPage implements ActionListener{
            
            private JTextArea textArea;
            private JFrame listFrame = new JFrame("Welcome to review list page");
            private JTextField usernameListField;
            private JButton listButton;
            
            private String listUser;
            private String reviewString = "";
            listPage(){
            
           listFrame.setLayout(new FlowLayout());
           listFrame.setPreferredSize(new Dimension(700, 500));
           usernameListField = new JTextField();
            usernameListField.setPreferredSize(new Dimension(250, 40));
            textArea = new JTextArea();
            textArea.setPreferredSize(new Dimension(500, 300));
            listButton = new JButton("Enter", null);
            listButton.addActionListener(this);
           listFrame.add(usernameListField);
           listFrame.add(listButton);
           listFrame.add(textArea);
            listFrame.setLocationRelativeTo(null);
           listFrame.pack();
           listFrame.setVisible(true);

        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == listButton){
                listUser = usernameListField.getText();
                usernameListField.setText("");
                }
            if(userMap.getUserMap().containsKey(listUser)){
                
                for(int i = 0; i <= userMap.getUserMap().get(listUser).size() - 1; i++){
                    reviewString += userMap.getUserMap().get(listUser).get(i).reviewtoString();
                    
                    reviewString += " ";
                }
                System.out.println(reviewString);
                textArea.setText(reviewString);
                listUser = "";
                reviewString = "";
                listFrame.setVisible(true);
                //new issue the "review" string is the same for all reviews across dey board


            }
        


    }
}