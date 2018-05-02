### Generics

Higher order: map / function
	static<E,R> map(Function<E,R> fun, List<E> a) {   		if (a.isEmpty())       		return new List();		else			return new List(fun.apply(a.getHead()),                       map(fun, a.getTail());
       // lambda expression       map((x) -> -x, list)

forEach, instance method (not a static method)	
	void forEach(Consumer<E> action) {		int sum = 0;   		a.forEach( (x) -> {sum = sum+x;} );   		a.forEach( (x) -> {System.out.println(x);} );  	}

### Comparable<> / Comparator

`Comparator<T>` - compare two T-type objects by using the method `int compare(T o1, T o2)`

	static<E> int max(List<E> L, Comparator<E> cmp) {		if ((L.getTail().isEmpty())) 
			return L.getHead();   		else {   			int m = max(L.getTail(), cmp);    		if(cmp.compare(L.getHead(),m) > 0)      			return L.getHead();    		else     			return m;     	}	}

`Comparable<E>`, allows natural orderings to be used by using the method `int compareTo(T other)`


	public class Name implements Comparable<Name> {
    	public String lastName, firstName;
    	
    	public Name(String last, String first) {
        lastName = last; firstName = first;
    	}

    	public int compareTo(Name other) {
        	int lastCheck = this.lastName.compareTo(other.lastName);
        	if (lastCheck == 0)
            	return this.firstName.compareTo(other.firstName);
        	else
            	return lastCheck;
            	
    	public boolean equals(Name other) {
        	return this.lastName.equals(other.lastName) &&
            		this.firstName.equals(other.firstName);
    	}	}

Another way for implements/ extends Comparable<E>

	static<E implements Comparable<E>> int max(List<E> L) {		if ((L.getTail().isEmpty())) 			return L.getHead();    	else {     		int m = max(L.getTail());     		if(L.getHead().compareTo(m) > 0)       			return L.getHead();     		else return m;      	}	}		
	
`Comparable` vs `Comparator`

Comparators allow for comparing objects not based on their natural ordering whereas Comparable defines a types natural order(Can only have one compareTo() but can have many compare() based on which comparator you use to compare.)

---what is `subtype`?
A sub type is a type which is derived from a super type to inherit its functionality whereas a sub class is a form of sub type. Sub classes inherit functionality and attributes from a super class.;.Relationships resulting in subtypes:Class extends class(sub class)   
Class implements Interface   
Interface extends Interface

#### Example - PhoneBook

/*
 * The PhoneBook class implements a telephone directory, associating
 * phone numbers with Names.  
 * The implementation uses TreeSet (binary search trees). The
 * Comparable interface of the Name class is essential for this.
 */

	public class PhoneBook {
    	private SortedMap<Name, Integer> directory = new TreeMap<Name, Integer>();

    /* The constructor builds a phone book from two array lists, one
     * for names and one for phone numbers.
     * precondition: the two arrays must be of the same size.
     */

    public PhoneBook(ArrayList<Name> names, ArrayList<Integer> phones) {
        for (int i = 0; i < names.size(); i++) {
            directory.put(names.get(i), phones.get(i));
        }
    }

	// or Iterator 
    public PhoneBook(List<Name> names, List<Integer> phones) {
        Iterator<Name> nameIter = names.iterator();
        Iterator<Integer> phoneIter = phones.iterator();
        
        while (nameIter.hasNext()) {
            Name name = nameIter.next();
            Integer phone = phoneIter.next();
            directory.put(name, phone);
        }
    }

    /* To print the entries in the phone book, we get its entrySet and
     * iterate through it using a for loop. The for-loop uses the
     * iterator of the entrySet (invisibly).

     * Note that map is not iterable, but its entrySet is.  Since a
     * TreeSet is a SortedSet, the iterator enumerates the entries in
     * sorted order, i.e., alphabetical order of the names.
     */

    public void print() {
        for (Map.Entry<Name,Integer> entry : directory.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(entry.getValue());
            System.out.println();
      }
    }

    /* An alternative print method using forEach higher-order method */

    public void print2() {
        directory.forEach ((name, phone) ->
                           {System.out.println(name + " " + phone);});
    }
}


#### Example - Street Address

Given below is a class for street addresses in a town that is meant to allow sorting.

	public class Address implements Comparable<Address> {      public String street;  // street name      public Integer number; // house number
            public Address(String street, Integer number) {          this.street = street; this.number = number;      }
      public int compareTo(Address other) {          int streetCheck = this.street.compareTo(other.street);          if (streetCheck == 0)              return this.number.compareTo(other.number);          else              return streetCheck;	  }	       public boolean equals(Address other) {          return this.street.equals(other.street) && this.number.equals(other.number);		} 
	}
	
Define a class called `MailingList` for storing street addresses and names for a group of residents.  

The constructor should create a map and add all the given street addresses along with the corresponding names of residents.

	public class MailingList {
		private SortedMap<Address, String> map;
		public MailingList(ArrayList<Address> addresses,
			ArrayList<String> residents);
			
		this.map = new TreeMap<Address, String>();
		
		// for method to get
		for (int i=0; i<addresses.size(); i++){
			map.put(addresses.get(i), residents.get(i));
		}
		
		//or
		Iterator<Address> addIter = addresses.iterator();
		Iterator<Addtess> resIter = residents.iterator();
		While (addIter.hasNext())
			map.put(addIter.next(), resIter.next());
		
The print method should print the street addresses and resident names of all the people in the mailing list in the ascending order of street address.`forEach` and `iterator` methods.		
		
		public void print() {
			// forEach
			map.forEach((key, val) -> {System.out.println(key.number + " " + key.street + ": " + val);});
			
			// or
			Set<Address> addresses = map.keySet();
			for (Address add: addresses)						System.out.println(add.number + " " + add.street + ": " + map.get(add));
			
			//iterator
			Iterator<Map.Entry<Address, String>> entries = this.map.entrySet().iterator();			while(entries.hasNext()){				Map.Entry<Address, String> e = entries.next();				System.out.println(e.getKey() + “ : “ + e.getValue());
		}
	}
	
### Sets & Maps

	public class Parents {        	SortedMap<Name, Name> motherMap = new TreeMap<Name, Name>();          SortedMap<Name, Name> fatherMap = new TreeMap<Name, Name>();       	SortedMap<Name, Set<Name>> childrenMap = new TreeMap<Name, Set<Name>>();

		// Constructor    	public Parents (Name[] person, Name[] mother, Name[] father) {       		for (int i = 0; i < person.length; i++) {       		// Add person[i] to the motherMap
			motherMap.put(person[i], mother[i]);
       		//Add person[i] to the childrenMap of mother[i]
			Set<Name> children = childrenMap.get(mother[i]);
			
			if (children == null) {
				children = new HashSet<Person>();
				childrenMap.put(mother[i],children);
			}
			children.add(person[i]);
		}    }


### Iteration / forEach

Add a method printMothers to the Parents class, which prints the list of persons stored along with their mothers in the format.

`forEach` method

	public void printMothers() {
		motherMap.forEach((person, mother) -> 
			System.out.println(person + ": " + mother));
	}
	
Maps do not have `iterators`. We have to obtain the map’s “entry Set” first.  
	
	public void print Mothers() {
		for (Map.Entry<Name, Name> e : motherMap.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue()); 
		}
	}
	
for loop way

	public void printMothers() {
		Iterator<Map.entry<Name, Name>> iter = motherMap.entrySet().iterator();
		
		while (iter.hasNext()) {
			Map.entry<Name, Name> e = iter.next();
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
	
Another way of solving this problem is to iterate through the “`key Set`” rather than the “entry Set”.

	 public void printMothers() {    	for (p : motherMap.keySet()) {       		System.out.println(p + ": " + motherMap.get(p));    	}	}
---
### Observer Pattern
`ActionListener` vs `Observer`
- Similar
	- Both of them are interfaces (not classes)
	- Both are meant for reacting to external events, ie. they are "handlers". Usually we don't call them ourselves from other objects.
	- Both of them are meant to be "added" to external objects to which they should react.
- Difference
	- ActionListerns react to **the user** (on a GUI), whereas Observers react to **internal data structures** (model objects in the model-view separation paradigm).
	- ActionListeners have an `actionPerformed` method whereas Observers have an `update` method. (Same idea, but different terminology.)
	- They are added to other objects using `addActionListener` or `addObserver` methods. (Same idea, but different terminology.)
Note that ActionListeners are used for handling GUI events. This is independent of whether or not we use the model-view separation paradigm.
Likewise, the Observer pattern may also be used in other contexts that have nothing to do with model-view sepraation. (For example, if we write a program to simulate a real world system with lots of things in it—consider cars and traffic lights for example—those objects often have to observe other objects and react to them. The Observer pattern is used for all sorts of things.)