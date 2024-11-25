def myFun(str):
    w=str[0]
    for i in range(1,len(str)):
        if(str[i]==str[i-1]):
            w+="*"
        else:
            w+=str[i]
    return w
str=input("Enter a string: ")
print(myFun(str))


'''
Write a function that takes a string as a parameter and returns a string with every 
successive repetitive character replaced with a star(*). 
For example, 
              'balloon' 
is returned as 
              'bal*o*n' 
              
'''