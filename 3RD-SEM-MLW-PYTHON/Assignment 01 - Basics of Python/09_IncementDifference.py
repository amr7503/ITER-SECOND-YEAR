'''
How does the effect of following two statements differ?
a. x += x + 10 
b. x = x + 10
'''

# Solution:
'''
The two statements x += x + 10 and x = x + 10 may look similar, but they actually perform different operations. Let's break down each statement and see how they differ:

a. x += x + 10
This statement uses the compound assignment operator +=, which adds the value on the right to the variable and then assigns the result to the variable.

If you break it down, it works as follows:

x += x + 10

This is equivalent to:

x = x + (x + 10)

So, if you start with:

x = 5
The expression would be:

x = 5 + (5 + 10)
x = 5 + 15
x = 20
So, x += x + 10 essentially doubles x, adds 10, and then assigns the result back to x.


---------------------------------------------------------------------------------------------

b. x = x + 10
This statement simply adds 10 to the current value of x and then assigns the result back to x.

If you start with:

x = 5
The expression would be:

x = 5 + 10
x = 15

So, x = x + 10 simply adds 10 to x and assigns the result back to x.


'''