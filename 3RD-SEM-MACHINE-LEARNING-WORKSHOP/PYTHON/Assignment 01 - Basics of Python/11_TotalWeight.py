'''
An online retailer sells two products: widgets and gizmos. Each widget weighs 75 grams.
Each gizmo weighs 112 grams. Write a program that reads the number of widgets and
the number of gizmos from the user. Then your program should compute and display
the total weight of the parts.
'''

w=int(input("Enter the number of widgets : "))
g=int(input("Enter the number of gizmos : "))
total_weight=w*75+g*112
print("Total weight of the parts",total_weight)

'''
Enter the number of widgets : 2
Enter the number of gizmos : 3
Total weight of the parts 486
'''