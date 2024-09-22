#Find all the prime numbers between 1 to 50

for n in range(1,51):
    prime=True
    for i in range(2,n):
        if n%i==0:
            prime=False
    if prime:
        print(n)
