def replace_char(str):
    first_char = str[0]
    return  first_char + str[1:].replace(first_char, '$')

str=input("Enter a string : ")
result = replace_char(str)
print("String with all occurrences of first character except  the first replaced with '$'",result)  