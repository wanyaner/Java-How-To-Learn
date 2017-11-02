### Numbers/Math
Java 语言为每一个内置数据类型提供了对应的包装类。所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。  
![image](http://www.runoob.com/wp-content/uploads/2013/12/number1.png)  
这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。相似的，编译器也可以把一个对象拆箱为内置类型。  
Number 类属于 java.lang 包。  
Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。  

**常用Math方法**  
1	xxxValue()
将 Number 对象转换为xxx数据类型的值并返回。  
2	compareTo()
将number对象与参数比较。  
3	`equals()`
判断number对象是否与参数相等。  
4	valueOf()
返回一个 Number 对象指定的内置数据类型  
5	`toString()`
以字符串形式返回值。  
6	`parseInt()`
将字符串解析为int类型。  
7	`abs()`
返回参数的绝对值。  
8	ceil()
对整形变量向上取整，返回类型为double型。  
9	floor()
对整型变量向下取整。返回类型为double类型。  
10	rint()
返回与参数最接近的整数。返回类型为double。  
11	`round()`
返回一个最接近的int、long型值。  
12	min()
返回两个参数中的最小值。  
13	max()
返回两个参数中的最大值。  
14	`exp()`
返回自然数底数e的参数次方。  
15	log()
返回参数的自然数底数的对数值。  
16	`pow()`
返回第一个参数的第二个参数次方。`Math.pow(x,2)`  
17	`sqrt()`
求参数的算术平方根。  
18	sin()
求指定double类型参数的正弦值。    
19	asin()
求指定double类型参数的反正弦值。  
20	atan2()
将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。  
21	toDegrees()
将参数转化为角度。  
22	toRadians()
将角度转换为弧度。  
23	`random()`
返回一个随机数。  

`Math.random()` returns a double value with positive sign, greater than 0.0 and less than 1.0. Unlike other methods in the Math class,
it does not return always the same value, but typically each time a different value so that the returned values are approximately uniformly distributed. It makes use of a "pseudo random-number generator".
