def q1(x,y,z):
    return (x<y) or (not(z==y) and (z<x))
print(q1(0,6,10)) # True or (not(False) and (False)) => True or (True and False) => True or False => True
print(q1(1,1,1)) # False or (not(True) and (False)) => False or (False and False) => False or False => False

q2a= -7*20+8/16*2+54
q2b = 7**2 // 9 % 3
q2c = (7 - 4 * 2) * 10 - 25 * 8 // 5
q2d = 5 % 10 + 10 - 25 * 8 // 5
#q2e = 'hello' * 2 - 5

print(q2a) # -140 + 1 + 54 => -85
print(q2b) # 49 // 9 % 3 => 5 % 3 => 2
print(q2c) # (7 - 8) * 10 - 40 => -10 - 40 => -50
print(q2d) # 5 + 10 - 40 => -25
#print(q2e) # TypeError: unsupported operand type(s) for -: 'str' and 'int'

'''
 The precedence of operators - determines the order in which operations are performed in an expression. Operators with higher precedence are evaluated before operators with lower precedence.

1.Parentheses: ()
2.Exponentiation: **
3.Unary plus, minus, and bitwise NOT: +x, -x, ~x
4.Multiplication, division, floor division, and modulus: *, /, //, %
5.Addition and subtraction: +, -


Associativity - determines the order in which operators of the same precedence are evaluated. Most operators are left-associative, meaning they are evaluated from left to right. However, some operators, like the exponentiation operator (**), are right-associative, meaning they are evaluated from right to left.


'''

q3a = 'hi' > 'hello' and 'bye' < 'Bye'
q3b = 'hi' > 'hello' or 'bye' < 'Bye'
q3c = 7 > 8 or 5 < 6 and 'I am fine' > 'I am not fine'
q3d = 10 != 9 and 29 >= 29
q3e = 10 != 9 and 29 >= 29 and 'hi' > 'hello' or 'bye' < 'Bye' and 7 <= 2.5

print(q3a) # True and False => False
print(q3b) # True or False => True
print(q3c) # False or True and False => False or False => False
print(q3d) # True and True => True
print(q3e) # True and True and False or False and False => True and False or False => False or False => False