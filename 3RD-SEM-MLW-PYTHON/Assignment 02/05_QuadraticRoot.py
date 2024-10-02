a=float(input("Enter the value of a : "))
b=float(input("Enter the value of b : "))
c=float(input("Enter the value of c : "))
d=(b**2)-(4*a*c)
if d>0:
    x1=(-b+(d**0.5))/(2*a)
    x2=(-b-(d**0.5))/(2*a)
    print("The equation has two roots ",x1," and ",x2)
elif d==0:
    x=-b/(2*a)
    print("The equation has one root ",x)
else:
    print("The equation has no real roots")