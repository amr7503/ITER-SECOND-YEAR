'''
Write  a  program  that  prints  a  histogram  of  frequencies  of  characters  occurring  in  a 
message supplied by the user. 
'''
message = input("Enter a message: ")
frequency = {}
for char in message:
    if char in frequency:
        frequency[char] += 1        
    else:
         frequency[char] = 1

print("Histogram of the input string:")
for char, freq in frequency.items():
    print(f"{char}: {'*' * freq}")

'''
Enter a message: Hello world this is a histogram
Histogram of the input string:
H: *
e: *
l: ***
o: ***
 : *****
w: *
r: **
d: *
t: **
h: **
i: ***
s: ***
a: **
g: *
m: *
'''