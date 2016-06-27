## Spring 框架的 7 个模块
- 1. spring code：核心容器，提供Spring的基本的功能，主要组建是BeanFactory，他是工厂模式的实现。BeanFactory 使用控制反转 （IOC） 模式将应用程序的配置和依赖性规范与实际的应用程序代码分开。

- 2. Spring context：Spring上下文是一个配置文件，向Spring 框架提供上下文信息。Spring上下文包括企业服务，例如 JNDI、EJB、电子邮件、国际化、校验和调度功能。

- 3. Spring AOP：通过配置管理特性，Spring AOP 模块直接将面向切面的编程功能集成到了Spring框架中。所以，可以很容易地使Spring框架管理的任何对象并支持 AOP。Spring AOP模块为基于Spring的应用程序中的对象提供了事务管理服务。通过使用Spring AOP，不用依赖 EJB 组件，就可以将声明性事务管理集成到应用程序中。

- 4. Spring DAO：JDBC DAO抽象层提供了有意义的异常层次结构，可用该结构来管理异常处理和不同数据库供应商抛出的错误消息。异常层次结构简化了错误处理，并且极大地降低了需要编写的异常代码数量（例如打开和关闭连接）。Spring DAO 的面向 JDBC 的异常遵从通用的 DAO 异常层次结构。

- 5. Spring ORM：Spring 框架插入了若干个ORM框架，从而提供了ORM的对象关系工具，其中包括 JDO、Hibernate 和 iBatis SQL Map。所有这些都遵从Spring的通用事务和DAO异常层次结构。

- 6. Spring Web 模块：Web上下文模块建立在应用程序上下文模块之上，为基于Web的应用程序提供了上下文。所以，Spring 框架支持与 Jakarta Struts 的集成。Web 模块还简化了处理多部分请求以及将请求参数绑定到域对象的工作。

- 7. Spring MVC框架：MVC 框架是一个全功能的构建Web应用程序的MVC实现。通过策略接口，MVC框架变成为高度可配置的，MVC 容纳了大量视图技术，其中包括JSP、Velocity、Tiles、iText 和 POI。

## IOC (Inversion of Control)
控制反转是一种将组件依赖关系的创建和管理置于程序外部的技术
IOC 控制反转模式（也称作依赖性介入）的基本概念是：不创建对象，但是描述创建它们的方式。在代码中不直接与对象和服务连接，但在配置文件中描述哪一个组件需要哪一项服务。容器 （在 Spring 框架中是 IOC 容器） 负责将这些联系在一起。
- 1. setter方法注入(常用)
各种类型的依赖注入模式中，设值注入模式在实际开发中得到了最广泛的应用
```java
public class ClassA { 
    private InterfaceB clzB;
    public void setClzB(InterfaceB clzB) { 
        this. clzB = clzB;
    }
}
```

- 2. 构造函数注入
依赖关系是通过类构造函数建立的，容器通过调用类的构造方法将其所需的依赖关系注入其中
```java
public class DIByConstructor {
    private final DataSource dataSource;
    public DIByConstructor(DataSource ds) { 
        this.dataSource = ds;  
    }
}

```

- 3. 接口注入
依赖性以构造函数的形式提供，不以 JavaBean 属性的形式公开
Container 在运行期动态注入
```java
public class ClassA {
    private InterfaceB clzB; //接口
    public void doSomething() {
        Ojbect obj =Class.forName(Config.BImplementation).newInstance();
        clzB = (InterfaceB)obj;
        clzB.doIt()
    }
}

//变异的写法，常用在servlet中可见
public class ClassA {
    private InterfaceB clzB; // 接口
    public Object doSomething(InterfaceB b) {
        clzB = b;
        return clzB.doIt();
    } 
}
```

## AOP Aspect Oriented Programming
意为：面向切面编程，通过预编译方式和运行期动态代理实现程序功能的统一维护的一种技术。它将那些影响多个类的行为封装到可重用的模块中
