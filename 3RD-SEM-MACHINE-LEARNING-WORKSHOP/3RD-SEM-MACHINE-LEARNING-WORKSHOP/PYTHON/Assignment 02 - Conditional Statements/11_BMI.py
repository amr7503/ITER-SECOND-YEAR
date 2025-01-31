w=float(input("Enter your weight in kilograms : "))
h=float(input("Enter your height in meters : "))
bmi=w/(h**2)
if bmi<18.5:
    print(f"Your BMI is {bmi} and you are Underweight")
elif bmi<25:
    print(f"Your BMI is {bmi} and you are Normal")
elif bmi<30:
    print(f"Your BMI is {bmi} and you are Overweight")
else:
    print(f"Your BMI is {bmi} and you are Obese")
# Output:
# Enter your weight in kilograms : 65
# Enter your height in meters : 1.7
# Your BMI is 22.49134948096886 and you are Normal

# Enter your weight in kilograms : 72
# Enter your height in meters : 1.7
# Your BMI is 24.913494809688583 and you are Normal