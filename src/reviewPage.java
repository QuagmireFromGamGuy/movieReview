

import java.util.*;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.*;
public class reviewPage implements ActionListener{
            public userMap userHashMap = new userMap();
            review inputReview;
            JFrame reviewFrame = new JFrame("Welcome to review page");
            static JTextField userField;
            static JTextField scoreField;
            static JTextField reviewField;
            static JTextField movieField;
            JLabel userLabel;
            JLabel movieLabel;
            JLabel scoreLabel;
            JLabel revLabel;
            String usernameInput;
            String movieNameInput;
            String scoreInput;
            static String reviewInput;
            JButton enterButton;
            reviewPage(){
                userField = new JTextField(); 
                userField.setPreferredSize(new Dimension(300, 40));
                movieField = new JTextField(); 
                movieField.setPreferredSize(new Dimension(300, 40));
                scoreField = new JTextField(); 
                scoreField.setPreferredSize(new Dimension(300, 40));
                reviewField = new JTextField(); 
                reviewField.setPreferredSize(new Dimension(300, 40));
                enterButton = new JButton("Enter", null);
                enterButton.addActionListener(this);
                
                reviewFrame.setLayout(new FlowLayout());
                reviewFrame.setPreferredSize(new Dimension(500, 300));
                reviewFrame.setLocationRelativeTo(null);
                //enterButton.setHorizontalAlignment();
                reviewFrame.add(enterButton);

                userLabel = new JLabel("Username");
                movieLabel = new JLabel("Movie Name");
                scoreLabel = new JLabel("Score(0.0-5.0)");
                revLabel = new JLabel("Optional Review");
                //reviewFrame.add(userLabel);
                
                //reviewFrame.add(movieLabel);
                
                //reviewFrame.add(scoreLabel);
                
                //reviewFrame.add(revLabel);
              
               reviewFrame.add(userField);
               reviewFrame.add(movieField);
               reviewFrame.add(scoreField);
               reviewFrame.add(reviewField);
                
                
                
                
                
                
                
                
                reviewFrame.pack();
                //enterButton.setLocation(0,0);
                reviewFrame.setVisible(true);

        }
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == enterButton){
                
                
                usernameInput = userField.getText();
                movieNameInput = movieField.getText();
                scoreInput = scoreField.getText();
                reviewInput = reviewField.getText();
                userField.setText("");
                movieField.setText("");
                scoreField.setText("");
                reviewField.setText("");
            
                
            }
            if(usernameInput.equals("") || !(scoreInput.indexOf(".") == 1) || Double.parseDouble(scoreInput) > 5.0 || Double.parseDouble(scoreInput) < 0.0 || movieNameInput.equals("")){
                JLabel invalidInput = new JLabel("Invalid input: Make sure you entered User/Moviename or use correct score constraints");
                reviewFrame.add(invalidInput);
                reviewFrame.setVisible(true);
            } else if(reviewInput.equals("")){
                 inputReview = new review(usernameInput, movieNameInput, Double.parseDouble(scoreInput));

            } else{
                 inputReview = new review(usernameInput,movieNameInput, Double.parseDouble(scoreInput), reviewInput);
            }
            if(userHashMap.getUserMap().containsKey(usernameInput)){
                ArrayList<review> userReviewList = new ArrayList<>(userHashMap.getUserMap().get(usernameInput));
                userReviewList.add(inputReview);
                userHashMap.getUserMap().put(usernameInput, userReviewList);
            } else{
                ArrayList<review> userReviewList = new ArrayList<>();
                userReviewList.add(inputReview);
                userHashMap.getUserMap().put(usernameInput, userReviewList);
            }
            
           
        


    }
}
