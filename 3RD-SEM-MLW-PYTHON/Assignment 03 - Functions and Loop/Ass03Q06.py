def gcd(a,b):
    while b!=0:
        a,b=b,a%b
    return a

def lcm(a,b):
    return (a*b)//gcd(a,b)

n1=int(input('Enter the first number : ' ))
n2=int(input('Enter the second number : '))
print('The gcd is : ',gcd(n1,n2))
print('The lcm is : ',lcm(n1,n2))
