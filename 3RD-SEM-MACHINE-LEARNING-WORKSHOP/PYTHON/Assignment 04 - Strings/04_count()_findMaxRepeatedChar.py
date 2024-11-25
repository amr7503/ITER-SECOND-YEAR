str=input("Enter the string: ")
max=0
for i in str:
    if str.count(i)>max:
        max=str.count(i)
        ch=i
print(str.replace(ch,'-'))

'''
Write a python program to replace that character, which is repeated maximum time in 
each string by ‘-’ (dash).

'''

