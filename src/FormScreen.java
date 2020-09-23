import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class FormScreen extends JFrame {
    private JPanel panel1;
    private JButton recordingButton;
    private JButton stopButton;
    private JButton ok;
    private JComboBox comboBox1;
    final Record record = new Record();


    public FormScreen()
    {

        this.getContentPane().add(panel1);

        recordingButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                record.start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });


        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String second = (String) comboBox1.getSelectedItem();
                record.setSecondRecord(Integer.parseInt(second));
            }
        });
    }
}
