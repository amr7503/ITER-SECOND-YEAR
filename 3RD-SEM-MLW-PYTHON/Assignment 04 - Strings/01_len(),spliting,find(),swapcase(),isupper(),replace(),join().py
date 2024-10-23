test='Hello, How are you'
print("Length of the string is : ",len(test))
print("Only 2 characters from the last word are : ",test[-2:])
print("'Hello' is present in the string at index : ",test.find('Hello'))
print("Change lowercase letter to uppercase and vice versa : ",test.swapcase())
print("Check if the string is in uppercase : ",test.isupper())
print("Separate the words of the string by a comma : ",test.replace(' ',','))
print("Separate the words of the string by a comma (using join()): ",','.join(test.split()))
print("Replace the word 'Hello' with 'Hi' : ",test.replace('Hello','Hi'))

'''
If the input string is test = ‘Hello, How are you’, then 
a.  Find the length of the above string 
b.  Print only 2 characters from the last word of the string 
c.  Find ‘hello’ in the above string  
d.  Change the lowercase letter to uppercase of the above string and vice 
versa, Check if the string is in uppercase or not 
e.  Separate the words of the string by a comma operator  
f.  Replace the word ‘Hello’ by ‘Hi

'''