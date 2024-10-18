str=input(" Enter a string : ")
print("String made of first 2 and last 2 characters : ",end="")
if len(str)<2:
    print("Empty String")
else:
    print(str[:2]+str[-2:])