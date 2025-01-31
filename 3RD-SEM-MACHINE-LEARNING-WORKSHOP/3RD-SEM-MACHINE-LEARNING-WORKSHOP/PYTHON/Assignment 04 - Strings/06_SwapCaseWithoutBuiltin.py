def SwapCase(str):
    w=""
    for ch in str:
        if ch.isupper():
            w+=ch.lower()
        elif ch.islower():
            w+=ch.upper()
        else:
            w+=ch
    return w
str=input("Enter a string : ")
print("String after swapping case : ",SwapCase(str))

'''
Write a function that takes a sentence as an input parameter and replaces the first letter 
of every word with the corresponding uppercase letter and rest of the letters in the word 
by corresponding letters in lowercase without using built-in function.

'''