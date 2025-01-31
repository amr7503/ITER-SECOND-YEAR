'''
A palindrome is a word that reads the same from the front and the back. You can extend 
this  definition  to  the  digits  of  a  number.  Write  recursive  function 
is_number_palindrome(number) but without converting the number into a string and 
then using string functionalities like [::-1].
'''


'''
def is_number_palindrome(number):

    def reverse(num,rev):
        if num==0:
            return rev
        rev=rev*10+num%10
        return reverse(num//10,rev)
    
    return number==reverse(number,0)

'''

def is_number_palindrome(n):

    if n<10:
        return True
    
    length=len(str(n)) 
    last_digit=n%10
    first_digit=n//(10**(length-1))

    if first_digit!=last_digit:
        return False
    
    middle_number=(n%(10**(length-1)))//10

    return is_number_palindrome(middle_number)


n=int(input("Enter a number : "))
rev=0
if is_number_palindrome(n):
    print(n,"is palindrome")
else:
    print(n,"is not palindrome")


'''

Enter a number : 23432
23432 is palindrome

-----------------------

Enter a number : 6
6 is palindrome

-----------------------

Enter a number : 67
67 is not palindrome


'''