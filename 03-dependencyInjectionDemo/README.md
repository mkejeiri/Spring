# Spring Framework 5: Beginner to Guru 
###  Dependency injection (DI)
We will explore the pros & cons of three options of 'DI' in Spring:
* Property DI : private properties and Spring reflexion (expensive  - to avoid!)
* Setter DI : could get a null pointer exception if we forget the initialisation
* Constructor DI: most used

We also analyses what is required to have a succesfull inversion of control and DI by Spring and by using annotations such as:
* @Profile & default profile
* @Primary service
* @Controller 
* @Component
* @Service
* ...
All of this by following the good old [S.O.L.I.D](https://www.tomdalling.com/blog/category/software-design/) principles! 
