'''
Write a Python program that randomly fills in 0s and 1s into a 4-by-4 matrix, prints the 
matrix, and finds the first row and column with the most 1s.  
 
Here is a sample run of the program: 
0 0 1 1 
0 0 1 1 
1 1 0 1 
1 0 1 0 
 
The largest row index: 2 
The largest column index: 2
'''

import random
mat=[]
for i in range(4):
    row=[]
    for j in range(4):
        row.append(random.randint(0,1))
    mat.append(row)

print("Randomly filled 4x4 matrix : ")
for row in mat:
    print(row)

maxCol=0
maxRow=0
col_index=0
row_index=0

for i in range(4):
    rowSum=0
    colSum=0
    for j in range(4): #i->const j->varies
        rowSum+=mat[i][j]
        colSum+=mat[j][i]
    if rowSum>maxRow:
        maxRow=rowSum
        row_index=i
    if colSum>maxCol:
        maxCol=colSum
        col_index=i
    
print("The largest row index:",row_index)
print("The largest column  index:",col_index)


'''
Randomly filled 4x4 matrix : 
[1, 1, 1, 0]
[1, 1, 1, 1]
[1, 1, 0, 1]
[1, 0, 1, 0]
The largest row index: 1
The largest column  index: 0

-------------------------------------

Randomly filled 4x4 matrix : 
[0, 0, 1, 0]
[1, 1, 1, 1]
[0, 1, 0, 1]
[1, 0, 1, 0]
The largest row index: 1
The largest column  index: 2

-------------------------------------

Randomly filled 4x4 matrix : 
[1, 0, 0, 0]
[1, 1, 0, 1]
[0, 1, 1, 0]
[0, 1, 1, 0]
The largest row index: 1
The largest column  index: 1

-------------------------------------

Randomly filled 4x4 matrix : 
[0, 0, 0, 1]
[0, 0, 1, 0]
[0, 1, 0, 0]
[1, 0, 1, 1]
The largest row index: 3
The largest column  index: 2

'''