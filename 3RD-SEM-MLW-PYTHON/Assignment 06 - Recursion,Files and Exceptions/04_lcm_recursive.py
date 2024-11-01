'''
Write  function  lcm(a,  b)  that  computes  the  lowest  common  multiplier  (LCM) 
recursively.
'''

def gcd(a,b):
    if b==0:
        return a
    else:
        return gcd(b,a%b)

def lcm(a,b):
    return abs(a*b)//gcd(a,b)
    
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
print(f"LCM of {a} and {b} is {lcm(a,b)}")

'''
Enter first number : 4
Enter second number : 3
LCM of 4 and 3 is 12
'''