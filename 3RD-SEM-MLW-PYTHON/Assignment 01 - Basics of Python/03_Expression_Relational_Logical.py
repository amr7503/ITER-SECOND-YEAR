q3a = 'hi' > 'hello' and 'bye' < 'Bye'
q3b = 'hi' > 'hello' or 'bye' < 'Bye'
q3c = 7 > 8 or 5 < 6 and 'I am fine' > 'I am not fine'
q3d = 10 != 9 and 29 >= 29
q3e = 10 != 9 and 29 >= 29 and 'hi' > 'hello' or 'bye' < 'Bye' and 7 <= 2.5

print(q3a) # True and False => False
print(q3b) # True or False => True
print(q3c) # False or (True and False) => False or False => False     {AND has higher precidency than OR so evaluated first}
print(q3d) # True and True => True
print(q3e) # (True and True and True) or (False and False) => True or False => True