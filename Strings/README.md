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

### contains()

* The `contains()` method checks whether the specified string is present in string or not.
* Syntax: `str1.contains(str2)`
* Checks whether str2 is present in str1
* return value is boolean
* `""` gives true because empty string is subset of every other string.

### split()
* This method splits the string at the specified regex and returns `an array of substrings`
* `string.split(String regex, int limit)`
* `limit` is optional, controls the number of resulting substrings
* If the regex passed to `split()` is invalid, the `split()` method raises `PatternSyntaxExpression`
* If limit is 0, it gives all substrings
* If limit is +ve(say n), then `split()` returns max n substrings

### compare to()
* The `compareTo()` method compares two strings lexicographically(in the dictionary order). The comparision is based on the unicode value of each character in the strings.
* `string.compareTo(String str)`
* returns
  * 0 - if strings are equal
  * -ve - if string comes before str
  * +ve - if string comes after str

### compareToIgnoreCase()

* same as compareTo(), ignoring case differences

