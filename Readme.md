## Library Management System
This library management system was done by using Java Spring , Java Swing and Mysql technologies.
#### How to use
1) Recall that, this application uses Mysql, so you have to download Mysql to your computer to run this application. This application connects a local Mysql server which is in localhost:3306/librarydb but if you want , you can change this url by using Beans.xml file. Also "librarydb" in this local server url is a schema and you have to create a schema for using this application. Assume that your local Mysql server runs in "localhost:25420" and your schema is "schema1", so you have to change url property in dataSource bean as "jdbc:mysql://localhost:25420/schema1".

2) You have to write your Mysql username and password to username and password properties in dataSource bean in Beans.xml file to run this application.

3) This application uses some external libraries such as Spring, for using this application these files must be added to Classpath of this project. I placed these files to RequiredFiles folder but you don't need to do anything here because I added these dependencies to .classpath file.
#### Demo 


#### Attributions
1) Thanks to <a href="https://www.flaticon.com/free-icons/book" title="book icons">Book icons created by Good Ware - Flaticon</a> for book.png file

2) Thanks to <a href="https://www.flaticon.com/free-icons/add" title="add icons">Add icons created by Freepik - Flaticon</a> for add-user.png file

3) Thanks to "Photo by Alfons Morales on Unsplash" for libraryBackground.png 

4) Thanks to <a href="https://www.flaticon.com/free-icons/book" title="book icons">Book icons created by surang - Flaticon</a> for assign-book.png file

5) Thanks to <a href="https://www.flaticon.com/free-icons/auction" title="auction icons">Auction icons created by Wichai.wi - Flaticon</a> for see-penalties.png file
