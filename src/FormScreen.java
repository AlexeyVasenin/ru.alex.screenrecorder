import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class FormScreen extends JFrame {
    private JPanel panel1;
    private JButton recordingButton;
    private JButton stopButton;

    public FormScreen() {
        this.getContentPane().add(panel1);

        recordingButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Record record = new Record();
                record.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            System.exit(0);

            }
        });
    }
}
