'''
Write recursive function reverse_string(text) that flips the letters of the text passed 
in.
'''

def reverse_string(text):
    if len(text)==0:
        return ""
    else:
        return reverse_string(text[1:])+text[0]

text=input("Enter a string : ")
print("It's reverse is " ,reverse_string(text))

'''
Enter a string : Amaresh Swain
It's reverse is  niawS hseramA
'''