'''
Write function gcd(a, b) that computes the greatest common divisor (GCD) recursively. 
'''
def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)
    
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
print(f"GCD of {a} and {b} is {gcd(a,b)}")

'''
Enter first number : 48
Enter second number : 120
GCD of 48 and 120 is 24
'''
