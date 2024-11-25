import math
x=float(input("Enter the value of x : "))
sum=0
n=int(input("Enter the number of terms : "))
for i in range(n):
    sum=sum+ (x**i)/math.factorial(i)
print("Sum of Taylor series e^x = ",sum)