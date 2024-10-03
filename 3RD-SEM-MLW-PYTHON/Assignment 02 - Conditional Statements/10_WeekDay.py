n=int(input("Enter today's day: "))
if(n<0 or n>6):
    print("Invalid Day! Enter number from 0 t0  6 (Sunday is 0, Monday is 1,.... and Saturday is 6)")
else:
    d=int(input("Enter the number of days elapsed since today : "))
    if(d<0):
        print("Invalid Input! Enter a positive number")
    else:
        d=(n+d)%7
        if n==0:
            print("Today is Sunday",end=" ")
        elif n==1:
            print("Today is Monday",end=" ")
        elif n==2:
            print("Today is Tuesday",end=" ")
        elif n==3:
            print("Today is Wednesday",end=" ")
        elif n==4:
            print("Today is Thursday",end=" ")
        elif n==5:
            print("Today is Friday",end=" ")
        elif n==6:
            print("Today is Saturday",end=" ")

        if d==0:
            print("and the future day is Sunday")
        elif d==1:
            print("and the future day is Monday")
        elif d==2:
            print("and the future day is Tuesday")
        elif d==3:
            print("and the future day is Wednesday")
        elif d==4:
            print("and the future day is Thursday")
        elif d==5:
            print("and the future day is Friday")
        elif d==6:
            print("and the future day is Saturday")

