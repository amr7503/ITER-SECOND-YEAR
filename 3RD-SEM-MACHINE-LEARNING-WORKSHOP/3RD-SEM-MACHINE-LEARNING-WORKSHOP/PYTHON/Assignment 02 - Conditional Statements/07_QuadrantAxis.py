x=float(input("Enter the x coordinate : "))
y=float(input("Enter the y coordinate : "))
if x>0 and y>0:
    print(f"({x},{y}) is in quadrant I")
elif x<0 and y>0:
    print(f"({x},{y}) is in quadrant II")
elif x<0 and y<0:
    print(f"({x},{y}) is in quadrant III")
elif x>0 and y<0:
    print(f"({x},{y}) is in quadrant IV")
elif x==0 and y!=0:
    print(f"({x},{y}) is on the y-axis")
elif x!=0 and y==0:
    print(f"({x},{y}) is on the x-axis")
else:
    print(f"({x},{y}) is on the origin")

# Output:
# Enter the x coordinate : 3
# Enter the y coordinate : 4
# (3.0,4.0) is in quadrant I

#Enter the x coordinate : -1.0
#Enter the y coordinate : -2.5
# (-1.0,-2.5) is in quadrant III

#Enter the x coordinate : 0.0
#Enter the y coordinate : 4.8
# (0.0,4.8) is on the y-axis
