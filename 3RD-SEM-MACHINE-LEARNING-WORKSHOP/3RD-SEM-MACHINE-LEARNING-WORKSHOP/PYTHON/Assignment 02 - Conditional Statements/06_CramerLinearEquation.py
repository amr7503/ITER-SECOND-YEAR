a, b, c, d, e, f = map(float, input("Enter a, b, c, d, e, f: ").split()) 
# To take input from user in a single line
if a*d - b*c == 0:
    print("The equation has no solution")
else:
    x = (e*d - b*f) / (a*d - b*c)
    y = (a*f - e*c) / (a*d - b*c)
    print("x is", x, "and y is", y)

# Output:
# Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
# x is -2.0 and y is 3.0
# Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
# The equation has no solution