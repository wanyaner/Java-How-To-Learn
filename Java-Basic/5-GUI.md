### Swing

### JFrame/ JPanel

	public class NewClass extends JPanel {
		JFrame frame = new JFrame();
		
		// set size
		final int FRAME_WIDTH = 600;
		final int FRAME_HEIGHT = 400;
		frame.setSIZE(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTITLE("Hello");
		
		// to visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);	
	}
	
### drawLine/ fillReck 
the dimensions are given in pixels from the left-upper corner of the frame.

- drawRect(x, y, width, height);
- fillRect(x, y, width, height);
- drawOval(x, y, width, height);
- fillOval(x, y, width, height);
- drawLine(x0, y0, x1, y1);

eg. a rectangle in (10,20), (210,20), (10, 120), (210,120)

	JPanel panel = new JPanel();
	
	@Override
	public void paintComponent(Graphics g) {
	
		g.drawRect(10,20,200,100);
		
		g.drawLine(x0, y0, x1, y1);
	}
	


### drawPolygon


		g.fillPolygon(xP,yP,xP.length);
		
		// or 



#### More  

`setFont(new Font("Dialog",1,12))`;  
`g.drawString`("Some text added here",10,10); at position (10,10).  
`g.drawImage`(loadImage(image), xPos, yPos, null)  
`g.copyArea`(0,0,100,100,300,300), [to copy the area in the rectangle from (0,0) to (100,100) to one starting at (300,300)]

---

### Model - View -Control
![mvc](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/MVC-Process.svg/400px-MVC-Process.svg.png)
- When creating a graphical user interface (GUI) for a program, we try to keep the **program functionality** separate from the **display elements (`views`)** and **interaction elements (`controls`)**. To this end we build a wrapper around the program and build a so-called `model` through which we access the program code.
	- The model is the central component of the pattern. It expresses the application's behavior in terms of the problem domain, independent of the user interface. It directly manages the data, logic and rules of the application.
	- The view means presentation of the model in a particular format.
	- The controller accepts input and converts it to commands for the model or view.








- The compiler looks to see if there is a listener attached to the control that can handle the event.

#### Implements Listeners









