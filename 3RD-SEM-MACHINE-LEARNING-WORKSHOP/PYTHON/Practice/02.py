frequency = []
for i in range(101):
    frequency.append(0)
#arr= list(map(int, input_data.split()))
while True:
    n=int(input("Enter an integer (0 to end): "))
    if n==0:
        break
    if n>=1 and n<=100:
        frequency[n]+=1
    else:
        print("Please enter an integer between 1 and 100.")

for i in range(1,101):
    if frequency[i]!=0:
        if frequency[i]==1:
            print(f"{i} occurs {frequency[i]} time")
        elif frequency[i]>1:
            print(f"{i} occurs {frequency[i]} times")