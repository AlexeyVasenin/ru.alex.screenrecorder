import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws Exception {
        Screenrecorder screenrecorder = new Screenrecorder();
        screenrecorder.pack();
        screenrecorder.setSize(new Dimension(200, 200));
        screenrecorder.setVisible(true);
    }
}
