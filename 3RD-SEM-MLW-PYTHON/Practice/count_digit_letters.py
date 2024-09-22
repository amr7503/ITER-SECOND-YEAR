str=input('Enter a string ')
count_digits=0
count_letters=0

for i in str:
    if ord(i)>=48 and ord(i)<=57:
        count_digits=count_digits+1
    if ord(i)>=65 and ord(i)<=90:
        count_letters=count_letters+1
    if ord(i)>=97 and ord(i)<=122:
        count_letters=count_letters+1

print("Number of digits = ",count_digits)
print("Number of letters = ",count_letters)
