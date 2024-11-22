
print(15 & 22)  # 15 ( 0000 1111 ) AND 22 ( 0001 0110 ) => 0000 0110 => 6

print(15 | 22 ) # 15 ( 0000 1111 ) OR 22 ( 0001 0110 ) => 0001 1111 => 31

print(-15 & 22 ) # -15 = 1111 0001 (in 2's complement form) AND 22 = 0001 0110 (in 2's complement form) => 0001 0000 => 16

print(-15 | 22 ) # -15 = 1111 0001 (in 2's complement form) OR 22 = 0001 0110 (in 2's complement form) => 1111 0111 => -9

'''
Identifying the Two's Complement of a Negative Number

Step 1: Identify the sign bit:
The leftmost bit (most significant bit) indicates the sign,here the sign bit is 1, indicating a negative number.
Step 2: Invert all bits:
                       11110111 → 00001000
Step 3: Add 1:
                       00001000+1=00001001
Step 4: Convert the resulting binary number to decimal:
                       00001001 → 9
Step 5: Apply the negative sign:
                            -9
So, 1111 0111 in Two's Complement form represents -9 in decimal.

'''
print( ~ 15 ) # 15 => 0000 1111 (Applying BitwiseNot)=> 1111 0000 => -16 (in 2's complement form)

print( ~ 22 ) # If x is a positive integer, ~x can be quickly found by calculating -(x + 1).For example, to find ~22, we can calculate -(22 + 1) = -23.

print( ~ - 20 ) #If x is a negative integer, ~x can be quickly found by calculating -(x - 1).For example, to find ~-20, we can calculate -(-20 - 1) = 19.

'''
Two's Complement Representation of -20:

First, represent 20 in binary:

20=0001 0100

Then, find the Two's Complement of 20 to get -20:By

i)Invert the bits:
 1110 1011
ii)Add 1:
 1110 1100
So, -20 in binary is 1110 1100.

Apply the Bitwise NOT:
i.e Invert each bit of 1110 1100:
 0001 0011

Convert the Resulting Binary to Decimal:
The binary 0001 0011 is: 2^4 + 2^1 + 2^0 = 16 + 2 + 1 = 19
So, ~ -20 evaluates to 19.
'''

print( 15^22 ) # XOR operation => 00001111 ^ 00010110 => 00011001 => 25

print( 8 << 3 ) # 8*2**3 => 8*8 => 64

print( 40 >> 3 ) # 40//2**3 => 40//8 => 5
