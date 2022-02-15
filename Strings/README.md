## Strings

* Strings in java are not primitive data types like int, float, char.
* They are the objects of predefined String class

## String Operations

* Length
  * To find the length of the string we use length() method of the string.
  * int c = `str.length()` etc

* Join 
  * We can join twi strings using concat() method
  * `s = s1.concat(s2)`
  * Here, concat method joins the s2 to s1 and assigns it to the variable `s`

* Compare Two Strings using equals()
  * We can make comparision b/w two strings using `equals()` method.
  * `boolean x = s1.equals(s2)`
  * `ewuals()` method checks the `content of strings` while comparing them.
  
* Comparing Two Strings using `==`
  * `==` checks if the  `reference` to string objects are equal or not.
  * `boolean x = (s1 == s2)`

# Strings are immutable

* Once we create a string, we cannot change that string

## Creating new strings using new keyword

* Since strings in java are objects, we can create strings using `new` keyword.
* We have to pass the string into the constructor while creating with new keyword

# Creating String using `literal vs new`

* We know, how strings are created using literals and new
* While creating string using literals
  * `String s1 = "Darsi";`
  * Here, we are directly providing the value of string.
  * Hence, the compiler first checks the string pool if the string already exists.
  * If the string exists, `the new string is not created`, instead it points to the already existing string.
  * If the string not exists, `then the new string is created`

* While we create string using new keyword
  * `String s1 = new String("darsi");`
  * Here, the value is the string is `not` directly provided
  * Hence, a new string is created even though the string is already present in the memory pool.

## String Methods
