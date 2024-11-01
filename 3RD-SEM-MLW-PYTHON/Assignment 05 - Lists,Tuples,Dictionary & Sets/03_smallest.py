'''
Write a function that finds the smallest element in a list of double values. Write a Python 
program that prompts the user to enter ten numbers, invokes this function to return the 
minimum value, and displays the minimum value. 
'''

print("Enter ten numbers")
arr=[]
for i in range(10):
    arr.append(float(input()))

min=arr[0]
for val in arr:
    if val<min:
        min=val

print("The minimum number is:",min)

'''
Enter ten numbers
1.9
2.5
3.7
2
1.5
6
3
4
5
2
The minimum number is: 1.5
'''