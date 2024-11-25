'''
Define a function to multiply two matrices. 
For example, for two 3 * 3 matrices a and b the product c is a 3 * 3 matrix

where c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j].
Write a Python program that prompts the user to enter two 3 * 3 matrices and displays 
their product.
'''


def  multiply_matrices(mat1,mat2):
    result=[]
    for i in range(3):   #len(mat1) - no. of rows in first matrix 
        row=[]
        for j in range(3):  #len(mat2[0]) - no. of columns in second matrix
            sum=0
            for k in range(3):  #len(mat2) - no. of rows in second matrix
                sum+=mat1[i][k]*mat2[k][j]  #multiplying elements of row i of first matrix with elements of column j of second matrix , k is  variable used to iterate over elements of row i of first matrix and column j of second matrix
            row.append(sum)
        result.append(row)
    return result

def input_matrice():
    mat=[]
    for i in range(3):
        row=list(map(int,input(f"Enter three elements of row {i+1} seperated by space : ").split()))
        mat.append(row)
    return mat

print("Enter elements of first matrix : ")
mat1=input_matrice()
print("Enter elements of second matrix : ")
mat2=input_matrice()

result=multiply_matrices(mat1,mat2)

print("Resultant matrix after multiplying two matrices : ")
for row in result:
    print(row)


'''

Enter elements of first matrix : 
Enter three elements of row 1 seperated by space : 1 2 3
Enter three elements of row 2 seperated by space : 2 3 4
Enter three elements of row 3 seperated by space : 3 2 1
Enter elements of second matrix : 
Enter three elements of row 1 seperated by space : 5 2 3
Enter three elements of row 2 seperated by space : 4 5 1
Enter three elements of row 3 seperated by space : 3 2 6
Resultant matrix after multiplying two matrices : 
[22, 18, 23]
[34, 27, 33]
[26, 18, 17]

'''