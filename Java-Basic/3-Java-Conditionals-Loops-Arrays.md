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


### Conditionals - if
#### if

	if (x < 0) { 
		x = -x;



#### if else
	if (x >= 0) {




	else if (str.equals("noon"))
	else

#### Switch statements
`switch` provides a convenient way to select between different elements of byte, short, char, and int data types with the syntax:  

	switch(var) {
		...




 





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


	int length = 100;

	}
	
#### Loops on Arrays

	for (int i=0; i < a.length; i++){ 
		System.out.print(a[i] + " ");





`int[][] a = {{1, 2, 3, 4},    
--- | --- | --- 






### ArrayList
ArrayList is not a basic construct, a particular library has to be loaded: `import java.util.ArrayList`;  

Comparable to arrays, but **without fixed size**. Only **on objects**. e.g.  



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


	