def to_octal(n):
    oct=''
    while n>0:
        oct=str(n%8)+oct
        n=n//8
    return oct
def to_hex(n):
    hex=''
    while n>0:
        d=n%16
        if d<10:
            x=str(d)
        else:
            x=chr(55+d)
        hex=x+hex
        n=n//16
    return hex

n=int(input("Enter the number : "))
print(f"Octal of {n} is { to_octal(n)}")
print(f"Hexadeciaml of {n} is { to_hex(n)}")
