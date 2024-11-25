def is_number_palindrome(number):
    n=number
    rev=0
    while n!=0:
        rev=rev*10+n%10
        n=n//10
    return rev==number

n=int(input("Enter a number : "))
if is_number_palindrome(n):
    print(n," is palindrome")
else:
    print(n," is not palindrome")
