def to_octal(n):
  if n==0:
    return ""
  else:
    return to_octal(n//8)+str(n%8)
    
def to_hex(n):
  if n==0:
    return ""
  else:
    d=n%16
    if d>9:
      if d==10:
        d='A'
      elif d==11:
        d='B'
      elif d==12:
        d='C'
      elif d==13:
        d='D'
      elif d==14:
        d='E'
      elif d==15:
        d='F'
    return to_hex(n//16)+str(d)

n=int(input("Enter a number : "))
print(f"Octal of {n} is {to_octal(n)}")
print(f"Hexadecimal of {n} is {to_hex(n)}")