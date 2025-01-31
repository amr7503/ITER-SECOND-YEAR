def replace_char(str):
    first_char = str[0]
    return  first_char + str[1:].replace(first_char, '$')

str=input("Enter a string : ")
result = replace_char(str)
print("String with all occurrences of first character except  the first replaced with '$'",result)  



'''
Write a Python program to get a string from a given string where all occurrences of its 
first char have been changed to '$', except the first char itself. 
 
Examples:  
Sample String: 'restart' 
Expected Result: 'resta$t'
'''