import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        //TODO: 20200831_175809
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd " +
                "HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        //TODO: получить скриншот экрана в переменную image
        BufferedImage image = null;
        System.out.println(image.getWidth() + "x" + image.getHeight());
    }
}
