import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Jupiter {

	private static int width = 1240;
    private static int height = 1760;
    
    private static int PIXEL_SIZE = 40;
    private static Graphics2D g;
    
    static Color night = new Color(11, 15, 53);
    static Color gray = new Color(131,104,88);
    static Color stars = new Color(187, 187, 187);
    static Color yellow = new Color(175,151,116);
    static Color white = Color.white;
    
    static BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
    
    public static void paint() {
    	drawBackground(PIXEL_SIZE, night);
    	drawVerticalLine(1, 38, 0, gray); drawVerticalLine(1, 38, 30, gray);
    	drawHorizontalLine(1, 29, 0, gray); drawHorizontalLine(1, 29, 39, gray);
    	drawHorizontalLine(0, 0, 0, white); drawHorizontalLine(30, 30, 0, white);
    	drawHorizontalLine(0, 0, 39, white); drawHorizontalLine(30, 30, 39, white);
    	drawHorizontalLine(2, 2, 2, stars); drawHorizontalLine(28, 28, 2, stars);
    	drawHorizontalLine(22, 22, 4, stars); drawHorizontalLine(21, 23, 5, stars); drawHorizontalLine(22, 22, 6, stars);
    	drawHorizontalLine(6, 7, 5, gray);
    	drawHorizontalLine(5, 5, 6, gray); drawHorizontalLine(6, 8, 6, yellow); drawHorizontalLine(9, 11, 6, gray);
    	drawHorizontalLine(5, 6, 7, yellow); drawHorizontalLine(7, 7, 7, gray); drawHorizontalLine(9, 15, 7, gray);
    	drawHorizontalLine(5, 5, 8, gray); drawHorizontalLine(6, 6, 8, yellow); drawHorizontalLine(8, 12, 8, yellow); drawHorizontalLine(13, 17, 8, gray);
    	drawHorizontalLine(6, 15, 9, yellow); drawHorizontalLine(7, 7, 9, gray); drawHorizontalLine(16, 20, 9, gray);
    	drawHorizontalLine(6, 21, 10, gray); drawHorizontalLine(7, 7, 10, yellow); drawHorizontalLine(9, 12, 10, yellow); drawHorizontalLine(17, 17, 10, yellow);
    	drawHorizontalLine(7, 12, 11, gray); drawHorizontalLine(9, 11, 11, yellow); drawHorizontalLine(18, 21, 11, gray); drawHorizontalLine(19, 19, 11, yellow);
    	drawHorizontalLine(8, 12, 12, gray); drawHorizontalLine(11, 11, 12, yellow);
    	drawHorizontalLine(9, 13, 13, gray); drawHorizontalLine(12, 12, 13, yellow);
    	drawHorizontalLine(10, 14, 14, gray); drawHorizontalLine(13, 13, 14, yellow);
    	drawHorizontalLine(11, 15, 15, gray); drawHorizontalLine(14, 14, 15, yellow);
    	drawHorizontalLine(12, 16, 16, gray); drawHorizontalLine(15, 15, 16, yellow);
    	drawHorizontalLine(13, 16, 17, gray); drawHorizontalLine(14, 14, 17, yellow); drawHorizontalLine(16, 16, 17, yellow);
    	drawHorizontalLine(14, 16, 18, gray); drawHorizontalLine(15, 15, 18, yellow); drawHorizontalLine(16, 16, 19, gray);
    	drawVerticalLine(9, 33, 29, yellow); drawVerticalLine(9, 9, 29, gray); drawVerticalLine(13, 14, 29, stars); drawVerticalLine(20, 20, 29, gray); drawVerticalLine(24, 25, 29, gray); drawVerticalLine(28, 28, 29, gray); drawVerticalLine(33, 33, 29, gray);
    	drawVerticalLine(9, 33, 28, yellow); drawVerticalLine(11, 13, 28, stars); drawVerticalLine(20, 20, 28, gray); drawVerticalLine(24, 25, 28, gray); drawVerticalLine(33, 33, 28, gray);
    	drawVerticalLine(9, 33, 27, yellow); drawVerticalLine(10, 11, 27, stars); drawVerticalLine(19, 19, 27, gray); drawVerticalLine(23, 24, 27, gray); drawVerticalLine(32, 33, 27, gray);
    	drawVerticalLine(9, 32, 26, yellow); drawVerticalLine(10, 11, 26, stars); drawVerticalLine(23, 24, 26, gray); drawVerticalLine(32, 32, 26, gray);
    	drawVerticalLine(9, 32, 25, yellow); drawVerticalLine(9, 9, 25, gray); drawVerticalLine(10, 10, 25, stars); drawVerticalLine(19, 19, 25, stars); drawVerticalLine(22, 23, 25, gray); drawVerticalLine(32, 32, 25, gray);
    	drawVerticalLine(10, 32, 24, yellow); drawVerticalLine(16, 16, 24, gray); drawVerticalLine(22, 22, 24, gray); drawVerticalLine(28, 28, 24, gray); drawVerticalLine(32, 32, 24, gray);
    	drawVerticalLine(10, 31, 23, yellow); drawVerticalLine(10, 10, 23, gray); drawVerticalLine(21, 22, 23, gray); drawVerticalLine(31, 31, 23, gray); drawVerticalLine(15, 16, 23, gray);
    	drawVerticalLine(11, 30, 22, yellow); drawVerticalLine(20, 21, 22, gray); drawVerticalLine(30, 30, 22, gray);
    	drawVerticalLine(12, 29, 21, yellow); drawVerticalLine(19, 20, 21, gray); drawVerticalLine(29, 29, 21, gray);
    	drawVerticalLine(12, 28, 20, yellow); drawVerticalLine(12, 13, 20, gray); drawVerticalLine(18, 20, 20, gray); drawVerticalLine(28, 28, 20, gray);
    	drawVerticalLine(14, 27, 19, yellow); drawVerticalLine(14, 14, 19, gray); drawVerticalLine(17, 19, 19, gray); drawVerticalLine(27, 27, 19, gray);
    	drawVerticalLine(15, 18, 18, gray); drawVerticalLine(19, 24, 18, yellow); drawVerticalLine(25, 26, 18, gray);
    	drawVerticalLine(17, 17, 17, gray); drawVerticalLine(18, 21, 17, yellow); drawVerticalLine(22, 24, 17, gray);
    	drawHorizontalLine(8, 8, 19, stars); drawHorizontalLine(15, 15, 22, stars);
    	drawHorizontalLine(5, 5, 25, stars); drawHorizontalLine(15, 15, 30, stars);
    	drawHorizontalLine(4, 4, 33, stars); drawHorizontalLine(22, 22, 35, stars); 
    	drawHorizontalLine(10, 10, 35, stars); drawHorizontalLine(9, 11, 36, stars); drawHorizontalLine(10, 10, 37, stars); 
    	drawHorizontalLine(3, 3, 12, stars); 
    	
    	drawSquareGrid(PIXEL_SIZE, Color.black);
    	try {       
            ImageIO.write(image, "jpg", new File("pixel_art.jpg"));
            System.out.println("EXITO !!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
    private static void drawVerticalLine(int a, int b, int x, Color c){
   	    g.setColor(c);
    	for(int i=a;i<=b;i++){
    		 putPixel(x, i, c);
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
