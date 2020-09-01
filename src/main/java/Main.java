import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    private static SimpleDateFormat formatter = new SimpleDateFormat(
            "yyyyMMdd_HHmmss");

    public void robo() throws AWTException, IOException {

        Calendar now = Calendar.getInstance();
        Robot robot = new Robot();
        BufferedImage image =
                robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "JPG", new File("C:/Users/alexx/Pictures" +
                "/Saved Pictures" + formatter.format(now.getTime()) + ".jpg"));
        System.out.println(image.getWidth() + "x" + image.getHeight());

    }

    public static void main(String[] args) throws Exception {

        Date date = new Date();
        System.out.println(formatter.format(date));

        Main s2i = new Main();
        while (true) {
            s2i.robo();
            Thread.sleep(10000);
        }
    }
}
