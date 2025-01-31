'''
Write a recursive function harmonic_sum(n) to calculate the harmonic sum of first n
terms.
Note: The harmonic sum is the sum of reciprocals of the positive integers. For example, if
n = 4, the output should be (1+1/2+1/3+1/4 ) = 2.0833 
'''

def harmonic_sum(n):
  if n==1:
    return 1
  else:
    return 1/n+harmonic_sum(n-1)

n=int(input("Enter the no. of terms(n) : "))
print("Sum =",harmonic_sum(n))

'''
Enter the no. of terms(n) : 4
Sum = 2.083333333333333
'''