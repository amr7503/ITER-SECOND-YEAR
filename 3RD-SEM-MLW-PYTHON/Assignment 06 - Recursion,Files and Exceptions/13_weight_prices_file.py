'''
Write a Python function that takes two files of equal size as input from the user. The first 
file contains weights of items, and the second file contains corresponding prices. Create 
another file that should contain price per unit weight for each item.
'''

f1=open("Assignment 06 - Recursion,Files and Exceptions/weights.txt","r")

f2=open("Assignment 06 - Recursion,Files and Exceptions/prices.txt","r")

f3=open("Assignment 06 - Recursion,Files and Exceptions/pricePerWeight.txt","w")

w=f1.readlines()
p=f2.readlines()
n=len(w)

for i in range(n):
    f3.write(str(float(p[i])/float(w[i]))+'\n') 

'''
#Contents of prices.txt ::::
10
6
7
9
18

#Contents of weights.txt ::::
5
2
3
4
6

#OUTPUT - Contents of pricePerWeight.txt
2.0
3.0
2.3333333333333335
2.25
3.0

'''