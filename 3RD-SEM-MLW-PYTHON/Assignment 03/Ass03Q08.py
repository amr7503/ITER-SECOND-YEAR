def to_binary(n):
    bin=''
    while n>0:
        bin=str(n%2)+bin
        n=n//2
    return bin

n=int(input("Enter the number : "))
print(f"Binary of {n} is { to_binary(n)}")

