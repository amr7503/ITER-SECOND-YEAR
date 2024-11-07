'''Write a Python program that displays all the numbers from 100 to 1000,ten per line, that are divisibleby 5 and 6. Numbers  are separated by exactly one space'''

count=0
for i in range(100,1000):
    if i%5==0 and i%6==0:
        print(i,end=" ")
        
        count=count+1
        if count%10==0:
            print()


"""
120 150 180 210 240 270 300 330 360 390 
420 450 480 510 540 570 600 630 660 690
720 750 780 810 840 870 900 930 960 990
"""