def fibonacci(n):
    fib=[0,1]
    for i in range(2,n+1):
        fib.append(fib[i-1]+fib[i-2])
    return fib[n]

n=int(input("Enter a number : "))
print(f"Fibonacci of {n} is {fibonacci(n)}")