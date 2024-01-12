import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class ticTacToe {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Label");
        Random random = new Random();
        JPanel title_panel = new JPanel();
        JPanel button_panel = new JPanel();
        JLabel textfield = new JLabel();
        JButton[] buttons = new JButton[9];
        boolean playerXTurn = true;
        int screenWidth = 800;
        int screenHeight = 600;
    public ticTacToe(){
        frame.add(label, BorderLayout.NORTH);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        for(int i=0;i<9;i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            frame.add(buttons[i]);
//            buttons[i].addActionListener(this);
        }

        panel.setLayout(new FlowLayout());
        frame.add(panel);
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        label.setVerticalAlignment(SwingConstants.CENTER);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(25,25,25));
        frame.setBackground(new Color(25,25,25));
        frame.setForeground(new Color(25,25,25));
//        frame.setResizable(false);

        changePlayer();
    }
    private void changePlayer(){
        if (playerXTurn == true){
            playerXTurn = false;
            label.setText("O's turn");
      }else{
            playerXTurn = true;
            label.setText("X's turn");
        }
    }
}
