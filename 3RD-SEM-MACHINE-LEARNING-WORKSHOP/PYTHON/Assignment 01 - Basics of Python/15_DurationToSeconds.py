'''
Create a program that reads duration from the user as number of days, hours, minutes,
and seconds. Compute and display the total number of seconds represented by this
duration.
'''

days = int(input("Enter number of days: "))
hours = int(input("Enter number of hours: "))
minutes = int(input("Enter number of minutes: "))
seconds = int(input("Enter number of seconds: "))

total_seconds = days * 86400 + hours * 3600 + minutes * 60 + seconds

print("The total number of seconds is: ",total_seconds)

'''
Enter number of days: 1
Enter number of hours: 1
Enter number of minutes: 2
Enter number of seconds: 10
The total number of seconds is:  90130
'''