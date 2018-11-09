import java.util.*;
import java.awt.Color;
public class SeamCarver {
	Picture picture;
	int h;
	int w;
	double[][] energy;
	// create a seam carver object based on the given picture
	public SeamCarver(Picture picture) {
		this.picture = picture;
		w = picture.width();
		h = picture.height();
		energy = new double[w][h];
		for (int i=0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (i==0 || j == 0|| i == w-1 || j == h-1)  {
					energy[i][j] = 1000.0;
				} else {
					energy[i][j] = Math.sqrt(xenergy(i, j)+ yenergy(i, j));
				}
			}
		}

	}
	public int  xenergy(int x, int y){
		Color a = picture.get(x-1, y);
		Color b = picture.get(x+1, y);
		int red = b.getRed() - a.getRed();
		int blue = b.getBlue() - a.getBlue();
		int green = b.getGreen() - a.getGreen();
		return ((red*red) + (green* green) + (blue*blue));

	}	
	public int yenergy(int x, int y){
		Color a = picture.get(y-1, x);
		Color b = picture.get(y+1, x);
		int red = b.getRed() - a.getRed();
		int blue = b.getBlue() - a.getBlue();
		int green = b.getGreen() - a.getGreen();
		return ((red*red) + (green* green) + (blue*blue));
	}
	// current picture
	public Picture picture() {
		return picture;
	}
	// width of current picture
	public int width() {
		return   w;
	}

	// height of current picture
	public int height() {
		return h;
	}

	// energy of pixel at column x and row y
	public double energy(int x, int y) {
		return energy[x][y];
	}

	// sequence of indices for horizontal seam
	public int[] findHorizontalSeam() {
		return new int[0];
	}

	// sequence of indices for vertical seam
	public int[] findVerticalSeam() {
		return new int[0];
	}

	// remove horizontal seam from current picture
	public void removeHorizontalSeam(int[] seam) {

	}

	// remove vertical seam from current picture
	public void removeVerticalSeam(int[] seam) {

	}
	/*public int getblue(int x, int y) {
		return picture.get(x, y).getBlue();
	}
	public int getred(int x, int y) {
		return picture.get(x, y).getRed();	
	}
	public int getgreen(int x, int y) {
		return picture.get(x, y).getGreen();
	}*/
}