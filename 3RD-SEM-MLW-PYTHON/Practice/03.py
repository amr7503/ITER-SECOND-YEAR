#arr=list(float(x) for x in input("Enter ten numbers: ").split())
arr=list(map(float, input("Enter ten numbers: ").split()))

min=arr[0]
for x in arr:
    if x<min:
        min=x
print(f"The minimum number is {min}")