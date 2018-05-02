### 1 - if/for/array/exception

array

	int[] a = new int[length];
	for(int i=0; i < a.length; i++) {
		a[i] = -i;
	}
	for(int e: a){
		a[e] = -e;
	}

2-d arrays

	int[][] b = {{1,2,3},{4,5,6}} ;
	String[][] b = new String[rows][cols];
	
	for (int i=0; i < b.length; i++ ){
		for (int j=0; j < b[i].length; j++){
		b[i][j] = " ";
		}
	}
	
	// or
	for (int[] e: b){
		for (int el: e) {
			System.out.print(el + " ");
		}
	}
	
	Arrays.sort(b);

ArrayList

	ArrayList<String> items = new ArrayList<String>();
	items.add("a");
	items.size();
	
### 2 - Classes / inherit

constructor/getter/setter/toString

	public class Book{
		private String title, author;
		private int year;
		
		public Book(String title, String author, int year) {
			this.title = title; this.author = author; this.year = year;
		}
		
		public String getTitle(){
			return title;
		}
		
		public void setTitle(String newTitle) {
			this.title = newTitle;
		}
		
		public String toString(){
			return "Title: " + title + ", Author: " + author + ", Year: " + year;
		}
	}
	
superclass methods - Product(String name, int price)

	public UrgentProduct extends Product {
		private int days;
		
		public UrgentProduct(String name, int price, int days){
			super(name, price);
			this.days = days;
		}
		
		public int getDays(){
			return days;
		}
		
		public void setDays(int newDays){
			this.days = newDays;
		}
		
		public String toString(){
			return super.toString()+", Days: "+ days;
		}
	}

### 3 - GUI

paint polygon

	@Override
	public paintComponent(Graphics g){
		super.paintComponent(g);
		int[] xPoints = { };
		int[] yPoints = { };
		int vertices = num/ xPoints.length;
		g.fillPolygon(xPoints, yPoints, vertices);		
	}
paint polyLine

	@Override
	public void paintComponent(Graphic g){
		super.paintComponent(g);
		int vertices = a.length;
		int[] xPoints = new int[vertices];
		int[] yPoints = new int[vertices];
		for(int i=0; i<vertices; i++){
			xPoints[i] = xNormalize(vertices, i);
			yPoints[i] = yNormalize(min(a), max(a), a[i]);
		}
		g.drawPolyLine(xPoints, yPoints, vertices);
	}

paint rect

	g.drawRect(x0,y0,width,height);
	g.drawOval(x0,y0,width,height);
	g.drawLine(x0,y0,x1,y1);
	
##### Modle-View-Controller paradigm

- MVC to keep the program functionality separate, we split it into 3 interconnected parts.
	
	- M: representing app's behavior, managing the data, logic and rules of applications;
	- V-display elements: representatin of the model in the particular format;
	- C-interaction elements: accepts input and converts it to commands for the View or model;

the Observer-Observable pattern enables a clean separation of MVC.

	
	public void actionPerformed(ActionEvent e){
		if (gButton.isSelected())
			model.setStatus(true);
		else
			model.setStatus(false);		
	}

model

	public void setStatues(Customer customer, boolean status) {
		customer.setStatus(status);
		setChanged();
		notifyObservers();
	}
	
### 4 - Recursion / List / Tree

No. | Test property | input | expect
-- | -- | -- | --
1 | empty list behavior| [] | []
2 | only 1 element | [2] | [2]
3 | 2 elements, no duplicate|[1,2]|[1,2]
4 | more than 2 elements, has|[1,2,2,3]|[1,2,3]
5 | more than 1 duplicates, comparison performed|[1,1,2,2,3]|[1,2,3]
6 | Upper bound|[Integer.min_value, Integer.max_value]|[Integer.min_value, Integer.max_value]

removeDuplicates

deleteCopies

isSearchTree

isHeightBalanced

### 5 - Collection / Java Type System

Comparator<T> | Comparable<E>
-- | --
use `compare()`method many times | only once to use `compareTo()` method
allow comparing by other ways | comparing items by their natural ordering

	public class Name implements Comparable<Name> {
    	public String lastName, firstName;
    	
    	public Name(String last, String first){
        lastName = last; firstName = first;
    	}
    	
    	// compareTo()
    	public int compareTo(Name other){
    		int lastCheck = this.lastName.comparaTo(other.lastName);
    		if (lastCheck == 0)
    			return this.firstName.compareTo(other.firstName);
    		else
    			return lastCheck;
    	}
    	
    	public boolean equals(Name other){
    		return this.lastName.equals(other.lastName) &&
            		this.firstName.equals(other.firstName);
    	}  	
   

Define a class and put/get the constructor  
using `for` / `iterator` method

	public class PhoneBook {
		private SortedMap<Name, Integer> directory = new TreeMap<Name, Integer>();
		
		public PhoneBook(ArrayList<Name> names, ArrayList<Integer> phones){
			for(int i=0; i<names.size(); i++)
				directory.put(names.get(i), phones.get(i));
		}
		
		//or 
		Iterator<Name> nameIter = names.iterator();
		Iterator<Integer> phoneIter = phones.iterator();
		while(nameIter.hasNext()){
			directory.put(nameIter.next(), phoneIter.next());
		}
		
	}

print using `forEach` / `iterator` for map - keySet()/entrySet()
	
	public void print(){
		directory.forEach((name,phone) -> {System.out.println(name + " " + phone);});
		
		// or keySet()
		for (p: directory.keySet()){
			System.out.println(p + " " + directory.get(p));
		}
		
		// or entrySet()
		for (Map.Entry<Name, Integer> entry: directory.entrySet()){
			System.out.println(entry.getKey() + " " + entry.getValue());
		}		
	}
public static Motorized refuel(Motorized v) ->
	
`public static <T extends Motorized> T refuel(T v)`

### 6 - Threads / Sockets

