for i in range(1,11):
    for j in range(1,11):
        if i%j==0 or j%i==0:
            print("* ",end="")
        else:
            print("  ",end="")
    print()