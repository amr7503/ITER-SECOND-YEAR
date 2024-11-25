n=int(input("Enter the integer: "))
s=0
print("It's digits from right are ")
while n!=0:
    d=n%10
    print(d)
    s=s+d
    n=n//10

if s%9==0:
    print("Divisible by 9")
else:
    print("Not Divisible by 9")


"""

Enter the integer: 154368
It's digits from right are 
8
6
3
4
5
1
Divisible by 9

""
