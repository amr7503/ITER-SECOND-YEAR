str=input("Enter a message : ")
i=1
while i<=10:
    if i==1:
        print("1st",str)
    elif i==2:
        print("2nd",str)
    elif i==3:
        print("3rd",str)
    else:
        print(f"{i}th {str}")
    i=i+1
"""
Enter a message : hello
1st hello
2nd hello
3rd hello
4th hello
5th hello
6th hello
7th hello
8th hello
9th hello
10th hello

"""
