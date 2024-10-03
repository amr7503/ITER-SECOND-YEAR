month=int(input("Enter the month(1-12) : "))
year=int(input("Enter the year: "))
leap_year=False
days=0
month_name='invalid input'
if (year%4==0 and year%100!=0) or (year%400==0):
    leap_year=True

if month==1:
    days=31
    month_name='January'
elif month==2:
    if leap_year:
        days=29
    else:
        days=28
    month_name='February'
elif month==3:
    days=31
    month_name='March'
elif month==4:
    days=30
    month_name='April'
elif month==5:
    days=31
    month_name='May'
elif month==6:
    days=30
    month_name='June'
elif month==7:
    days=31
    month_name='July'
elif month==8:
    days=31
    month_name='August'
elif month==9:
    days=30
    month_name='September'
elif month==10:
    days=31
    month_name='October'
elif month==11:
    days=30
    month_name='November'
elif month==12:
    days=31
    month_name='December'

print(month_name,year,"had",days,"days")
    

    

# Output:
# Enter the month(1-12) : 3
# Enter the year: 2015
# March 2015 had 31 days

# Enter the month(1-12) : 2
# Enter the year: 2024
# February 2024 had 29 days
    
