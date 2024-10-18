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