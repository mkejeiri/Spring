# Spring Framework 5: Beginner to Guru 
### using H2 in memory relational database 
This simple app shows how to use Spring with H2 in memory relational database, its uses the following entities:
* Author
* Book
* Publisher
* Author_Book (auto-gen by Hibernate)

The application populates the H2 DB at startup, and it allows us to retrieve the data and renders it to the authors.html & books.html views (Thymeleaf template engine).
H2 in memory DB is really a powerfull concept to test an application in case we don't have any available database to work with.
