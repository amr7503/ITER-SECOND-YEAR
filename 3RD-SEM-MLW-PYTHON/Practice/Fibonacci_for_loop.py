def fibonacci(n):
    assert n>0,'Number should be positive'
    a=0
    b=1
    if n==1 or n==2:
        c=n-1
    for i in range(3,n+1):
        c=a+b
        a=b
        b=c
    return c

n=int(input("Enter a number : "))
print(f"{n}th fibonacci is {fibonacci(n)}")