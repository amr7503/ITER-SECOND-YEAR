'''
Define a function to add two matrices. In order to be added, the two matrices must have 
the same dimensions and the same or compatible types of elements. Let c be the resulting matrix. 
Each element c[i][j] is  a[i][j] + b[i][j]. 
Write a Python program that prompts the user to enter two 3 * 3 matrices and display their sum
'''


def add_matrices(mat1,mat2):
    result=[]
    for i in range(3): # len(mat1)
        row=[]
        for j in range(3): # len(mat1[0])
            row.append(mat1[i][j]+mat2[i][j])
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

result=add_matrices(mat1,mat2)

print("Resultant matrix after adding two matrices : ")
for row in result:
    print(row)


'''
Enter elements of first matrix : 
Enter three elements of row 1 seperated by space : 2 3 4
Enter three elements of row 2 seperated by space : 1 5 6
Enter three elements of row 3 seperated by space : 4 2 3
Enter elements of second matrix : 
Enter three elements of row 1 seperated by space : 6 2 4
Enter three elements of row 2 seperated by space : 3 5 6
Enter three elements of row 3 seperated by space : 7 4 2
Resultant matrix after adding two matrices :
[8, 5, 8]
[4, 10, 12]
[11, 6, 5]
'''