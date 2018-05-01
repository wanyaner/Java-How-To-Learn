This note contains:  
Type Casting, Syntactic Sugar, Conditionals, Loops, Loop Invariants Arrays, ArrayLists  

###Characters / String 
	String s = `"Hello, World!"`;  
	
`s.length` get the length of s;  
`s.charAt(4)` the 4th character in the s.(Notice: we start to count with 0.);  
`s.substring(0,4)` returns a substring of s from 0th element(inclusively) to the 4th element(exclusively).

### Type Casting
Some types can be converted, some not. e.g:  
long l = `Long.MAX.VALUE` / 48;  
int i = `(int)` l;  
short s = `(short)` i;  
byte b = `(byte)` s;  
float f = `(float)` i;   
char c = `(char)` i;  
 
### Syntactic Sugar
a += 5 | a = a + 5;  
a -= 5 | a = a - 5;  
a++; a--;  a != b
!(a == b) | test for pointer equality(not);   

### Static / final / public / private
When defining a class we typically initialize objects with variables.  
`final int account = 000` means the value of a not changes. Obviously the account numbers should be **different** for different accounts.

In contrast when we speak about variables which are the **same for all objects in a class**, we call these variables `static`.  

If something is static and final we can declare this:  
	public/private static final double CM = 2.5;

### Conditionals - if
#### if

	if (x < 0) { 
		x = -x;	}
or
	if (x < 0)		x = -x;

#### if else
	if (x >= 0) {		x = Math.sqrt(x);	} else {		x = Math.sqrt(-x);	}
#### Nested if statements 嵌套条件表述
	String str = "evening";	
	if (str.equals("morning"))  		System.out.println("good");

	else if (str.equals("noon"))		  System.out.println("Enjoy");	
	else  		System.out.println("Oops.");

#### Switch statements
`switch` provides a convenient way to select between different elements of byte, short, char, and int data types with the syntax:  

	switch(var) {		case value1: ... break;  		case value2: ... break; 
		...		default: ... break;	}
If the `default` is missing and none of the cases occurs then the switch statement does nothing.
### While Loop
In a `while` loop we **distinguish the condition** (included in round brackets) and the body of the loop. If the condition is true the body is **executed repeatedly until the condition is false** after executing the body in full.  
	int i = 0 ; 
 	while (i < 7) {		i = i+1;	    System.out.print(i + " ");	}
### For Loops
A `for` loop is similar to a while loop, however, in the round brackets we **declare and initialize an iteration variable**, separate by a semicolon the **termination condition** and again by a semicolon the **update expression** for the iteration variable.
	for (int i = 0 ; i <=n ; i++) { //i为循环变量
		System.out.print(i + " ");	}

### Loop Invariant 循环不变式
Need good documentation of loops, in particular, a `loop invariant` in order to understand the loops. 循环不变式是一种条件式（必须满足的条件，对循环而言是保持不变的，无论循环执行了多少次），循环语句每执行一次，就要求中间的结果必须符合不变式的要求。

	// (**) 不变式在进入循环之前必须成立
	
	while () {
    	// 循环体开始
    	...
    	// 循环体结束
    	
    	// (**) 不变式在此处也必须成立
	}

### Arrays
An array is a **data structure** for storing a collection of values of the same type.  
initialization of Arrays: `int [] c = {2, 5, 24, 6}`;


	int length = 100;	int[] a = new int[length];
	for (int i=0; i < length; i++) {		a[i] = i*i; 
	}
	
#### Loops on Arrays

	for (int i=0; i < a.length; i++){ 
		System.out.print(a[i] + " ");	}
Better write:
	for (int element : a){ 		System.out.print(element + " ");	}
### Two-dimensional Arrays
A two-dimensional array is an array of one-dimensional arrays.  
**a[row][column]** declared and initialized:  
`int[][] a = {{1, 2, 3, 4},                 {5, 6, 7, 8},                 {9, 10, 11, 12}}`;Column 1 |  Column 2 |  Column 3 
--- | --- | --- a[0][1] |   a[0][2]|   a[0][3]  a[1][1] |   a[1][2]|   a[1][3]  a[2][1] |   a[2][2]|   a[2][3]  a[2][1] == 10  
		int rows = 3;	int columns = 3;	String[][] board = new String[rows][columns];	for (int i = 0; i < rows; i++) {    	for (int j = 0; j < columns; j++) {        	board[i][j] = " ";    	}	}Example multiplication table:	int length = 12;	int[][] multi = new int[length][length];
	for (int i=0; i < length; i++){    	for (int j=0; j<length; j++){        	multi[i][j] = i*j;		} 	}
or
	for (int[] element : multi) {    	for (int el : element) {        	System.out.print(el + " ");    	}    	System.out.println();	}Two-dimensional arrays can be be initialized in an easy way as shown in the example.
	for (int[]  element : d) {        for (int el : element) {            System.out.printf("%4d ",el);        }        System.out.println();    }

### ArrayList
ArrayList is not a basic construct, a particular library has to be loaded: `import java.util.ArrayList`;  

Comparable to arrays, but **without fixed size**. Only **on objects**. e.g.  

    ArrayList<String> items = new ArrayList<String>();
    ArrayList<String> items = new ArrayList<String>(1000);`items.add("newString")`;  `item.size()` corresponds to length of an array.  
`void trimToSize()`; reduce storage size.

### More Exercise
#### Array

	public class TestArray {  
	  public static void main(String[] args) {
	  
	  // 初始化数组
      double[] myList = {1.9, 2.9, 3.4, 3.5};
 
      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
         System.out.println(myList[i] + " ");
      }
      // 计算所有元素的总和
      double total = 0;
      for (int i = 0; i < myList.length; i++) {
         total += myList[i];
      }
      System.out.println("Total is " + total);
      
      // 查找最大元素
      double max = myList[0];
      for (int i = 1; i < myList.length; i++) {
         if (myList[i] > max) 
         	max = myList[i];
      }
      System.out.println("Max is " + max);
   	}
   	
and reverse method:

	public static int[] reverse(int[] list) {  
  		int[] result = new int[list.length];
 
	  for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {  
    	result[j] = list[i];
  	  }
  	  return result; // result 数组作为函数的返回值
	}


	
