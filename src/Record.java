import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Record extends Thread {

    private static final SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyyMMdd_HHmmss");

    public void run() {
        while (true) {
            Calendar now = Calendar.getInstance();
            Robot robot = null;
            try {
                robot = new Robot();
            } catch (AWTException e) {
                e.printStackTrace();
            }

            BufferedImage image =
                    robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            try {
                ImageIO.write(image, "PNG", new File("C:/Users/alexx/Desktop" +
                        "/Doc/screen/" + formatter.format(now.getTime()) +
                        ".png"
                ));
            } catch (IOException e) {
                e.printStackTrace();
            }
            //System.out.println(image.getWidth() + "x" + image.getHeight());
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
