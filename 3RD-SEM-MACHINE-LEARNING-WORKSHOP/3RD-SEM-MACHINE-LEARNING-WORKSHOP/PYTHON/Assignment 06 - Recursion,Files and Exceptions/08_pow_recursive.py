'''
Write  recursive  function  power_of(value,  exponent)  that  exponentiates  the  given 
positive integer with the positive number specified as second parameter.  
For example, the call power_of(4,  2) should return the square of 4, so it computes       
42 = 16. You may not use the built-in functionality pow() or the operator **.

'''

def power_of(value, exponent):
    if exponent==1:
        return value
    else:
        return value*power_of(value,exponent-1)
    
v=int(input("Enter value : "))
e=int(input("Enter exponent : "))

print(f"{v} to the power {e} is {power_of(v,e)}")

'''
Enter value : 2
Enter exponent : 5
2 to the power 5 is 32
'''
