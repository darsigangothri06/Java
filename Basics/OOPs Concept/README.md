## OOPs Concept

* OOPs concept is a paradigm that provides many concepts such as:
  * Inheritance
  * Encapsulation
  * Abstraction
  * Polymorphism

**Smalltalk** is considered as first complete object oriented programming language.

* Object means some real world entities. Class means group of objects
* OOP is a methodology to code using classes and objects.



## Object

* Can be defined as an instance of a class
* Contains an Address takes up space in memory.
* Other definitions:
  * An object is a **real-world** entity.
  * An object is a **runtime** entity.
  * The object is an entity which has state and behavior.
  * The object is an **instance of a class**.

## Class

* Collection of Objects.
* It is a logical entity.
* **Blueprint from which you can create an individual object.**
* _Class **doesn't** consume any space._
  
There are **two ways** to create a class.

* Main inside the class.
* Main outside the class
### New Keyword

* Memory gets allocated using NEW keyword  `new`
* Any object gets memory in **Heap** area.



### Method

* Method is like a function, which represents behavior of an object.
* Code reusability.
* Code optimization.
* The method is only invoked once it is called.

### Static Method
* Static method belongs to class, and not to instance of class.
* We can create a static method by using `static` keyword.
* Main advantage of using static method is that, we can call this method without making objects.

## *Constructor*
* Constructor is a block of code similar to a method.
* It is called as soon as instance of a class is created.
* At the time of calling constructor, memory allocation takes place.
* Everytime when a new object is created, Constructor is called by default atleast once.
* Default Constructor is called when no constructor is made.

* ### Types of constructor:
    * Default Constructor (When it does not have any parameters)
      * Default Constructor is used to provide values like '0' and 'null'.
    * Parameterized Constructor.
* ### Constructor Overloading
  * Constructor is very similar to method without any return type.
  * It can also be overloaded similar to methods.
  * Overloading is a technique of having more than one method/constructor with same name and different parameters in it.

## Static Variable
* Used to refer common shared variable with common properties.
* It gets memory only once, at the time of class loading.
* It makes your program memory efficient.

* ### Restrictions of Static Method
  * We cannot use `this` and `super` in static method.
  * Static method cannot use `non-static` members directly.