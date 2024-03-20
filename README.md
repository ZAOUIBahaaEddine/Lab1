# Lab 1:
## Exercise 1:
### Line coverage's result is 91 percent
### The "return true" line is not covered
### The issue was the incrementation of j and i: "j++;i--;"
### The correct is "i++; j--;"
## Exercise 2:
### The old method has an issue with the loop: for (int i = 0; i <= s1.length(); i++), which causes "ArrayIndexOutOfBoundsException"
### The correct one is the new: for (int i = 0; i < s1.length(); i++)
## Exercise 3:
### N.B. This method is wrong: The condition "while (low < high)" will be changed into while (low <= high) in order to consider the case low equals high
## Exercise 4:
### Probably it is better to throw an exception too when delta < 0
### Fours tests are sufficient
## Exercise 5:
### No other remarks
## Exercise 6:
### No other remarks