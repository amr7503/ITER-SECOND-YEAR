def check_protected_format(amount):
    return f'{amount:*>10}'

amount = input("Enter the dollar amount: ")
print('Check-protected amount: ',check_protected_format(amount))

'''
Write a script that inputs a dollar amount, then prints the amount in check-protected 
format in a field of 10 characters with leading asterisks if necessary.


Formatting: The f"{amount:*>10}" part formats the string:
-The * is the fill character.
-The > aligns the text to the right.
-The 10 is the total length of the string.
-The f before the string indicates that it's a formatted string.

Padding means adding extra characters to a string to make it fit a certain length. In this case, we're adding asterisks to the front of the dollar amount to make sure the total length is 10 characters. This ensures there are no empty spaces that someone could alter.



# Output:
# Enter the dollar amount: 123.45
# Check-protected amount: ****123.45

'''