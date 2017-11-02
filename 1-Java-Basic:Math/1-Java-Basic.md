# Java Basic

Textbook:  
Paul Deitel,Harvey Deitel. **Java - How to Program Tenth Edition**

### Overview

1. Pocket calculator computations, base types, simple strings, variables, static methods, JavaDoc  2. Classes, objects, methods, JUnit tests    
3. Conditionals, ‘for’ Loops, arrays, ArrayList
4. Exceptions, assertions, I/O, Patterns, printf  
5. Interfaces, functions6. Sub-classes, inheritance, abstract classes7. Inheritance (Cont’d), packages  
8. Graphics
9. Graphical User Interfaces10. Graphical User Interfaces (Cont’d)

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
	bype  | range -128 to 127 	short | range -32,768 to 32,767 16位数字	int   | range +-2,147,483,648 32位整数形
	long  | range +-9,223,372,036,854,775,808 32位整数形

**Floating** point numbers (reals) are approximated by 4 or 8 bytes.

	float  | 4 bytes, 6-7 significant decimal digits 3.4028235E38	double | 8 bytes 64-bit双精度浮点数

**booleans** contains 2 elements:`true` and `false`.

**char** is used to represent characters such as `'a'`, `'b'`,`'c'`, and `'\u00A3'` (for the pound symbol). They are enclosed in single quotes.
### Methods
	public static int square(int x) {    	return x * x;	}
* `public` means that the method can be called by anybody who can access the class.
* `static` 在类级别定义，所有实例共享的. Conversion - a value to another one. This can be done by so-called **static methods**.
* `int` is the return type.
* `square` is the name of the method with which it is “called.”
* `x` is the name of the parameter.
* `return` specifies what the method gives back as value.
**常用转义字符**  
	"\b" (退格)  
	"\f" (换页)  
	"\n" (换行)  
	"\r" (回车)  
	"\t" (水平制表符(到下一个tab位置))  
	"\' " (单引号)  
	"\" " (双引号)   
	"\\" (反斜杠)  


### Javadoc
We use the tags: 
 * `author` (author of a class)
* `version` (the date when class written, e.g.) 
* `param` (one entry for each parameter) 
* `return` (return value for non void methods)
### JUnit Testing
In JUnit testing we compare the `expected result` of a method or a computation to the `actual result`. If the result agrees then the test passes, otherwise it fails.  We use initially only `assertEquals`, `assertFalse`, and `assertTrue`.  Details on <http://junit.org/> or <http://junit.org/junit5/docs/current/user-guide/>.