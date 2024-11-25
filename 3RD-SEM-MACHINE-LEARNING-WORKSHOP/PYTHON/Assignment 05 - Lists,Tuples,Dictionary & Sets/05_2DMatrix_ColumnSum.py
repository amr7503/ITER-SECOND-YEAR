'''
Define a function that returns the sum of all the elements in a specified column in a 
matrix. Write a Python program that reads a 3-by-4 matrix and displays the sum of each 
column.
'''

def ColumnSum(mat,i):
    return mat[0][i]+mat[1][i]+mat[2][i]

mat=[]
print("Enter a 3-by-4 matrix row by row")
for i in range(3):
    row=list(map(float,input().split()))
    mat.append(row)

for i in range(4):
    print("Sum of elements at column",i,"is ",ColumnSum(mat,i))

# OR => for row in mat: sum+=row[i]
'''
Enter a 3-by-4 matrix row by row
1.5 2 3 4 
5.5 6 7 8
9.5 1 3 1
Sum of elements at column 0 is  16.5
Sum of elements at column 1 is  9.0
Sum of elements at column 2 is  13.0
Sum of elements at column 3 is  13.0
'''