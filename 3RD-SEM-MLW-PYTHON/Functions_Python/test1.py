def add(a,b):
    return a+b
def sub(a,b):
    return a-b
if __name__=='__main__':
    print('The script is running directly !!')
    r1=add(10,7)
    print('The addition result is',r1)
    r2=sub(10,7)
    print('The subtraction result is',r1)
else:
    print("This script is imported !!")