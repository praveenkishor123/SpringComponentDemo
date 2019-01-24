# Description

The annotation @Component from Spring framework is used to denote a class as a component which means that the Spring framework will auto detect the classes annotated with this annotation and create object of those classes in Spring context given annotation-based configuration and classpath scanning is used.

This annotation is part of the package - "org.springframework.stereotype" which is a part of spring-context jar.

@Component used to auto-detect and auto-configure beans using classpath scanning.

NOTE - It is a class level annotation.

We can replace @Component annotation with its more specialized version annotations - @Service, @Repository or @Controller based on whether the class is a Service class, a DAO class or a Controller class respectively.

