import math
def calc_primes_up_to(max_value):
    for n in range(2,max_value+1):
        prime=True
        for i in range(2,int(math.sqrt(n))+1): #range(2,n)
            if n%i==0:
                prime=False
                break
        if prime:
            print(n,end=" ")

n=int(input("Enter a number : "))
calc_primes_up_to(n)