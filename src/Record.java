import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Record {

    private static SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyyMMdd_HHmmss");

    public void screenRecorder() throws AWTException, IOException,
            InterruptedException {

        Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage image =
                robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "PNG", new File("C:\\Users\\vasenin_ak\\Desktop" +
                "\\ScreenDesctop\\" + formatter.format(now.getTime()) + ".png"
        ));
        System.out.println(image.getWidth() + "x" + image.getHeight());
        }
}

