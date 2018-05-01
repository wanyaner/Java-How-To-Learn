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

        int[] xPoints = new int[vertices];        int[] yPoints = new int[vertices];        g.drawPolygon(xPoints, yPoints, vertices);
		g.fillPolygon(xP,yP,xP.length);
		
		// or         Polygon pol = new Polygon(xPoints, yPoints, vertices) 



#### More  

`setFont(new Font("Dialog",1,12))`;  
`g.drawString`("Some text added here",10,10); at position (10,10).  `drawPolyline`  
`g.drawImage`(loadImage(image), xPos, yPos, null)  
`g.copyArea`(0,0,100,100,300,300), [to copy the area in the rectangle from (0,0) to (100,100) to one starting at (300,300)]

---

### Model - View -Control
![mvc](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/MVC-Process.svg/400px-MVC-Process.svg.png)
- When creating a graphical user interface (GUI) for a program, we try to keep the **program functionality** separate from the **display elements (`views`)** and **interaction elements (`controls`)**. To this end we build a wrapper around the program and build a so-called `model` through which we access the program code.
	- The model is the central component of the pattern. It expresses the application's behavior in terms of the problem domain, independent of the user interface. It directly manages the data, logic and rules of the application.
	- The view means presentation of the model in a particular format.
	- The controller accepts input and converts it to commands for the model or view.- We use the `Observer – Observable` pattern to do this – it enables a clean separation that is easy to maintain.
### Observer – Observable
- We “wrap” the underlying program objects into a “model” object.- The model object is from a class that extends Observable. 
- This means that it can have observers (using addObserver).- When a change occurs, the observers are notified by the following two lines of code: `setChanged()`;`notifyObservers()`;
#### Views are Observers
- Any view class `extends` a class representing view (e.g. JLabel), and implements the Observer interface.- In order to implement it must provide a method:`public void update(Observable obs, Object obj)`- This is the method that is run when notifyObservers() is called (it has to implement what should happen when something is observed).
#### Controls and Listeners
- Elements that the user can interact with are called `controls`.- Often you can use the built-in control class directly (e.g. JSlider), but you can create your own class for them if you want to add extra functionality.- Each control needs a `listener` to handle the interactions.#### Listeners and Events
- When the user interacts with a control, it generates an “`event`” object.- For example, moving the slider creates a `ChangeEvent` object. 
- The compiler looks to see if there is a listener attached to the control that can handle the event.- If so, the appropriate method is run.

#### Implements Listeners- Listeners are interfaces.  - There are different listener interfaces for different kinds of control and event.  - For example, to handle a `ChangeEvent`, you need a `ChangeListener`.  - This requires you to provide the appropriate method:  `public void stateChanged(ChangeEvent e)`
#### The Sequence of Events- The user interacts with a control.- This generates an event.- The listener handles the event and runs its method.- This creates changes in the model.- The model’s set methods call notifyObservers.- All the views that are observing the model run their update. method.- This causes them to re-draw themselves appropriately.---
The Model-View-Controller paradigm splits a system up into three interconnected parts. You have a core model which is where the storage and processing of data is carried out. This is represented to the user by a view which allows the user to see elements of the model that the designer wants them to see whilst obscuring sensitive parts of the model that the user isn’t intended to see. Thirdly you have a controller which allows the user to interact with the model and make alterations. Again the functionality of this is limited to what the designer intended so that the user can only access parts of the model that they should have access to.

This separation ensures **security and reduces the chance of errors** occuring in use. It is also **useful in parallel development** because it means multiple developers can work on separate parts of the system individually, producing and structuring them in ways that are conducive to success in the particular task that component is assigned to. It also means that the individual components can **easily be updated separately** without having an effect of other components.
This framework also means that the system will be **extensible**. That is, the system will be able to be accessed and used by **multiple users** whilst maintaining data integrity and accuracy. Furthermore, as the system develops and more students are registered with the system, it will be able to **support additional views** without having to do any additional coding.
---
### Layout Manager
`GridLayout(rows, clos)`  
JButton `public void actionPerformed(ActionEvent e)`  
Icon `ImageIcon icon = new ImageIcon("pic.jpg")`; `button.setIcon(icon)`