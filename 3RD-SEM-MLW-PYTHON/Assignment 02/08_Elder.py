a=int(input("Enter age of Rahul : "))
b=int(input("Enter age of Ayush : "))
c=int(input("Enter age of Ajay : "))

# if a>b and a>c:
#     print('Rahul is eldest')
# elif b>a and b>c:
#     print('Ayush is eldest')
# elif c>a and c>b:
#     print('Ajay is eldest')

if a>b:
    if a>c:
        print('Rahul is eldest')
    else: # b<c
        print('Ajay is eldest')
else: # a<b
    if b>c:
        print('Ayush is eldest')
    else: # b<c
        print('Ajay is eldest')