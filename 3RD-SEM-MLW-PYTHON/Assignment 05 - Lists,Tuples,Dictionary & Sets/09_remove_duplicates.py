'''
You are supposed to remove duplicate entries from a list. The constraint is that the 
original order should be preserved. Write function remove_duplicates(values). 
'''

def remove_duplicates(values):
    distinct=[]
    for val in values:
        if val not in distinct:
            distinct.append(val)
    return distinct

n=int(input("Enter the size of list : "))
arr=[]
print(f"Enter {n} integers ")
for i in range(n):
    arr.append(int(input()))

print("List with duplicates    :",arr)
print("List without duplicates :",remove_duplicates(arr))

'''
Enter the size of list : 8
Enter 8 integers 
10 
20
30
20
50
30
60
20
List with duplicates    : [10, 20, 30, 20, 50, 30, 60, 20]
List without duplicates : [10, 20, 30, 50, 60]
'''