import animals.*;

import javax.swing.*;

public class Zooapp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zoológico Virtual");
        JPanel panel = new JPanel();
        
        JLabel descriptionLabel = new JLabel("Escolha um animal para ver suas ações!");
        panel.add(descriptionLabel);

        JButton tigerButton = new JButton("Tigre");
        JButton dolphinButton = new JButton("Golfinho");
        JButton penguinButton = new JButton("Pinguim");

        tigerButton.addActionListener(e -> {
            Tiger tiger = new Tiger();
            StringBuilder info = new StringBuilder();
            info.append(tiger.displayCharacteristics()).append("<br>");
            info.append(tiger.eat()).append("<br>");
            info.append(tiger.walk()).append("<br>");
            
            descriptionLabel.setText("<html>" + info.toString() + "</html>");
        });

        dolphinButton.addActionListener(e -> {
            Dolphin dolphin = new Dolphin();
            StringBuilder info = new StringBuilder();
            info.append(dolphin.displayCharacteristics()).append("<br>");
            info.append(dolphin.eat()).append("<br>");
            info.append(dolphin.swim()).append("<br>");
            
            descriptionLabel.setText("<html>" + info.toString() + "</html>");
        });

        penguinButton.addActionListener(e -> {
            Penguin penguin = new Penguin();
            StringBuilder info = new StringBuilder();
            info.append(penguin.displayCharacteristics()).append("<br>");
            info.append(penguin.eat()).append("<br>");
            info.append(penguin.walk()).append("<br>");
            
            descriptionLabel.setText("<html>" + info.toString() + "</html>");
        });

        panel.add(tigerButton);
        panel.add(dolphinButton);
        panel.add(penguinButton);

        frame.add(panel);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
