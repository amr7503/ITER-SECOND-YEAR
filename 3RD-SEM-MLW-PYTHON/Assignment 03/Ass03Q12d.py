n=int(input("Enter number of rows : "))
x=1
for i in range(1,n+1):
    for j in range(1,i+1):
        print(x,end=" ")
        x=x+1
    print()
    
"""
Enter number of rows : 5
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 

"""
