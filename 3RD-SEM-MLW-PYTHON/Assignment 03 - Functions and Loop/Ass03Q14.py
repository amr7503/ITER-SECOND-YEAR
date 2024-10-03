import math
x=int(input('Enter the angle in radian: '))
n=int(input('Enter the no. of terms: '))
sin_value=0
cos_value=0
for i in range(n):
    sin_term=((-1)**i*(x**(2*i+1)))/math.factorial(2*i+1)
    sin_value=sin_value+sin_term
    cos_term=((-1)**i*(x**(2*i)))/math.factorial(2*i)
    cos_value=cos_value+cos_term
print('Sin(x)=',sin_value)
print('Cos(x)=',cos_value)