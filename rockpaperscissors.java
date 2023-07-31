import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
public class rockpaperscissors
{
	public static void main(String[] args) {
	    Random rand = new Random();
	 final  int  computer_choice = rand.nextInt(4);//rock-1 paper-2 scissors-3
	JFrame f=new JFrame("Rock Paper Scissors Game");
    final JTextField restf=new JTextField();
    restf.setBounds(150,150, 150,20);
    JButton b1=new JButton("rock");
    b1.setBounds(50,100,95,30);
    JButton b2=new JButton("paper");
    b2.setBounds(150,100,95,30);
    JButton b3=new JButton("scissors");
    b3.setBounds(250,100,95,30);
    b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
            if( computer_choice == 1)
            restf.setText("It's a draw");
       else if( computer_choice == 3)
        restf.setText("You won");
        else
        restf.setText("Sorry, You lost");
        } });
         b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
          if( computer_choice == 2)
            restf.setText("It's a draw");
       else if(computer_choice == 1 )
        restf.setText("You won");
        else
        restf.setText("Sorry, You lost");
        } }     );
         b3.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
             if( computer_choice == 3)
            restf.setText("It's a draw");
       else if( computer_choice == 2 )
        restf.setText("You won");
        else
        restf.setText("Sorry, You lost");
        } });

    f.add(b1);
    f.add(b2);
    f.add(b3);f.add(restf);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
	}

}
