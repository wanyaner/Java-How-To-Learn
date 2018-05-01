### Functions

Functions/ lambda-expressions / arguments in methods  

	import java.util.function.Function;		public class FunMain {  		public static void printN(Function<Integer,Integer> 		f, 	int n){      		for (int i = 0; i <= n; i++){        		System.out.print(f.apply(i) + " ");      		}		
			System.out.println();  		}
	  		public static final Function<Integer,Integer> f0 =   			x -> {return x * x + x - 7;};
 		public static void main(String[] args) {      		printN(x -> {return x * x;}, 10);      		printN(x -> {return x + 1;}, 10);      		printN(f0, 10);		} 	}
##### Distinguish:	
* **Classes**, e.g., BankAccount, Customer  * **Objects**, e.g., bankAccountJohn, customerMary created by a **Constructor**, e.g.public BankAccount (Customer customer, String password)  * **Methods**, e.g. getBalance()  
---### Interface
#### Class
* Only **one class declaration** in a particular file can be **public**. It corresponds to the file name.  * Classes can be **nested**. **Inner classes are invisible** from the outside and corresponding methods cannot be called from the outside.
#### Interface
> There are a number of situations in software engineering when it is important for disparate groups of programmers to agree to a “contract” that spells out how their software interacts. Each group should be able to write their code without any knowledge of how the other group’s code is written. Generally speaking, interfaces are such contracts.
	public interface Payable {        int getPaymentAmount();    }    public class Invoice implements Payable{        public int getPaymentAmount(){			return ...; } 	}
### Inheritance
#### Superclass vs Subclass
* A SubclassA inherits from its (unique) SuperclassB 
	
		public class SubclassA extends SuperclassB
	

* Variables (and methods) **private** to the superclass are **not accessible** from the subclass.
* **Abstract classes** do not have immediate objects, but only via subclasses.### Overriden
* **Overridden** methods from the superclass are accessible, e.g.`super.toString()`; 
* However, use `@Overwrite` the old value of a variable, it is gone.
---
### Packages> Packages are Java libraries of classes. import statements make classes from a package available to your program.

Packages determine the access of variables and methods. We have seen two access modifiers **public** and **private**. There are two more **protected** and the **default**, which is package access.  

Inside the same package /and subclass:
	package somePackage;	public class A {    	public    static int v1 = 1;    	protected static int v2 = 2;              	  static int v3 = 3; // package access    	private   static int v4 = 4;	}
	package somePackage;	public class B {    	public void BPrint() {        	System.out.println(A.v1); //access        	System.out.println(A.v2); //access        	System.out.println(A.v3); //access        	System.out.println(A.v4); //no access		}	}
Outside the same package and no subclass.  
If has subclass,A.v2 could be accessed.
	import somePackage.A;	public class E {    	public void EPrint() {        	System.out.println(A.v1); //access        	System.out.println(A.v2); //no access         	System.out.println(A.v3); //no access         	System.out.println(A.v4); //no access		}	}