'''
Write a Python program to create a list of integers of size N and store random values in 
it. Find and display the sum and average. Create two more lists that contain the even 
and odd values from this list.
'''


import random
num=[]

n = int(input("Enter the size of the list (N): "))
for i in range(n):
    num.append(random.randint(1,100))

print("Generated list of integers : ",num)
print("Sum = ",sum(num))
print("Average = ",(sum(num)/n))

evNum=[]
odNum=[]

for val in num:
    if val%2==1:
        odNum.append(val)
    else:
        evNum.append(val)

print("Even value list is ")
for x in evNum:
    print(x,end=" ")
print("\nOdd value list is ")
for x in odNum:
    print(x,end=" ")

''' #OUTPUT

Enter the size of the list (N): 10
Generated list of integers :  [76, 84, 45, 77, 7, 77, 27, 10, 81, 69]
Sum =  553
Average =  55.3
Even value list is 
76 84 10 
Odd value list is 
45 77 7 77 27 81 69

'''
