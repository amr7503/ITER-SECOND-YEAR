n=int(input("Enter the value of n : "))
i=0

while 2**i <= n:
    i=i+1

print("Lowest power of 2 less than equal to",n,"is",i-1," with value",(2**(i-1)))

"""
Enter the value of n : 10
Lowest power of 2 less than equal to 10 is 3  with value 8
"""
