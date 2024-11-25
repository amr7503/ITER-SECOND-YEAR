'''
Write a program that determines how quickly an object is travelling when it hits the
ground. The user will enter the height from which the object is dropped in meters (m).
Because the object is dropped its initial speed is 0 m/s. Assume that the acceleration due to gravity is 9.8 m/s2.
You can use the formula Vf =√(Vi^2+2ad)   to compute the final speed, Vf, when the initial speed, Vi, acceleration, a, and distance, d, are known.
'''

import math
d=float(input("Enter the height from which object is dropped (in meters) : "))
a=9.8
vi=0
vf=math.sqrt((vi**2) + (2*a*d))
print("Final speed is",vf)


'''
Enter the height from which object is dropped (in meters) : 50
Final speed is 31.304951684997057
'''