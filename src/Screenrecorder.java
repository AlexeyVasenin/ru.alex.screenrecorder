import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Screenrecorder extends JFrame {
    private JPanel panel1;
    private JButton recordingButton;
    private JButton stopButton;
    private JButton openFolderButton;

    public Screenrecorder() {
        this.getContentPane().add(panel1);
        recordingButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Record record = new Record();
                try {
                    while (true) {
                        record.screenRecorder();
                        Thread.sleep(1000);
                    }

                } catch (AWTException awtException) {
                    awtException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }

            }
        });
        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Record record = new Record();
                try {
                    record.screenRecorder();
                } catch (AWTException awtException) {
                    awtException.printStackTrace();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        });
    }
}
