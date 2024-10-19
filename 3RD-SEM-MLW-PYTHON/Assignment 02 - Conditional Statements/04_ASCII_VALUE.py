ch=input("Enter a character : ")
ascii=ord(ch)
if ascii>=65 and ascii<=90:
    print("Capital letter")
elif ascii>=97 and ascii<=122:
    print("Small case letter")
elif ascii>=48 and ascii<=57:
    print("Digit")
else:
    print("Special Symbol")
