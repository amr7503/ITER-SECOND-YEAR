str=input(" Enter a string : ")
print("String made of first 2 and last 2 characters : ",end="")
if len(str)<2:
    print("Empty String")
else:
    print(str[:2]+str[-2:])



'''
Write a Python program to get a string made of the first 2 and last 2 characters of a given 
string. If the string length is less than 2, return the empty string instead. 
 
Examples:  
 
Sample String: 'w3resource' 
Expected Result: 'w3ce' 
 
Sample String: 'w3' 
Expected Result: 'w3w3' 
 
Sample String: 'w' 
Expected Result: Empty String

'''