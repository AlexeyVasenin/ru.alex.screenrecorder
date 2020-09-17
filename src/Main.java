import java.awt.*;

public class Main {

    public static void main(String[] args) throws Exception {
        FormScreen form = new FormScreen();
        form.pack();
        form.setResizable(false);
        form.setSize(new Dimension(200,100));
        form.setVisible(true);
    }
}
