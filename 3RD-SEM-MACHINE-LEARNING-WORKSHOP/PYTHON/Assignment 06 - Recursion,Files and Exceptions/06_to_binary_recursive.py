'''
Write function to_binary(n) that recursively converts the given positive integer into a
textual binary representation. No call to int(x, base) may be used
'''

def to_binary(n):
  if n==0:
    return ""
  else:
    return to_binary(n//2)+str(n%2)

n=int(input("Enter a number : "))
print(f"Binary of {n} is {to_binary(n)}")

'''
Enter a number : 18
Binary of 18 is 10010
'''