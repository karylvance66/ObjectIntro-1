/* 
You can see an explanation of this in Edhesive, Term 2 Lesson 3 - 
https://intro.edhesive.com/courses/28804/pages/term-2-lesson-3-classes-the-basics?module_item_id=7425717 
*/

public class Book{
 
/* fields or instance variables
        -should be private
        -defines the attributes of your object
        -every book has a title, author, year, etc. 
*/
private String title;
private String author;
private int year;

/*  Constructor 
        -must be public
        -does not have a return data type
        -must have the same name as a class
        -can be more than one with different method signatures  
*/
public Book(){
  title = "NA";
  author = null;
  year = -1;
}
public Book(String n, String a, int y){

  title = n;
  author = a;
  setYear(y);
}
public Book(String n, String a){
  title = n;
  author = a;
  year = -1;
}

/* toString method
  - is called implicitly - meaning without being called directly by println/print
  -must return a String and be called toString exactly
  -must not have any parameters
*/
public String toString(){
  return title + "\n\t" + author + "\n\t" + year;
}

/* mutator methods modify the instance variable of an object*/
public void setYear(int y){
  
  if( y >= 1450 ){
    year = y;
  }
  else
    year = 1450;
}

/* accessor methods return the current state of an instance variable*/

public String getTitle(){
  return title;
}






}