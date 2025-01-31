def calc_checksum(digits):
    l=len(digits)
    s=0
    digits=int(digits)
    while digits!=0:
        ld=digits%10
        s=s+ld*l
        l=l-1
        digits=digits//10
    print("Sum = ",s)
    print("Result = ",(s%10))
n=input("Enter the number : ")
calc_checksum(n)

"""
Enter the number : 87654321
Sum =  120
Result =  0

"""