def q1(x,y,z):
    return (x<y) or (not(z==y) and (z<x))

print(q1(0,6,10)) # True or (not(False) and (False)) => True or (True and False) => True or False => True

print(q1(1,1,1)) # False or (not(True) and (False)) => False or (False and False) => False or False => False