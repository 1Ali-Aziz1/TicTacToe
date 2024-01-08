import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class ticTacToe {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Label");
    public ticTacToe(){
        panel.setLayout(new FlowLayout());
        frame.add(panel);
        frame.add(label);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(25,25,25));
        frame.setBackground(new Color(25,25,25));
        frame.setForeground(new Color(25,25,25));
        frame.setResizable(false);

    }
}
