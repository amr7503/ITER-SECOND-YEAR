'''
You are supposed to remove duplicate entries from a list. The constraint is that the 
original order should be preserved. Write function remove_duplicates(values). 
'''

def remove_duplicates(values):
    distinct=[]
    s=set()
    for val in values:
        if val not in s:
            s.add(val)
            distinct.append(val)
    return distinct
    
'''Why Set? Because it's efficient for accessing elements.
   With Set: The membership check is O(1), so the overall time complexity is O(n).
   Without Set: The membership check is O(n), making the overall time complexity O(n²) in the worst case.
'''


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
1
2
3
2
1
4
5
4
List with duplicates    : [1, 2, 3, 2, 1, 4, 5, 4]
List without duplicates : [1, 2, 3, 4, 5]

-------------------------------------------
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