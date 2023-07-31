import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Label;
public class rockpaperscissors
{

    public static void main(String[] args) {
        Random rand = new Random();
        final  int  computer_choice = rand.nextInt(4);//rock-1 paper-2 scissors-3
        JFrame f=new JFrame("Rock Paper Scissors Game");
        final JTextField restf=new JTextField();
        restf.setBounds(100,250, 120,30);
        JButton b1=new JButton("rock");
        b1.setBounds(50,100,95,30);
        JButton b2=new JButton("paper");
        b2.setBounds(150,100,95,30);
        JButton b3=new JButton("scissors");
        b3.setBounds(250,100,95,30);
        Label comp_ch_label = new Label ("Computer choice:");
        comp_ch_label.setBounds(10,150,155,30);
        Label user_ch_label = new Label ("Select  your choice:");
        user_ch_label.setBounds(10,50,195,30);
        final JTextField compf = new JTextField();
        compf.setBounds(175,150,105,30);
        Label res_label = new Label ("result:");
        res_label.setBounds(10,250,155,30);
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if( computer_choice == 1) {
                    compf.setText("rock");
                    restf.setText("It's a draw");
                }
                else if( computer_choice == 3) {
                    compf.setText("scissors");
                    restf.setText("You won");
                }
                else {
                    compf.setText("paper");
                    restf.setText("Sorry, You lost");
                }
            } });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if( computer_choice == 2) {
                    compf.setText("paper");
                    restf.setText("It's a draw");
                }
                else if(computer_choice == 1 ) {
                    compf.setText("rock");
                    restf.setText("You won");
                }
                else {
                    compf.setText("scissors");
                    restf.setText("Sorry, You lost");
                }
            } }     );
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){

                if( computer_choice == 3) {
                    compf.setText("scissors");
                    restf.setText("It's a draw");
                }
                else if( computer_choice == 2 ) {
                    compf.setText("paper");
                    restf.setText("You won");
                }
                else {
                    compf.setText("rock");
                    restf.setText("Sorry, You lost");
                }
            } });

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(restf);
        f.add(comp_ch_label);
        f.add(user_ch_label);
        f.add(compf);
        f.add(res_label);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
