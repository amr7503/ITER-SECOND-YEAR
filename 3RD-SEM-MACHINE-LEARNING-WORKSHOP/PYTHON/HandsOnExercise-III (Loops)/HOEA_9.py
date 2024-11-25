print("The sum of the squares of the first hundred natural numbers is,",end="")

s1=0
for i in range(1,101):
    s1=s1+i**2
print(s1)

print("The square of the sum of the first hundred natural numbers is,",end="")

s2=0
for i in range(1,101):
    s2=s2+i
s2=s2**2
print(s2)

print("The difference between them is",s2-s1)
