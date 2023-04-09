import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class DonkeyKong {

	private static int width = 1040;
    private static int height = 1040;
    
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    static Color brown = new Color(135,62,35);
    static Color skin = new Color(234,182,118);
    static Color black = Color.black;
    static Color yellow = Color.yellow;
    static Color white = Color.white;
    static Color red = Color.red;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, Color.white);  
    	drawHorizontalLine(15, 22, 1, black); 
    	drawHorizontalLine(14, 23, 2, black); drawHorizontalLine(15, 22, 2, brown);
    	drawHorizontalLine(13, 22, 3, black); drawHorizontalLine(14, 21, 3, brown);
    	drawHorizontalLine(8, 21, 4, black); drawHorizontalLine(13, 16, 4, brown);
    	drawHorizontalLine(7, 22, 5, black); drawHorizontalLine(8, 11, 5, brown); drawHorizontalLine(13, 14, 5, brown); 
    	drawHorizontalLine(6, 21, 6, black); drawHorizontalLine(7, 10, 6, brown); drawHorizontalLine(13, 14, 6, brown);
    	drawHorizontalLine(5, 21, 7, black); drawHorizontalLine(6, 10, 7, brown); drawHorizontalLine(14, 15, 7, brown);
    	drawHorizontalLine(4, 22, 8, black); drawHorizontalLine(5, 10, 8, brown); 
    	drawHorizontalLine(3, 23, 9, black); drawHorizontalLine(4, 11, 9, brown);
    	drawHorizontalLine(3, 24, 10, black); drawHorizontalLine(4, 12, 10, brown);
    	drawHorizontalLine(3, 23, 11, black); drawHorizontalLine(4, 7, 11, brown); drawHorizontalLine(9, 9, 11, brown); drawHorizontalLine(11, 12, 11, brown);
    	drawHorizontalLine(3, 22, 12, black); drawHorizontalLine(4, 8, 12, brown); drawHorizontalLine(10, 11, 12, brown);
    	drawHorizontalLine(2, 21, 13, black); drawHorizontalLine(4, 8, 13, brown);
    	drawHorizontalLine(1, 21, 14, black); drawHorizontalLine(5, 9, 14, brown); drawHorizontalLine(2, 2, 14, brown); drawHorizontalLine(18, 20, 14, brown);
    	drawHorizontalLine(1, 22, 15, black); drawHorizontalLine(5, 10, 15, brown); drawHorizontalLine(2, 3, 15, brown); drawHorizontalLine(19, 21, 15, brown);
    	drawHorizontalLine(1, 23, 16, black); drawHorizontalLine(6, 11, 16, brown); drawHorizontalLine(2, 4, 16, brown); drawHorizontalLine(19, 22, 16, brown);
    	drawHorizontalLine(1, 23, 17, black); drawHorizontalLine(7, 11, 17, brown); drawHorizontalLine(2, 5, 17, brown); drawHorizontalLine(19, 22, 17, brown);
    	drawHorizontalLine(2, 24, 18, black); drawHorizontalLine(8, 9, 18, brown); drawHorizontalLine(3, 6, 18, brown); drawHorizontalLine(20, 21, 18, brown);
    	drawHorizontalLine(3, 24, 19, black); drawHorizontalLine(4, 6, 19, brown); drawHorizontalLine(4, 6, 19, brown);
    	drawHorizontalLine(2, 17, 20, black); drawHorizontalLine(3, 6, 20, brown); drawHorizontalLine(15, 15, 20, brown);
    	drawHorizontalLine(2, 16, 21, black); drawHorizontalLine(14, 14, 21, brown);
    	drawHorizontalLine(2, 17, 22, black);
    	drawHorizontalLine(3, 17, 23, black);
    	drawHorizontalLine(7, 12, 24, black); drawHorizontalLine(13, 17, 24, black); drawHorizontalLine(3, 6, 24, black);
    	drawHorizontalLine(7, 12, 25, black); drawHorizontalLine(20, 23, 25, black);
    	drawHorizontalLine(20, 20, 24, black); drawHorizontalLine(24, 24, 24, black);
    	drawHorizontalLine(19, 21, 23, black); drawHorizontalLine(24, 24, 23, black);
    	drawHorizontalLine(19, 19, 22, black); drawHorizontalLine(24, 24, 22, black); drawHorizontalLine(21, 21, 22, black);
    	drawHorizontalLine(19, 19, 21, black); drawHorizontalLine(24, 24, 21, black);
    	drawHorizontalLine(19, 20, 20, black); drawHorizontalLine(24, 24, 20, black);
    	drawHorizontalLine(16, 20, 4, skin);
    	drawHorizontalLine(15, 15, 5, skin); drawHorizontalLine(19, 19, 5, skin);
    	drawHorizontalLine(12, 12, 6, skin); drawHorizontalLine(15, 16, 6, skin);
    	drawHorizontalLine(12, 13, 7, skin); drawHorizontalLine(16, 16, 7, skin); drawHorizontalLine(19, 19, 7, skin);
    	drawHorizontalLine(12, 18, 8, skin); drawHorizontalLine(20, 20, 8, skin);
    	drawHorizontalLine(14, 22, 9, skin);
    	drawHorizontalLine(14, 14, 10, skin); drawHorizontalLine(17, 23, 10, skin);
    	drawHorizontalLine(14, 16, 11, skin);
    	drawHorizontalLine(12, 12, 12, skin); drawHorizontalLine(15, 21, 12, skin);
    	drawHorizontalLine(10, 13, 13, skin);
    	drawHorizontalLine(11, 14, 14, skin);
    	drawHorizontalLine(12, 14, 15, skin);
    	drawHorizontalLine(13, 14, 16, skin);
    	drawHorizontalLine(14, 14, 17, skin); 
    	drawHorizontalLine(14, 14, 18, skin); drawHorizontalLine(22, 23, 18, skin);
    	drawHorizontalLine(11, 12, 19, skin); drawHorizontalLine(14, 14, 19, skin); drawHorizontalLine(21, 23, 19, skin);
    	drawHorizontalLine(8, 13, 20, skin); drawHorizontalLine(21, 23, 20, skin);
    	drawHorizontalLine(8, 13, 21, skin); drawHorizontalLine(20, 23, 21, skin);
    	drawHorizontalLine(3, 6, 22, skin); drawHorizontalLine(8, 12, 22, skin); drawHorizontalLine(14, 14, 22, skin); drawHorizontalLine(20, 20, 22, skin); drawHorizontalLine(22, 23, 22, skin);
    	drawHorizontalLine(4, 6, 23, skin); drawHorizontalLine(9, 12, 23, skin); drawHorizontalLine(14, 16, 23, skin); drawHorizontalLine(22, 23, 23, skin);
    	drawHorizontalLine(8, 12, 24, skin); drawHorizontalLine(21, 23, 24, skin);
    	drawHorizontalLine(17, 17, 6, white); drawHorizontalLine(20, 20, 6, white);
    	drawHorizontalLine(17, 17, 7, white); drawHorizontalLine(20, 20, 7, white);
    	drawHorizontalLine(16, 17, 14, red);
    	drawHorizontalLine(16, 18, 15, red);
    	drawHorizontalLine(16, 18, 16, red);
    	drawHorizontalLine(18, 18, 17, red); drawHorizontalLine(16, 17, 17, yellow);
    	drawHorizontalLine(17, 17, 18, red); drawHorizontalLine(16, 16, 18, yellow); drawHorizontalLine(18, 18, 18, yellow);
    	drawHorizontalLine(16, 18, 19, red);
    	drawHorizontalLine(17, 18, 20, black);
    	
    	drawSquareGrid(PIXEL_SIZE, Color.black);
    	try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void drawHorizontalLine(int a, int b, int y, Color c){
    	g.setColor(c);
        for(int i=a;i<=b;i++){
        	 putPixel(i, y, c);
        }
    }
    
    private static void putPixel(int x, int y, Color c){       
	   g.setColor(c);
	   g.fillRect(x * PIXEL_SIZE, y * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);    
    }
    
    private static void drawSquareGrid(int size, Color c) {
    	g.setColor(c);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) { 
                g.drawRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);
            }
        }
    }
    private static void drawBackground(int size, Color c) {
    	g.setColor(c);
    	for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                g.fillRect(i * PIXEL_SIZE, j * PIXEL_SIZE, PIXEL_SIZE, PIXEL_SIZE);                
            }
        }
    }    
    
    public static void main(String[] args) {
        g = image.createGraphics();        
        paint();
    }
}
