'''
Write a Python function that reads a file file1 and displays the number of words and the 
number of vowels in the file
'''

f=open("file1.txt","r")
vowels='aeiouAEIOU'
data=f.read()
no_words=len(data.split())
no_vowels=0
for x in data:
    if x in vowels:
        no_vowels+=1

print("Number of words = ",no_words)
print("Number of vowels = ",no_vowels)

'''
#Contents of file1::::

Hello World
This is line 2
This is line 3
Last line 

#OUTPUT

Number of words =  12
Number of vowels =  14

'''