package lesson28_Swing_part_03;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {
    private static MainForm mainWindow;
    private static BufferedImage image;

    public static void main(String[] args) {
        mainWindow = new MainForm(500, 500);
    }

    static void setImage(URL url) {
        try {
            image = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setImage(File file) {
        try {
            image = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveImage(File file, String format) {
        try {
            ImageIO.write(image, format, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static BufferedImage getImage() {
        return image;
    }

    public static void setImage(BufferedImage image) {
        Main.image = image;
    }

    public static MainForm getMainWindow() {
        return mainWindow;
    }

    public static void setMainWindow(MainForm mainWindow) {
        Main.mainWindow = mainWindow;
    }

}
