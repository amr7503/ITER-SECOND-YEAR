gender = input("What is your gender (M or F): ")
first_name = input("First name: ")
last_name = input("Last name: ")
age = int(input("Age: "))
married='n' #default for those female who are less than 20
if gender.upper() == 'F' and age >= 20:
    married = input(f"Are you married, {first_name} (y or n)? ")


# if gender.upper() == 'F' and married.lower() == 'y':
#     title = "Mrs."
# elif gender.upper() == 'F' and married.lower() == 'n':
#     title = "Ms."
# elif gender.upper() == 'M' and age >= 20:
#     title = "Mr."
# else:
#     title = ""

title=""
if gender.upper() == 'F':
    if married.lower() == 'y':
        title = "Mrs."
    else:
        title = "Ms."
else: #gender is M
    if age >= 20:
        title = "Mr."

print(f"Then I shall call you {title} {first_name} {last_name}.")