'''
Write a program that reads a four-digit integer from the user and displays the sum of its
digits. For example, if the user enters 3141 then your program should display 3+1+4+1=9
'''


n=int(input("Enter a four digit integer : "))

d1=n%10
n//=10

d2=n%10
n//=10

d3=n%10
n//=10

d4=n%10
n//=10

sum=d1+d2+d3+d4

''' Alternative approach (using loop)

sum=0
while n!=0:
    sum+=n%10
    n=n//10

'''''

print("Sum of digits =",sum)


'''
Enter a four digit integer : 5673
Sum of digits = 21
'''

