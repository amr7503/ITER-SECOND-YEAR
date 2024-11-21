'''
Write a program that reads three integers from the user and displays themin sorted order
(from smallest to largest). Use the min and max functions to find the smallest and largest values.
The middle value can be found by computing the sum of all three values, 
and then subtracting the minimum value and the maximum value.
'''
a=int(input("Enter first number : "))
b=int(input("Enter second number : "))
c=int(input("Enter third number : "))

largest=max(a,max(b,c))
smallest=min(a,min(b,c))
middle=(a+b+c)-(largest+smallest)

print("The three numbers arranged in sorted order : ")
print(smallest,middle,largest)

'''
Enter first number : 67
Enter second number : 98
Enter third number : 55
The three numbers arranged in sorted order : 
55 67 98
'''