import math

for a in range(1,101):
    for b in range(1,101):
        for c in range(1,101):
            if a**2 + b**2 == c**2:
                print(f"{a}^2 + {b}^2 = {c}^2")

# Time complexity - O(n^3)

for a in range(1,101):
    for b in range(1,101):
        c = math.sqrt(a**2 + b**2)      
        if c == int(c) and c <= 100:
            print(f"{a}^2 + {b}^2 = {int(c)}^2")

# Time complexity - O(n^2)