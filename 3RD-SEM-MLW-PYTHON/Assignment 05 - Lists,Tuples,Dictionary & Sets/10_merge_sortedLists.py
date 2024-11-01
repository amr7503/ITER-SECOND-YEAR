'''
Given two lists of numbers, each sorted in ascending order, merge them into a result list 
according to their order. Write function mergeList(values1, values2).
'''

def mergeList(values1,values2):
    arr=[]
    i=0
    j=0
    while i<len(values1) and j<len(values2):
        if values1[i]<values2[j]:
            arr.append(values1[i])
            i+=1
        else:
            arr.append(values2[j])
            j+=1
    
    if i!=len(values1):
        while i<len(values1):
            arr.append(values1[i])
            i+=1

    if j!=len(values2):
        while j<len(values2):
            arr.append(values2[j])
            j+=1

    return arr

print("Enter first sorted list")
values1=list(map(int,input().split()))

print("Enter second sorted list")
values2=list(map(int,input().split()))

print("Merged sorted list :",mergeList(values1,values2))

'''
Enter first sorted list
1 4 7 12 20
Enter second sorted list
10 15 17 33
Merged sorted list : [1, 4, 7, 10, 12, 15, 17, 20, 33]

-----------------------------------------------------------

Enter first sorted list
1 2 3
Enter second sorted list

Merged sorted list : [1, 2, 3]

'''