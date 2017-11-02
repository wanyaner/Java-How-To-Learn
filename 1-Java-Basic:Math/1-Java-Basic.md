# Java Basic

Textbook:  
Paul Deitel,Harvey Deitel. **Java - How to Program Tenth Edition**

### Overview

1. Pocket calculator computations, base types, simple strings, variables, static methods, JavaDoc  

4. Exceptions, assertions, I/O, Patterns, printf  


9. Graphical User Interfaces

Java is an **object-oriented programming** language.  
Everything is put in `classes`. The file name has to match the name of the class.

	public class HelloWorld {
		public static void main(String[] args) {
			System.out.println("Hello World!");
		}
![image](http://www.runoob.com/wp-content/uploads/2013/12/ZSSDMld.png)  

### Comments
	/**
	 * All relevant information should be written in the program as comments.
	 */

### Strings
`"Hello"` + `"World!"`


### Variables
* Variables have a name, a type, and a value. Value can be rewritten.
* Java is a **strictly** typed language, that is, all variables must be **declared** with type or a class. e.g. `public int x` or `public int x, y, z`; 
* Before a vaiable is used, it must be **initialized**. It must be given an initial value.

### Types
Java has 8 different **base types**: 
 
* 4 for the representation of **integers**,
* 2 for **floating point numbers**, 
* 1 for **boolean** values, 
* 1 for **characters**.

**Integers** are implemented in a cyclic way.

	long  | range +-9,223,372,036,854,775,808 32位整数形

**Floating** point numbers (reals) are approximated by 4 or 8 bytes.

	float  | 4 bytes, 6-7 significant decimal digits 3.4028235E38

**booleans** contains 2 elements:`true` and `false`.

**char** is used to represent characters such as `'a'`, `'b'`,









	"\b" (退格)  
	"\f" (换页)  
	"\n" (换行)  
	"\r" (回车)  
	"\t" (水平制表符(到下一个tab位置))  
	"\' " (单引号)  
	"\" " (双引号)   
	"\\" (反斜杠)  



We use the tags: 
 




