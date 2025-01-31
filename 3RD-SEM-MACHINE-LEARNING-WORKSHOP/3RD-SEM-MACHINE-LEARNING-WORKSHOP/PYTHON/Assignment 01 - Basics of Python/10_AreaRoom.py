'''Write a program that asks the user to enter the width and length of a room. Once these values 
have been read, your program should compute and display the area of the room. The length and the 
width will be entered as floating-point numbers. Include units in your prompt and output message;
either feet or meters, depending on which unit you are more comfortable working with.'''

width=float(input("Enter the width of room(in meters) : "))
length=float(input("Enter the length of room(in meters) : "))

area=width*length
print("Area of the room is",area,"meters")

'''
Enter the width of room(in meters) : 5
Enter the length of room(in meters) : 2.7
Area of the room is 13.5 meters
'''