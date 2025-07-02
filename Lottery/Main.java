import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main extends JPanel {
    private Theme manager;

    public Main(Theme theme) {
        this.manager = theme;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // State Manager
        ImageIcon logo = manager.getImageIcon();
        Color c = manager.getColor();
        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
        g.setColor(c);

        // Border
        g.fillRect(0, 0, 500, 50);
        g.fillRect(0, 0, 50, 700);
        g.fillRect(0, 650, 500, 50);
        g.fillRect(450, 0, 50, 700);
        g.fillOval(0, 0, 150, 150);
        g.fillOval(350, 550, 150, 150);
        g.drawImage(logo.getImage(), 0, 0, 150, 150, null);
        g.drawImage(logo.getImage(), 350, 550, 150, 150, null);
        
        // Disclaimer
        g.setColor(new Color(255 - red, 255 - green, 255 - blue));
        g.setFont(new Font("BiauKai", Font.BOLD, 15));
        g.drawString("For Entertainment Purposes - Not Real", 90, 690);

        // Intro
        g.setColor(new Color(245, 175, 12));
        g.setFont(new Font("BiauKai", Font.BOLD, 25));
        g.drawString("Your Numbers Are: ", 160, 90);
        
        // Number Size
        g.setFont(new Font("BiauKai", Font.BOLD, 40));

        // Numbers
        for (int i = 150; i <= 450; i += 150) {
            g.setColor(Color.BLACK);
            g.drawRect(200, i + 20, 100, 100);
            g.setColor(new Color(245, 175, 12));
            g.drawString(("" + (int) (Math.random() * 101)), 210, i + 90);
        }
    }

    public static void main(String[] args) {
        // Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter State: ");
        String input = scan.nextLine().toUpperCase().replaceAll("\\s", "");
        Theme manager = new Theme(input);

        // GUI setup
        JFrame frame = new JFrame("Lottery");
        frame.setSize(500, 700);
        frame.setLocation(0, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Main(manager));
        frame.setVisible(true);
    }
}
