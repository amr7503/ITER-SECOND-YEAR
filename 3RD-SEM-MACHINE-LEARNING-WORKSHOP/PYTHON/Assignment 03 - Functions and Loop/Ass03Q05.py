def divSum(n):
    sum=0
    for i in range(1,n):
        if n%i==0:
            sum+=i
    return sum
def calc_friends(max_exclusive):
    for n in range(1,max_exclusive+1): 
        x=divSum(n) #n=220 x=284
        y=divSum(x) #y=220
        if n==y:
            print(n,x)

n=int(input("Enter nuber : "))
print("Friends numbers upto ",n," are ")
calc_friends(n)
