# Spring Framework 5: Beginner to Guru 
###  Dependency injection (DI) & component scan behaviour
We will explore the pros & cons of three options of 'DI' in Spring:
* Property DI : private properties and Spring reflexion (expensive  - to avoid!)
* Setter DI : could get a null pointer exception if we forget the initialisation
* Constructor DI: most used
* defaut component scan limitation when we shuffling arround package

We also analyses what is required to have a succesfull inversion of control and DI by Spring and by using annotations such as:
* @Profile & default profile
* @Primary service
* @Controller 
* @Component
* @Service
* ...

**Important!**: The default behaviour (no specification of ComponentScan) of ComponentScan is top-down scan of com.kejeiri.courses.didemo package since Service is outside that package we get a not found service error, we need explicitly override the default behaviour and add all package that need to be scanned.!!!
```sh
 @ComponentScan(basePackages = {"com.kejeiri.courses.services","com.kejeiri.courses.didemo"})
```
 All of this by following the good old [S.O.L.I.D](https://www.tomdalling.com/blog/category/software-design/) principles! 
