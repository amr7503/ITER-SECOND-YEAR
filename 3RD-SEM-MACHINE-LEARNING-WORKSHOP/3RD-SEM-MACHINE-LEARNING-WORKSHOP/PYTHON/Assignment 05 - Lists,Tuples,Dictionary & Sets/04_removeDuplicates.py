'''
Define a function that eliminates the duplicate values in the list. Write a Python program 
that reads in ten integers, invokes the method, and displays the result.
'''

def remove_duplicate(num):
    distinct_num=[]
    for val in num:
        if val not in distinct_num:
            distinct_num.append(val)
    return distinct_num

num=list(map(int,input("Enter ten numbers: ").split()))
print("The distinct numbers are: ",remove_duplicate(num))

'''
Enter ten numbers: 2 3 4 5 6 5 4 4 3 2
The distinct numbers are:  [2, 3, 4, 5, 6]
'''