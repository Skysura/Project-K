package Main;

import org.lwjgl.opengl.GL11;

public class Render {
	
	private int WIDTH;
	private int HEIGHT;
	
	public Render(int WIDTH, int HEIGHT){
		this.WIDTH = WIDTH;
		this.HEIGHT = HEIGHT;
	}
	
	public void setColor(float red, float green, float blue){
		GL11.glColor3f(red, green, blue);
	}
	
	public void drawQuad(int xStart, int yStart, int xSize, int ySize){
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glVertex2f(xStart,yStart);
		GL11.glVertex2f(xStart+xSize,yStart);
		GL11.glVertex2f(xStart+xSize,yStart+ySize);
		GL11.glVertex2f(xStart,yStart+ySize);
		GL11.glEnd();
	}
	
	

}
