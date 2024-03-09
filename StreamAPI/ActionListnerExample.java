package StreamAPI;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class ActionListnerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Change Color on Click");

        JButton button = new JButton("Click me");
        button.setBounds(100, 50, 100, 30); // Set the position and size of the button
        button.addActionListener((ActionEvent e) -> {
            // Change the background color to a random color on button click
            frame.getContentPane().setBackground(getRandomColor());
        });

        frame.setLayout(null); // Using null layout for simplicity
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private static Color getRandomColor() {
        // Generate random RGB values for a new color
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);

        return new Color(red, green, blue);
    }
}
