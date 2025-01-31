#WPP to print the multiplication table of a given number

n=int(input('Enter a number'))
print('MULTIPLICATION TABLE OF',n,' IS :::: ')

for i in range(1,11):
    print(f"{n} X {i} = {n*i}")
