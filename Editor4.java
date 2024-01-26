import java.awt.Color;

/**
 * Demonstrate morphing an image into its grayscaled version.
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of a source image,and the number of morphing steps (an int). 
 * For example, to morph the thor in 50 steps, use:
 * java Editor4 thor.ppm 50
 * Note: There is no need to scale the target image to the size of the source
 * image, since Runigram.morph performs this action.
 */

public class Editor4 {
    

    public static void main(String[] args){
        String source = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] sourceImage = Runigram.read(source);
        Color[][] targetImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
    }
}
