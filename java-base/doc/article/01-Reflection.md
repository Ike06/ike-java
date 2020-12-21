> 反射：将类的属性和方法映射成相应的类。

## 反射的定义：
1. 反射机制的核心是在程序运行时动态加载类并获取类的详细信息，从而操作类或对象的属性和方法，本质为JVM带到Class对象后，对其进行反编译，从而获取对象的信息。
2. Java属于先编译再运行的语言，程序中对象的类型在编译期就确定下来了，而当程序在运行时可能需要动态加载某些类，这些类因为之前用不到，所以没有被加载到JVM。通过反射，可以在运行时动态地创建对象并调用其属性，不需要提前在编译期知道运行的对象是谁。

## 反射的基本使用
反射原理:
![missing](./../img/reflection.png)
## 反射的优缺点
1. 优点：在运行时获得类的各种内容，进行反编译，对于Java这种先编译再运行的语言，能够让我们很方便的创建灵活的代码，这些代码可以在运行时装配，无需在组件之间进行源代码的链接，更加容易实现面向对象。
2. 缺点：	（1）反射会消耗一定的系统资源，因此，如果不需要动态地创建一个对象，那么就不需要用反射；
		（2）反射调用方法时可以忽略权限检查，因此可能会破坏封装性而导致安全问题。

## 应用场景
1. 反编译：.class-->.java

2. 通过反射机制访问java对象的属性，方法，构造方法等

3. 当我们在使用IDE,比如Ecplise时，当我们输入一个对象或者类，并想调用他的属性和方法是，一按点号，编译器就会自动列出他的属性或者方法，这里就是用到反射。

4. 反射最重要的用途就是开发各种通用框架。比如很多框架（Spring）都是配置化的（比如通过XML文件配置Bean），为了保证框架的通用性，他们可能需要根据配置文件加载不同的类或者对象，调用不同的方法，这个时候就必须使用到反射了，运行时动态加载需要的加载的对象。

5. 例如，在使用Strut2框架的开发过程中，我们一般会在struts.xml里去配置Action，比如
```xml
	<action name="login" class="org.ScZyhSoft.test.action.SimpleLoginAction" method="execute">   
	    <result>/shop/shop-index.jsp</result>           
	    <result name="error">login.jsp</result>       
	</action>
```	
比如我们请求login.action时，那么StrutsPrepareAndExecuteFilter就会去解析struts.xml文件，从action中查找出name为login的Action，并根据class属性创建SimpleLoginAction实例，并用Invoke方法来调用execute方法，这个过程离不开反射。配置文件与Action建立了一种映射关系，当View层发出请求时，请求会被StrutsPrepareAndExecuteFilter拦截，然后StrutsPrepareAndExecuteFilter会去动态地创建Action实例。
比如，加载数据库驱动的，用到的也是反射。
```Class.forName("com.mysql.jdbc.Driver"); // 动态加载mysql驱动```
	
### 获取Class类的三种方法：
1. 类名.class
2. 对象名.getClass()
3. Class.forName("要加载的类名")
>注意，在运行期间，一个类，只有一个Class对象产生，所以打印结果都是true；三种方式中，常用第三种，第二种对象都有了还要反射干什么，第一种需要导入类包，依赖太强，不导包就抛编译错误。一般都使用第三种，一个字符串可以传入也可以写在配置文件中等多种方法。
