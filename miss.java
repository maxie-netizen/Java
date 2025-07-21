import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MissYou {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Miss You");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("I missed you!");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setForeground(Color.decode("#FF69B4")); // Pink color

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // Animate the text color
        Timer timer = new Timer(1000, new ActionListener() {
            int count = 0;
            Color[] colors = {Color.decode("#FF69B4"), Color.decode("#33CC33"), Color.decode("#6666FF")};

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setForeground(colors[count % colors.length]);
                count++;
            }
        });
        timer.start();
    }
          }
