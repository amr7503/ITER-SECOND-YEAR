'''
Write a Python program using a list that reads the integers between 1 and 100 and counts 
the occurrences of each. Assume the input ends with 0.
'''

print("Enter integers between 1 and 100 (0 to exit)")
arr=[]
while True:
    n=int(input())
    if n==0:
        break
    elif n>100 or n<0:
        print("Error!! Input between 1 and 100")
    else:
        arr.append(n)

count=[]
for i in range(101):
    count.append(0)

for x in arr:
    count[x]+=1

for i in range(1,101):
    if(count[i]!=0):
        if count[i]==1:
            print(f"{i} occurs {count[i]} time")
        else:
            print(f"{i} occurs {count[i]} times")


'''
Enter integers between 1 and 100 (0 to exit)
2
5
6
5
4
3
23
43
2
0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
'''