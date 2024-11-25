'''
Create a tuple containing the names of five countries and display the whole tuple. Ask 
the user to enter one of the countries that have been shown to them and then display 
the index number (i.e. position in the list) of that item in the tuple
'''

countries = ("USA", "India", "Bangladesh", "France", "Japan")

print("Countries : ", countries)

country = input("Enter the name of one of the countries listed above: ")


if country in countries:
    print(f"The index of {country} is {countries.index(country)}.")
else:
    print(f"{country} is not in the list.")


'''
Countries :  ('USA', 'India', 'Bangladesh', 'France', 'Japan')
Enter the name of one of the countries listed above: India
The index of India is 1.
'''