#WPP to check  the given number is AR=rmstrong number or not (1^3+5^3+3^3 = 153)

n=input("Enter the number : ")
n_length=len(n)
sum=0
for i in n:
    sum=sum+int(i)**n_length
if sum==int(n):
    print("The number is Armstrong")
else:
    print("The number is not a Armstrong")
