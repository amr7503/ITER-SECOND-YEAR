def calc_armstrong_numbers():
    for x in range(1,10):
        for y in range(1,10):
            for z in range(1,10):
                if  (x*100+y*10+z) == (x**3+y**3+z**3):
                    print(x,y,z,sep="")
print("All 3 digits armstrong numbers are : ")
calc_armstrong_numbers()