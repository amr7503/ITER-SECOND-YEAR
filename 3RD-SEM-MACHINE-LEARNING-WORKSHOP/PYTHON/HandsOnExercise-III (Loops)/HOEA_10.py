import math
n=16
print("N\tlog N\tN²\tN³\t2ⁿ")
while n<=2048:
    print(f"{n}\t{math.log(n)}\t{n**2}\t{n**3}\t{2**n}")
    n=n*2
