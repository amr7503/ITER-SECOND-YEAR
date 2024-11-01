'''
Calculate the sum of the digits of a number recursively. Write recursive function calc_ 
sum_of_digits(value) for this purpose
'''

def calc_sum_of_digits(value):
    if value==0:
        return 0
    else:
        return value%10+calc_sum_of_digits(value//10)
n=int(input("Enter a number : "))
print("Sum of it's digits is",calc_sum_of_digits(n))
'''
Enter a number : 372
Sum of it's digits is 12
'''