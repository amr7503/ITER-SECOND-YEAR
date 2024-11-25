'''
Add to program in Q 12 to ask the user to enter a number and display the country in 
that position.
'''

countries = ("USA", "India", "Bangladesh", "France", "Japan")

print("Countries : ", countries)

n = int(input("Enter a number to display  the country in that position in the list: "))


if n<len(countries) and n>=0:
    print(f"Country at index {n} is {countries[n]}.")
else:
    print(f"Index out of bound.")

'''
Countries :  ('USA', 'India', 'Bangladesh', 'France', 'Japan')
Enter a number to display  the country in that position in the list: 4
Country at index 4 is Japan.
'''