'''
Write function fib_rec(n) that recursively computes Fibonacci numbers.
'''

def fib_rec(n):
     if n==0 or n==1:
          return n
     else:
          return fib_rec(n-1)+fib_rec(n-2)
n=int(input("Enter the value of n : "))
print(f"{n}th fibonnaci is {fib_rec(n)}")

'''
Enter the value of n : 6
6th fibonnaci is 8
'''