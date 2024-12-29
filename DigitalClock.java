import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DigitalClock extends JFrame {
    private JLabel timeLabel;
    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 36));
        add(timeLabel, BorderLayout.CENTER);
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();
        setVisible(true);
    }
    private void updateClock() {
        String currentTime = new SimpleDateFormat("hh:mm:ss a").format(new Date());
        timeLabel.setText(currentTime);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DigitalClock::new);
    }
}
