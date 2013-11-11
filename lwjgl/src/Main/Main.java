package Main;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
 

public class Main implements Runnable{

	//Thread
	Thread thread;
	
	//render
	Render render;
	
	//Dimensions
	private static final int WIDTH = 1280;
	private static final int HEIGHT = 720;
	
	
	public static void main(String[] args){
		
		new Main();
		
	}
	
	public Main(){


		try {
		Display.setDisplayMode(new DisplayMode(WIDTH,HEIGHT));
		Display.create();
		} catch (LWJGLException e) {
		e.printStackTrace();
		System.exit(0);
		}
		
		initilize();
		
		while (!Display.isCloseRequested()) {
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT); 
			 
			render.setColor(0.5f, 0f, 0.5f);
			render.drawQuad(100, 100, 50, 50);
			
		Display.update();
		Display.sync(60);
		}
		 
		Display.destroy();
		
		/*thread = new Thread();
		thread.start();
		 */

		}
	
	public void initilize(){
		
		GL11.glMatrixMode(GL11.GL_PROJECTION);
		GL11.glLoadIdentity();
		GL11.glOrtho(0, WIDTH, 0, HEIGHT, 1, -1);
		GL11.glMatrixMode(GL11.GL_MODELVIEW);
		
		render = new Render(WIDTH, HEIGHT);
		
	}
	
	public void run(){
		

		
	}

}
