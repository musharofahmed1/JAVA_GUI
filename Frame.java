//package BroCode;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Bro Code");
        frame.setSize(400, 300); // Set the size of the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application when the frame is closed
        frame.setVisible(true); // Make the frame visible

        frame.getContentPane().setBackground(Color.PINK);
    }
}
