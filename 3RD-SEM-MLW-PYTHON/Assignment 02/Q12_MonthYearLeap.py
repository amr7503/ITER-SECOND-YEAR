month=int(input("Enter the month(1-12) : "))
year=int(input("Enter the year: "))
leap_year=False
days=0
month_name='invalid input'
if (year%4==0 and year%100!=0) or (year%400==0):
    leap_year=True

if month==1:
    days=31
    month_name='january'
elif month==2:
    if leap_year:
        days=29
    else:
        days=28
    month_name='february'
elif month==3:
    days=31
    month_name='march'
elif month==4:
    days=30
    month_name='april'
elif month==5:
    days=31
    month_name='may'
elif month==6:
    days=30
    month_name='june'
elif month==7:
    days=31
    month_name='july'
elif month==8:
    days=31
    month_name='august'
elif month==9:
    days=30
    month_name='september'
elif month==10:
    days=31
    month_name='october'
elif month==11:
    days=30
    month_name='november'
elif month==12:
    days=31
    month_name='december'

print(month_name,year," had ",days," days")
    

    
    
