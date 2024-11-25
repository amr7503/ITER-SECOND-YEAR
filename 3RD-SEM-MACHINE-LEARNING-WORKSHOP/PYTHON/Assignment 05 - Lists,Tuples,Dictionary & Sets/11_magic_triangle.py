'''
Write function is_magic_triangle(values) that checks whether a sequence of numbers 
forms a magic triangle. Such a triangle is defined as one where the respective sums of the 
three sides' values must all be equal. The sequence of numbers must be entered in the 
form of a list.
'''

def is_magic_triangle(values):
    if len(values)!=6:
        return False
    
    side1=values[0]+values[1]+values[2]
    side2=values[2]+values[3]+values[4]
    side3=values[4]+values[5]+values[0]

    return side1==side2==side3
print("Enter the sequence of numbers as list : ")
values=list(map(int,input().split()))

print("Is magic triangle?",is_magic_triangle(values))

'''
Enter the sequence of numbers as list : 
1 5 3 4 2 6
Is magic triangle? True

-----------------------------------------

Enter the sequence of numbers as list : 
1 2 3 4 5 6
Is magic triangle? False
'''