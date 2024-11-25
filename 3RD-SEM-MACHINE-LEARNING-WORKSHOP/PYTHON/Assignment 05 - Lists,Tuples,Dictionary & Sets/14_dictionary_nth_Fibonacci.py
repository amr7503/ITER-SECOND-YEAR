'''
Write a program that prints up to nth Fibonacci number by using a dictionary

'''

n=int(input("Enter the value of n : "))
fibonacci={ 0:0,
            1:1 }

for i in range(2, n+1):
    fibonacci[i] = fibonacci[i-1] + fibonacci[i-2]

# print(fibonacci)

for i,j  in fibonacci.items():
    print(f"{i}th fibonacci : {j}")

'''
Enter the value of n : 15
0th fibonacci : 0
1th fibonacci : 1
2th fibonacci : 1
3th fibonacci : 2
4th fibonacci : 3
5th fibonacci : 5
6th fibonacci : 8
7th fibonacci : 13
8th fibonacci : 21
9th fibonacci : 34
10th fibonacci : 55
11th fibonacci : 89
12th fibonacci : 144
13th fibonacci : 233
14th fibonacci : 377
15th fibonacci : 610
'''